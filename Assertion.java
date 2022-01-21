package Week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	@Test
	public void login() {
		String exptitle="My Home | opentaps CRM";
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url="http://leaftaps.com/opentaps/control/login";
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, exptitle);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(title, exptitle);
System.out.println("page displayed");
	sa.assertAll();
	}

}
