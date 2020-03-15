package com.suresh.learnings.lambdas.inter;

@FunctionalInterface
public interface LambdaFunctionalInterfaceNoParam {

	String printMessage();
	
	//Since the interface is a functional interface the only allowed option is a "default" method with implementation 
	default String doNotPrintAMessage(String param) {
		return param + " .";
	}
}
