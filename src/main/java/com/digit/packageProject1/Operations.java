package com.digit.packageProject1;

import java.util.Scanner;

public class Operations extends Thread{
	public void run() 
	{
		if(Thread.currentThread().getName().equals("banking")) {
			banking();
		}
		else if (Thread.currentThread().getName().equals("printing")) {
			printing();
		}
		else
		{
			add();
		}
	}
	void banking () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking and operation");
		System.out.println("Enter the accno:");
		int accno = sc.nextInt();
		System.out.println("Enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking completed");
	}
	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition Operation");
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
	}
	void printing()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			try {
				System.out.println("hi gud morning");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("printing completed");
	}

}
public class pgm3{
	public static void main(String[] args) {
		System.out.println("main method");
		Operations op1 = new Operations();
		op1.setName("banking");
		op1.setPriority(3);
		Operations op2 = new Operations();
		op2.setName("printing");
		op2.setPriority(7);
		Operations op3 = new Operations();
		op3.setName("add");
		
		op1.start();
		op2.start();
		op3.start();
		
		System.out.println("Main Terminated");
		
		
		
	}
}
