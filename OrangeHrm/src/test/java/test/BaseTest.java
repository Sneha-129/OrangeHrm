package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;                  //declare variable int x 
	@BeforeSuite
	
	public void broweserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();           //initialization int x= 10
		
		driver.manage().window().maximize();    //utilization
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Browser Launch Successfull");
		
	}
	
	@AfterSuite
	
	public void teardown() {
		
		driver.close();   
		
		
	}
	
}
