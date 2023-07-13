package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class PageLogin extends Base{

    WebDriver driver= Driver.getDriver();

    @FindBy(id = "email")
    public WebElement textBoxUsername;

    @FindBy(id = "password")
    public WebElement textBoxPassword;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement buttonSignIn;

    @FindBy(id = "email")
    public WebElement textBoxDoctorUsername;

    @FindBy(id = "password")
    public WebElement textBoxDoctorPassword;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement buttonSignInDoctorLoginPage;

    @FindBy(id = "email")
    public WebElement textBoxAdminUsername;

    @FindBy(id = "password")
    public WebElement textBoxAdminPassword;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement buttonSignInAdminLoginPage;


    public void userLoginMethod(String username,String password){

        ReusableMethod.bekle(1);
        textBoxUsername.sendKeys(ConfigReader.getProperty(username));
        textBoxPassword.sendKeys(ConfigReader.getProperty(password));



    }

    public void doctorLoginMethod(String username,String password){
        ReusableMethod.bekle(1);
        textBoxDoctorUsername.sendKeys(ConfigReader.getProperty(username));
        textBoxDoctorPassword.sendKeys(ConfigReader.getProperty(password));

    }
    public void adminLoginMethod(String username,String password){


        textBoxAdminUsername.sendKeys(ConfigReader.getProperty(username));
        textBoxAdminPassword.sendKeys(ConfigReader.getProperty(password));


    }
}
