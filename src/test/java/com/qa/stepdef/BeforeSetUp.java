/**
 * 
 */
package com.qa.stepdef;

import io.cucumber.java.Before;
import utilspackage.SingletonObject;

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
