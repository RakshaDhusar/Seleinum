

		// TODO Auto-generated method stub
		package com.cyient.multipletab;

		import java.util.Set;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class MultipleTab  {
			
			public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
					driver.get("https://www.db4free.net/");
					
					driver.findElement(By.partialLinkText("phpMyAdmin »")).click();
					
					Set<String> windows=driver.getWindowHandles();
					for(String win : windows);
					{
					
						driver.switchTo().window(win);
						if(driver.getTitle().equals("phpMyAdmin"))
						{
							break;//exit the iteration
						}
						}
					driver.findElement(By.id("input_username")).sendKeys("RD");
					driver.findElement(By.id("input_password")).sendKeys("RD123");
					driver.findElement(By.id("input_go")).click();
					
					
		}
		}
	
