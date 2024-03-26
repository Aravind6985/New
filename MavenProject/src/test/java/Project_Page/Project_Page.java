package Project_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Project_Page {
	
	WebDriver driver;
	
	By username=By.name("username");
	By pass=By.name("password");
	By loginbutton=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By forgetpass=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	By forgetuser=By.name("username");
	By forgetresetpass=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]");
	
	public Project_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String user, String password)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(loginbutton).click();
	}
	
	public void forget(String user)
	{
		driver.findElement(forgetpass).click();
		driver.findElement(forgetuser).sendKeys(user);
		driver.findElement(forgetresetpass).click();	
		driver.navigate().back();
		driver.navigate().back();
	}
	

}
