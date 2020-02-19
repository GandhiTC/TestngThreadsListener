TestngThreadsListener is a custom listener used to showcase capabilities of TestNG listeners.

This listener automatically sets the parallel mode and the thread-count based on number of tests/methods.
If you have manually set these already in the TestNG .xml file, they will not be overwritten.

The logic used for parallelization and threading is only an example to show how it can be done, 
I do not recommend using it in production.



---------------------------------------------------------------------------------------------------------------------------------------
To Test
---------------------------------------------------------------------------------------------------------------------------------------
The listener will only set parallel mode and/or thread count if they are not already set in the .xml file.

Run testng1.xml, testng2.xml, and testng3.xml files as TestNG Suites.



