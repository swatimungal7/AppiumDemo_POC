package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.BasePage;

public class testPage extends BasePage {
	
	@Test
	public void testOne()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.ENTER);
		
		System.out.println("Completed Test One... ");
	}

	@Test
	public void testTwo()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Swati");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.ENTER);
		
		System.out.println("Completed Test Two... ");
	}
}
