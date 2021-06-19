/**
 * 
 */
package com.qa.stepdef;

import com.qa.utils.SingletonObject;

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
