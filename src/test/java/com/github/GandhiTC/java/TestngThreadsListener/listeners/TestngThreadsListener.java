package com.github.GandhiTC.java.TestngThreadsListener.listeners;



import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;



public class TestngThreadsListener implements IAlterSuiteListener
{
	@Override
	public void alter(List<XmlSuite> suites)
	{
		System.out.println("\r\n");
		
		/*
		  	for each suite, make sure it does not have any child suites
			if it does, recursively run this method again on each child suite
			see testng2.xml example
		*/
		suites.forEach(parentSuite ->
		{
			List<XmlSuite> childSuites = parentSuite.getChildSuites();

			if(childSuites.isEmpty())
				setThreads(parentSuite);
			else
				alter(childSuites);
		});
	}


	private void setThreads(XmlSuite suite)
	{
		System.out.println("Suite:  " + suite.getName());
		
		//	total number of threads possibly available to the JVM minus number of currently active threads
		int					numThreads		= Runtime.getRuntime().availableProcessors() - Thread.activeCount();
		int					numTests		= suite.getTests().size();
		int 				numClasses  	= 0;
		int 				moreClasses 	= 0;
		int 				maxClasses  	= 0;
		int 				moreMethods 	= 0;
		int 				maxMethods		= 0;
		Iterator<XmlTest> 	testIterator 	= suite.getTests().iterator();
		
		while(testIterator.hasNext())
		{
			XmlTest				currTest		= testIterator.next();
			List<XmlClass> 		classes 		= currTest.getClasses();
			int 				currNumClasses 	= classes.size();
			Iterator<XmlClass> 	classIterator 	= classes.iterator();
								numClasses 	   += currNumClasses;
			
			while(classIterator.hasNext())
			{
				XmlClass			currClass		= classIterator.next();
				String				fullClassName	= currClass.getName();
				Reflections			reflections		= new Reflections(fullClassName, new MethodAnnotationsScanner());
				Set<Method>			resources		= reflections.getMethodsAnnotatedWith(org.testng.annotations.Test.class);
				Iterator<Method>	methodIterator	= resources.iterator();
				int					currNumMethods	= 0;
				
				while(methodIterator.hasNext())
				{
					Method method = methodIterator.next();
					
					if(method.getAnnotation(org.testng.annotations.Test.class).enabled() == true)
						currNumMethods++;
				}
				
				if(numTests == 1 && numClasses == 1)
				{
					suite.setParallel(ParallelMode.METHODS);
					suite.setThreadCount(Math.min(currNumMethods, numThreads));
					
					System.out.println("\tParallel mode:  " + suite.getParallel());
					System.out.println("\tThread  count:  " + suite.getThreadCount() + "\n\n");
					return;
				}
				
				if(currNumMethods >= numClasses)
					moreMethods++;
				
				maxMethods = Math.max(maxMethods, currNumMethods);
			}
			
			if(currNumClasses > numTests)
				moreClasses++;
			
			maxClasses = Math.max(maxClasses, currNumClasses);
		}
		
		if(moreMethods >= numClasses)
		{
			suite.setParallel(ParallelMode.METHODS);
			suite.setThreadCount(Math.min(maxMethods, numThreads));
		}
		else if(moreClasses >= numTests)
		{
			suite.setParallel(ParallelMode.CLASSES);
			suite.setThreadCount(Math.min(maxClasses, numThreads));
		}
		else
		{
			suite.setParallel(ParallelMode.TESTS);
			suite.setThreadCount(Math.min(numTests, numThreads));
		}
		
		System.out.println("\tParallel mode:  " + suite.getParallel());
		System.out.println("\tThread  count:  " + suite.getThreadCount() + "\n\n");
	}
}