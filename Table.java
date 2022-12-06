package Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static WebDriver driver;
	private static int indexofpopulation;
	private static int indexofcountry;
	
	public static void browserLaunch() {
		
		WebDrivermanager.chromedriver().setup().
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/#countries");
		driver.manage().window().maximize();
		}

	public static void getAllHeader() {
		Map<Integer, String> headerMap = new LinkedHashMap<Integer, String>();
			// List<WebElement> allHeader =
			// driver.findElements(By.xpath("//table[@id='main_table_countries_today]/tbody/thead/th"));
			List<WebElement> allHeader = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr[@role='row']"));
			for (int i = 0; i < allHeader.size(); i++) {
				String header = allHeader.get(i).getText().replace("\n", "");
				// System.out.println(header);
				headerMap.put(i, header);
				if (header.equals("populatioin")) {
					indexofpopulation = i;
				} else if (header.contains("Country")) {
					indexofcountry = i;
				}

			}
			System.out.println(headerMap);
		}

		public static void getAllData() {
			List<WebElement> getAllData = driver.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr/td"));
			for (WebElement data : getAllData) {
				System.out.println(data.getText());
			}
		}

		public static void getIndiaPopulation() {
			/*
			 * WebElement findElement = driver .findElement(By.xpath(
			 * "//*[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]/a"));
			 * System.out.println(findElement.getText());
			 */

			// Particular Data
			WebElement particularData = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]"));
			System.out.println(particularData.getText());
		}

		public static void rowWiseData() {
			List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr[7]/td"));
			for (WebElement data : allData) {
				System.out.println(data.getText());
			}
		}

		private void getParticularData(String countryName) {
			List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr"));
			for (int i = 0; i < allRows.size(); i++) {
				List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < allColumns.size(); j++) {
					if (allColumns.get(indexofcountry).getText().equals(countryName)) {
						String population = allColumns.get(indexofpopulation).getText();
						System.out.println(countryName + "Population is" + population);
						break;
					}
				}
			}
		}

		public static void columnWiseData() {
			// driver.findElements(By.xpath("//"))
			System.out.println("    ");
			System.out.println("* Particular Column **");
			List<WebElement> c = driver.findElements(By.xpath("//table/tbody/tr[@role=\"row\"]/td[2]"));
			for (WebElement column : c) {
				System.out.println(column.getText());
			}
			System.out.println("   ");
		}

		public static void main(String[] args) {
			browserLaunch();
			getAllData();
			getIndiaPopulation();
			rowWiseData();
			columnWiseData();
			getAllHeader();

			driver.close();
		}
	}


