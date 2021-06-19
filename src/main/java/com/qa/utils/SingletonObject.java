/**
 * 
 */
package com.qa.utils;

import com.qa.testcase.TestApiCall;

/**
 * @author Ujjwal
 * 
 *         This class is used for creating single instance for all API Test case
 *         classes
 *
 */
public class SingletonObject {

	static SingletonObject sinhleOb;
	TestApiCall apicall;

	/**
	 * @return the apicall
	 */
	public TestApiCall getApicall() {
		if (apicall == null)
			apicall = new TestApiCall();
		return apicall;
	}

	public static void setUpSingleTon() {

		System.out.println("Initialize singelton class");
		setSinhleOb(new SingletonObject());
	}

	public SingletonObject getSinhleOb() {
		return sinhleOb;
	}

	public static void setSinhleOb(SingletonObject sineOb) {
		sinhleOb = sineOb;
	}

}
