package uiautomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Product_Filtering {

	@Test
	public void productfilter() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        
	        WebElement Sort = driver.findElement(By.className("product_sort_container"));
	        Select dropdown = new Select(Sort);
	        
	        dropdown.selectByValue("lohi");
	        
	        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
	        List<Double> actualPrices = prices.stream()
	            .map(p -> Double.parseDouble(p.getText().replace("$", "")))
	            .collect(Collectors.toList());

	        List<Double> sortedPrices = new ArrayList<>(actualPrices);
	        Collections.sort(sortedPrices);

	        Assert.assertEquals(actualPrices, sortedPrices);
	        
	}
	}    	 
		