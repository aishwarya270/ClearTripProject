//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import java.util.concurrent.TimeUnit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;

import org.json.simple.JSONObject;

//import org.json.JSONArray;
//import org.json.JSONObject;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.JSONObject;
import org.json.simple.parser.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.interactions.Actions;

public class MainMethod implements Objects  {
	public static WebDriver driver;
	public static JSONObject jo;
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ParseException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe" );
		FileReader fr = new FileReader("CleartripValues.json");
		JSONParser jp = new JSONParser();
		
		Object obj = jp.parse(fr);
		jo = (JSONObject) obj;

		driver = new ChromeDriver();
		 
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		ReusableLibrary rl = new ReusableLibrary();
		driver.get("https://www.cleartrip.com");	
		//rl.clik(flight_tab);
		//rl.clik(One_way);
		rl.clik(Round_trip);
		//rl.clik(Flash_sale);
		rl.EnterTextWithJS(From_tag,"Coimbatore");
		rl.enter(To_tag, "Chennai");
		rl.EnterTextWithJS(Date,"Sat, 29 Jun, 2019"); 
		rl.EnterTextWithJS(Return_Date,"Sun, 30 Jun, 2019" );
		rl.DropDown(Adults, 1);
		rl.DropDown(Children, 2);
		rl.DropDown(Infant, 1);
		rl.clik(More_Options);
		rl.DropDown(Classes, 1);
//		rl.EnterTextWithJS(Preffered_Airline,"SpiceJet");
		rl.clik(Search_flights);
		rl.Load(Book);
		//rl.clik(Book);
		//rl.clik(Currency);
		//rl.DropDown(Currency, 5);
		rl.Load(Home_page);
		//rl.clik(Home_page);
		
		rl.Load(Hotel_tab);
		//rl.clik(Hotel_tab);
		
		//rl.enter(Where,"Chennai");
		
		//WebElement WhereVal = driver.findElement(Where);
	    //rl.send(WhereVal);
		
		rl.enter(Where, (String) jo.get("WhereVal"));
		//rl.enter(Check_in, (String) jo.get("Checkin"));
		//rl.enter(Check_out, (String) jo.get("Checkout"));
		
		rl.EnterTextWithJS(Check_in,"Sat, 28 Jun, 2019");
		rl.EnterTextWithJS(Check_out, "Sun, 30 Jun, 2019");
		rl.DropDown(Travellers,0);
		rl.clik(Search_Hotels);		
		
	}
}
		