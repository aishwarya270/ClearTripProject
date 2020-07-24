import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Details {
		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cleartrip.com");
			
			File src = new File("C:\\selenium\\ExcelData\\Cleartrip.xlsx ");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wb.getSheetAt(0);
			
		String data0 =	sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is" +data0);
		
		String data1 =	sheet1.getRow(2).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is" +data1);
		 
		String data2 =	sheet1.getRow(2).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is" +data2);
		
		String data3 =	sheet1.getRow(2).getCell(3).getStringCellValue();
		System.out.println("Data from Excel is" +data3);
		
		WebElement From = driver.findElement(By.id("FromTag"));
		From.sendKeys(data1);
		
		WebElement To = driver.findElement(By.id("ToTag"));
		To.sendKeys(data2);
		
		WebElement Date = driver.findElement(By.id("DepartDate"));
		Date.sendKeys(data3);
		}
	

}
