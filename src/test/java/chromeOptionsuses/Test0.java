package chromeOptionsuses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test0 {

	public static void main(String[] args) {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.amazon.com/");
		
	}

}
