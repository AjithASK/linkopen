package Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TableandDataRead {
	
	public static WebDriver driver;
	
	public static void browserlaunch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\Test Pgrm\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
		driver.manage().window().maximize();
		
	}

	public static void getAllHeader() {
		
		Map<Integer, String> headerMap = new HashMap<Integer , String>();
		
		List<WebElement> allHeader = driver.findElements(By.xpath("//@id=\"main_table_countries_today\"]/thread/tr[@role='row']"));
		
		for(int i=0; i <allHeader.size(); i++);
		

	
		String header= allHeader.get(i).getText().replace("\n" , "");
			
				headerMap.put(i,header);
	}
	
	System.out.Println(headerMap); {

}

	public static void getAllData() {
		
		List<WebElement> allData =driver.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr/td"));
		
		for(WebElement data : allData) {
			
			System.out.println(data.getText());
		}
		
	}
	
	public static void getparticularData() {
		
		WebElement data = driver.findElement(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr[7]/td[15]"));
		
		System.out.println(data.getText());
		
	}
	
	public static void allCountry() {
		List<WebElement> countries = driver
				.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr/td[2]"));
		for (WebElement country : countries) {
			System.out.println(country.getText());

		}
	}

	public static void header() {
		List<WebElement> he = driver.findElements(By.xpath("//table/thead/tr/th"));
		for (WebElement header : he) {
			System.out.print(header.getText());
		}
	}

	public static void main(String[] args) {
		browserlaunch();
//	   CoronaAllData();
//		getParticularData();
//		allCountry();
//		header();
		getAllHeader();

	}

}
	
		
	
		

	