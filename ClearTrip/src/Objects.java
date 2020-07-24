import org.openqa.selenium.By;

public interface Objects {
 By flight_tab=By.xpath("//ul[@class='navGroup productNav withArrows']//li[@class='flightApp']//a[@href='/flights']");
 By Flash_sale=By.xpath("//a[@id='flightsHomeFlashSaleBanner']");
 By One_way = By.xpath("//input[@id='OneWay']");
 By Round_trip = By.xpath("//input[@id='RoundTrip']");
 By Multi_City = By.xpath("//input[@id='MultiCity']");
 By From_tag = By.xpath("//input[@id='FromTag']");
 By To_tag = By.xpath("//input[@id='ToTag']");
 By Date = By.xpath("//input[@id='DepartDate']");
 By Return_Date = By.id("ReturnDate");
 By Adults = By.id("Adults");
 By Children = By.id("Childrens");
 By Infant = By.id("Infants");
 By More_Options = By.id("MoreOptionsLink");
 By Classes = By.id("Class");
 By Preffered_Airline = By.id("AirlineAutocomplete");
 By Search_flights = By.id("SearchBtn");
 By Modify_search = By.id("modifySearchLink");
 By Book = By.xpath("//div[@id='ResultContainer_1_1']//button[@class='booking fRight']");
// By Currency = By.xpath("//a[@class='listMenuLink currencyLink']");
 By Home_page = By.xpath("//a[@class='brand forceHttp'] ");
 By Hotel_tab = By.xpath("//a[@title='Find hotels in destinations around the world']");
 By Where = By.id("Tags");
 By Check_in = By.id("CheckInDate");
 By Check_out = By.id("CheckOutDate");
 By Travellers = By.id("travellersOnhome");
 By Search_Hotels = By.id("SearchHotelsButton");
// By gmail=By.xpath("//a[@href='https://mail.google.com/mail/?tab=rm&ogbl']");
 
}
