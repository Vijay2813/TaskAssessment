package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void Loginpage() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	String text = driver.findElement(By.className("app_logo")).getText();
	if (text.contains("Swag Labs")) {
		System.out.println("Login Successfully");
		
	}
	else {
		System.out.println("Login Failed");
	}    	 
		
	}}

	


