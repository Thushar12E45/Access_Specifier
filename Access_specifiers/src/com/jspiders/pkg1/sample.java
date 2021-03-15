package com.jspiders.pkg1;

public class sample 
{
	public    int    v1=1234;
	protected double v2=12345.678;
		      long	 v3=1234567l;
    private   String v4="Hello World";
    
    public void test1()
    {
    	System.out.println("This is public-test1() of sample class");
    }
    protected void test2()
    {
    	System.out.println("This is protected-test2() of sample class");
    }
    public void test3()
    {
    	System.out.println("This is pkg_level(default)-test3() of sample class");
    }
    public void test4()
    {
    	System.out.println("This is private-test4() of sample class");
    }
}
