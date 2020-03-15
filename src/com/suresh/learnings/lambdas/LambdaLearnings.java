package com.suresh.learnings.lambdas;

import com.suresh.learnings.lambdas.inter.LambdaFunctionalInterfaceSingleParam;
import com.suresh.learnings.lambdas.inter.LambdaFunctionalInterfaceTwoParam;
import com.suresh.learnings.collections.CollectionGeneratorUtil;
import com.suresh.learnings.lambdas.inter.LambdaFunctionalInterfaceNoParam;

public class LambdaLearnings {

	public static void main(String[] args) {
		
		demoNoParamLambda();
		
		demoSingleParamLambda();
		
		demoTwoParamLambda();
		
		demoCollectionLambda();
		
	}

	private static void demoCollectionLambda() {
		
		//Java-7
		for(String s : CollectionGeneratorUtil.listOfStrings()) {
			System.out.println(s);
		}
		
		//From Java-8 - Iterating list of strings
		CollectionGeneratorUtil.listOfStrings().forEach((str) -> System.out.println(str));
		
		//From Java-8 - Iterating set of strings
		CollectionGeneratorUtil.setOfStrings().forEach((str) -> System.out.println(str));
		
		//From Java-8 - Iterating map of strings
		CollectionGeneratorUtil.mapOfNumberToStrings().forEach((k, v) -> System.out.println(k + "->" +v));
		
		CollectionGeneratorUtil.mapOfNumberToStrings().forEach((k, v) -> {
			if ("1".equals(k)) {
				System.out.println("Value is ---> " + v);
			}
		});
		
	}

	private static void demoTwoParamLambda() {
		LambdaFunctionalInterfaceTwoParam twoParam = (a, b) -> {
			return a + " " + b;
		};
		
		System.out.println(twoParam.printMessage("One", "Two"));
		
	}

	private static void demoSingleParamLambda() {
		LambdaFunctionalInterfaceSingleParam singleParam = (a) -> {
			return "Hello " + a + " !";
		};
		
		System.out.println(singleParam.printMessage("Suresh"));
	}

	private static void demoNoParamLambda() {
		LambdaFunctionalInterfaceNoParam noParam = () -> {
			return "A = " + "B";
		};
		
		System.out.println(noParam.printMessage());
		System.out.println(noParam.doNotPrintAMessage("print --->>>>"));
	}

}