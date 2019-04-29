package com.testng.dataprovider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;


//ITestContext: Fetch the test case name at runtime
public class DataProviderSource {
	
	@DataProvider(name="TestType")
	public static Object[][] getTestTypeData(ITestContext context){  //It will work on the basics of the test case name
		String testName = context.getName();
		
		if("IntegrationLevel".equals(testName)){
			return new Object[][]{{"Integration test data"}};
		} else if("AcceptanceLevel".equals(testName)){
			return new Object[][]{{"Acceptance test data"}};
		} else {
			return new Object[][]{{"Common test data"}};
		}
	}
	
	@DataProvider(name="scenarioData")
	public static Object[][] getScenarioData(Method method){ //It will work on the basics of the test method name
		String testCase = method.getName();
		
		if("scenario1".equals(testCase)){
			return new Object[][]{{"Scenario1 data"}};
		} else if("scenario2".equals(testCase)){
			return new Object[][]{{"Scenario2 data"}};
		} else {
			return new Object[][]{{"Common scenario data"}};
		}
	}


}
