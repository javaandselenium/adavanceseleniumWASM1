package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Sample.class)
public class Testcase1 extends BaseClass{

	@Test
	public void tc1() {
	driver.findElement(By.partialLinkText("email")).sendKeys("admin");	
	driver.findElement(By.id("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();

	}

}
