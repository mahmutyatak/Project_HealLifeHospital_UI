package pages;

import com.github.javafaker.Faker;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethod;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class PageHomepage extends Base{
    WebDriver driver= Driver.getDriver();
    @FindBy(xpath = "//*[@class='navbar-brand logo']")
    public WebElement logoHospitalSite;

    @FindBy(xpath = "//*[@class='col-md-9 col-sm-12']")
    public WebElement sliderLastestNews;

    @FindBy(xpath = "//*[@class='collapse navbar-collapse']")
    public WebElement buttonsNavbarElements;

    @FindBy(xpath = "(//a[text()='Home'])[1]")
    public WebElement buttonHomeLink;

    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement linkAppointmentPage;

    @FindBy(xpath = "(//*[text()='Gallery'])[1]")
    public WebElement linkGalleryPage;

    @FindBy(xpath = "(//*[text()='Contact Us'])[1]")
    public WebElement linkContactusPage;

    @FindBy(xpath = "(//*[@class='col-md-12 col-sm-12'])[2]")
    public WebElement contentContactUs;

    @FindBy(id = "name")
    public WebElement textBoxNameInContactUs;

    @FindBy(id = "email")
    public WebElement textBoxEmailInContactUs;

    @FindBy(id = "subject")
    public WebElement textBoxSubjectInContactUs;

    @FindBy(id = "description")
    public WebElement textBoxDescriptionsInContactUs;

    @FindBy(xpath = "//*[@class='view-all-btn btn btn-primary']")
    public WebElement buttonSubmitContactUs;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    public  WebElement textAlertSuccessMesage;

    @FindBy(xpath = "(//*[@aria-label='Harita'])[1]")
    public WebElement contentMapInContactUs;


    @FindBy(xpath = "//*[@src='https://qa.heallifehospital.com/uploads/gallery/media/slider2.jpg']")
    public WebElement imgSlidersecond;

    @FindBy(xpath = "//*[@src='https://qa.heallifehospital.com/uploads/gallery/media/slider1.jpg']")
    public WebElement imgSliderFirst;

    @FindBy(xpath = "//*[@data-slide='prev']")
    public WebElement leftSliderIcon;

    @FindBy(xpath = "//*[@data-slide='next']")
    public WebElement rightSliderIcon;

    @FindBy (xpath = "//*[@class='col-md-12 hometop']")
    public WebElement blogAndOpeningHours;

    @FindBy(xpath = "(//*[@title='Read More'])[1]")
    public WebElement buttonReadMoreInsurancePlans;

    @FindBy(xpath = "(//*[@title='Read More'])[2]")
    public WebElement buttonReadMorePediatricServices;

    @FindBy(xpath = "(//*[@title='Read More'])[3]")
    public WebElement buttonReadMoreLabTesting;

    @FindBy(xpath = "//*[text()='Featured Services']")
    public WebElement textFeaturedServices;

    @FindBy(xpath = "(//*[@class='row text-center'])[1]")
    public WebElement underFeaturedServicesInfoBlok;

    @FindBy(xpath = "(//*[@class='team-member'])[1]")
    public WebElement infoForFirstOurDoctors;

    @FindBy(xpath = "//*[@class='company-social']")
    public WebElement iconsAllSocialMedia;

    @FindBy(xpath = "//*[@class='fa fa-facebook']")
    public WebElement iconFacebook;

    @FindBy(xpath = "//*[@class='fa fa-twitter']")
    public WebElement iconTwitter;


    @FindBy(xpath = "//*[@class='fa fa-youtube']")
    public WebElement iconYoutube;

    @FindBy(xpath = "//*[@class='fa fa-google-plus']")
    public WebElement iconGooglePlus;

    @FindBy(xpath = "//*[@class='fa fa-linkedin']")
    public WebElement iconLinkedin;

    @FindBy(xpath = "//*[@class='fa fa-instagram']")
    public WebElement iconInstagram;

    @FindBy(xpath = "//*[@class='fa fa-pinterest']")
    public WebElement iconPrintest;

    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-4'])[2]")
    public WebElement linksHomeAcademicsContactAboutGallery;

    @FindBy(xpath = "(//*[text()='Home'])[2]")
    public WebElement linkFooterHome;

    @FindBy(xpath = "//*[text()='Academics']")
    public WebElement linkFooterAcademics;

    @FindBy(xpath = "(//*[text()='Contact Us'])[2]")
    public WebElement linkFooterContactUs;

    @FindBy(xpath = "//*[text()='About']")
    public WebElement linkFooterAbout;

    @FindBy(xpath = "(//*[text()='Gallery'])[2]")
    public WebElement linkFooterGallery;

    @FindBy(xpath = "(//*[@class='contacts-item'])[1]")
    public WebElement iconFooterPhone;

    @FindBy(xpath = "(//*[@class='contacts-item'])[2]")
    public WebElement iconFooterMail;

    @FindBy(xpath = "(//*[@class='contacts-item'])[3]")
    public WebElement iconFooterAddress;

    @FindBy(xpath = "//*[text()='Complain']")
    public WebElement iconFooterCompain;

    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement linkAppointment;

    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[1]")
    public WebElement dropDownSpecialist;

    @FindBy (xpath = "(//*[@class='select2-selection__arrow'])[2]")
    public WebElement dropDownDoctor;

    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
    public WebElement dropDownShift;

    @FindBy(id = "datetimepicker1")
    public WebElement dropDownDatePanel;

    @FindBy(xpath = "//*[@class='slot-details each-slot-duration']")
    public WebElement optionSlotTime;

    @FindBy(xpath = "(//*[@class='req'])[1]")
    public WebElement iconStarForMessage;

    @FindBy(id = "slot_1")
    public WebElement buttonAppointmentTimeInSlot;
    @FindBy(id = "slot_2")
    public WebElement buttonAppointmentTimeInSlot2;

    @FindBy(xpath = "//*[@value='new patient']")
    public WebElement radioButtonNewPatient;

    @FindBy(id = "patient_name")
    public WebElement textBoxPatientFormPatientName;

    @FindBy(id = "email")
    public WebElement textBoxPatientFormEmail;

    @FindBy(id = "gender")
    public WebElement dropDownPatientFormGender;

    @FindBy(id = "phone")
    public WebElement textBoxPatientFormPhoneNumber;

    @FindBy(id = "submitbtn")
    public WebElement buttonPatientFormSubbmit;

    @FindBy(xpath = "//*[@type='text/css']")
    public WebElement messageAlert;

    @FindBy(id = "message")
    public WebElement textBoxMessage;

    @FindBy(xpath = "//*[@value='old patient']")
    public  WebElement radioButtonOldPatient;

    @FindBy(id = "username")
    public WebElement textBoxOldPatientUsername;

    @FindBy(id = "password")
    public WebElement textBoxOldPatientPassword;

    @FindBy(xpath = "//*[text()='  Pay']")
    public WebElement iconPaymentLink;

    @FindBy(xpath = "//*[text()='Pay with Card']")
    public WebElement buttonPayWithCard;

    @FindBy(xpath = "//*[@class='emailInput input']")
    public WebElement textBoxPaymentPageEmail;

    @FindBy(xpath = "//*[@class='cardNumberInput input top']")
    public WebElement textBoxPaymentPageCardNumber;

    @FindBy(xpath = "//*[@class='cardExpiresInput input left bottom']")
    public WebElement textBoxPaymentPageCardDate;

    @FindBy(xpath = "//*[@class='cardCVCInput input right bottom']")
    public WebElement textBoxPaymentPageCardCCV;

    @FindBy(id = "submitButton")
    public WebElement buttonPaymentPageSubmit;

    @FindBy(id = "billing-zip")
    public WebElement textBoxPaymentPageZipCode;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]")
    public  WebElement textAppointmentDate;

    @FindBy(xpath = "//*[text()='13.05.2023 04:10 PM']")
    public WebElement textNewAppointmentDate;

    @FindBy(xpath = "//*[@class='dropdown-toggle']")
    public WebElement dropDownAboutUs;

    @FindBy(xpath = "//*[text()='About Hospitals']")
    public WebElement linkAboutHospital;

    @FindBy(xpath = "(//*[@class='col-md-6 col-sm-6'])[2]")
    public WebElement textSomeWordsAboutUS;

    @FindBy(xpath = "//*[@class='col-md-8 col-sm-8']")
    public WebElement infoOurMission;

    @FindBy(xpath = "//*[@class='opening-hours']")
    public WebElement infoOpeninHours;

    @FindBy(xpath = "(//*[@class='col-md-3 col-sm-6'])[3]")
    public  WebElement bloc3Doctors;

    @FindBy(xpath = "//*[text()='Meet Our Doctors']")
    public WebElement linkMeetOurDoctors;

    @FindBy(xpath = "(//*[@class='row'])[3]")
    public WebElement infoForDoctors;

    @FindBy(xpath = "//*[text()='FAQ’s']")
    public WebElement linkFAQ;

    @FindBy(xpath = "(//*[@class='row'])[3]")
    public WebElement blocsForQuestions;

    @FindBy(xpath = "//*[text()='How do I obtain my visa?']")
    public WebElement oneQuestionForVisa;

    @FindBy(xpath = "(//*[@class='panel-body pxlr-faq-body'])[2]")
    public WebElement oneAnswerForVisa;

    @FindBy(xpath = "//*[text()='Departments']")
    public WebElement linkDepartmentsInAboutUsDropdown;

    @FindBy(xpath = "//*[@class='col-md-12 col-sm-12']")
    public WebElement blocDepartment;

    @FindBy(xpath = "//*[text()='Testimonials']")
    public WebElement linkTestimonials;

    @FindBy(xpath = "//*[@class='col-md-12 col-sm-12']")
    public WebElement contentTestimanials;

    @FindBy(xpath = "(//*[@class='row'])[3]")
    public  WebElement contentGallery;

    @FindBy(xpath = "//*[text()='Map']")
    public WebElement mapContentInContactUS;



    public  void urlQuery(String expUrlContent,String actUrl){
        actUrl=driver.getCurrentUrl();

        Assert.assertTrue(actUrl.contains(expUrlContent));

    }
    public void elementIsDisplayed(WebElement elementName){
        Assert.assertTrue(elementName.isDisplayed());
    }
    public void elementIsSelected(WebElement elementName){

        Assert.assertTrue(elementName.isSelected());
    }

    public void elementIsEnabled(WebElement elementName){

        Assert.assertTrue(elementName.isEnabled());
    }

    public void selectInDropDownAndUrlQuery(WebElement elementName,String selectedText, String expUrlContent,String actUrl){
        elementName.click();
        ReusableMethod.bekle(1);
        Select select=new Select(elementName);
        select.selectByVisibleText(selectedText);
        ReusableMethod.bekle(1);
        actUrl=driver.getCurrentUrl();
        urlQuery(expUrlContent,actUrl);

    }

    public void goToUrl(String url){

        driver.get(ConfigReader.getProperty(url));

    }
    public void clickAndUrlQuery(WebElement element,String expUrlContent,String actUrl){
        element.click();
        actUrl=Driver.getDriver().getCurrentUrl();
        urlQuery(expUrlContent,actUrl);
        ReusableMethod.bekle(1);
    }




    public void clikcElementAndSwitchToTabWindowAndQuerly(WebElement element,String expUrlContent){
        String firstWHD=driver.getWindowHandle();
        element.click();
        ReusableMethod.bekle(2);
        Set<String> tumSayfalarWHDSeti=driver.getWindowHandles();
        String ikinciSayfaWHD="";
        for (String each:tumSayfalarWHDSeti
        ) {
            if (!each.equals(firstWHD)){
                ikinciSayfaWHD=each;
            }
        }
        driver.switchTo().window(ikinciSayfaWHD);
        ReusableMethod.bekle(3);
        urlQuery(expUrlContent,driver.getCurrentUrl());
        driver.switchTo().window(firstWHD);



    }
    public void selectInDropDown(WebElement elemenName,String selectedText){
        elemenName.click();
        Select select = new Select(dropDownSpecialist);
        select.selectByValue("1");
    }

    public void choosingAnAppointmentSlot(){

       dropDownSpecialist.click();
        ReusableMethod.bekle(1);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethod.bekle(1);

        dropDownDoctor.click();
        ReusableMethod.bekle(1);
        actions=new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER).perform();
        ReusableMethod.bekle(1);


        dropDownShift.click();
        ReusableMethod.bekle(1);
        actions=new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethod.bekle(1);

        dropDownDatePanel.click();
        ReusableMethod.bekle(1);
        actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethod.bekle(1);

        elementIsDisplayed(optionSlotTime);

        textBoxMessage.sendKeys("agrim var");

        optionSlotTime.click();

        ReusableMethod.bekle(2);

        driver.switchTo().alert().accept();
    }

    public  void appointmentInformationEntryMethod(){
        choosingAnAppointmentSlot();

        buttonAppointmentTimeInSlot.click();
        ReusableMethod.bekle(1);
        radioButtonNewPatient.click();
        ReusableMethod.bekle(1);
        Faker faker=new Faker();
        textBoxPatientFormPatientName.sendKeys(faker.name().fullName());
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        textBoxPatientFormEmail.sendKeys(faker.internet().emailAddress());
        actions.sendKeys(Keys.TAB).perform();
        Select select=new Select(dropDownPatientFormGender);
        select.selectByVisibleText("Male");
        actions.sendKeys(Keys.TAB).perform();
        textBoxPatientFormPhoneNumber.sendKeys(faker.phoneNumber().phoneNumber());


    }

    public void createNewAppointment(String phoneNumber){
        choosingAnAppointmentSlot();

        buttonAppointmentTimeInSlot2.click();
        ReusableMethod.bekle(1);
        radioButtonNewPatient.click();
        ReusableMethod.bekle(1);
        Faker faker=new Faker();
        textBoxPatientFormPatientName.sendKeys(faker.name().fullName());
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        textBoxPatientFormEmail.sendKeys(faker.internet().emailAddress());
        actions.sendKeys(Keys.TAB).perform();
        Select select=new Select(dropDownPatientFormGender);
        select.selectByVisibleText("Male");
        actions.sendKeys(Keys.TAB).perform();
        textBoxPatientFormPhoneNumber.sendKeys((phoneNumber));
        buttonPatientFormSubbmit.click();
        ReusableMethod.bekle(3);
        urlQuery("appointment", driver.getCurrentUrl());


    }
    public  void oldPatientAppointment(String username,String password) {
        choosingAnAppointmentSlot();
        buttonAppointmentTimeInSlot.click();
        ReusableMethod.bekle(1);
        radioButtonOldPatient.click();
        textBoxOldPatientUsername.sendKeys(username);
        textBoxOldPatientPassword.sendKeys(password);
        Date date = new Date();
        long olusturmaDate = date.getTime();
        buttonPatientFormSubbmit.click();
        ReusableMethod.bekle(3);
        urlQuery("appointment", driver.getCurrentUrl());


    }


}
