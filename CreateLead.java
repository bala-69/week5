package Week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@Test
	public void createLead() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosearch");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("balanalan2017@gmail.com");
		driver.findElement(By.name("submitButton")).click();
	
	}

}
