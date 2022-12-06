package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonedit {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\Test Pgrm\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com//pages/Button.html");
		
		driver.manage().window().maximize();
		
		WebElement getpositionbutton= driver.findElement(By.id("position"));
		
		Point xypoint=getpositionbutton.getLocation();		
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X Value is :"+ xValue+"Y Value is:"+ yValue);
		
		WebElement colorbutton=driver.findElement(By.id("color"));
		String color=colorbutton.getCssValue("background-color");
		System.out.println("Button color is:"+color);
		
		WebElement Buttonsize=driver.findElement(By.id("size"));
		int height = Buttonsize.getSize().getHeight();
		int width= Buttonsize.getSize().getWidth();
		System.out.println("Hight is:"+height+"Width is:"+width);
		
		WebElement homebutton=driver.findElement(By.id("home"));
		homebutton.click();
	}

}
