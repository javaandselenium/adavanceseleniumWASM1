package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() {
		driver.findElement(By.name("login")).click();
		Reporter.log("click on login buttonTestcase3.java",true);
	}

}
