package com.jspiders.pkg2;
import com.jspiders.pkg1.sample;
public class MainClass2 extends sample
{

	public static void main(String[] args) 
	{
		sample s1=new sample();
		System.out.println("V1 = "+s1.v1);
		s1.test1();
		
		MainClass2 m1=new MainClass2();
		System.out.println("V2 = "+m1.v2);
		m1.test2();
		
		s1.test3();
		
		s1.test4();

	}

}
