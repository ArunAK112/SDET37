package com.MavenDemo;

import org.testng.annotations.Test;

public class JenkinsParameterizationTest {
	
	@Test
	 public void jenkinsParameterization()
	 {
		//getting browser name from jenkins and printing it
		System.out.println(System.getProperty("browser"));
		
		//getting url from the jenkins and printing it
		System.out.println(System.getProperty("url"));
		
		//other some lines for conformation
		System.out.println("It accepted and printing browser name and url");
		
	 }

}
