package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

public class Test3 {

	public static void main(String[] args) throws SQLException {

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//step:1 Register to the database
Driver driverref=new Driver();
DriverManager.registerDriver(driverref);

//Step:2 connect to database
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wasam1","root","root");

//Step:3 create sql query statements
Statement statement = con.createStatement();
 String query = "select * from userlogin";
 
 //Step:4 execute query
 ResultSet result = statement.executeQuery(query);
 while(result.next()) {
	
	 driver.findElement(By.id("txtUsername")).sendKeys(result.getString(1));
	 driver.findElement(By.id("txtPassword")).sendKeys(result.getString(2));
 }
 //step:5 close the db connection
 con.close();
 



	}

}
