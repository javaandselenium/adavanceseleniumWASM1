package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Parameters({"browserName","ipaddress"})
	@Test
	public void demo(String browserName,String ip) throws MalformedURLException {
		URL remoteAddress=new URL("http://"+ip+":4444/wd/hub");
	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setBrowserName(browserName);

WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
}
}
