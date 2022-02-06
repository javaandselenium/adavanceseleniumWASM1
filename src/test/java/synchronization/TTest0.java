package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TTest0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://skillrary.com/");

//fullscreen
Thread.sleep(3000);
driver.manage().window().fullscreen();

//minize the browser
Thread.sleep(5000);
driver.manage().window().minimize();


	}

}
