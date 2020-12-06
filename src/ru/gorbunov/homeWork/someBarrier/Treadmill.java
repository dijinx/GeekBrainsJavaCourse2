package ru.gorbunov.homeWork.someBarrier;

import ru.gorbunov.homeWork.someCreature.Cat;
import ru.gorbunov.homeWork.someCreature.Human;
import ru.gorbunov.homeWork.someCreature.Robot;

public class Treadmill {
	public int treadmillLength = 1;
	Human human = new Human();
	Cat cat = new Cat();
	Robot robot = new Robot();

	public void catStopAction(){
		System.out.println("This cat can not move");
	}

	public void humanStopAction(){
		System.out.println("This human can not move");
	}

	public void robotStopAction(){
		System.out.println("This robot can not move");
	}


	public void TreadmillAction(){
		human.humanRun();
		cat.catRun();
		robot.robotRun();
	}

}

