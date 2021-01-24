package com.start;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
isprimeornot(17);
	}

	private static void isprimeornot(int n) {
		// TODO Auto-generated method stub
		//Scanner sc=new  Scanner(System.in);
		int m=n/2;
		for(int i=2;i<=m;i++)
		{
			if (n%i==0)
			{
				System.out.println("n is not a prime number");
				break;
			}else
				System.out.println("is prime number");
			
		}
		
		
		
	}

}
