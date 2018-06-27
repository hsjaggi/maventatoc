package Setup;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import maventc.Base;



public class BrowserLaunch extends Base {
	
	public BrowserLaunch(WebDriver driver) {
	this.driver = driver;
	}
	public void openbrowser() {
		driver.get("http://10.0.1.86/tatoc");
	    String pagetitle = driver.getTitle();
	    Assert.assertEquals("Welcome - T.A.T.O.C", pagetitle);
	    
	} 
}
