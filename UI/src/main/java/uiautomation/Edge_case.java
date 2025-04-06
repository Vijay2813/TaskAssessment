package uiautomation;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Edge_case extends BaseTest {

	    @Test
	    public void emptyCartCheckout() {
	        login();
	        driver.findElement(By.className("shopping_cart_link")).click();
	        driver.findElement(By.id("checkout")).click();

	        boolean formDisplayed = driver.findElements(By.id("first-name")).size() > 0;
	        Assert.assertFalse(formDisplayed); // Should not reach checkout
	    }

	    @Test
	    public void testResponsiveUI() {
	        login();
	        driver.manage().window().setSize(new Dimension(375, 667)); // iPhone 8 size
	        Assert.assertTrue(driver.findElement(By.className("app_logo")).isDisplayed());
	    }

	    public void login() {
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	    }
	}
}
