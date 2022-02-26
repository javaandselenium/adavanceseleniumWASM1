package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Test0 {
	@Test
	public void createUser(XmlTest xml) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(xml.getParameter("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys(xml.getParameter("username"));
			driver.findElement(By.id("txtPassword")).sendKeys(xml.getParameter("password"));
	}

	

}
