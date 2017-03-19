package com.study.market.action;

public class MarketManager {

	public static void main(String[] args) {
		MarketInitializer.initMarket();
		BrokerManager.activateMarketBrokers();
	}

}
