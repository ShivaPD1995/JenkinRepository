package com.jenkin.cicd;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinThirdTest 
{
	@Test(groups = "Regression")
	public void method1()
	{
		System.out.println("Hello3");
		Reporter.log("Hi3");
	}
}
