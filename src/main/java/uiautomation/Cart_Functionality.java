package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cart_Functionality {



@Test
public void CartFunctionality() {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        
    

                // Add two products
                driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
                driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
                driver.findElement(By.className("shopping_cart_link")).click();

                // Verify total
                double price1 = Double.parseDouble(driver.findElement(By.cssSelector(".cart_item:nth-child(3) .inventory_item_price")).getText().replace("$", ""));
                double price2 = Double.parseDouble(driver.findElement(By.cssSelector(".cart_item:nth-child(4) .inventory_item_price")).getText().replace("$", ""));
                double total = price1 + price2;

                Assert.assertEquals(total, price1 + price2);

                // Remove one item
                driver.findElement(By.id("remove-sauce-labs-backpack")).click();
                Assert.assertEquals(driver.findElements(By.className("cart_item")).size(), 1);
            }

            public void login() {
                driver.findElement(By.id("user-name")).sendKeys("standard_user");
                driver.findElement(By.id("password")).sendKeys("secret_sauce");
                driver.findElement(By.id("login-button")).click();
            }
        }
}
}
