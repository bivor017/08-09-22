package com.work.bll;

import java.util.Scanner;

public class AccountPin {
	
	public static final int pin=1234;
	public static void main(String args[]) {
		
	Scanner scanner=new Scanner(System.in);
	
	int num=0;
	while(true)
	{
		
		System.out.println("Enter the PIN: " );
		int guess=scanner.nextInt();
		
		if(pin==guess) 
		{ //if pin entered is correct
			System.out.println("Correct, welcome back.");
		
			break;
		}
		
		else
		{//if pin entered is incorrect
			if(num<2) 
			{
			System.out.println("Incorrect, try again.");
			}
		
		
		}
		num++;
		
		if(num>=3)
		{		//after 3 unsuccessful trials
		System.out.println("Sorry but you have been locked out.");
		break;	
		}
		
	}
		
	scanner.close();
		
	}
}
