package com.Jive;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jivepage.Jiveticket;



public class JiveTest {
	WebDriver driver = null;
	Jiveticket form = null;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe"); 	
		driver = new ChromeDriver(); 
		driver.get("http://jive.com/resources/support/lets-talk/submit-a-ticket/");
		//The page is automatically redirecting to HTTPS even though it is given HTTP in URL
		form = new Jiveticket(driver);
	}
		@AfterTest
		void closeAll() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
		}
		@Test 
		void verifyDefaultform() throws IOException {
			String
			dform = form.DefaultForm();
			System.out.println("Test Completed");
	}

}
