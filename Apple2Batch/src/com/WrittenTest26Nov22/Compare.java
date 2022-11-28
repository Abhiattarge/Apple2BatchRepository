package com.WrittenTest26Nov22;

public class Compare {
	public void Compare(int a,int b)
	{
		if(a<b)
		{
			System.out.println(a +" Is greater");
		}
		else
		{
			System.out.println(b +" Is greater");
		}
	}
	public void Compare(char a,char b)
	{
		int x = (int)a;
		int y = (int)b;
		
		if(x<y)
		{
			System.out.println(b +" Is greater");
		}
		else
		{
			System.out.println(a +" Is greater");
		}
	}

}
