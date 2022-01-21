package Week5.day1;



import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class DuplicateLead extends BaseClass{
@Test

public void duplicateLead() {
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("balanalan2017@gmail.com");
	driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	driver.findElement(By.linkText("Bala")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.name("submitButton")).click();
	driver.close();


}
}