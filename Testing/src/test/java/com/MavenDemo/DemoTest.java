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
		
		//changing in github 5:20
		
		//chamge in github 5:25
    
		//again some change in github
		
		//chamge in eclipse 5:25
		
		//chamgee neqw 
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

