package com.github.GandhiTC.java.TestngThreadsListener.tests;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestClass3
{
	@BeforeSuite
	public void beforeTest3()
	{
		System.out.println("This is before start of test 3.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test3a()
	{
		System.out.println("\tThis is the test3a() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test3b()
	{
		System.out.println("\tThis is the test3b() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@AfterSuite
	public void afterTest3()
	{
		System.out.println("This is after end of test 3.  It is using thread id: " + Thread.currentThread().getId());
	}
}