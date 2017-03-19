package com.study.market.action;

import com.study.market.entity.Share;

public interface MarketAction {
	public Share getFirstCheapestShareToBuy();
	public Share getFirstMostExpensiveShareToSell();
	public void addShare(Share share);
	public void removeShare(Share share);
	public void performBuyOrder(Share share);
	public void performSellOrder(Share share);
}
