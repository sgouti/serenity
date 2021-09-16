package com.driver.customdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;

public class Driverhandler implements DriverSource {

	@Override
	public WebDriver newDriver() {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return true;
	}

}
