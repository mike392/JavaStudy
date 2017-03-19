package com.study.market.action;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.study.market.entity.Share;
import com.study.market.entity.ShareEnum;
import com.study.market.entity.impl.ShareMarket;

public class MarketInitializer {
	public static void initMarket(){
		SortedSet<Share> shares = new TreeSet<Share>(Comparator.comparing(Share::getPrice));
		for (ShareEnum shareHolder : ShareEnum.values()){
			shares.add(shareHolder.getShare());
		}
		ShareMarket.getInstance().setShares(shares);
	}
}
