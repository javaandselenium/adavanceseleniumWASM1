package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[*]"));
		
		 for(WebElement allrow:ele) {
			 System.out.println(allrow.getText());
		 }
		 
		 driver.close();

	}

}
