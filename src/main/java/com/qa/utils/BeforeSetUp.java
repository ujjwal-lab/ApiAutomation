/**
 * 
 */
package com.qa.utils;

import io.cucumber.java.Before;

/**
 * @author Ujjwal
 *
 */
public class BeforeSetUp {

	@Before
	public static void runSetup() {
		SingletonObject.setUpSingleTon();
	}
}
