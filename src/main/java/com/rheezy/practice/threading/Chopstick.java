package com.rheezy.practice.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {

	ReentrantLock lock = new ReentrantLock();
	
	public Boolean pickUp() {
		Boolean isSuccessful = lock.tryLock();
		return isSuccessful;
	}
	
	public void putDown() {
		if (lock.isHeldByCurrentThread()) {
			lock.unlock();
		}
	}
}
