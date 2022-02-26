package chromeOptionsuses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 {
public static void main(String[] args) {
	
	ChromeOptions option=new ChromeOptions();
	System.out.println(option.addArguments("version"));
	
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.amazon.com/");
	driver.close();
}
}
