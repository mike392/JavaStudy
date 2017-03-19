package com.study.market.entity;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class Market {
	protected SortedSet<Share> shares = new TreeSet<>(Comparator.comparing(Share::getPrice));

	public SortedSet<Share> getShares() {
		return shares;
	}

	public void setShares(SortedSet<Share> shares) {
		this.shares = shares;
	}

}
