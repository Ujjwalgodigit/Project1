package com.digit.packageProject1;

public class trycatch3 {
	
	void fun1()
	{
		int a = 10;
		int b = 0;
		
		int divide = a/b;
		
	}
	void fun2() throws Exception 
	{
		fun1();
	}
	void fun3() throws Exception
	{
		fun2();
	}
}

class handle{
	public static void main(String[] args) throws Exception {
		trycatch3 trycatchObj = new trycatch3();
		
		trycatchObj.fun3();
	}
}