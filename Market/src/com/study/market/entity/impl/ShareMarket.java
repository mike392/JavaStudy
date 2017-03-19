package com.study.market.entity.impl;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import com.study.market.action.MarketAction;
import com.study.market.entity.Market;
import com.study.market.entity.Share;
import com.study.market.entity.ShareEnum;
import com.study.market.util.Constants;

public class ShareMarket extends Market implements MarketAction {

	private final static ShareMarket INSTANCE = new ShareMarket(); 
	private static ReentrantLock lock = new ReentrantLock();
	private static Random randomGenerator = new Random();
	private ShareMarket(){
		super();
	}
	
	public static ShareMarket getInstance(){
		return INSTANCE;
	}
	
	@Override
	public Share getFirstCheapestShareToBuy() {
		return shares.first();
	}

	@Override
	public Share getFirstMostExpensiveShareToSell() {
		return shares.last();
	}

	@Override
	public void addShare(Share share) {
		shares.add(share);

	}

	@Override
	public void removeShare(Share share) {
		shares.remove(share);
	}

	@Override
	public void performBuyOrder(Share share) {
		lock.lock();
		double initialPrice = ShareEnum.valueOf(share.getName()).getShare().getPrice();
		removeShare(share);
		System.out.println("Share " + share.getName() + " was bought for " + share.getPrice() + "\n");
		ShareEnum.valueOf(share.getName()).getShare().setPrice(initialPrice + randomGenerator.nextDouble() * Constants.RANDOM_CAPACITY);
		addShare(share);
		lock.unlock();
	}

	@Override
	public void performSellOrder(Share share) {
		lock.lock();
		double initialPrice = ShareEnum.valueOf(share.getName()).getShare().getPrice();
		removeShare(share);
		System.out.println("Share " + share.getName() + " was sold for " + share.getPrice() + "\n");
		ShareEnum.valueOf(share.getName()).getShare().setPrice(initialPrice - randomGenerator.nextDouble() * Constants.RANDOM_CAPACITY);
		addShare(share);
		lock.unlock();
		
	}
}
