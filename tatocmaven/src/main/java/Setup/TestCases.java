package Setup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import maventc.Base;

public class TestCases {
	WebDriver driver;
	@BeforeClass
	public void calllaunchBrowser() {
		Base b = new Base();
		driver = b.getDriver();
		BrowserLaunch objj = new BrowserLaunch(driver);
		objj.openbrowser();
		
	}
	@Test(priority = 1)
	public void callBasicCourseClick() {
		ClickBasicCourse obj = new ClickBasicCourse(driver);
		obj.action();
		
	}
	@Test(priority = 2)
	public void callGreenBox() {
		GreenBoxClick obj1 = new GreenBoxClick(driver);
		obj1.action();
		
	}
	@Test(priority = 3)
	public void callBoxcolormatch() {
		Boxcolormatch obj2 = new Boxcolormatch(driver);
		obj2.boxcolor();	
	}
	@Test(priority = 4)
	public void callDragandDrop() {
		DragDrop obj3 = new DragDrop(driver);
		obj3.draganddropfunction();		
	}
	@Test(priority = 5)
	public void callNewTabAndSearch() {
		PopupWindow obj4 = new PopupWindow(driver);
		obj4.action("Rishabh");
		
	}
	@Test(priority = 6)
	public void callTokenGeneration() {
		TokenGeneration obj5= new TokenGeneration(driver);
		obj5.token();
		
	}
	@AfterClass
	public void callclosebrowser() {
		BrowserClose obj6 = new BrowserClose(driver);
		obj6.close();
	}
	

}
