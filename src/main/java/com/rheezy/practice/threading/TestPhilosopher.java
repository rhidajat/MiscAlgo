package com.rheezy.practice.threading;

import org.junit.Test;

public class TestPhilosopher {

	@Test
	public void testLocking() {
		Chopstick c1 = new Chopstick();
		Chopstick c2 = new Chopstick();
		Thread p1 = new Philosopher("p1", c1, c2);
		Thread p2 = new Philosopher("p2", c2, c1);
		p1.start();
		p2.start();
	}
}
