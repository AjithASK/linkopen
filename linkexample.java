package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkexample {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\Test Pgrm\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com//");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		
	}

}
