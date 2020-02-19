package com.github.GandhiTC.java.TestngThreadsListener.tests;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestClass5
{
	@BeforeSuite
	public void beforeTest5()
	{
		System.out.println("This is before start of test 5.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test5a()
	{
		System.out.println("\tThis is the test5a() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test5b()
	{
		System.out.println("\tThis is the test5b() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@AfterSuite
	public void afterTest5()
	{
		System.out.println("This is after end of test 5.  It is using thread id: " + Thread.currentThread().getId());
	}
}