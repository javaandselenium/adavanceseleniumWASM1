package autoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
Runtime.getRuntime().exec("C:\\Users\\QSP\\Desktop\\Autoit4\\filepopup.exe");
	}

}
