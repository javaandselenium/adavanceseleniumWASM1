package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		try {
		driver.get("https://www.amazon.com/");
		System.out.println("page is  loaded within the given time");
		}
		catch(Exception e) {
			System.out.println("page is not loaded within the given time");
		}

		driver.close();
	}

}
