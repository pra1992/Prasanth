package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement usernameTextField=driver.findElement(By.id("username"));
		usernameTextField.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTCOMPANY1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PRASANTH1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SANKARAN1");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Chemical1");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prasanthsnkr@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		WebElement dd1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd2 = new Select(dd1);
		dd2.selectByVisibleText("Armed Forces Americas");
	
		driver.findElement(By.className("smallSubmit")).click();
	String TitleOfPage=	driver.getTitle();
	if(TitleOfPage.contains("View Lead"))
		System.out.println("Lead is Created");
	else
		System.out.println("Lead is not created");
driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
driver.findElement(By.className("smallSubmit")).click();
if(TitleOfPage.contains("View Lead"))
	System.out.println("Lead is Created");
else
	System.out.println("Lead is not created");

	}

}
