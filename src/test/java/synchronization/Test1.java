package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
//old		
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//new
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//old
WebDriverWait wait=new WebDriverWait(driver,10);

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));


	
	
	}

}
