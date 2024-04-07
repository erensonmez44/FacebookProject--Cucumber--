package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){ 
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = ("(//a[contains(text(),'Yeni hesap oluştur')])[1]"))
    public WebElement signupButton;

    @FindBy (name = "firstname")
    public WebElement username;

    @FindBy (name = "lastname")
    public WebElement lastName;

    @FindBy (name = "reg_email__")
    public WebElement email;
    @FindBy (name = "reg_email_confirmation__")
    public WebElement emailConfirmation;

    @FindBy (name = "reg_passwd__")
    public WebElement password;

    @FindBy (name = "birthday_day")
    public WebElement birthDay;

    @FindBy (name = "birthday_month")
    public WebElement birthdayMonth;

    @FindBy (name = "birthday_year")
    public WebElement birthdayYear;

    @FindBy (xpath = "//span[.='Erkek']")
    public WebElement gender;

    @FindBy (xpath = "(//button[.=\"Kaydol\"])[1]")
    public WebElement finalsignupButton;
}
