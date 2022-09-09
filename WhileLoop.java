package com.work.bll;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	int sumEven=0;
	int sumOdd=0;
	System.out.println("Enter two positive Number where num1 < num2 : ");
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	int start=num1;
	int end=num2;
	
	if(num1<num2 && num1>=0 && num2>=0) {
		
		System.out.println("Even number's are: ");
			while(start<=end) {
				if(start%2==0) {
					System.out.print(" "+start+"\n");
				sumEven+=start;
				
		
			}start++;
		}
			start=num1;
			end=num2;
			
			System.out.println("odd number's are: ");
			while(start<=end) {
				if(start%2!=0) {
				System.out.print(" "+start+"\n");
				sumOdd+=start;
				
			}start ++;
				}
			
			System.out.println("Sum of all even Number : "+sumEven);
			System.out.println("Sum of all odd Number : "+sumOdd);
		
		}

		
		
		else {
			System.out.println("Numbers you entered are not fulfilling the condition");
		}
		
	scanner.close();
	}

}
