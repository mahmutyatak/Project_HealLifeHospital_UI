package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePatientDashboard extends Base{

    @FindBy (xpath = "//*[text()='User Login']")
    public WebElement textUserLogin;

    @FindBy(xpath = "//*[@class='col-lg-6 col-sm-6 col-sm-6']")
    public WebElement textLastestNew;

    @FindBy(xpath = "(//*[text()='Read More'])[1]")
    public WebElement linkReadMoreNews;

    @FindBy(xpath = "//*[text()=' Forgot Password']")
    public WebElement linkForgetPassword;

    @FindBy(id = "form-username")
    public WebElement textBoxEmail;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement buttonForgetPasswordSubmit;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    public WebElement textSendMailAlert;

    @FindBy(xpath = "//*[text()=' User Login']")
    public WebElement linkUserLogin;

    @FindBy(xpath = "//*[text()='Invalid Username or Password']")
    public WebElement textWrongAlert;

    @FindBy(xpath = "//*[@class='logo-lg']")
    public WebElement logoPatientDashboard;

    @FindBy(xpath = "//span[.='My Appointments']")
    public WebElement linkAppointmentPatient;

    @FindBy(xpath = "//*[.=' OPD']")
    public WebElement linkOpdPatient;

    @FindBy(xpath = "//span[.=' IPD']")
    public WebElement linkIpdPatient;

    @FindBy(xpath = "//*[.=' Pharmacy']")
    public WebElement linkPharmacy;

    @FindBy(xpath = "//*[.=' Pathology']")
    public WebElement linkPathology;

    @FindBy(xpath = "//*[.=' Radiology']")
    public WebElement linkRadiology;

    @FindBy(xpath = "//*[.=' Ambulance']")
    public WebElement linkAmbulance;

    @FindBy(xpath = "//*[.=' Blood Bank']")
    public WebElement linkBloodBank;

    @FindBy(xpath = "//*[@class='sidebar-toggle']")
    public WebElement linkToggleNavigation;

    @FindBy(xpath = "(//img[@alt='Heal Life Hospital & Research Center'])[1]")
    public WebElement logoPatientDashboardMini;

    @FindBy(xpath = "//span[.=' English']")
    public WebElement englishFlag;

    @FindBy(xpath = ("//*[@id=\"alert\"]/nav/div[2]/div/div/div/div/div/ul/li[2]/a/span"))
    public WebElement turkishFlag;

    @FindBy(xpath = "//*[@href=\"https://qa.heallifehospital.com/patient/systemnotifications\"]")
    public WebElement notifications;

    @FindBy(xpath = "//*[.=\"Notifications\"]")
    public WebElement getNotificationsText;

    @FindBy(xpath = "//*[.=' Delete All']")
    public WebElement deleteAll;

    @FindBy(xpath = "//*[.='No Record Found']")
    public WebElement noRecordFoundText;

    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement hLHRCenterText;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement profilePicture;

    @FindBy(xpath = "//*[.='ali.tozcu']")
    public WebElement profileUserName;

    @FindBy(xpath = "//*[.='Patient']")
    public WebElement profileTitle;

    @FindBy(xpath = "(//img[@alt='User Image'])[2]")
    public WebElement profileProfilePicture;

    @FindBy(xpath = "//*[.=' Change Password']")
    public WebElement profileChangePassword;

    @FindBy(xpath = "//*[@name='current_pass']")
    public WebElement changePasswordCurrent;

    @FindBy(xpath = "//*[@name='new_pass']")
    public WebElement changePasswordNew;

    @FindBy(xpath = "//*[@name='confirm_pass']")
    public WebElement changePasswordComfirm;

    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement changePasswordButton;

    @FindBy(xpath = " //*[.=' Logout']")
    public WebElement profileLogoutButton;






}
