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
			
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
	
	
	public static void deployMenu() {
		System.out.println("1. N multiple of M");
		System.out.println("2. Less or equal than X ");
		System.out.println("3. Sum_Squares");
	}
}


