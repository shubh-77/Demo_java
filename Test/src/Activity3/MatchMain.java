package Activity3;

import java.util.Scanner;

abstract class Match{
	private int currentscore,target;
	private float currentOver;

	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate, int balls);


	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}


}

class ODIMatch extends Match{

	@Override
	float calculateRunRate() {
		// TODO Auto-generated method stub

		float rr = getTarget()-getCurrentscore();
		return (rr / calculateBalls()) * 6;
	}

	@Override
	int calculateBalls() {
		// TODO Auto-generated method stub
		return 300 - ((int) getCurrentOver() * 6);


	}

	@Override
	void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Requirements:");
		System.out.println("Need " + (getTarget() - getCurrentscore()) + " runs in " + balls + " balls");
		System.out.printf("Required Runrate: %.2f\n", reqRunrate);

	}

}
class TestMatch extends Match{

	@Override
	float calculateRunRate() {
		// TODO Auto-generated method stub
		float rr = getTarget()-getCurrentscore();
		return (rr / calculateBalls()) * 6;
	}

	@Override
	int calculateBalls() {
		// TODO Auto-generated method stub
		return 540 - ((int) getCurrentOver() * 6);
	}

	@Override
	void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Requirements:");
		System.out.println("Need " + (getTarget() - getCurrentscore()) + " runs in " + balls + " balls");
		System.out.printf("Required Runrate: %.2f\n", reqRunrate);

	}

}
class T20Match extends Match{

	@Override
	float calculateRunRate() {
		// TODO Auto-generated method stub
		float rr = getTarget()-getCurrentscore();
		return (rr / calculateBalls()) * 6;
	}

	@Override
	int calculateBalls() {
		// TODO Auto-generated method stub
		return 120 - ((int) getCurrentOver() * 6);
	}

	@Override
	void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Requirements:");
		System.out.println("Need " + (getTarget() - getCurrentscore()) + " runs in " + balls + " balls");
		System.out.printf("Required Runrate: %.2f\n", reqRunrate);
	}

}



public class MatchMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentScore,target,balls;
		float currentover,reqRunrate;
		System.out.println("Enter the match format");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		int choice = sc.nextInt();
		if (choice ==1) {
			System.out.println("Enter the Current score");
			currentScore=sc.nextInt();
			System.out.println("Enter the current Over");
			currentover=sc.nextFloat();
			System.out.println("Enter the Target Score");
			target=sc.nextInt();
			ODIMatch odi = new ODIMatch();
			odi.setCurrentscore(currentScore);
			odi.setCurrentOver(currentover);
			odi.setTarget(target);
			reqRunrate=odi.calculateRunRate();
			balls=odi.calculateBalls();
			odi.display(reqRunrate, balls);


		}
		else if (choice ==2) {
			System.out.println("Enter the Current score");
			currentScore=sc.nextInt();
			System.out.println("Enter the current Over");
			currentover=sc.nextFloat();
			System.out.println("Enter the Target Score");
			target=sc.nextInt();
			T20Match t20 = new T20Match();
			t20.setCurrentscore(currentScore);
			t20.setCurrentOver(currentover);
			t20.setTarget(target);
			reqRunrate=t20.calculateRunRate();
			balls=t20.calculateBalls();
			t20.display(reqRunrate, balls);


		}
		else if (choice ==3) {
			System.out.println("Enter the Current score");
			currentScore=sc.nextInt();
			System.out.println("Enter the current Over");
			currentover=sc.nextFloat();
			System.out.println("Enter the Target Score");
			target=sc.nextInt();
			TestMatch tm = new TestMatch();
			tm.setCurrentscore(currentScore);
			tm.setCurrentOver(currentover);
			tm.setTarget(target);
			reqRunrate=tm.calculateRunRate();
			balls=tm.calculateBalls();
			tm.display(reqRunrate, balls);


		}
		else {
			System.out.println("Invalid Input");
		}

		sc.close();

	}
}
