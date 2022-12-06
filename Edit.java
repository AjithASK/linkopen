package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\Test Pgrm\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testleaf.herokuapp.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys("ajith@gmil.com");
		
		WebElement appendbox= driver.findElement(By.xpath("//*[@id=\'contentblock\'*-]/section/div[2]/div/div/input"));
		appendbox.sendKeys("Text");

		WebElement getTextBox= driver.findElement(By.id("username"));
		String value =getTextBox.getAttribute("value");
		
		System.out.println(value);
		
		WebElement clearbox= driver.findElement(By.id("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement disabledBox= driver.findElement(By.id("//*[@id=\'contentblock']/section/div[5]/div/div/input"));
		boolean enabled= disabledBox.isEnabled();
		System.out.println(enabled);
		
		
	}

}
