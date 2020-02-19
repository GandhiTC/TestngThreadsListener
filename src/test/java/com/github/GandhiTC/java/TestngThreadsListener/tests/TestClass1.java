package com.github.GandhiTC.java.TestngThreadsListener.tests;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestClass1
{
	@BeforeSuite
	public void beforeTest1()
	{
		System.out.println("This is before start of test 1.  It is using thread id: " + Thread.currentThread().getId());
	}


	@Test
	public void test1a()
	{
		System.out.println("\tThis is the test1a() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1b()
	{
		System.out.println("\tThis is the test1b() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1c()
	{
		System.out.println("\tThis is the test1c() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1d()
	{
		System.out.println("\tThis is the test1d() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1e()
	{
		System.out.println("\tThis is the test1e() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1f()
	{
		System.out.println("\tThis is the test1f() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1g()
	{
		System.out.println("\tThis is the test1g() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1h()
	{
		System.out.println("\tThis is the test1h() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test1i()
	{
		System.out.println("\tThis is the test1i() method.  It is using thread id: " + Thread.currentThread().getId());
	}


	@AfterSuite
	public void afterTest1()
	{
		System.out.println("This is after end of test 1.  It is using thread id: " + Thread.currentThread().getId());
	}
}