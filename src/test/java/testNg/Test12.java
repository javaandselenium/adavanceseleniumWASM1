package testNg;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test12 extends BaseClass{
	@DataProvider
	public Object[][] getData() {
	Object[][] a=new Object[3][2];
	a[0][0]="userewet";
	a[0][1]="qwrewew";
	a[1][0]="1342344";
	a[1][1]="3445445";
	a[2][0]="454fghfttd&^$&";
	a[2][1]="656hg%&^%&^";
	return a;
	
	}
	@Test(dataProvider = "getData")
	public void demo(String us,String pwd) {
		driver.findElement(By.id("email")).sendKeys(us);	
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}

}
