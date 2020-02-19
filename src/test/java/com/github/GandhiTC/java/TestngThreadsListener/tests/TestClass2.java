package com.github.GandhiTC.java.TestngThreadsListener.tests;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestClass2
{
	@BeforeSuite
	public void beforeTest2()
	{
		System.out.println("This is before start of test 2.  It is using thread id: " + Thread.currentThread().getId());
	}


	@Test
	public void test2a()
	{
		System.out.println("\tThis is the test2a() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2b()
	{
		System.out.println("\tThis is the test2b() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2c()
	{
		System.out.println("\tThis is the test2c() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2d()
	{
		System.out.println("\tThis is the test2d() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2e()
	{
		System.out.println("\tThis is the test2e() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2f()
	{
		System.out.println("\tThis is the test2f() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2g()
	{
		System.out.println("\tThis is the test2g() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2h()
	{
		System.out.println("\tThis is the test2h() method.  It is using thread id: " + Thread.currentThread().getId());
	}
	
	
	@Test
	public void test2i()
	{
		System.out.println("\tThis is the test2i() method.  It is using thread id: " + Thread.currentThread().getId());
	}


	@AfterSuite
	public void afterTest2()
	{
		System.out.println("This is after end of test 2.  It is using thread id: " + Thread.currentThread().getId());
	}
}