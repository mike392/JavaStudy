package com.study.market.action;

import com.study.market.entity.impl.ShareMarketRunnable;

public class MarketManager {

	public static void main(String[] args) {
		MarketInitializer.initMarket();
		Thread marketWatcher = new Thread(new ShareMarketRunnable());
		marketWatcher.setDaemon(true);
		marketWatcher.start();
		BrokerManager.activateMarketBrokers();
	}

}
