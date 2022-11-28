package com.WrittenTest26Nov22;

import java.util.Scanner;

public class FunctionOverloadSeriesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloadSeries fo = new FunctionOverloadSeries();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value : ");
		double n1 = sc.nextDouble();
		fo.Series(n1);
		System.out.println(fo.Series(n1));
		
		System.out.println("Enter the value : ");
		double n2 = sc.nextDouble();
		System.out.println("Enter the value : ");
		double n3 = sc.nextDouble();
		
		System.out.println(fo.Series(n2, n3));

	}

}
