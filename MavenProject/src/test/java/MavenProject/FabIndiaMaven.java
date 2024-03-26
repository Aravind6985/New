package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FabIndiaMaven {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	public void Run()
	{
		driver.get("https://www.fabindia.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/app-root/cx-storefront/div[2]/div/div/div[1]/cx-page-slot/fab-ham-burger-menu/button/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/cx-storefront/div[2]/div/div/div[1]/cx-page-slot/fab-ham-burger-menu/ng-sidebar-container/ng-sidebar/aside/div/div[1]/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Qwerty");
		driver.findElement(By.id("lastName")).sendKeys("Key");
		driver.findElement(By.id("phone")).sendKeys("9567220985");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[1]/app-fab-india-register/div/div/div/form/div[3]/div/button")).click();
		driver.findElement(By.id("email")).sendKeys("qwerty@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Qwerty@123");
		driver.findElement(By.id("passwordconf")).sendKeys("Qwerty@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"options.code\"]")).click();
		driver.findElement(By.id("dob")).sendKeys("08071995");
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[1]/app-fab-india-register/div/div/div/form/div[12]")).click();
	}
	
	@AfterMethod
	public void Finish()
	{
		System.out.println("test completed");
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}

}
