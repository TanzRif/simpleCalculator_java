package project;

import java.util.Scanner;

public class neNew {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		char operator;
		double answer = 0.0;

		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Please Enter First Number");
		num1 = scannerObject.nextInt();
		System.out.println("Please Enter Second Number");
		num2 = scannerObject.nextInt();
		System.out.println("Please Enter Oparetor");
		operator = scannerObject.next().charAt(0);

		switch (operator) {
		case '+':
			answer = num1 + num2;

			break;
		case '-':
			answer = num1 - num2;
			break;

		case '/':
			answer = num1 / num2;
			break;

		case '*':
			answer = num1 * num2;
			break;
		}

		System.out.println("answer= " + answer);
	}

}
