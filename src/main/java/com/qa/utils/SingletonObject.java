/**
 * 
 */
package com.qa.utils;

import com.qa.testcase.*;

/**
 * @author Ujjwal
 * 
 *         This class is used for creating single instance for all API Test case
 *         classes
 *
 */
public class SingletonObject {

	static SingletonObject sinhleOb;
	ApiMethodCall apicall;

	/**
	 * @return the apicall
	 */
	public ApiMethodCall getApicall() {
		if (apicall == null)
			apicall = new ApiMethodCall();
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
