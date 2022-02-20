package com.logic;

import java.util.Scanner;

public class LogicalProgram {

	public static void fibonacciSeries(int range) {
		int a = 0;// 0,1,1,2,3,5,8
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");
		while (true) {
			c = a + b;// c=2//c=3
			if (c > range) {
				break;
			}
			System.out.print(c + " ");
			a = b;// a=1//a=1
			b = c;// b=1//b=2

		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = scanner.nextInt();
		System.out.println("the fibonacci series with in range are");
		fibonacciSeries(range);
		scanner.close();
	}

}
