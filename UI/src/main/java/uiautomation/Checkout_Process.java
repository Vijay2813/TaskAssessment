package uiautomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout_Process extends BaseTest {

    @Test
    public void checkoutProcess() {
        login();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();

        Assert.assertTrue(driver.findElement(By.className("summary_total_label")).isDisplayed());

        driver.findElement(By.id("finish")).click();
        Assert.assertTrue(driver.findElement(By.className("complete-header")).isDisplayed());
    }

    public void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}



	
	

