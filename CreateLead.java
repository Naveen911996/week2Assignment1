package week2.Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();

driver.findElement(By.linkText("Create Lead")).click();

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hello");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/01/96");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("system engineer");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("development");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7");

driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("87951");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing of web page");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("testing of web page");

driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("testing");
WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
countrycode.clear();
countrycode.sendKeys("5");


driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("5465");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9487151573");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("test");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("test");

driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testing@gmail.com");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Testing");

driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("address line1");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("address line 2");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Erode");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("638002");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("87845");



WebElement drpDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select drpDow = new Select(drpDown);
drpDow.selectByIndex(2);

WebElement drpDown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select drpDow1 = new Select(drpDown1);
drpDow1.selectByVisibleText("Demo Marketing Campaign");

WebElement drpDown2 = driver.findElement(By.id("createLeadForm_currencyUomId"));
Select drpDow2 = new Select(drpDown2);
drpDow2.selectByValue("DZD");

WebElement drpDown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select drpDow3 = new Select(drpDown3);
drpDow3.selectByIndex(2);

WebElement drpDown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select drpDow4 = new Select(drpDown4);
drpDow4.selectByVisibleText("LLC/LLP");

WebElement drpDown5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select drpDow5 = new Select(drpDown5);
drpDow5.selectByIndex(5);

WebElement drpDown6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select drpDow6 = new Select(drpDown6);
drpDow6.selectByValue("DZA");


String text = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");

System.out.println("First Name : " + text);

driver.findElement(By.className("smallSubmit")).click();


String title = driver.getTitle();
String title2 = "View Lead | opentaps CRM";
if(title.equals(title2))
{
	
	System.out.println("Title Matches and title is : "+ title);
}
else
{
	
	System.out.println("Tiltle mismatch and title is : "+ title);
}

	}

	
}
