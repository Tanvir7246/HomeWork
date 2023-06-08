package hw6IfElseCondition01;

import java.util.Scanner;

public class Voter {
	public static void main(String[] args) {
		System.out.println("******Put your age below******");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (age == 18) {
			System.out.println("I am a voter");
		} else if (age < 18) {
			System.out.println("I am not a voter");
		} else if (age > 18) {
			System.out.println("I am a voter from age 18");
		} else {
			System.out.println("Please add a vaild age");
			
			scanner.close();
		}
	}

}