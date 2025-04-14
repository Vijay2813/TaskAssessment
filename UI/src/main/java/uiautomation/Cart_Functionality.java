package uiautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cart_Functionality {



@Test
public void CartFunctionality() {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.saucedemo.com/");
	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        
    driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
    driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[2]")).click();
    driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[3]")).click();
    driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[4]")).click();
    
    driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[2]")).click();
    
    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    
    



               
            }

          
            
        
}

