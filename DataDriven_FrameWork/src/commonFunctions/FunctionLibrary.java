package commonFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import config.AppUtil;

public class FunctionLibrary extends AppUtil {
	public static boolean Check_Login(String username,String password)
	{
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(conpro.getProperty("ObjUser"))).sendKeys(username);
		driver.findElement(By.xpath(conpro.getProperty("ObjPass"))).sendKeys(username);
		driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
		String Expected = "user";
		String Actual = driver.getCurrentUrl();
		try {
			Assert.assertEquals(Actual, Expected,"Username and password Invalid");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}	
		return false;
	}			
}	



