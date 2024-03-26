package Project_Test;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Project_Page.Project_Page;

public class Project_Test extends Project_Base{

	@Test
	public void Test() throws InterruptedException
	{
		Project_Page pp=new Project_Page(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pp.login("Aamin", "admin123");
		pp.forget("Admin");
		pp.login("Admin", "admin123");
	}
	
	@AfterMethod
	public void Finish()
	{
		System.out.println("Test Completed");
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	

	
}
