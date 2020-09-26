package com.functionaltesting;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestExecution {
	WebDriver driver;
	
	@Test
	public void test01() {
		//open a browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Test
	public void test02() {

		// send URL
		
		driver.get("https://www.cnn.com/business");
	
	}

	@Test
	public void test03() {

		// need to check all modules are there or not
		
				
		/*
		 * List modules =
		 * driver.findElements(By.xpath("(//*[@class='sc-cSHVUG bYPcOh'])[1]/li"));//6
		 * 
		 * System.out.println("Modules number = "+modules.size());
		 * 
		 * //loop==> for loop, advance for loop, foreach ,while loop //for loop
		 * 
		 * for(int i=0;i<modules.size();i++) { //highlight
		 * System.out.println("Old java loop "+modules.get(i).getAttribute(
		 * "data-section")); }
		 * 
		 * modules.forEach(m-> { //highlight
		 * System.out.println("New java loop "+m.getAttribute("data-section"));
		 */}

	/*
	 * );
	 * 
	 * 
	 * 
	 * }
	 */
@Test
public void test04() {
	
	
}
@Test
public void test05() {
	}
}
