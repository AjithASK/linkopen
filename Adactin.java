package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\Test Pgrm\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://adactinhotelapp.com/index.php");
				
				driver.manage().window().maximize();
				
				WebElement Username= driver.findElement(By.id("username"));
				Username.sendKeys("Ajithask");
				
				WebElement pw= driver.findElement(By.id("password"));
				pw.sendKeys("Ajith@81292");
			
				WebElement login= driver.findElement(By.id("login"));
				login.sendKeys("click button");
				
				WebElement Location= driver.findElement(By.id("location"));
				Location.sendKeys("click Select Location");
								
				WebElement Location1= driver.findElement(By.id("location"));
				String value =Location1.getAttribute("London");		
				
			
			
	}
}
