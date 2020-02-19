package com.github.GandhiTC.java.TestngThreadsListener.tests;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestClass4
{
	@BeforeSuite
	public void beforeTest4()
	{
		System.out.println("This is before start of test 4.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test4a()
	{
		System.out.println("\tThis is the test4a() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test4b()
	{
		System.out.println("\tThis is the test4b() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@AfterSuite
	public void afterTest4()
	{
		System.out.println("This is after end of test 4.  It is using thread id: " + Thread.currentThread().getId());
	}
}