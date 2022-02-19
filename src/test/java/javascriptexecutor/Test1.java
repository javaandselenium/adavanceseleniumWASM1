package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/AdvanceSelenium_WASA2/disable.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("abc"));
		
		if(ele.isEnabled()) {
			System.out.println("Pass it is enabled");
		}
		else
		{
			System.out.println("Fail: it is not enebaled");
		}
		
		//to perform typing on disbaled element
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('abc').value='java'");
		
		Thread.sleep(5000);
		//to clear the data on disabled element
		js.executeScript("document.getElementById('abc').value=''");
		
	}

}
