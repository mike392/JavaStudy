package com.study.market.entity;

import java.util.concurrent.locks.ReentrantLock;

public class Share {
	private String name;
	private double price;
	private static ReentrantLock lock = new ReentrantLock();
	public Share(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		try {
			lock.lock();
			return name;
		} finally {
			lock.unlock();
		}
		
	}
	public double getPrice() {
		try {
			lock.lock();
			return price;
		} finally {
			lock.unlock();
		}
		
	}
	public void setPrice(double price) {
		this.price = price;
	}
}