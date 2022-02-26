package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//label[@for='departure']")).click();
	
	while(true) {
		try {
	driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Fri Nov 18 2022']/div/p[text()='18']")).click();
	break;
		}
		catch(Exception e) {
			System.out.println("date is no found");
		}
		
	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}

	}}
