package com.study.market.entity;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Market {
	protected Set<Share> shares = new CopyOnWriteArraySet<Share>();
	private ConcurrentSkipListSet<Share> sortedShares;
	protected static ReentrantLock lock = new ReentrantLock();
	public SortedSet<Share> getShares() {
		try {
			lock.lock();
			sortedShares = new ConcurrentSkipListSet<Share>(Comparator.comparing(Share::getPrice));
			sortedShares.addAll(shares);
			return sortedShares;
		} finally {
			lock.unlock();
		}
	}

	public void setShares(Set<Share> shares) {
		try {
			lock.lock();
			sortedShares = new ConcurrentSkipListSet<Share>(Comparator.comparing(Share::getPrice));
			sortedShares.addAll(shares);
			this.shares = sortedShares;
		} finally {
			lock.unlock();
		}
	}

}
