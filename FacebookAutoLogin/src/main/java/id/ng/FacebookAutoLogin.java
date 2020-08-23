package id.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class FacebookAutoLogin 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
    	FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		String userEmail = "xxxx";
		String userPassword = "xxxx";
		
        WebElement inputEmail = driver.findElement(By.name("email"));
        inputEmail.sendKeys(userEmail);

        WebElement inputPassword = driver.findElement(By.name("pass"));
        inputPassword.sendKeys(userPassword);

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();		
		
//		driver.close();
    }
}
