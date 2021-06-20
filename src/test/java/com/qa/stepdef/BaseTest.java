package com.qa.stepdef;

import io.cucumber.java.Before;

public class BaseTest {

	static SingleClassIntsance intsance;

	@Before
	public static void setUpInstance() {
		intsance = new SingleClassIntsance();
	}
}
