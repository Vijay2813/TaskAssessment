package uiautomation;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Login_Presisytence {

	
	@Test
	public void testLoginPersistence() {
	    testLogin("standard_user", "secret_sauce", true);

	    Set<Cookie> cookies = driver.manage().getCookies();

	    driver.quit();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(baseUrl);

	    for (Cookie cookie : cookies) {
	        driver.manage().addCookie(cookie);
	    }

	    driver.navigate().refresh();

	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),
	            "Login session did not persist after browser restart.");
	}
}

