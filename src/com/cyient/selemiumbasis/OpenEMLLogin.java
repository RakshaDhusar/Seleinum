package com.cyient.selemiumbasis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEMLLogin {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cyient.com/");
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
	}

}
