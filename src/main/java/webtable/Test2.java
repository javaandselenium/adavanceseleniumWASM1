package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/*"));

		for(WebElement allcol:ele) {
			System.out.println(allcol.getText());
		}
		
		driver.close();

	}

}
