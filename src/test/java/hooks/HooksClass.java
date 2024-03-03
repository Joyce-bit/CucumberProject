package hooks;


import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class HooksClass {
	
	@BeforeStep
	public void beforeEachStep() throws InterruptedException {
		
		Thread.sleep(5000);
		
	}
	
	@AfterStep
	public void afterEachStep() throws InterruptedException {
		Thread.sleep(5000);
		
		
	}
	
}
