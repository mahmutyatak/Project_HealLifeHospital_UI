package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHomepage;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethod;

import java.io.IOException;
import java.time.Duration;

public class homepageStepDefinition {

    PageHomepage homepage= new PageHomepage();
    WebDriver driver= Driver.getDriver();

    @Given("Start browser, go to {string}")
    public void start_browser_go_to(String url) {
        homepage.goToUrl(url);
    }
    @Given("It is verified that the URL of the page the user went to contains {string}")
    public void ıt_is_verified_that_the_url_of_the_page_the_user_went_to_contains(String string) {
        homepage.urlQuery(string, driver.getCurrentUrl());
    }
    @Then("Browser closed")
    public void browser_closed() {
        Driver.quitDriver();
    }

    @And("Verify that the Site logo is visible at the URL to go")
    public void verifyThatTheSiteLogoIsVisibleAtTheURLToGo() {
        homepage.elementIsDisplayed(homepage.logoHospitalSite);
    }



    @And("Verified that the Latest News heading at the top of the Homepage is visible")
    public void verifiedThatTheLatestNewsHeadingAtTheTopOfTheHomepageIsVisible() {
        homepage.elementIsDisplayed(homepage.sliderLastestNews);
    }

    @And("The visibility of the site logo and menu titles in the User Homepage top bar is verified")
    public void theVisibilityOfTheSiteLogoAndMenuTitlesInTheUserHomepageTopBarIsVerified() {
        homepage.elementIsDisplayed(homepage.buttonsNavbarElements);
    }

    @And("It should be correct that when you click on the homelink, it redirects to the homepage")
    public void itShouldBeCorrectThatWhenYouClickOnTheHomelinkItRedirectsToTheHomepage() {
        homepage.buttonHomeLink.click();
        homepage.urlQuery("heallifehospital", driver.getCurrentUrl());
    }

    @And("When the user clicks on the menu titles in the top bar of the site, it is verified that he or she is directed to the correct pages.")
    public void whenTheUserClicksOnTheMenuTitlesInTheTopBarOfTheSiteItIsVerifiedThatHeOrSheIsDirectedToTheCorrectPages() {

        homepage.clickAndUrlQuery(homepage.buttonHomeLink,"frontend",Driver.getDriver().getCurrentUrl());
        homepage.clickAndUrlQuery(homepage.linkAppointmentPage,"appointment",Driver.getDriver().getCurrentUrl());
        homepage.clickAndUrlQuery(homepage.linkGalleryPage,"gallery",Driver.getDriver().getCurrentUrl());
        homepage.clickAndUrlQuery(homepage.linkContactusPage,"contact-us",Driver.getDriver().getCurrentUrl());


    }

    @And("User verifies slidebar has images and changes with time intervals")
    public void userVerifiesSlidebarHasImagesAndChangesWithTimeIntervals() throws InterruptedException {
        String firstImg=homepage.imgSliderFirst.getAttribute("src");
        ReusableMethod.bekle(10);
        String secondImg=homepage.imgSlidersecond.getAttribute("src");
        Assert.assertNotEquals(firstImg,secondImg);
        ReusableMethod.bekle(3);




    }

    @And("By clicking the icons next to the photos in the slider, it is verified that the image entries have been made.")
    public void byClickingTheIconsNextToThePhotosInTheSliderItIsVerifiedThatTheImageEntriesHaveBeenMade() {
        String firstImg=homepage.imgSliderFirst.getAttribute("src");
        ReusableMethod.bekle(10);
        homepage.rightSliderIcon.click();
        String secondImg=homepage.imgSlidersecond.getAttribute("src");
        Assert.assertNotEquals(firstImg,secondImg);
        ReusableMethod.bekle(3);
    }

    @And("Page scrolled down until Insurance Plans, Pediatric Services, Lab Testing, Opening Hours appeared")
    public void pageScrolledDownUntilInsurancePlansPediatricServicesLabTestingOpeningHoursAppeared() {
        JSUtilities.scrollToElement(driver,homepage.blogAndOpeningHours);
        ReusableMethod.bekle(3);
    }

    @And("Insurance Plans, Pediatric Services, Lab Testing, Opening Hours visibility verified")
    public void insurancePlansPediatricServicesLabTestingOpeningHoursVisibilityVerified() {
        homepage.elementIsDisplayed(homepage.blogAndOpeningHours);
    }

    @And("User verified that the Read More link under Insurance Plans leads to the correct page")
    public void userVerifiedThatTheReadMoreLinkUnderInsurancePlansLeadsToTheCorrectPage() {
        homepage.clickAndUrlQuery(homepage.buttonReadMoreInsurancePlans,"insurance-plans", driver.getCurrentUrl());
    }

    @And("User verified that Read More link under Pediatric Services section leads to correct page")
    public void userVerifiedThatReadMoreLinkUnderPediatricServicesSectionLeadsToCorrectPage() {
        homepage.clickAndUrlQuery(homepage.buttonReadMorePediatricServices,"pediatric-care", driver.getCurrentUrl());
    }

    @And("It has been verified by the user that the Read More link under the Lab Testing section leads to the correct page")
    public void itHasBeenVerifiedByTheUserThatTheReadMoreLinkUnderTheLabTestingSectionLeadsToTheCorrectPage() {
        homepage.clickAndUrlQuery(homepage.buttonReadMoreLabTesting,"lab-testing-and-digital-x-rays", driver.getCurrentUrl());
    }

    @And("Return to old page")
    public void returnToOldPage() {
        driver.navigate().back();
    }





    @And("The page is scrolled down until the text Featured Services is visible by the user")
    public void thePageIsScrolledDownUntilTheTextFeaturedServicesIsVisibleByTheUser() {
        JSUtilities.scrollToElement(driver,homepage.textFeaturedServices);
        ReusableMethod.bekle(3);
    }

    @And("Featured Services text visibility verified by user")
    public void featuredServicesTextVisibilityVerifiedByUser() {
        homepage.elementIsDisplayed(homepage.textFeaturedServices);
    }

    @And("The page is scrolled down until the Subject headings are visible under the Featured Services text by the user.")
    public void thePageIsScrolledDownUntilTheSubjectHeadingsAreVisibleUnderTheFeaturedServicesTextByTheUser() {
        JSUtilities.scrollToElement(driver,homepage.underFeaturedServicesInfoBlok);
        ReusableMethod.bekle(1);
    }

    @And("User verifies that Topic titles are visible under Featured Services")
    public void userVerifiesThatTopicTitlesAreVisibleUnderFeaturedServices() {
        homepage.elementIsDisplayed(homepage.underFeaturedServicesInfoBlok);
    }

    @And("The page is scrolled down until the doctors under the Our Doctors section are visible by the user.")
    public void thePageIsScrolledDownUntilTheDoctorsUnderTheOurDoctorsSectionAreVisibleByTheUser() {
        JSUtilities.scrollToElement(driver, homepage.infoForFirstOurDoctors);
    }

    @And("User verified that doctors are visible under Our Doctors section")
    public void userVerifiedThatDoctorsAreVisibleUnderOurDoctorsSection() {
        homepage.elementIsDisplayed(homepage.infoForFirstOurDoctors);
    }

    @And("The user scrolls down to the bottom of the page.")
    public void theUserScrollsDownToTheBottomOfThePage() {
        JSUtilities.scrollToBottom(driver);
        ReusableMethod.bekle(3);
    }

    @And("It must be true that the icons of the hospital's social media pages are visible")
    public void itMustBeTrueThatTheIconsOfTheHospitalSSocialMediaPagesAreVisible() {
        homepage.elementIsDisplayed(homepage.iconsAllSocialMedia);
    }

    @And("The user clicks on the facebook icon, confirms that the redirected page is the correct page")
    public void theUserClicksOnTheFacebookIconConfirmsThatTheRedirectedPageIsTheCorrectPage() {

        homepage.clikcElementAndSwitchToTabWindowAndQuerly(homepage.iconFacebook,"facebook");
        ReusableMethod.bekle(3);
    }

    @And("User verified that Home,Academics,Gallery,About,Event,Contact US titles in bottom bar are visible")
    public void userVerifiedThatHomeAcademicsGalleryAboutEventContactUSTitlesInBottomBarAreVisible() {
        homepage.elementIsDisplayed(homepage.linksHomeAcademicsContactAboutGallery);
    }

    @And("It is verified that the user's Home,Academics,Gallery,About,Event,Contact US links are directed to the correct addresses")
    public void itIsVerifiedThatTheUserSHomeAcademicsGalleryAboutEventContactUSLinksAreDirectedToTheCorrectAddresses() {
        homepage.clickAndUrlQuery(homepage.linkFooterHome,"heallifehospital", driver.getCurrentUrl());
        driver.navigate().back();
        ReusableMethod.bekle(1);
        homepage.clickAndUrlQuery(homepage.linkFooterAcademics,"meet-our-doctors", driver.getCurrentUrl());
        driver.navigate().back();
        ReusableMethod.bekle(1);
        homepage.clickAndUrlQuery(homepage.linkFooterContactUs,"contact", driver.getCurrentUrl());
        driver.navigate().back();
        ReusableMethod.bekle(1);
        homepage.clickAndUrlQuery(homepage.linkFooterAbout,"about", driver.getCurrentUrl());
        driver.navigate().back();
        ReusableMethod.bekle(1);
        homepage.clickAndUrlQuery(homepage.linkFooterGallery,"gallery", driver.getCurrentUrl());
    }

    @And("The user clicks on the twitter icon, confirms that the redirected page is the correct page")
    public void theUserClicksOnTheTwitterIconConfirmsThatTheRedirectedPageIsTheCorrectPage() {
        homepage.clikcElementAndSwitchToTabWindowAndQuerly(homepage.iconTwitter,"twitter");
    }

    @And("The user clicks on the youtube icon, confirms that the redirected page is the correct page")
    public void theUserClicksOnTheYoutubeIconConfirmsThatTheRedirectedPageIsTheCorrectPage() {
        homepage.clikcElementAndSwitchToTabWindowAndQuerly(homepage.iconYoutube,"youtube");
    }

    @And("The user clicks on the google plus icon, confirms that the redirected page is the correct page")
    public void theUserClicksOnTheGooglePlusIconConfirmsThatTheRedirectedPageIsTheCorrectPage() {
        homepage.clikcElementAndSwitchToTabWindowAndQuerly(homepage.iconGooglePlus,"google");
    }

    @And("The user clicks on the Linkedin icon, confirms that the redirected page is the correct page")
    public void theUserClicksOnTheLinkedinIconConfirmsThatTheRedirectedPageIsTheCorrectPage() {
        homepage.clikcElementAndSwitchToTabWindowAndQuerly(homepage.iconLinkedin,"linkedin");
    }

    @And("The user clicks on the instagram icon, confirms that the redirected page is the correct page")
    public void theUserClicksOnTheInstagramIconConfirmsThatTheRedirectedPageIsTheCorrectPage() {
        homepage.clikcElementAndSwitchToTabWindowAndQuerly(homepage.iconInstagram,"instagram");
    }

    @And("The user clicks on the printeres icon, confirms that the redirected page is the correct page")
    public void theUserClicksOnThePrinteresIconConfirmsThatTheRedirectedPageIsTheCorrectPage() {
        homepage.clikcElementAndSwitchToTabWindowAndQuerly(homepage.iconPrintest,"pinterest");
    }

    @Then("Browser quit")
    public void browserQuit()
    {
        driver.quit();
    }

    @And("The user confirms that the hospital's contact information \\(phone, mail, address) is visible")
    public void theUserConfirmsThatTheHospitalSContactInformationPhoneMailAddressIsVisible() {
        homepage.elementIsDisplayed(homepage.iconFooterPhone);
    }

    @And("When the user clicks on the hospital contact information, he confirms that he has taken the relevant action")
    public void whenTheUserClicksOnTheHospitalContactInformationHeConfirmsThatHeHasTakenTheRelevantAction() throws IOException {

        homepage.iconFooterPhone.click();
        ReusableMethod.getScreenshot("ContactYonlendirme");
        homepage.urlQuery("contact", driver.getCurrentUrl());
     //   homepage.clickAndUrlQuery(homepage.iconFooterPhone,"contact", driver.getCurrentUrl());


    }

    @And("User verifies that the Complain title and icon are visible in the footer of the page")
    public void userVerifiesThatTheComplainTitleAndIconAreVisibleInTheFooterOfThePage() {
        homepage.elementIsDisplayed(homepage.iconFooterCompain);
    }


    @And("When the user clicks on the Complain title and icon at the bottom of the page, it redirects to the correct page.")
    public void whenTheUserClicksOnTheComplainTitleAndIconAtTheBottomOfThePageItRedirectsToTheCorrectPage() {
        homepage.clickAndUrlQuery(homepage.iconFooterCompain,"complain", driver.getCurrentUrl());
    }

    @And("The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address")
    public void theUserClicksOnTheAppointmentLinkAtTheTopOfThePageAndItIsVerifiedThatItForwardsToTheCorrectAddress() {
        homepage.clickAndUrlQuery(homepage.linkAppointment,"appointment", driver.getCurrentUrl());
    }

    @And("On the page entered by the user, it is verified that Specialist, Doctor, Shift, Date dropDowns are selectable.")
    public void onThePageEnteredByTheUserItIsVerifiedThatSpecialistDoctorShiftDateDropDownsAreSelectable() {
        homepage.choosingAnAppointmentSlot();

    }

    @And("It is verified that the appropriate slot is seen in accordance with the information entered by the user.")
    public void itIsVerifiedThatTheAppropriateSlotIsSeenInAccordanceWithTheInformationEnteredByTheUser() {
        homepage.elementIsDisplayed(homepage.optionSlotTime);
    }

    @And("Even if all appointment information is entered when the Message box is left blank by the user The Message field is required. the visibility of the text must be verified")
    public void evenIfAllAppointmentInformationIsEnteredWhenTheMessageBoxIsLeftBlankByTheUserTheMessageFieldIsRequiredTheVisibilityOfTheTextMustBeVerified() {
        homepage.elementIsDisplayed(homepage.iconStarForMessage);
    }

    @And("After the user enters the necessary information for the appointment, selects the slot, and selects the desired time interval in the window that opens It should be verified that the patient can choose and patient information can be entered.")
    public void afterTheUserEntersTheNecessaryInformationForTheAppointmentSelectsTheSlotAndSelectsTheDesiredTimeIntervalInTheWindowThatOpensItShouldBeVerifiedThatThePatientCanChooseAndPatientInformationCanBeEntered() {
        homepage.appointmentInformationEntryMethod();
    }

    @And("If the user is a former patient, she enters her information and makes an appointment")
    public void ifTheUserIsAFormerPatientSheEntersHerInformationAndMakesAnAppointment() {
        homepage.oldPatientAppointment("furkan.veli.inal","heallife123");
        ReusableMethod.bekle(2);
    }

    @And("appointments can be made by creating a new patient record")
    public void appointmentsCanBeMadeByCreatingANewPatientRecord() {
        homepage.createNewAppointment("6541236554");
        ReusableMethod.bekle(3);
    }

    @And("The result of the patient who has a new appointment is confirmed to be directed to the dashboard.")
    public void theResultOfThePatientWhoHasANewAppointmentIsConfirmedToBeDirectedToTheDashboard() {
        homepage.oldPatientAppointment("furkan.veli.inal","heallife123");

    }

    @And("t is verified that it redirects to its dashboard page")
    public void tIsVerifiedThatItRedirectsToItsDashboardPage() {
        homepage.urlQuery("dashboard", driver.getCurrentUrl());
    }

    @And("User verifies that the About Us dropDown is visible in the upper abdomen of the homepage")
    public void userVerifiesThatTheAboutUsDropDownIsVisibleInTheUpperAbdomenOfTheHomepage() {
        homepage.elementIsDisplayed(homepage.dropDownAboutUs);

    }

    @And("It is verified that the link links appear when you mouse over About Us")
    public void itIsVerifiedThatTheLinkLinksAppearWhenYouMouseOverAboutUs() {
        homepage.dropDownAboutUs.click();
        Assert.assertTrue(homepage.linkAboutHospital.isDisplayed());
    }

    @And("Confirmed that About Hospital linkedin under About us redirected to the correct page")
    public void confirmedThatAboutHospitalLinkedinUnderAboutUsRedirectedToTheCorrectPage() {
        homepage.dropDownAboutUs.click();
        homepage.clickAndUrlQuery(homepage.linkAboutHospital,"about-hospitals", driver.getCurrentUrl());

    }

    @And("Verifies that the text Some words About US is visible on the page navigated to")
    public void verifiesThatTheTextSomeWordsAboutUSIsVisibleOnThePageNavigatedTo() {
        homepage.elementIsDisplayed(homepage.textSomeWordsAboutUS);
    }

    @And("Verifies that the text Some words Our Mission is visible on the page that is navigated to")
    public void verifiesThatTheTextSomeWordsOurMissionIsVisibleOnThePageThatIsNavigatedTo() {
        homepage.elementIsDisplayed(homepage.infoOurMission);
    }

    @And("Verifies that the Opening Hours text is visible on the entered page")
    public void verifiesThatTheOpeningHoursTextIsVisibleOnTheEnteredPage() {
        homepage.elementIsDisplayed(homepage.infoOpeninHours);
    }

    @And("Verify that our specialist is visible")
    public void verifyThatOurSpecialistIsVisible() {
        homepage.elementIsDisplayed(homepage.bloc3Doctors);
    }

    @And("The user clicks the Meet Our Doctors link from the About Us dropdown in the homepage top bar")
    public void theUserClicksTheMeetOurDoctorsLinkFromTheAboutUsDropdownInTheHomepageTopBar() {
        homepage.dropDownAboutUs.click();
        homepage.clickAndUrlQuery(homepage.linkMeetOurDoctors,"meet-our-doctors", driver.getCurrentUrl());

    }

    @And("The user confirms that the information \\(name, picture, title) of the units and the doctors working in those units are visible on the Meet Our Doctors page.")
    public void theUserConfirmsThatTheInformationNamePictureTitleOfTheUnitsAndTheDoctorsWorkingInThoseUnitsAreVisibleOnTheMeetOurDoctorsPage() {
        homepage.elementIsDisplayed(homepage.infoForDoctors);
    }

    @And("The user clicks the FAQ's link from the About Us dropdown in the homepage top bar")
    public void theUserClicksTheFAQSLinkFromTheAboutUsDropdownInTheHomepageTopBar() {
        homepage.dropDownAboutUs.click();
        homepage.clickAndUrlQuery(homepage.linkFAQ,"faq", driver.getCurrentUrl());
    }

    @And("Verifies that the What Our Clients Say and What Our Doctor Say headers are visible")
    public void verifiesThatTheWhatOurClientsSayAndWhatOurDoctorSayHeadersAreVisible() {
        homepage.elementIsDisplayed(homepage.blocsForQuestions);
    }

    @And("Clicking on any question title displayed the answer")
    public void clickingOnAnyQuestionTitleDisplayedTheAnswer() {
        homepage.oneQuestionForVisa.click();
        ReusableMethod.bekle(1);
        homepage.elementIsDisplayed(homepage.oneAnswerForVisa);
    }

    @And("The user clicks the Departments link from the About Us dropdown in the homepage top bar")
    public void theUserClicksTheDepartmentsLinkFromTheAboutUsDropdownInTheHomepageTopBar() {
        homepage.dropDownAboutUs.click();
        homepage.clickAndUrlQuery(homepage.linkDepartmentsInAboutUsDropdown,"departments", driver.getCurrentUrl());
    }

    @And("The user confirms that the information about the hospital departments is visible on the page.")
    public void theUserConfirmsThatTheInformationAboutTheHospitalDepartmentsIsVisibleOnThePage() {
        homepage.elementIsDisplayed(homepage.blocDepartment);
    }

    @And("The user clicks the Testimonials link from the About Us dropdown in the homepage top bar")
    public void theUserClicksTheTestimonialsLinkFromTheAboutUsDropdownInTheHomepageTopBar() {
        homepage.dropDownAboutUs.click();
        homepage.clickAndUrlQuery(homepage.linkTestimonials,"testimonials", driver.getCurrentUrl());
    }

    @And("The patient comments about the hospital that have been treated are displayed.")
    public void thePatientCommentsAboutTheHospitalThatHaveBeenTreatedAreDisplayed() {
        homepage.elementIsDisplayed(homepage.contentTestimanials);
    }

    @And("User clicks Gallery link in homepage top bar")
    public void userClicksGalleryLinkInHomepageTopBar() {
        homepage.linkGalleryPage.click();
    }

    @And("User verifies that the URL of the visited page contains gallery")
    public void userVerifiesThatTheURLOfTheVisitedPageContainsGallery() {
        homepage.urlQuery("gallery", driver.getCurrentUrl());
    }

    @And("The user must verify that the images of the specified sections \\(divided into Health & Wellness, Hospitals and Directions, Specialties, Recreation Centre, Your Health, Surgery sections) are visible on the page they go to.")
    public void theUserMustVerifyThatTheImagesOfTheSpecifiedSectionsDividedIntoHealthWellnessHospitalsAndDirectionsSpecialtiesRecreationCentreYourHealthSurgerySectionsAreVisibleOnThePageTheyGoTo() {
        homepage.elementIsDisplayed(homepage.contentGallery);
    }

    @And("User clicks Contact US link in homepage top bar")
    public void userClicksContactUSLinkInHomepageTopBar() {
        homepage.linkContactusPage.click();
    }

    @And("User verifies that the URL of the visited page contains contact us")
    public void userVerifiesThatTheURLOfTheVisitedPageContainsContactUs() {
        homepage.urlQuery("contact-us", driver.getCurrentUrl());
    }

    @And("The user confirms that the relevant textBoxes are visible in the Let's Talk section of the entered page.")
    public void theUserConfirmsThatTheRelevantTextBoxesAreVisibleInTheLetSTalkSectionOfTheEnteredPage() {
        homepage.elementIsDisplayed(homepage.contentContactUs);
    }

    @And("User verifies that the message delivered alert is visible by filling out the lets talk section")
    public void userVerifiesThatTheMessageDeliveredAlertIsVisibleByFillingOutTheLetsTalkSection() {
        Faker faker=new Faker();
        homepage.textBoxNameInContactUs.sendKeys(faker.name().fullName());
        homepage.textBoxEmailInContactUs.sendKeys("aydinliefe38@gmail.com");
        homepage.textBoxSubjectInContactUs.sendKeys(faker.medical().symptoms());
        homepage.textBoxDescriptionsInContactUs.sendKeys(faker.letterify("agrilarim var ne yapmam lazim"));
        homepage.buttonSubmitContactUs.click();
        homepage.elementIsDisplayed(homepage.textAlertSuccessMesage);
    }

    @And("The visible truths of the map on the User Contact US page")
    public void theVisibleTruthsOfTheMapOnTheUserContactUSPage() {
        JSUtilities.scrollToElement(driver, homepage.mapContentInContactUS);
        ReusableMethod.bekle(2);
        homepage.elementIsDisplayed(homepage.mapContentInContactUS);
    }

}
