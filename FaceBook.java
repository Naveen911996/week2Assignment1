package week2.Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("test");
	driver.findElement(By.name("lastname")).sendKeys("Leaf");
	driver.findElement(By.name("reg_email__")).sendKeys("TestLeaf@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("TestLeaf@1");
	
	WebElement drpDown = driver.findElement(By.name("birthday_day"));
	Select drpDow = new Select(drpDown);
	drpDow.selectByIndex(9);
	
	WebElement drpDown1 = driver.findElement(By.name("birthday_month"));
	Select drpDow1 = new Select(drpDown1);
	drpDow1.selectByVisibleText("Jan");
	
	WebElement drpDown2 = driver.findElement(By.name("birthday_year"));
	Select drpDow2 = new Select(drpDown2);
	drpDow2.selectByValue("1996");

	driver.findElement(By.className("_8esa")).click();
	driver.findElement(By.name("websubmit")).click();
	}

}
