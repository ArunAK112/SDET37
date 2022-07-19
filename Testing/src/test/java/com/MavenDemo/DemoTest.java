package com.MavenDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void createDemo1()
	{
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("name"));
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

