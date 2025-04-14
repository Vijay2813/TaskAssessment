package uiautomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout_Process  {

    @Test
    public void checkoutProcess() {
       
    	ChromeDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.saucedemo.com/");
    	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            
            
            
    }

   
}



	
	

