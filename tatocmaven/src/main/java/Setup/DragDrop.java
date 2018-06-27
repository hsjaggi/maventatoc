package Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import maventc.Base;

public class DragDrop extends Base{
	By proceedclick =By.linkText("Proceed");
	public void draganddropfunction() {
	    Actions act=new Actions(driver);
		WebElement drop = driver.findElement(By.cssSelector("#dropbox"));
		WebElement drag = driver.findElement(By.cssSelector("#dragbox"));
		act.dragAndDrop(drag, drop).build().perform();
		driver.findElement(proceedclick).click();
		System.out.println("Successful drag and drop action");
  } 


}
