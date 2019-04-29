package execution.order;

import org.testng.annotations.*;

public class SampleTestNGUsage {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("From BeforeTest annotation in SampleTestNGUsage class ..");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("From BeforeSuite annotation in SampleTestNGUsage class ..");
	}

}
