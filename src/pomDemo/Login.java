package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	By username= By.name("uid");
	By password= By.name("password");
	By login= By.name("btnLogin");
	By insurance= By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[2]/a");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}

	public void setUsername(String usernamevalue)
	{
		driver.findElement(username).sendKeys(usernamevalue);
	}
	
	public void setpassword(String passwordvalue)
	{
		driver.findElement(password).sendKeys(passwordvalue);
	}
	
	public void setlogin()
	{
		driver.findElement(login).click();
	}
	
	public void insurance()
	{
		driver.findElement(insurance);
	}
	
}
