package com.work.pll;

import java.util.Scanner;

import com.work.bll.DigitCount;

public class TestDigitCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		DigitCount cd =new DigitCount();
		
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("Total Digits :" +cd.DigitCount(num));
		}
		else {
			System.out.println("Please Enter a Positive Number ");
		}
		scanner.close();
	}
	

}
