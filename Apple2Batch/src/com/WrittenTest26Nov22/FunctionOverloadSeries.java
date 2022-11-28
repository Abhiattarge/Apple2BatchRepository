package com.WrittenTest26Nov22;

public class FunctionOverloadSeries {
	double Series(double n) {
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double term=1.0/i;
			sum += term;
		}
		return sum;
	}
	double Series (double a,double n) {
		double sum=0;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			int e = x + 1;
			double term = x/Math.pow(a, e);
			sum += term;
			x +=3;
		}
		return sum;
	}

}
