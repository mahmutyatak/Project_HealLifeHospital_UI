package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.PageHomepage;
import pages.PageLogin;
import pages.PagePatientDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class patientStepdefinition {
    PageLogin pageLogin=new PageLogin();
    PageHomepage homepage=new PageHomepage();
    PagePatientDashboard pagePatientDashboard = new PagePatientDashboard();
    WebDriver driver=Driver.getDriver();

    @Given("Start browser , go to {string}")
    public void start_browser_go_to(String string) {
        homepage.goToUrl(string);
    }
    @Given("User fills {string} and {string} textBoxes")
    public void user_fills_and_text_boxes(String string, String string2) {
        pageLogin.userLoginMethod(string,string2);
    }
    @Given("User clicks sign in button")
    public void user_clicks_sign_in_button() {
        homepage.clickAndUrlQuery(pageLogin.buttonSignIn,"patient", Driver.getDriver().getCurrentUrl());

    }
    @Then("Browser  closed")
    public void browser_closed() {
        Driver.closeDriver();

    }

    @And("When   Verify that the page {string} has been accessed")
    public void whenVerifyThatThePageHasBeenAccessed(String userLoginURL) {
        homepage.goToUrl(userLoginURL);

    }



    @And("Visibility of Latest News information is verified")
    public void visibilityOfLatestNewsInformationIsVerified() {
        homepage.elementIsDisplayed(pagePatientDashboard.textLastestNew);
    }

    @When("Verify that Latest News information is accessible")
    public void verifyThatLatestNewsInformationIsAccessible() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkReadMoreNews,"alexander-smith", driver.getCurrentUrl());
    }

    @Given("Visibility of userLogin is verified")
    public void visibilityOfUserLoginIsVerified() {
        homepage.elementIsDisplayed(pagePatientDashboard.textUserLogin);
    }

    @Given("Click on the forgot password link on the page that opens")
    public void clickOnTheForgotPasswordLinkOnThePageThatOpens() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkForgetPassword,"ufpassword", driver.getCurrentUrl());
    }

    @And("Enter valid email into email textBox")
    public void enterValidEmailIntoEmailTextBox() {
        pagePatientDashboard.textBoxEmail.sendKeys("aydinliefe38@gmail.com");
    }

    @And("Click the Submit button")
    public void clickTheSubmitButton() {
        pagePatientDashboard.buttonForgetPasswordSubmit.click();
    }


    @And("sentToMailText text visibility is verified")
    public void senttomailtextTextVisibilityIsVerified() {
        homepage.elementIsDisplayed(pagePatientDashboard.textSendMailAlert);
    }

    @Then("Clicking on the User Login link will return to the login page again.")
    public void clickingOnTheUserLoginLinkWillReturnToTheLoginPageAgain() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkUserLogin,"userlogin", driver.getCurrentUrl());
    }

    @Given("Enters {string} from examples as username")
    public void entersFromExamplesAsUsername(String username) {
        pageLogin.textBoxUsername.sendKeys(username);
    }

    @And("Enters {string} from examples as password")
    public void entersFromExamplesAsPassword(String password) {
        pageLogin.textBoxPassword.sendKeys(password);
    }

    @And("Presses the Sign In button")
    public void pressesTheSignInButton() {
    pageLogin.buttonSignIn.click();
    }

    @And("Tests that login is not possible")
    public void testsThatLoginIsNotPossible() {

    }

    @And("User click dashboard logo and it is verified that the page is refreshed")
    public void userClickDashboardLogoAndItIsVerifiedThatThePageIsRefreshed() {
        homepage.clickAndUrlQuery(pagePatientDashboard.logoPatientDashboard,"dashboard", driver.getCurrentUrl());
    }

    @And("User clicks appointment Link and it is verified that the page navigated")
    public void userClicksAppointmentLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkAppointmentPatient, "appointment", driver.getCurrentUrl());
    }

    @And("User clicks opdLink and it is verified that the page navigated")
    public void userClicksOpdLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkOpdPatient, "profile", driver.getCurrentUrl());
    }

    @And("User clicks ipdLink and it is verified that the page navigated")
    public void userClicksIpdLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkIpdPatient, "patientipddetails", driver.getCurrentUrl());
    }

    @And("User clicks the Pharmacy link and it is verified that the page navigated")
    public void userClicksThePharmacyLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkPharmacy, "pharmacybill", driver.getCurrentUrl());
    }

    @And("User clicks the Pathology link and it is verified that the page navigated")
    public void userClicksThePathologyLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkPathology, "pathology", driver.getCurrentUrl());
    }

    @And("User clicks the Radiology link and it is verified that the page navigated")
    public void userClicksTheRadiologyLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkRadiology, "radiology", driver.getCurrentUrl());
    }

    @And("User clicks the Ambulance link and it is verified that the page navigated")
    public void userClicksTheAmbulanceLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkAmbulance, "ambulance", driver.getCurrentUrl());
    }

    @And("User clicks the Bloodbank link and it is verified that the page navigated")
    public void userClicksTheBloodbankLinkAndItIsVerifiedThatThePageNavigated() {
        homepage.clickAndUrlQuery(pagePatientDashboard.linkBloodBank, "bloodbank", driver.getCurrentUrl());
    }

    @And("User clicks the menu icon \\(three lines one below the other) and it is verified that the mini logo is displayed")
    public void userClicksTheMenuIconThreeLinesOneBelowTheOtherAndItIsVerifiedThatTheMiniLogoIsDisplayed() {
        ReusableMethod.bekle(3);
        pagePatientDashboard.linkToggleNavigation.click();
        homepage.elementIsDisplayed(pagePatientDashboard.logoPatientDashboardMini);
    }

    @And("User clicks the menu icon \\(three lines one below the other) and it is verified that the Heal Life Hospital logo is displayed")
    public void userClicksTheMenuIconThreeLinesOneBelowTheOtherAndItIsVerifiedThatTheHealLifeHospitalLogoIsDisplayed() {
        ReusableMethod.bekle(3);
        pagePatientDashboard.linkToggleNavigation.click();
        homepage.elementIsDisplayed(pagePatientDashboard.logoPatientDashboard);
    }

    @And("User click dashboard logo and it leaded to the panel homepage")
    public void userClickDashboardLogoAndItLeadedToThePanelHomepage() {
        homepage.clickAndUrlQuery(pagePatientDashboard.logoPatientDashboard,"dashboard", driver.getCurrentUrl());
    }

    @And("User clicks English Flag and cliks Turkish Flag and verifies that Turkish Flag is visible")
    public void userClicksEnglishFlagAndCliksTurkishFlagAndVerifiesThatTurkishFlagIsVisible() {
        pagePatientDashboard.englishFlag.click();
        ReusableMethod.bekle(1);
        pagePatientDashboard.turkishFlag.click();
        ReusableMethod.bekle(1);
        pagePatientDashboard.turkishFlag.isDisplayed();
    }


    @And("User clicks notifications icon and verifies that Notifications text is visible")
    public void userClicksNotificationsIconAndVerifiesThatNotificationsTextIsVisible() {
        pagePatientDashboard.notifications.click();
        pagePatientDashboard.getNotificationsText.isDisplayed();

    }

    @And("User clicks notifications icon and verifies that notification list on the systemnotifications page is displayed and notifications are deleted")
    public void userClicksNotificationsIconAndVerifiesThatNotificationListOnTheSystemnotificationsPageIsDisplayedAndNotificationsAreDeleted() {
        pagePatientDashboard.notifications.click();
        homepage.urlQuery("systemnotifications", driver.getCurrentUrl());
        pagePatientDashboard.deleteAll.click();
        driver.switchTo().alert().accept();
        homepage.elementIsDisplayed(pagePatientDashboard.noRecordFoundText);

    }

    @And("User clicks Dasboard navbar and verifies that Heal Life Hospital & Research Center text is displayed")
    public void userClicksDasboardNavbarAndVerifiesThatHealLifeHospitalResearchCenterTextIsDisplayed() {
        homepage.elementIsDisplayed(pagePatientDashboard.hLHRCenterText);
    }

    @And("User clicks on the profile picture in the Dashboard navbar, the user name, title and profile picture are displayed in the tab that opens.")
    public void userClicksOnTheProfilePictureInTheDashboardNavbarTheUserNameTitleAndProfilePictureAreDisplayedInTheTabThatOpens() {
        pagePatientDashboard.profilePicture.click();
        homepage.elementIsDisplayed(pagePatientDashboard.profileUserName);
        homepage.elementIsDisplayed(pagePatientDashboard.profileTitle);
        homepage.elementIsDisplayed(pagePatientDashboard.profileProfilePicture);
    }

    @And("User cliks profile icon and cliks change password link")
    public void userCliksProfileIconAndCliksChangePasswordLink() {
        pagePatientDashboard.profilePicture.click();
        ReusableMethod.bekle(1);
        pagePatientDashboard.profileChangePassword.click();
    }

    @And("User fills related text boxes and clicks change password button")
    public void userFillsRelatedTextBoxesAndClicksChangePasswordButton() {
        homepage.urlQuery("changepass", driver.getCurrentUrl());
        pagePatientDashboard.changePasswordCurrent.sendKeys("1234");
        pagePatientDashboard.changePasswordNew.sendKeys("heallife123");
        pagePatientDashboard.changePasswordComfirm.sendKeys("heallife123");
        pagePatientDashboard.changePasswordButton.click();
        ReusableMethod.bekle(10);
        
    }

    @And("User cliks profile icon and cliks logout button")
    public void userCliksProfileIconAndCliksLogoutButton() {
        pagePatientDashboard.profilePicture.click();
        ReusableMethod.bekle(1);
        homepage.clickAndUrlQuery(pagePatientDashboard.profileLogoutButton, "userlogin", driver.getCurrentUrl());
    }

}
