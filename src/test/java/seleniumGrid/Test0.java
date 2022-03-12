package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void demo() throws MalformedURLException {
		URL remoteAddress=new URL("http://192.168.0.104:4444/wd/hub");
	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setBrowserName("chrome");

WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

		
	}

}
