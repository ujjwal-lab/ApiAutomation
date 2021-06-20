/**
 * 
 */
package com.qa.stepdef;

import com.qa.utils.*;

import io.cucumber.java.*;

/**
 * @author Ujjwal
 *
 */
public class BeforeSetUp {

	@Before
	public static void runSetup() {
		System.out.println("running setup");
		SingletonObject.setUpSingleTon();
	}
}
