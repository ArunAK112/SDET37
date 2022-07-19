package com.MavenDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void createDemo1()
	{
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("name"));
		//iam going to do some changes in this arun branch and check whether it is going to upload it to the master branch
		//another change
		//again change
    
		//again some change in github
	}
	
	@Test
	public void createDemo2()
	{
		Reporter.log("TestDemo2",true);
	}
	
	@Test
	public void createDemo3()
	{
		Reporter.log("TestDemo3",true);
	}
	
}

