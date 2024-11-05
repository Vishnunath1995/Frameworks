package org.steps;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hookssample extends BaseClass {
	
@Before(value= "not @sanity1 or @smoke",order=1)
	public void beforeExcuteScenario() {
		browserLaunch("chrome");
	    launchUrl("https://www.facebook.com/");
	    maxWindow();
	   implicitwait();

	}
	@After(order=2)
	public void afterExecteScenario()
	{
		
		closebws();
	}

}
