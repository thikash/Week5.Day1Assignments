package assignmentsweek5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassServiceNow {
	public ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev82068.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
//Enter the username as admin
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
//Enter the password as Aathi&&1234
		driver.findElement(By.id("user_password")).sendKeys("Aathi&&1234");
//click Login
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");

	}

	@AfterMethod
	public void postCondition() {

		driver.close();

	}

}
