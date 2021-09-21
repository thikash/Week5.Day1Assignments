package assignmentsweek5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@Test
	public void runCreatelead() throws InterruptedException {
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();

	}
}
