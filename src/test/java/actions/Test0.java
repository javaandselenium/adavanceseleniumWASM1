package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.inject.Key;

public class Test0 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement username = driver.findElement(By.id("username"));
username.sendKeys("admin"+Keys.CONTROL+"A");
username.sendKeys(Keys.CONTROL+"c");

System.out.println("hello");



WebElement password = driver.findElement(By.name("pwd"));
password.sendKeys(Keys.CONTROL+"v");

	}

}
