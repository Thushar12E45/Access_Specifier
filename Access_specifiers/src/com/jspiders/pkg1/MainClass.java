package com.jspiders.pkg1;

public class MainClass {

	public static void main(String[] args) 
	{
		sample s1=new sample();
		System.out.println("V1 : "+s1.v1);
		s1.test1();
		
		System.out.println("V2 : "+s1.v2);
		s1.test2();
		
		System.out.println("V3 : "+s1.v3);
		s1.test3();
	}

}
