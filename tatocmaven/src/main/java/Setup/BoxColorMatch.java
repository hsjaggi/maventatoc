package Setup;

import org.openqa.selenium.By;

import maventc.Base;

public class BoxColorMatch extends Base{
	By boxarea = By.id("answer");
	By proceedclick =By.linkText("Proceed");
	By Repaintclick =By.linkText("Repaint Box 2");
	
	public void boxcolor() {
		String box1;
		String box2;
		boolean condition = true;
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		box1 = driver.findElement(boxarea).getAttribute("class");
		while(condition) {
			//driver.switchTo().defaultContent();
		    driver.switchTo().frame("child");
		    box2= driver.findElement(boxarea).getAttribute("class");
		    System.out.println(box2);
		    if(box1.equals(box2))
			{
		    	condition=false;
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.switchTo().parentFrame();
				driver.findElement(proceedclick).click();
				
			}
			else
			{
					driver.switchTo().parentFrame();
					driver.findElement(Repaintclick).click();
			}
		}
		
	} 

}

