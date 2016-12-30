package com.home.Trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class IEBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver");
		//WebDriver drv=new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vikas.kumar5\\Downloads\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		//WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.1:4444/wd/hub"), capabilities);
		driver.get("http://google.com");
		Thread.sleep(5000);
		driver.quit();

	}

}
