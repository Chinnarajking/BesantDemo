package com.wipro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@beforeMethod");
	}
	@Test
	public void test() {
		System.out.println("@test");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
}




