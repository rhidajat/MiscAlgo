package com.rheezy.practice.threading;

public class Philosopher extends Thread {

	private String name;
	private Chopstick leftChopstick;
	private Chopstick rightChopstick;

	public Philosopher(String name, Chopstick leftChopstick,
			Chopstick rightChopstick) {
		this.name = name;
		this.leftChopstick = leftChopstick;
		this.rightChopstick = rightChopstick;
	}

	private void eat() {
		System.out.println(name + ": is eating.");
	}

	private boolean pickUpLeft() {
		System.out.println(name + ": Trying to pick up left");
		return leftChopstick.pickUp();
	}

	private void putDownLeft() {
		System.out.println(name + ": Putting down left");
		leftChopstick.putDown();
	}

	private boolean pickUpRight() {
		System.out.println(name + ": Trying to pick up right");
		return rightChopstick.pickUp();
	}

	private void putDownRight() {
		System.out.println(name + ": Putting down right");
		rightChopstick.putDown();
	}

	@Override
	public void run() {
		boolean haveBoth = false;

		while (!haveBoth) {
			boolean haveLeft = false;
			boolean haveRight = false;

			putDownLeft();
			haveLeft = pickUpLeft();
			if (haveLeft) {
				System.out.println(name + ": Successfully picked up left");
			} else {
				System.out.println(name + ": Could not picked up left");
			}

			haveRight = pickUpRight();
			if (haveRight) {
				System.out.println(name + ": Successfully picked up right");
			} else {
				System.out.println(name + ": Could not pick up left");
			}

			haveBoth = haveLeft && haveRight;
		}

		eat();
		putDownRight();
		putDownLeft();
	}
}
