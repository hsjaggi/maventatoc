package Setup;

import org.openqa.selenium.By;

import maventc.Base;

public class PopupWindow extends Base{
	By textenter =By.id("name");
	By pop = By.linkText("Launch Popup Window");
	By submit = By.id("submit");
	By proceed =By.linkText("Proceed");
	public void action(String text) {
		driver.findElement(pop).click();
		String handle = driver.getWindowHandle();
		for(String newtab : driver.getWindowHandles()) {
			driver.switchTo().window(newtab);
			//driver.findElement(pop).click();
			
			   
		}
		driver.findElement(textenter).sendKeys(text);
		driver.findElement(submit).click();
		driver.switchTo().window(handle);
		driver.findElement(proceed).click();
		
		
		System.out.println("Successfully opening of new tab and seacrching"); 

	}
}
