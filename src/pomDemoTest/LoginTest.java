package pomDemoTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomDemo.Login;
import pomDemo.Utility;

public class LoginTest {

		WebDriver driver;
		Login obj;
		public HashMap<String, String> data;
		String path=System.getProperty("user.dir");
				
		@BeforeSuite()
		public void extentReport()
		{
			
		}
		@BeforeTest
		public void setUp()
		{
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path+"\\EXE\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/V4/");
		}

		@Test
		public void login() throws Exception
		{
			data= Utility.getData();
			obj= new Login(driver);
			obj.setUsername(data.get("username"));
			obj.setpassword(data.get("password"));
			obj.setlogin();			
		}
		
		@AfterTest
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(10000);
			driver.close();
		}
	

}
