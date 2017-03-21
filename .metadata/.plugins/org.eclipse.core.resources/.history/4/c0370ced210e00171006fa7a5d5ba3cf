package com.study.market.entity;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import com.study.market.entity.impl.ShareMarket;
import com.study.market.util.Constants;

public class MarketBroker extends Thread {
	private int id;
	private double balance;
	private HashMap<Share, Integer> investPortfolio = new HashMap<Share, Integer>();
	public MarketBroker(int id){
		this.id = id;
		this.setBalance(Constants.INITIAL_BALANCE);
		this.start();
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private void buyShare(Share share){
		addToPortfolio(share);
		balance = balance - share.getPrice();
		ShareMarket.getInstance().performBuyOrder(share);
		//System.out.println("Broker " + id + " has balance " + balance + "\n");
	}
	private void sellShare(Share share){
		takeFromPortfolio(share);
		balance = balance + share.getPrice();
		ShareMarket.getInstance().performSellOrder(share);
		//System.out.println("Broker " + id + " has balance " + balance + "\n");
	}
	
	public void run(){
		while(balance > 0){
			tryMaximizeBalance();
			try {
				TimeUnit.MILLISECONDS.sleep(Constants.SLEEP_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Broker " + id + " has no money left");
	}

	private void tryMaximizeBalance() {
		double balanceRatio = balance/Constants.INITIAL_BALANCE*100;
		if (balanceRatio > Constants.BALANCE_LOWER_THRESHOLD){
			Share share = ShareMarket.getInstance().getFirstCheapestShareToBuy();
			buyShare(share);
		} else {
			Share share = ShareMarket.getInstance().getFirstMostExpensiveShareToSell();
			if (investPortfolio.containsKey(share)){
				sellShare(share);
			}
		}
		//System.out.println("Broker " + id + " has balance " + balance + "\n");
		//System.out.println(investPortfolio.values().toString() + "\n");
	}
	
	private void addToPortfolio(Share share){
		if (investPortfolio.containsKey(share)){
			Integer count = new Integer(investPortfolio.get(share).intValue() + 1);
			investPortfolio.put(share, count);
		} else {
			investPortfolio.put(share, 1);
		}
	}
	
	private void takeFromPortfolio(Share share){
		if (investPortfolio.get(share).intValue() > 1){
			Integer count = new Integer(investPortfolio.get(share).intValue() - 1);
			investPortfolio.put(share, count);
		} else {
			investPortfolio.remove(share);
		}
	}
}
