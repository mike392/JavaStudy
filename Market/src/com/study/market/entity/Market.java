package com.study.market.entity;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Market {
	protected SortedSet<Share> shares = new TreeSet<>(Comparator.comparing(Share::getPrice));
	protected static ReentrantLock lock = new ReentrantLock();
	public SortedSet<Share> getShares() {
		try {
			lock.lock();
			return shares;
		} finally {
			lock.unlock();
		}
		
	}

	public void setShares(SortedSet<Share> shares) {
		this.shares = shares;
	}

}
