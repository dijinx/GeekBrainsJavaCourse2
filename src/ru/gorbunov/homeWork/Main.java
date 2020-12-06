package ru.gorbunov.homeWork;

import ru.gorbunov.homeWork.someBarrier.Treadmill;
import ru.gorbunov.homeWork.someBarrier.Wall;

public class Main {
	public static void main(String[] args) {

		Treadmill t1 = new Treadmill();
		t1.TreadmillAction();
		Wall w1 = new Wall();
		w1.wallAction();
	}
}
