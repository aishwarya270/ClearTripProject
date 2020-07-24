	import java.io.File;
import java.io.FileInputStream;
	import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
	
	    public class Excel implements Objects {
	                private static XSSFSheet ExcelWSheet;
	                private static XSSFWorkbook ExcelWBook;
	                private static org.apache.poi.ss.usermodel.Cell Cell;
	                private static XSSFRow Row;
	                
	  public static void main(String[] args) throws IOException {
              XSSFWorkbook workbook;
              XSSFSheet sheet;
              XSSFCell cell;
              System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe" );
              File src = new File("C:\\selenium\\ExcelData\\Cleartrip.xlsx");
              FileInputStream finput = new FileInputStream(src);
              workbook = new XSSFWorkbook(finput);
              sheet = workbook.getSheetAt(0);
              
              WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("https://www.cleartrip.com/");
              ReusableLibrary rl = new ReusableLibrary();
              
              rl.clik(Round_trip);
              cell=sheet.getRow(1).getCell(0);
             // rl.send(From_tag,cell);
              cell=sheet.getRow(1).getCell(1);
              
              
           
              
            
	  }
	    }
	    
