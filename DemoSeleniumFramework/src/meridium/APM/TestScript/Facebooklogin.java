package meridium.APM.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import meridium.APM.UtilityLibrary.UtilFunction;
public class Facebooklogin {
	WebDriver driver = new FirefoxDriver();
	String inputPathFile="C:\\Users\\prisharm\\workspace\\DemoSeleniumFramework\\src\\meridium\\APM\\TestData\\Login.Properties";
	String xpathFile="C:\\Users\\prisharm\\workspace\\DemoSeleniumFramework\\src\\meridium\\APM\\objectRepository\\xpathPropertyfile.properties";
@Test
public void login(){
	String fbURL, uName, pass, usernameXpath;
	
	fbURL = UtilFunction.dataExtract("url", inputPathFile);
	uName = UtilFunction.dataExtract("email", inputPathFile);
	usernameXpath = UtilFunction.dataExtract("usernameXpath", xpathFile);
	pass = UtilFunction.dataExtract("pass", inputPathFile);
	driver.get(fbURL);
	
	driver.findElement(By.xpath(usernameXpath)).sendKeys(uName);
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.findElement(By.id("loginbutton")).click();
	System.out.println("Login successful");
}
}
