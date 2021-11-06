package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US08_page {
     public US08_page(){
         PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelLink;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy(partialLinkText = "Room reservations")
    public WebElement roomReservationButton;

    @FindBy(id = "IDUser")
    public WebElement selectUser;

     @FindBy(id = "IDHotelRoom")
    public  WebElement selectHotelRoom;

     @FindBy(id = "Price")
    public  WebElement price;

     @FindBy(xpath = "//button[@class='btn default']")
    public List<WebElement> listOfDateButtons;

     @FindBy(xpath = "//input[@placeholder='DateStart']")
    public WebElement dateStart;

    @FindBy(xpath = "//input[@placeholder='DateEnd']")
    public WebElement dateEnd;

    @FindBy(xpath = "//td[@class='day']")
    public  List<WebElement> listOfDays;

    @FindBy(xpath = "//th[@class='next']")
    public WebElement next;

    @FindBy(id = "AdultAmount")
    public WebElement adultAmount;

    @FindBy(id = "ChildrenAmount")
    public WebElement childrenAmount;

    @FindBy(id = "ContactNameSurname")
    public WebElement contactNameSurname;

    @FindBy(id = "ContactPhone")
    public WebElement contactPhone;

    @FindBy(id = "ContactEmail")
    public WebElement contactEmail;

    @FindBy(id = "Notes")
    public WebElement notes;

    @FindBy(id = "Approved")
    public WebElement approved;

    @FindBy(id = "IsPaid")
    public WebElement isPaid;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='RoomReservation was inserted successfully']")
    public WebElement successMessage;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButton;

    @FindBy(xpath = "//label[@class='error']")
    public List<WebElement> errorTexts;

    @FindBy(xpath = "//div[text()='Fill All Fields Please']")
    public WebElement fillallfieldstext;

}
