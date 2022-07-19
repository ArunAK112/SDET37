package com.MavenDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2Test {
	
	@Test
	public void createDemo4()
	{
		Reporter.log("TestDemo4",true);
		Reporter.log("I love purple colour", true);
	}
	
	@Test
	public void createDemo5()
	{
		Reporter.log("TestDemo5",true);
	}
	
	@Test
	public void createDemo6()
	{
		Reporter.log("TestDemo6",true);
	}

}
