package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase4 extends BaseClass{
	@Test
	public void tc4() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		Reporter.log("click on forgotten password",true);
	}

}
