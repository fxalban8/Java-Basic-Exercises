package eda_java_exercises;

import java.util.Scanner;
public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int option=0;
		int n,m;
		do {
			deployMenu();
			option=input.nextInt();
		}while(option!=1&&option!=2&&option!=3);
		
		switch(option) {
		case 1:
			System.out.println("Enter two numbers");
			n= input.nextInt();
			m=input.nextInt();
			System.out.println(isMultiple(n,m));
			break;
		case 2:
			System.out.println("Enter one number");
			n= input.nextInt();
			System.out.println("The sum is "+lessOrEqual(n));
			break;
		case 3:
			System.out.println("Enter one number");
			n= input.nextInt();
			System.out.println("The sum of the squares is "+sumSquares(n));
			break;
		}
	}
	
	
	public static void deployMenu() {
		System.out.println("1. N multiple of M");
		System.out.println("2. Less or equal than X ");
		System.out.println("3. Sum_Squares");
	}
	
	public static boolean isMultiple(long n, long m) {
		return n%m==0;
	}
	
	public static int lessOrEqual(long n) {
		int x=0;
		for(int i=1;i<=n;i++) {
			x+=i;
		}
		return x;
	}
	
	public static int sumSquares(long n) {
		int x=0;
		for(int i=1;i<=n;i++) {
			x+=i*i;
		}
		return x;
	}
	
	public static String showResult(int n) {
		String result = new String("The result is"+n);
		return result;
	}
	
	
	}		


