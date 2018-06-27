package Setup;

import org.openqa.selenium.By;

import maventc.Base;

public class GreenBoxClick extends Base{
	By clickgreenbox =By.className("greenbox");
	public void action() {
		driver.findElement(clickgreenbox).click();
	}

}
