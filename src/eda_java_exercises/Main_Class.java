package eda_java_exercises;

import java.util.Scanner;
public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int option=0;
		do {
			deployMenu();
			option=input.nextInt();
		}while(option!=1&&option!=2&&option!=3);
		
		switch(option) {
		case 1:
			showResult((isMultiple()));
			break;
		case 2:
			showResult(lessOrEqual());
			break;
		case 3:
			showResult(sumSquares());
			break;
		}
	}
	
	public static int enterNumber() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		int x;
		x= input.nextInt();
		return x;
		
	}
	
	
	public static void deployMenu() {
		System.out.println("1. N multiple of M");
		System.out.println("2. Less or equal than X ");
		System.out.println("3. Sum_Squares\n");
	}
	
	public static boolean isMultiple() {
		int n,m;
		n=enterNumber();
		m=enterNumber();
		return n%m==0;
	}
	
	public static int lessOrEqual() {
		int x=enterNumber(),m=0;
		for(int i=1;i<=x;i++) {
			m+=i;
		}
		System.out.println(x);
		return m;
	}
	
	public static int sumSquares() {
		int x= enterNumber(), m=0;
		for(int i=1;i<=x;i++) {
			m+=i*i;
		}
		return m;
	}
	
	public static void showResult(int n) {
		System.out.println("The result is "+n);
	}
	
	public static void showResult(boolean x) {
		if(x==true) {
			System.out.println("It's multiple");
		}else
			System.out.println("It's not multiple");
	}
	}		


