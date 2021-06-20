package com.qa.stepdef;

public class SingleClassIntsance {

	ApiMethodCall methodCall;

	/**
	 * @return the methodCall
	 */
	public ApiMethodCall getMethodCall() {
		if (methodCall == null)
			return methodCall=new ApiMethodCall();
		return methodCall;
	}

}
