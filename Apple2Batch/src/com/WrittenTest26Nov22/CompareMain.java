package com.WrittenTest26Nov22;

import java.util.Scanner;

public class CompareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Compare c = new Compare();
		
		System.out.println("Enter First Integer : ");
		int n1=sc.nextInt();
		System.out.println("Enter Second Integer : ");
		int n2=sc.nextInt();
		
		c.Compare(n1, n2);
		
		System.out.println("Enter the first character : ");
		char c1=sc.next().charAt(0);
		System.out.println("Enter the second character : ");
		char c2=sc.next().charAt(0);
		sc.nextLine();
		c.Compare(c1, c2);

	}

}
