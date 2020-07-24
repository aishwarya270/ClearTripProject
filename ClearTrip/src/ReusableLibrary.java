import java.io.FileReader;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.json.simple.parser.*;

public class ReusableLibrary extends MainMethod {
	public void clik(By obj) {
		//WebDriver driver = new ChromeDriver();
		WebElement element=driver.findElement(obj);
		element.click();
	}
	
	public void enter(By obj, String text)
	{
		WebElement element = driver.findElement(obj);
		element.sendKeys(text);
	}
	 public void EnterTextWithJS(By strobj, String text) {
		  try {
		  System.out.println(strobj);
		   WebElement element = driver.findElement(strobj);
		   JavascriptExecutor executor = (JavascriptExecutor) driver;
		   executor.executeScript("arguments[0].value='" + text + "'", element);
		   System.out.printf("EnterText", text + " is entered in " );
		  } catch (Exception e) {
		   System.out.println(e);
		   System.out.printf("EnterText", text + " is not entered in " );
		   
		  }
		 }
	public void DropDown(By obj,int i) {
		Select drop = new Select(driver.findElement(obj));
		drop.selectByIndex(i);
	}
	public void subm(By obj) {
		WebElement elm = driver.findElement(obj);
		elm.submit();
		
		
	}
	public void Load(By obj) {
		WebDriverWait wait= new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(obj)).click();
		}
	
	public void EnterVal(By obj) {
		Actions action = new Actions(driver); 
	    action.moveToElement(driver.findElement(Where)).sendKeys(Keys.ENTER).perform();
	}
 
       
}
