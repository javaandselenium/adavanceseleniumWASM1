package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() {
		driver.findElement(By.id("pass")).sendKeys("manager");
		Reporter.log("enetered the password",true);
	}

}
