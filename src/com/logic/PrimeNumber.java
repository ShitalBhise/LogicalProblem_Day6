package com.logic;

public class PrimeNumber {
	public static int checkPrimeNo(int num) {
		int i = 0;
		int flag = 0;
		int primeNo = 0;
		for (i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0 && num != 1)
			primeNo = num;
		return primeNo;

	}

	public static void main(String[] args) {

//		int num = 0;
		int prime = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num = scanner.nextInt();

		for (int num = 1; num <= 10; num++) {
			prime = checkPrimeNo(num);
			if (prime == num) {
				System.out.println(num);
			}
		}

//		sum = checkPrimeNo(num);
//		if (sum == num) {
//			System.out.println(num + " is a prime number");
//		} else {
//			System.out.println(num + " is not a prime number");
//		}
//		scanner.close();

	}
}
