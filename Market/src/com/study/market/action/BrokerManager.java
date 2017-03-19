package com.study.market.action;

import com.study.market.entity.MarketBroker;

public class BrokerManager {
	public static void activateMarketBrokers(){
		for (int i = 1; i< 4; i++){
			new MarketBroker(i);
		}
	}
}
