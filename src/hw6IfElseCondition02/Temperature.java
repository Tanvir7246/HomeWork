package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		System.out.println("Today's Weather");
		Scanner scanner = new Scanner(System.in);
		int todaysTempareture = scanner.nextInt();

		if (todaysTempareture < 32) {
			System.out.println("Freezing");
		} else if (todaysTempareture < 55) {
			System.out.println("Pleasant");
		} else if (todaysTempareture < 73) {
			System.out.println("Getting warmer");
		} else if (todaysTempareture > 101) {
			System.out.println("Very hot");
		} else {
			System.out.println("Please put a valid tempareture");

			scanner.close();
		}
	}

}
