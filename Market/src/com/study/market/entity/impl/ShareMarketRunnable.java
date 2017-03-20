package com.study.market.entity.impl;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import com.study.market.entity.Market;
import com.study.market.entity.Share;
import com.study.market.util.ColorConstants;
import com.study.market.util.Constants;

public class ShareMarketRunnable extends Market implements Runnable {
	private SortedSet<Share> sharesMemo = new TreeSet<>(Comparator.comparing(Share::getPrice));
	private SortedSet<Share> refShares;
	@Override
	public void run() {
		sharesMemo = shares; 
		while (true) {
		printSharePrices();
		}
	}
	
	private void printSharePrices() {
		SortedSet<Share> refShares = new TreeSet<Share>(ShareMarket.getInstance().getShares());
		for (Share share : refShares){
			System.out.printf(ColorConstants.RED_PATTERN, share.getName(), share.getPrice());
			System.out.flush();
		}
		try {
			TimeUnit.MILLISECONDS.wait(Constants.SLEEP_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
