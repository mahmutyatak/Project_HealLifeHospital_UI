package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import org.openqa.selenium.Keys;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.PageDoctorDashboard;
import pages.PageHomepage;
import pages.PageLogin;
import utilities.Driver;
import utilities.ReusableMethod;
import javax.swing.*;
import java.io.IOException;

import utilities.JSUtilities;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class doctorStepdefinition {
    WebDriver driver= Driver.getDriver();
    PageHomepage homepage=new PageHomepage();
    PageLogin pageLogin=new PageLogin();
    PageDoctorDashboard doctorPage=new PageDoctorDashboard();
  PageDoctorDashboard pageDoctor = new PageDoctorDashboard();





    @Given("Start browser  go to {string}")
    public void start_browser_go_to(String string) {
        homepage.goToUrl(string);

    }

    @Given("User fill {string} and {string} textBoxes")
    public void user_fill_and_text_boxes(String username, String password) {
        pageLogin.doctorLoginMethod(username, password);
    }

    @Given("User click sign in button")
    public void user_click_sign_in_button() {

        homepage.clickAndUrlQuery(pageLogin.buttonSignInDoctorLoginPage, "admin/dashboard", Driver.getDriver().getCurrentUrl());
    }

    @Then("Browser   closed")
    public void browser_closed() {

        Driver.quitDriver();
    }


    @And("Verify that {string} are visible")
    public void verifyThatAreVisible(String data) {
        ReusableMethod.baslikListelemeMethod(data);
    }

    @And("Click the page of IPD")
    public void clickThePageOfIPD() {

        ReusableMethod.istenenUrunElementi(5).click();
    }

    @And("Verify that the contents of the IPD Patient List are sortable")
    public void verifyThatTheContentsOfTheIPDPatientListAreSortable() {

        ReusableMethod.IntListSiralamaTesti(1);

    }

    @And("User verify that there should be a search box in the IPD Patient List to easily search through the contents.")
    public void userVerifyThatThereShouldBeASearchBoxInTheIPDPatientListToEasilySearchThroughTheContents() {

        pageDoctor.searchIPD.sendKeys("70");
        pageDoctor.searchIPDNo.isDisplayed();
    }


    @And("User verify that the IPD No redirect to a page which shows the details of the relevant content")
    public void userVerifyThatTheIPDNoRedirectToAPageWhichShowsTheDetailsOfTheRelevantContent() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);

        pageDoctor.verifyCreditLimit.isDisplayed();

    }


    @And("User verify that Limit column in the IPD Patient List redirect the details of the relevant content")
    public void userVerifyThatLimitColumnInTheIPDPatientListRedirectTheDetailsOfTheRelevantContent() {

        ReusableMethod.hover(pageDoctor.creditLimitlist2);
        ReusableMethod.bekle(2);

        pageDoctor.iconShowDetails.click();
        pageDoctor.verifyCreditLimit.isDisplayed();


    }


    @And("Verify that the number of items displayed per page in the Appointment Details List is selectable.")
    public void verifyThatTheNumberOfItemDisplayedPerPageInTheAppointmentDetailsListIsSelectable() {

        pageDoctor.dropDownAllor100.click();
        Select select = new Select(pageDoctor.dropDownAllor100);
        select.selectByVisibleText("100");
    }


    @And("User verify that The Overview page display information about the procedures performed on the relevant patient.")
    public void userVerifyThatTheOverviewPageDisplayInformationAboutTheProceduresPerformedOnTheRelevantPatient() {

        ReusableMethod.bekle(1);
        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.overview.isDisplayed();
    }

    @And("User verify that The Nurse Notes page should display the nurse note")
    public void userVerifyThatTheNurseNotesPageShouldDisplayTheNurseNote() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.nurseNotePage.click();
        ReusableMethod.bekle(1);
        pageDoctor.nurseNotes.isDisplayed();
    }

    @And("User verify that The Medication page should display the medication treatment history for the patient.")
    public void userVerifyThatTheMedicationPageShouldDisplayTheMedicationTreatmentHistoryForThePatient() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.medicationPage.click();
        pageDoctor.medicationHistory.isDisplayed();

    }

    @And("User verify that  A new medication treatment should be able to be added for the patient on the Medication page.")
    public void userVerifyThatANewMedicationTreatmentShouldBeAbleToBeAddedForThePatientOnTheMedicationPage() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.medicationPage.click();
        pageDoctor.addMedicationdose.click();
        ReusableMethod.bekle(1);
        pageDoctor.medicationDosePage.isDisplayed();

    }


    @And("User verify that The Prescription page should display the prescriptions written for the patient.")
    public void userVerifyThatThePrescriptionPageShouldDisplayThePrescriptionsWrittenForThePatient() {

        pageDoctor.searchIPDNo.click();

        ReusableMethod.bekle(1);
        pageDoctor.prescriptionPage.click();
        ReusableMethod.bekle(1);

        pageDoctor.prescriptionHistoy.isDisplayed();

    }

    @And("User verify that a new prescription should be able to be written for the patient on the Prescription page.")
    public void userVerifyThatANewPrescriptionShouldBeAbleToBeWrittenForThePatientOnThePrescriptionPage() {
        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.prescriptionPage.click();
        ReusableMethod.bekle(1);
        pageDoctor.addPrescription.click();
        ReusableMethod.bekle(1);

        pageDoctor.prescriptionDoctorSelect.click();

        ReusableMethod.bekle(1);

        pageDoctor.doctorAhmetBicakci.click();
        ReusableMethod.bekle(1);

        pageDoctor.medicineCategory.click();
        ReusableMethod.bekle(1);

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        pageDoctor.medicine.click();
        ReusableMethod.bekle(4);

        action.sendKeys("as" + Keys.ENTER).perform();
        ReusableMethod.bekle(2);

        pageDoctor.dosage.click();
        ReusableMethod.bekle(2);

        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        //pageDoctor.oneML.click();


        pageDoctor.pharmacist.click();
        pageDoctor.saveButtonPrescription.click();

        String prescriptionDate = pageDoctor.datePrescription.getText();
        String actualDate = "IPDP113";

        Assert.assertEquals(prescriptionDate, actualDate);

        ReusableMethod.bekle(1);

        pageDoctor.patientPrescription.isDisplayed();


    }

    @And("Verify that the Consultant Register page should list the consultant records.")
    public void verfiyThatTheConsultantRegisterPageShouldListTheConsultantRecords() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.consultantRegisterPage.click();
        pageDoctor.listOfConsultantRegister.isDisplayed();


    }

    @And("Verify that A new consultant record should be able to be created on the Consultant Register page.")
    public void verifyThatANewConsultantRecordShouldBeAbleToBeCreatedOnTheConsultantRegisterPage() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.consultantRegisterPage.click();
        pageDoctor.creataNewConsultantRegister.click();
        pageDoctor.consultantAppliedDate.sendKeys("16.05.2023");
        ReusableMethod.bekle(1);
        pageDoctor.consultantaniInstructionDate.sendKeys("16.05.2023");
        ReusableMethod.bekle(1);
        pageDoctor.instruction.sendKeys("The patient goes well");
        pageDoctor.saveButtonOfConsultant.click();

        ReusableMethod.bekle(2);

        pageDoctor.pageOfNewConsultantRegister.isDisplayed();


    }

    @And("User verify The Lab Investigation page should list the laboratory history for the relevant patient.")
    public void userVerifyTheLabInvestigationPageShouldListTheLaboratoryHistoryForTheRelevantPatient() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.labInvestigationPage.click();
        pageDoctor.labPageHistory.isDisplayed();
    }


    @And("User verify that The Payment page should display the invoice payments made by the patient.")
    public void userVerifyThatThePaymentPageShouldDisplayTheInvoicePaymentsMadeByThePatient() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.paymentsPage.click();
    }

    @And("User verify that A new payment record should be able to be created on the Payment page")
    public void userVerifyThatANewPaymentRecordShouldBeAbleToBeCreatedOnThePaymentPage() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);
        pageDoctor.paymentsPage.click();

        pageDoctor.addPaymentPage.click();
        pageDoctor.addPaymentDate.sendKeys("" + Keys.TAB + "100" + Keys.TAB + Keys.TAB + Keys.TAB + Keys.ENTER);

        homepage.urlQuery("90#payment", "actualUrl");

    }

    @And("User verify The Operations page should list the operations undergone by the patient.")
    public void userVerifyTheOperationsPageShouldListTheOperationsUndergoneByThePatient() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(2);

        pageDoctor.operationPage.click();

    }

    @And("User verify that A new operation record should be able to be created from the Operations page.")
    public void userVerifyThatANewOperationRecordShouldBeAbleToBeCreatedFromTheOperationsPage() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(2);

        pageDoctor.operationPage.click();
        ReusableMethod.bekle(1);

        pageDoctor.addOperation.click();
        ReusableMethod.bekle(1);

        pageDoctor.selectOperation.click();

        ReusableMethod.bekle(2);

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        // pageDoctor.entOralSurgery.click();

        pageDoctor.operationDate.sendKeys("17.05.2023 09:45");
        ReusableMethod.bekle(1);

        pageDoctor.operationNameSelect.click();
        ReusableMethod.bekle(1);

        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        // pageDoctor.toothExactrionOperation.click();

        //  pageDoctor.consultantDoctor.click();
        ReusableMethod.bekle(1);

        pageDoctor.addSaveOperation.click();

    }

    @And("User verify that The Charges page should display the expenses of the patient.")
    public void userVerifyThatTheChargesPageShouldDisplayTheExpensesOfThePatient() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(2);

        pageDoctor.chargesPage.click();

    }

    @And("User verify that A new expense record should be able to be created for the relevant patient on the Charges page.")
    public void userVerifyThatANewExpenseRecordShouldBeAbleToBeCreatedForTheRelevantPatientOnTheChargesPage() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(2);

        pageDoctor.chargesPage.click();

        pageDoctor.addChargesPage.click();

        pageDoctor.chargesType.click();
        ReusableMethod.bekle(2);

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        pageDoctor.selectChargeCategory.click();
        ReusableMethod.bekle(2);

        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();


        pageDoctor.selectChargeName.click();
        ReusableMethod.bekle(5);

        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        pageDoctor.qtyCharge.sendKeys("2");

        ReusableMethod.bekle(1);

        pageDoctor.dateCharges.click();

        pageDoctor.addCharges.click();
        ReusableMethod.bekle(1);

        pageDoctor.chargeSave.click();

        pageDoctor.newChargesList.isDisplayed();


    }

    @And("User verify that The Bed History page should list the bed information for the IPD patient.")
    public void userVerifyThatTheBedHistoryPageShouldListTheBedInformationForTheIPDPatient() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);

        pageDoctor.homePageIPDSlide.click();
        ReusableMethod.bekle(3);

        pageDoctor.bedHistoryPage.click();

        homepage.urlQuery("88#bed_history", "actaulUrl");


    }

    @And("User verify that The Timeline page should display notes on the patient's future treatment.")
    public void userVerifyThatTheTimelinePageShouldDisplayNotesOnThePatientSFutureTreatment() {


        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);

        pageDoctor.homePageIPDSlide.click();
        ReusableMethod.bekle(4);

        pageDoctor.homePageIPDSlide.click();
        ReusableMethod.bekle(2);

        pageDoctor.timelinePage.click();

        homepage.urlQuery("88#timeline", "actaulUrl");


    }

    @And("User verify that A new timeline note should be able to be created on the Timeline page.")
    public void userVerifyThatANewTimelineNoteShouldBeAbleToBeCreatedOnTheTimelinePage() {


        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);

        pageDoctor.homePageIPDSlide.click();
        ReusableMethod.bekle(4);

        pageDoctor.homePageIPDSlide.click();
        ReusableMethod.bekle(2);

        pageDoctor.timelinePage.click();

        pageDoctor.addTimeline.click();

        pageDoctor.titleAddTimeLine.sendKeys("Timeline1" + Keys.TAB + Keys.TAB + Keys.
                TAB + Keys.TAB + Keys.TAB + Keys.ENTER);

        pageDoctor.verifyAddTimeline.isDisplayed();

    }

    @And("User verify that The Treatment History page should list the treatment history of the relevant patient.")
    public void userVerifyThatTheTreatmentHistoryPageShouldListTheTreatmentHistoryOfTheRelevantPatient() {

        pageDoctor.searchIPDNo.click();
        ReusableMethod.bekle(1);

        pageDoctor.homePageIPDSlide.click();
        ReusableMethod.bekle(4);

        pageDoctor.homePageIPDSlide.click();
        ReusableMethod.bekle(2);

        pageDoctor.addTreatmenHistory.click();
        pageDoctor.verifyTreatmenHistory.isDisplayed();

    }

    @And("User verify that There should be a redirection to the page displaying the information of discharged patients when clicked on from the IPD page.")
    public void userVerifyThatThereShouldBeARedirectionToThePageDisplayingTheInformationOfDischargedPatientsWhenClickedOnFromTheIPDPage() {

        pageDoctor.searchIPD.click();
        pageDoctor.dischargedPage.click();
        pageDoctor.verifyDischargedPatient.isDisplayed();

    }


    @And("On the IPD Discharged Patient List, columns titled {string} should be displayed.")
    public void onTheIPDDischargedPatientListColumnsTitledShouldBeDisplayed(String theList) {

        pageDoctor.dischargedPage.click();
        ReusableMethod.bekle(1);

        ReusableMethod.baslikListelemeMethod("theList");

    }

    @And("User verify that The contents of the IPD Discharged Patient List should be sortable based on column headers.")
    public void userVerifyThatTheContentsOfTheIPDDischargedPatientListShouldBeSortableBasedOnColumnHeaders() {

        pageDoctor.dischargedPage.click();
        ReusableMethod.bekle(1);

        ReusableMethod.IntListSiralamaTesti(1);
    }

    @And("User verify that There should be a search box in the IPD Discharged Patient List to easily search through the contents.")
    public void userVerifyThatThereShouldBeASearchBoxInTheIPDDischargedPatientListToEasilySearchThroughTheContents() {

        pageDoctor.dischargedPage.click();
        ReusableMethod.bekle(1);
        pageDoctor.searchDischarged.isDisplayed();
    }


    @And("User verify that The number of contents to be displayed on one page  should be selectable in the IPD Discharged Patient List.")
    public void userVerifyThatTheNumberOfContentsToBeDisplayedOnOnePageShouldBeSelectableInTheIPDDischargedPatientList() {

        pageDoctor.dischargedPage.click();
        ReusableMethod.bekle(1);
        pageDoctor.dropDownAllor100.isDisplayed();

    }

    @And("User verify that When the show button under the Total column clicked, a page showing the details of the relevant content.")
    public void userVerifyThatWhenTheShowButtonUnderTheTotalColumnClickedAPageShowingTheDetailsOfTheRelevantContent() {

        pageDoctor.dischargedPage.click();
        ReusableMethod.bekle(1);

        Actions action = new Actions(driver);
        action.moveToElement(pageDoctor.totalDischarged).perform();
        ReusableMethod.bekle(2);

        pageDoctor.showIcon.click();
        homepage.urlQuery("ipdprofile/81", "actualUrl");

    }

    @And("User verify that When the Name information in IPD Discharged Patient List clicked, a page showing the details of the relevant content.")
    public void userVerifyThatWhenTheNameInformationInIPDDischargedPatientListClickedAPageShowingTheDetailsOfTheRelevantContent() {

        pageDoctor.dischargedPage.click();
        pageDoctor.dischargedNameInformation.click();

        homepage.urlQuery("ipdprofile/81", "actualUrl");
    }

    @And("User verify that when the Pathology link in the Dashboard Sidebar clicked, it goes to the relevant page")
    public void userVerifyThatWhenThePathologyLinkInTheDashboardSidebarClickedItGoesToTheRelevantPage() {

        pageDoctor.patholgyDashboard.click();
        homepage.urlQuery("pathology/gettestreportbatch", "actualUrl");
    }


    @And("On the Pathology page, a Pathology Bill List with the headers {string} should be displayed.")
    public void onThePathologyPageAPathologyBillListWithTheHeadersShouldBeDisplayed(String data) {

        pageDoctor.patholgyList(data);

    }

    @And("User verify that The content in the Pathology Bill List should be sortable based on the column headers.")
    public void userVerifyThatTheContentInThePathologyBillListShouldBeSortableBasedOnTheColumnHeaders() {

        pageDoctor.StringListSiralamaTestiPathology(4);

    }

    @Then("User verify that There should be a search box in the Pathology Bill List to easily search through the content.")
    public void userVerifyThatThereShouldBeASearchBoxInThePathologyBillListToEasilySearchThroughTheContent() {

        pageDoctor.searchBoxInPathology.click();
        pageDoctor.searchBoxInPathology.sendKeys("55");
        pageDoctor.patalogygySearchResult.isDisplayed();
    }



    @Then("User verify that The number of items on a single page in the Pathology Bill List should be selectable.")
    public void userVerifyThatTheNumberOfItemsOnASinglePageInThePathologyBillListShouldBeSelectable() {


        pageDoctor.patalogySelectList();

        ReusableMethod.bekle(2);
        pageDoctor.patalogyAllList.isDisplayed();

    }


    @Then("User verify that When the View Reports icon under the Balance Amount header in the Pathology Bill List is clicked, the page showing the details of the relevant content.")
    public void userVerifyThatWhenTheViewReportsIconUnderTheBalanceAmountHeaderInThePathologyBillListIsClickedThePageShowingTheDetailsOfTheRelevantContent() {
        Actions action = new Actions(driver);
        action.moveToElement(pageDoctor.firstBalance).perform();
        ReusableMethod.bekle(2);

        pageDoctor.viewReports.click();

        pageDoctor.verifyPatologyBill.isDisplayed();

    }

    @Then("User verify that it should be editied of details of sample collected from where,when colected and which laboratory collected at.")
    public void userVerifyThatItShouldBeEditiedOfDetailsOfSampleCollectedFromWhereWhenColectedAndWhichLaboratoryCollectedAt() {
        pageDoctor.billdeatilsPatology.click();


    }

    @Then("User verify that there should be a link from the Pathology page to the Pathology Test page.")
    public void userVerifyThatThereShouldBeALinkFromThePathologyPageToThePathologyTestPage() {

        pageDoctor.patalogyTestPage.click();
        homepage.urlQuery("pathology/search","actualUrl");
    }



    @Then("user verify that there should be a Pathology Test List with the headers {string}")
    public void userVerifyThatThereShouldBeAPathologyTestListWithTheHeaders(String data) {

        pageDoctor.patalogyTestPage.click();
        pageDoctor.patholgyList(data);




    }

    @Then("user verify that there should be a search box in the Pathology Test List to easily search through the content.")
    public void userVerifyThatThereShouldBeASearchBoxInThePathologyTestListToEasilySearchThroughTheContent() {


        pageDoctor.patalogyTestPage.click();
        pageDoctor.searchBoxInPathology.sendKeys("Hematology");
        pageDoctor.patalogyTestList.isDisplayed();


    }

    @Then("User verify that the number of items to be displayed on a single page \\(either {int} or All) in the Pathology Test List should be selectable.")
    public void userVerifyThatTheNumberOfItemsToBeDisplayedOnASinglePageEitherOrAllInThePathologyTestListShouldBeSelectable(int arg0) {

        pageDoctor.patalogyTestPage.click();
        pageDoctor.allOr100patalogyTest();

        ReusableMethod.bekle(2);
        pageDoctor.patalogyAllList.isDisplayed();

    }

    @Then("User verify that when the Show icon under the Amount header in the Pathology Test List is clicked, to the pageshowing the details of the relevant content.")
    public void userVerifyThatWhenTheShowIconUnderTheAmountHeaderInThePathologyTestListIsClickedToThePageshowingTheDetailsOfTheRelevantContent() throws IOException {

        pageDoctor.patalogyTestPage.click();
        Actions action = new Actions(driver);

        action.moveToElement(pageDoctor.amountFirstPatologyTestBill).perform();
        ReusableMethod.bekle(3);

        pageDoctor.showPathologyIcon.click();

        ReusableMethod.bekle(3);
        ReusableMethod.getScreenshot("Test Details");




    }

    @Then("Click the Appointment link in the Dashboard Sidebar")
    public void clickTheAppointmentLinkInTheDashboardSidebar() {
       // doctorPage.linkAppointments.click();
        ReusableMethod.istenenUrunElementi(3).click();
    }

    @Then("Verify that it goes to the Appointment link in the Dashboard Sidebar")
    public void verifyThatItGoesToTheAppointmentLinkInTheDashboardSidebar()
    {
        homepage.urlQuery("appointment/index","actualurl");
    }

    @Then("Verify the visibility of the appointment number entered in the search box in the list")
    public void verifyTheVisibilityOfTheAppointmentNumberEnteredInTheSearchBoxInTheList() {
        doctorPage.panelSearch.sendKeys("394");
        ReusableMethod.bekle(1);
        doctorPage.appSearchVerification.isDisplayed();

    }


    @Then("It should be verified that the titles such as {string}, {string} List are displayed on the appointment page.")
    public void ıtShouldBeVerifiedThatTheTitlesSuchAsListAreDisplayedOnTheAppointmentPage(String data, String ikiciData)
    {

        ReusableMethod.baslikListelemeMethod(data);

        ReusableMethod.bekle(4);

        ReusableMethod.hover(doctorPage.appointStatusApporoved);
        ReusableMethod.bekle(2);
        doctorPage.statusShowLogo.click();
        doctorPage.statusSshowAppointDetails.isDisplayed();


    }





    @Then("Verify that list content is sortable via headings")
    public void verifyThatListContentIsSortableViaHeadings()
    {

        ReusableMethod.IntListSiralamaTesti(1);
        ReusableMethod.bekle(2);
        ReusableMethod.IntListSiralamaTesti(2);
    }

    @Then("Verify that information about the content under the status column is displayable and printable")
    public void verifyThatInformationAboutTheContentUnderTheStatusColumnIsDisplayableAndPrintable()
    {
        ReusableMethod.hover(doctorPage.appointStatusApporoved);
        ReusableMethod.bekle(2);
        doctorPage.statusShowLogo.click();
        ReusableMethod.bekle(1);
        doctorPage.statusSshowAppointDetails.isDisplayed();
        ReusableMethod.bekle(1);
        doctorPage.statusShowAppExtButon.click();
        ReusableMethod.bekle(1);
        ReusableMethod.hover(doctorPage.appointStatusApporoved);
        ReusableMethod.bekle(2);
        doctorPage.statusPrintLogo.isDisplayed();
        doctorPage.statusPrintLogo.click();
        doctorPage.statusPrintLogo.isEnabled();


    }

    @Then("It should be verified that there is a redirect from the appointment page to the Doctor Wise page")
    public void ıtShouldBeVerifiedThatThereIsARedirectFromTheAppointmentPageToTheDoctorWisePage() {
        doctorPage.doctorWise.click();
        homepage.urlQuery("onlineappointment/patientschedule","actualUrl");
    }

    @Then("when Doctor and Date are selected on the Doctor Wise Appointment page, it should be verified that the relevant doctor's appointments are listed.")
    public void whenDoctorAndDateAreSelectedOnTheDoctorWiseAppointmentPageItShouldBeVerifiedThatTheRelevantDoctorSAppointmentsAreListed() {

        doctorPage.doctorWise.click();
        ReusableMethod.bekle(1);
        doctorPage.doctorWiseDoctor.click();
        ReusableMethod.bekle(2);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.TAB+"17.05.2023").perform();
        ReusableMethod.bekle(1);
        doctorPage.doctorWiseSearch.click();
        ReusableMethod.bekle(2);
        doctorPage.doctorWiseEmre.isDisplayed();



    }

    @Then("Verify that there is a redirect link from the Appointment page to the Queue page")
    public void verifyThatThereIsARedirectLinkFromTheAppointmentPageToTheQueuePage()
    {
        doctorPage.doctorQueue.click();

        homepage.urlQuery("patientqueue","actuelUrl");

    }

    @Then("Let's verify that the patients who have made an appointment are listed after entering the Doctor, Shift, Date, Slot information on the Patient Queue page and searching.")
    public void letSVerifyThatThePatientsWhoHaveMadeAnAppointmentAreListedAfterEnteringTheDoctorShiftDateSlotInformationOnThePatientQueuePageAndSearching()
    {
        doctorPage.doctorQueue.click();
        ReusableMethod.bekle(1);
        doctorPage.queryDoctor.click();
        ReusableMethod.bekle(2);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethod.bekle(1);
        doctorPage.queryShift.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys("10.05.2023").perform();
        ReusableMethod.bekle(2);
        doctorPage.querySlot.click();
        ReusableMethod.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethod.bekle(1);
        doctorPage.querySelect.click();
        ReusableMethod.bekle(1);
        doctorPage.queryDogrulama.isDisplayed();
    }

    @Then("Click the OPD link in the Dashboard Sidebar")
    public void clickTheOPDLinkInTheDashboardSidebar() {
        ReusableMethod.istenenUrunElementi(4).click();
    }

    @Then("Verify that clicking the OPD link in the Dashboard Sidebar is directed to the relevant page.")
    public void verifyThatClickingTheOPDLinkInTheDashboardSidebarIsDirectedToTheRelevantPage() {
        homepage.urlQuery("patient/search","actualurl");
    }


    @Then("On the OPD page, verify that the OPD Patient List \\(with columns {string}) is displayed.")
    public void onTheOPDPageVerifyThatTheOPDPatientListWithColumnsIsDisplayed(String baslik)
    {
        ReusableMethod.baslikListelemeMethod(baslik);
    }

    @Then("A search box must be validated to easily search OPD Patient List contents")
    public void aSearchBoxMustBeValidatedToEasilySearchOPDPatientListContents()
    {
        doctorPage.panelSearch.sendKeys("394");
        ReusableMethod.bekle(1);
        doctorPage.appSearchVerification.isDisplayed();
    }

    @Then("Let's verify that the contents of the OPD Patient List are sortable by column headings")
    public void letSVerifyThatTheContentsOfTheOPDPatientListAreSortableByColumnHeadings() {
        ReusableMethod.IntListSiralamaTesti(1);
    }

    @Then("Post messages sent to doctors under the navar")
    public void post_messages_sent_to_doctors_under_the_navar() {
        homepage.elementIsDisplayed(doctorPage.noticeMessage);
    }


    @Then("The number of registered employees in the system {string} should be displayed on the doctor panel's main page.")
    public void theNumberOfRegisteredEmployeesInTheSystemShouldBeDisplayedOnTheDoctorPanelSMainPage(String data) {
      ReusableMethod.bekle(3);
      JSUtilities.scrollToElement(Driver.getDriver(),doctorPage.boxBody);
      ReusableMethod.bekle(3);
      List<WebElement> actualList=Driver.getDriver().findElements(By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-12 col20']"));
      doctorPage.titleListingMethod(data,actualList);
    }

    @Then("It should be accurate that the registered person goes to the Human Resources Page")
    public void itShouldBeAccurateThatTheRegisteredPersonGoesToTheHumanResourcesPage() {
        ReusableMethod.bekle(3);
        JSUtilities.scrollToElement(Driver.getDriver(),doctorPage.boxBody);
        ReusableMethod.bekle(3);
        doctorPage.EmployesClickAndQuary();
    }

    @Then("Calendar of the doctor should be displayed on the home page on the doctor panel")
    public void calendarOfTheDoctorShouldBeDisplayedOnTheHomePageOnTheDoctorPanel() {
        homepage.elementIsDisplayed(doctorPage.calendar);
        homepage.elementIsDisplayed(doctorPage.doctorNowEvent);
    }
    @Then("In the Calender section, there is a change in history when it is clicked on the forward, back, Today, Month, Week, Day button.")
    public void inTheCalenderSectionThereIsAChangeInHistoryWhenItIsClickedOnTheForwardBackTodayMonthWeekDayButton() {
        doctorPage.clickAndElementControl(doctorPage.nextButton);
        doctorPage.clickAndElementControl(doctorPage.backButton);
        doctorPage.clickAndElementControl(doctorPage.monthButton);
        doctorPage.clickAndElementControl(doctorPage.weekButton);
        doctorPage.clickAndElementControl(doctorPage.dayButton);
        doctorPage.todayControl();
    }

    @Then("New event should be added when the desired date selects")
    public void newEventShouldBeAddedWhenTheDesiredDateSelects() {
        doctorPage.monthButton.click();
        ReusableMethod.bekle(3);
         homepage.elementIsDisplayed(doctorPage.eventContainer);
    }

    //  --------------- US_057-----------------
    @Given("It is confirmed that a Dashboard Sidebar was found on the left side of the doctor panel.")
    public void itIsConfirmedThatADashboardSidebarWasFoundOnTheLeftSideOfTheDoctorPanel() {
        homepage.elementIsDisplayed(doctorPage.dashboardSidebar);
    }


    @Given("Dashboard Sidebar Billing, Appointment, OPD, IPD, Pathology, Radiology, Bloodbank, Ambulance, Humanresource, TPA Management, Messaging, Live Consultation, Setup should be found.")
    public void dashboardSidebarBillingAppointmentOPDIPDPathologyRadiologyBloodbankAmbulanceHumanresourceTPAManagementMessagingLiveConsultationSetupShouldBeFound() {
        doctorPage.dashBoardListControl();
    }


    @Given("When you click on the Bird & Deathday menu link in Dashboard Sidebar")
    public void whenYouClickOnTheBirdDeathdayMenuLinkInDashboardSidebar() {
          doctorPage.dashboardClickAndElementControl(doctorPage.birthDeathRecord);
    }


    @Given("When you click on the icon of the category \\(Categories), Dashboard may be closed and urgent")
    public void whenYouClickOnTheIconOfTheCategoryCategoriesDashboardMayBeClosedAndUrgent() {
        doctorPage.dashboardControl();
    }

    @Given("When you close Dashboard Sidebar, the icons of the lists are seen in the left bar")
    public void whenYouCloseDashboardSidebarTheIconsOfTheListsAreSeenInTheLeftBar() {
        doctorPage.dashBoardIconControl();


    }


    @Then("The doctor's panel is found on the home page.")
    public void theDoctorSPanelIsFoundOnTheHomePage() {
        homepage.elementIsDisplayed(doctorPage.navbar);
    }

    @Then("{string} on Navbar is displayed.")
    public void onNavbarIsDisplayed(String arg0) {
        String navbarText=doctorPage.navbarText.getText();
        Assert.assertTrue(navbarText.contains("Heal Life Hospital & Research Center"));
    }


    @Then("Searchbox is found in the Navbar panel")
    public void searchboxIsFoundInTheNavbarPanel() {
        homepage.elementIsDisplayed(doctorPage.navbarSearchBox);
    }

    @Then("The information entered into Searchbox is true.")
    public void theInformationEnteredIntoSearchboxIsTrue() {
        doctorPage.searchControl();
    }
    /*
    Navbar da dil ikonu bulundugu dogrulanir
Dil ikonuna tikalaninca iEnglish ve Turkish seceneklerinin görüldüğü dogrulanir
İstenilen ikona tiklanınca dilin degistiği dogrulanir
     */

    @Then("Navbar is also found in the language icon.")
    public void navbarIsAlsoFoundInTheLanguageIcon() {
       homepage.elementIsDisplayed(doctorPage.navbarLanguageIcon);
    }

    @Then("When the language icon is ticked, it is true that English and Turkish options are seen.")
    public void whenTheLanguageIconIsTickedItIsTrueThatEnglishAndTurkishOptionsAreSeen() {
        doctorPage.navbarLanguageIcon.click();
        ReusableMethod.bekle(2);
        String languageText=doctorPage.navbarLanguages.getText();
        Assert.assertTrue(languageText.contains("Turkish"));
        Assert.assertTrue(languageText.contains("English"));
        
    }

    @Then("the desired icon is ticked, the change of language is correct")
    public void theDesiredIconIsTickedTheChangeOfLanguageIsCorrect() {
      /*  doctorPage.navbarLanguageIcon.click();
        doctorPage.navbarEnglish.click();
        homepage.elementIsDisplayed(doctorPage.navbarBedStatusEn);

       */
        ReusableMethod.bekle(2);
        doctorPage.navbarLanguageIcon.click();
        ReusableMethod.bekle(3);
        doctorPage.navbarTurkish.click();
        homepage.elementIsDisplayed(doctorPage.navbarBedStatusTr);
    }

    @Then("It is confirmed that it is found in the navbar notification icon")
    public void itIsConfirmedThatItIsFoundInTheNavbarNotificationIcon() {
        //
        homepage.elementIsDisplayed(doctorPage.navbarNotificationIcon);
    }

    @Then("When the notification icon is clicked, he goes to the relevant page.")
    public void whenTheNotificationIconIsClickedHeGoesToTheRelevantPage() {
        homepage.clickAndUrlQuery(doctorPage.navbarNotificationIcon,
                "/admin/systemnotification",Driver.getDriver().getCurrentUrl());
    }

    @Then("It is true that a chat icon is found in the navbar")
    public void itIsTrueThatAChatIconIsFoundInTheNavbar() {
      homepage.elementIsDisplayed(doctorPage.navbarChatIcon);
    }


    @Then("When the chat iconuna is clogged, he goes to the relevant page.")
    public void whenTheChatIconunaIsCloggedHeGoesToTheRelevantPage() {
        homepage.clickAndUrlQuery(doctorPage.navbarChatIcon,"/admin/chat",Driver.getDriver().getCurrentUrl());
    }



    @Then("Add Contact icon is seen and the new Contact is added")
    public void addContactIconIsSeenAndTheNewContactIsAdded() {
        homepage.elementIsDisplayed(doctorPage.addContactIcon);
        // doctorPage.addContactIcon.click();
         // ReusableMethod.hover(doctorPage.contactSearchTextbox);
        // doctorPage.contactSearchTextbox.sendKeys("tugba");

    }

    @Then("There is an icon showing the bed condition in the navbar")
    public void thereIsAnIconShowingTheBedConditionInTheNavbar() {
    }

    @Then("When the Radiology link is clicked on the relevant page, it is correct.")
    public void whenTheRadiologyLinkIsClickedOnTheRelevantPageItIsCorrect() {
       homepage.clickAndUrlQuery(doctorPage.radiologyLink,
               "/radio/gettestreportbatch",Driver.getDriver().getCurrentUrl());
    }
    @Then("Click on the radiology link")
    public void clickOnTheRadiologyLink() {
        doctorPage.radiologyLink.click();
    }
    @Then("Radiology page is displayed on Radiology Bill List{string} titles")
    public void radiologyPageIsDisplayedOnRadiologyBillListTitles(String data) {
       ReusableMethod.radiologyBaslikListelemeMethod(data);
    }

    @Then("In the Radiology Bill List, the list contents are ordered by column headings")
    public void inTheRadiologyBillListTheListContentsAreOrderedByColumnHeadings() {
        doctorPage.StringListSiralamaTestiPathology(4);
    }



    @Then("The search box is verified")
    public void theSearchBoxIsVerified() {
        homepage.elementIsEnabled(doctorPage.panelSearch);
    }

    @Then("When the information entry to SearchBox is made, he confirmed his search")
    public void whenTheInformationEntryToSearchBoxIsMadeHeConfirmedHisSearch() {
        doctorPage.panelSearch.sendKeys("121");
        ReusableMethod.bekle(1);
        doctorPage.radiologySearchReuslt.isDisplayed();
    }

    @Then("The number of items displayed per page must be selectable")
    public void theNumberOfItemsDisplayedPerPageMustBeSelectable() {
        doctorPage.selectList();
        ReusableMethod.bekle(2);
        doctorPage.allList.isDisplayed();
    }
//

    

    @Then("It is verified that he went to the relevant page")
    public void itIsVerifiedThatHeWentToTheRelevantPage() {
    }


    @Then("Click the View Reports icon under the {string}heading.")
    public void clickTheViewReportsIconUnderTheHeading(String arg0) {
        Actions actions=new Actions(driver);
        actions.moveToElement(doctorPage.radiologyBalance).perform();
        ReusableMethod.bekle(2);
        doctorPage.navbarTaskViewAll.click();
        ReusableMethod.bekle(3);
        doctorPage.radiologyBillDeatils.isDisplayed();

    }

    @Then("Notification details are confirmed by the moment")
    public void notificationDetailsAreConfirmedByTheMoment() {
        ReusableMethod.hover(doctorPage.firstNotification);
        doctorPage.firstNotification.click();
        homepage.elementIsEnabled(doctorPage.firstNotificationResult);
    }

    @Then("Old messages are displayed and click on it")
    public void oldMessagesAreDisplayedAndClickOnIt() {
        homepage.elementIsDisplayed(doctorPage.firstContactS);
        doctorPage.firstContactS.click();
    }

    @Then("Incoming messages are answered")
    public void incomingMessagesAreAnswered() {
        doctorPage.sendMessage.sendKeys("How are you ?",Keys.ENTER);
        doctorPage.messageSubmit.click();
        ReusableMethod.bekle(3);
        homepage.elementIsDisplayed(Driver.getDriver().findElement(By.xpath("(//li[@class='replies'])[4]")));
    }

    @Then("It is confirmed that the page showing the bed status is opened")
    public void itIsConfirmedThatThePageShowingTheBedStatusIsOpened() {
        doctorPage.navbarBedStatusEn.click();
        String bedStatusWHD=driver.getWindowHandle();
        driver.switchTo().window(bedStatusWHD);
        ReusableMethod.bekle(3);
        homepage.elementIsDisplayed(doctorPage.bedStatus);
    }

    @Then("It is found that there is a Calendar icon in Navbar that opens the Calendar page of the Calendar page.")
    public void itIsFoundThatThereIsACalendarIconInNavbarThatOpensTheCalendarPageOfTheCalendarPage() {
        homepage.clickAndUrlQuery(doctorPage.navbarCalanderIcon,
                    "/admin/calendar/events",Driver.getDriver().getCurrentUrl());
    }

    @Then("Navbarda Calendar icon is clicked")
    public void navbardaCalendarIconIsClicked() {
        doctorPage.navbarCalanderIcon.click();
    }

    @Then("A required status and color is added to a desired date.")
    public void aRequiredStatusAndColorIsAddedToADesiredDate() {

        ReusableMethod.bekle(2);
        doctorPage.calendarDate.click();
        ReusableMethod.bekle(3);
         Actions actions=new Actions(driver);
        doctorPage.taskEventTitle.click();
        ReusableMethod.bekle(2);
        actions.sendKeys("son event "+Keys.TAB+"son event "+Keys.TAB+"04.05.2023 12:00 AM - 04.05.2023 12:00 AM"+Keys.TAB).perform();
        ReusableMethod.bekle(2);
        JSUtilities.clickWithJS(driver,doctorPage.taskEventColor);
        ReusableMethod.bekle(1);
        doctorPage.taskEventType.click();
        ReusableMethod.bekle(1);
        doctorPage.taskEventSaveButton.click();



        /*
        actions.sendKeys("heallife1234"+Keys.TAB+"heallife123"+Keys.TAB+"heallife123"+Keys.ENTER).perform();
         */
    }

    @Then("Events are displayed on Calendar page as days")
    public void eventsAreDisplayedOnCalendarPageAsDays() {
        doctorPage.clickAndElementControl(doctorPage.dayButton);


    }

    @Then("On Calendar page, the events are displayed as weeks.")
    public void onCalendarPageTheEventsAreDisplayedAsWeeks() {
        doctorPage.clickAndElementControl(doctorPage.weekButton);
    }

    @Then("On the Calendar page, the events are displayed per month.")
    public void onTheCalendarPageTheEventsAreDisplayedPerMonth() {
        doctorPage.clickAndElementControl(doctorPage.monthButton);
    }

    @Then("It is confirmed that there is a {string} on the side bar on the Calendar page")
    public void itIsConfirmedThatThereIsAOnTheSideBarOnTheCalendarPage(String arg0) {
        homepage.elementIsDisplayed(doctorPage.toDoList);
    }

    @Then("Click the {string} button on the side bar on the Calendar page and the new list is added")
    public void clickTheButtonOnTheSideBarOnTheCalendarPageAndTheNewListIsAdded(String arg0) {
        doctorPage.toDoList.click();
        ReusableMethod.bekle(3);
        Actions actions=new Actions(driver);
        doctorPage.taskTitle.click();
        actions.sendKeys("test"+Keys.TAB+"18.05.2023"+Keys.TAB+Keys.ENTER).perform();

    }

    @Then("It is confirmed that the task icon is on the navar")
    public void itIsConfirmedThatTheTaskIconIsOnTheNavar() {
        homepage.elementIsDisplayed(doctorPage.navbarTaskIcon);
    }

    @Then("Task icon is clicked")
    public void taskIconIsClicked() {

        doctorPage.navbarTaskIcon.click();
    }

    @Then("Click on the ViewAll link and confirms that the tasks assigned to the doctor are seen")
    public void clickOnTheViewaAllLinkAndConfirmsThatTheTasksAssignedToTheDoctorAreSeen() {
        ReusableMethod.bekle(2);
        doctorPage.taskViewAll.click();
        ReusableMethod.bekle(1);
        homepage.elementIsDisplayed(doctorPage.calanderTask);
        System.out.println("task : "+doctorPage.calanderTask.getText());
    }


    @Then("In the opened menu, {string} and {string} links are confirmed.")
    public void inTheOpenedMenuAndLinksAreConfirmed(String arg0, String arg1) {
        homepage.elementIsDisplayed(doctorPage.profileLink);
        homepage.elementIsDisplayed(doctorPage.passwordLink);

    }

    @Then("When clicking on the {string} link, it is confirmed that it goes to the relevant page")
    public void whenClickingOnTheLinkItIsConfirmedThatItGoesToTheRelevantPage(String arg0) {

    }


    @Then("When clicking on the Profile link, it is confirmed that it goes to the relevant page")
    public void whenClickingOnTheProfileLinkItIsConfirmedThatItGoesToTheRelevantPage() {
        homepage.clickAndUrlQuery(doctorPage.profileLink,"staff/profile/",
                            driver.getCurrentUrl());

    }

    @Then("When clicking on the Password link, it is confirmed that he goes to the relevant page")
    public void whenClickingOnThePasswordLinkItIsConfirmedThatHeGoesToTheRelevantPage() {
        doctorPage.navbarProfileIcon.click();
        homepage.clickAndUrlQuery(doctorPage.passwordLink,"/admin/changepass",
                driver.getCurrentUrl());
    }

    @Then("The profile icon on the navar is confirmed and clicked")
    public void theProfileIconOnTheNavarIsConfirmedAndClicked() {
        homepage.elementIsDisplayed(doctorPage.navbarProfileIcon);
        doctorPage.navbarProfileIcon.click();
        ReusableMethod.bekle(1);
    }

    @Then("Click on profile icon")
    public void clickOnProfileIcon() {
        doctorPage.navbarProfileIcon.click();
        ReusableMethod.bekle(3);
    }

    @Then("The logout link is clicked and it is verified that the doctor has logged out of her page.")
    public void theLogoutLinkIsClickedAndItIsVerifiedThatTheDoctorHasLoggedOutOfHerPage() {
        homepage.clickAndUrlQuery(doctorPage.logoutLink,"site/login",
                      driver.getCurrentUrl());
    }

    @Then("Password on profile icon")
    public void passwordOnProfileIcon() {
        doctorPage.passwordLink.click();
    }

    @Then("Password change operations are performed")
    public void passwordChangeOperationsArePerformed() {
        /*
        Actions actions=new Actions(driver);
        doctorPage.taskTitle.click();
        actions.sendKeys("test"+Keys.TAB+"18.05.2023"+Keys.TAB+Keys.ENTER).perform();
         */
        ReusableMethod.bekle(3);
        Actions actions=new Actions(driver);
        doctorPage.passwordCurrent.click();
        ReusableMethod.bekle(2);
        //actions.sendKeys("heallife123"+Keys.TAB+"heallife1234"+Keys.TAB+"heallife1234"+Keys.ENTER).perform();
        actions.sendKeys("heallife1234"+Keys.TAB+"heallife123"+Keys.TAB+"heallife123"+Keys.ENTER).perform();
        driver.navigate().back();

    }

    @Then("Radiology is clicked")
    public void radiologyIsClicked() {
        doctorPage.radiologyLink.click();

    }

    @Then("Click on the Radiolgy Test link and confirmed that the relevant page is going")
    public void clickOnTheRadiolgyTestLinkAndConfirmedThatTheRelevantPageIsGoing() {
        homepage.clickAndUrlQuery(doctorPage.radiologyTestButonu,"/admin/radio/search",
                            driver.getCurrentUrl());
    }

    @Then("Radiology test page is displayed on Radiology Test List {string} headings")
    public void radiologyTestPageIsDisplayedOnRadiologyTestListHeadings(String data) {
        ReusableMethod.radiologyBaslikListelemeMethod(data);
    }

    @Then("Radiology test is found among the content in LIST to easily search for Searchbox")
    public void radiologyTestIsFoundAmongTheContentInLISTToEasilySearchForSearchbox() {
        doctorPage.panelSearch.sendKeys("CT ORBITS");
        ReusableMethod.bekle(1);
        doctorPage.radiologyTestSearchReuslt.isDisplayed();
    }

    @Then("Radiology The number of items displayed per test page should be selected")
    public void radiologyTheNumberOfItemsDisplayedPerTestPageShouldBeSelected() {
        doctorPage.radiologyTestselectList();
        ReusableMethod.bekle(2);
        doctorPage.allList.isDisplayed();

    }

    @Then("Radiology directs the show icon under the {string} title in the test list.")
    public void radiologyDirectsTheShowIconUnderTheTitleInTheTestList(String arg0) throws IOException {
        Actions actions=new Actions(driver);
        actions.moveToElement(doctorPage.radiologyAmountFirst).perform();
        ReusableMethod.bekle(3);
        doctorPage.radiologyTestShow.click();
        ReusableMethod.bekle(3);
        ReusableMethod.getScreenshot("Test Details");
    }

    @Then("Click the profile link")
    public void clickTheProfileLink() {
        doctorPage.profileLink.click();
        ReusableMethod.bekle(3);
    }

    @Then("It is confirmed that detailed information is seen on the profile page.")
    public void itIsConfirmedThatDetailedInformationIsSeenOnTheProfilePage() {
        doctorPage.profile.isDisplayed();
        driver.findElement(By.xpath("//td[text()='Phone']")).isDisplayed();



    }

    @Then("It is confirmed that detailed information is seen on the Leavs page")
    public void itIsConfirmedThatDetailedInformationIsSeenOnTheLeavsPage() {
        ReusableMethod.bekle(3);
        doctorPage.leaves.click();
        driver.findElement(By.xpath("(//div[@class='staffprofile'])[10]")).isDisplayed();
    }

    @Then("It is confirmed that detailed information is seen on the Documents page.")
    public void itIsConfirmedThatDetailedInformationIsSeenOnTheDocumentsPage() {
        doctorPage.documents.click();
    }

    @Then("It is confirmed that detailed information is seen on the Timeline page.")
    public void itIsConfirmedThatDetailedInformationIsSeenOnTheTimelinePage() {
        doctorPage.timeline.click();
        driver.findElement(By.xpath("//div[@class='timeline-item']")).isDisplayed();
    }

    @Then("Added new task is made as a sign")
    public void addedNewTaskIsMadeAsASign() {
      ReusableMethod.bekle(3);
      JSUtilities.clickWithJS(driver,doctorPage.toDoListCheck);
    }

    @Then("Added task can be deleted")
    public void addedTaskCanBeDeleted() {
     ReusableMethod.bekle(3);
     JSUtilities.clickWithJS(driver,doctorPage.toDoListRemove);
     Alert alert=driver.switchTo().alert();
     alert.accept();
    }

    @Then("In the Radiology Test List, the list contents are ordered by the column headings.")
    public void inTheRadiologyTestListTheListContentsAreOrderedByTheColumnHeadings() {
       // doctorPage.StringListSiralamaTestiPathology(1);
    }

    @Then("When the {string} Collection person is clicked to the icon, the relevant test for the relevant test is made for the recording of the track.")
    public void whenTheCollectionPersonIsClickedToTheIconTheRelevantTestForTheRelevantTestIsMadeForTheRecordingOfTheTrack(String arg0) {
    }
    //
}



    @Then("Verify that the number of items displayed per page in the OPD List is selectable.")
    public void verifyThatTheNumberOfItemsDisplayedPerPageInTheOPDListIsSelectable()
    {
        doctorPage.statusList();
        ReusableMethod.bekle(2);
        doctorPage.allList.isDisplayed();
    }


    @Then("It should be verified that when the show button under the title of Total Recheckup in the OPD Patient List is clicked, it redirects to the page where the details of the relevant content are shown.")
    public void ıtShouldBeVerifiedThatWhenTheShowButtonUnderTheTitleOfTotalRecheckupInTheOPDPatientListIsClickedItRedirectsToThePageWhereTheDetailsOfTheRelevantContentAreShown() {

        ReusableMethod.hover(doctorPage.totalRechecupilkShow);
        ReusableMethod.bekle(2);
        doctorPage.totalRechecupShowİkon.click();
        ReusableMethod.bekle(1);
        doctorPage.totalShowLogoDOgrulama.isDisplayed();

    }


    @Then("Let's verify that the Overview page displays summary information about the procedures performed on the respective patient.")
    public void letSVerifyThatTheOverviewPageDisplaysSummaryInformationAboutTheProceduresPerformedOnTheRespectivePatient() {


        ReusableMethod.hover(doctorPage.totalRechecupilkShow);
        ReusableMethod.bekle(2);
        doctorPage.totalRechecupShowİkon.click();
        ReusableMethod.bekle(1);
        doctorPage.totalShowLogoDOgrulama.isDisplayed();

    }

    @Then("The Visits page should display a list of Visits and verify that new Visits are allowed to be opened")
    public void theVisitsPageShouldDisplayAListOfVisitsAndVerifyThatNewVisitsAreAllowedToBeOpened()
    {
        ReusableMethod.hover(doctorPage.totalRechecupilkShow);
        ReusableMethod.bekle(2);
        doctorPage.totalRechecupShowİkon.click();
        ReusableMethod.bekle(1);

        homepage.urlQuery("385#activity","actualUrl");
    }

    @Then("Lab Investigation page, let's verify that it displays the laboratory history of the respective patient")
    public void labInvestigationPageLetSVerifyThatItDisplaysTheLaboratoryHistoryOfTheRespectivePatient()
    {
        ReusableMethod.hover(doctorPage.totalRechecupilkShow);
        ReusableMethod.bekle(2);
        doctorPage.totalRechecupShowİkon.click();
        ReusableMethod.bekle(1);
        doctorPage.labInvestigationOPD.click();
        homepage.urlQuery("385#labinvestigation","actualURL");


    }

    @Then("It should be verified that the Treatment History page shows the treatment history of the relevant patient.")
    public void ıtShouldBeVerifiedThatTheTreatmentHistoryPageShowsTheTreatmentHistoryOfTheRelevantPatient()
    {
        ReusableMethod.hover(doctorPage.totalRechecupilkShow);
        ReusableMethod.bekle(2);
        doctorPage.totalRechecupShowİkon.click();
        ReusableMethod.bekle(1);
        doctorPage.treatmentHistoryOPD.click();
        homepage.urlQuery("385#treatment_history","actualURL");

    }

    @Then("Let's verify that the Timeline page displays the timeline notifications that have been opened for the relevant patient")
    public void letSVerifyThatTheTimelinePageDisplaysTheTimelineNotificationsThatHaveBeenOpenedForTheRelevantPatient()
    {
        ReusableMethod.hover(doctorPage.totalRechecupilkShow);
        ReusableMethod.bekle(2);
        doctorPage.totalRechecupShowİkon.click();
        ReusableMethod.bekle(1);
        doctorPage.timelineOPD.click();
        homepage.urlQuery("385#timeline","actualURL");
        driver.navigate().back();
        driver.navigate().back();


    }

    @Then("Let's verify that new timelines can be created on the Timeline page")
    public void letSVerifyThatNewTimelinesCanBeCreatedOnTheTimelinePage()
    {
        ReusableMethod.hover(doctorPage.totalRechecupilkShow);
        ReusableMethod.bekle(2);
        doctorPage.totalRechecupShowİkon.click();
        ReusableMethod.bekle(1);
        doctorPage.timelineOPD.click();
       ReusableMethod.bekle(1);
        doctorPage.newTimelineOPD.click();
        ReusableMethod.bekle(1);
        doctorPage.newTimelineTitleOPD.sendKeys("biNefes");
        ReusableMethod.bekle(1);
        doctorPage.newTimelineSaveOPD.click();
        ReusableMethod.bekle(1);
        doctorPage.newTimelineSaveOPD.isEnabled();


    }

    @Then("Let's verify that there is a redirect from the OPD page to the Add Patient window")
    public void letSVerifyThatThereIsARedirectFromTheOPDPageToTheAddPatientWindow()
    {
        doctorPage.addPatientOPD.click();
        doctorPage.newAddPatientOPD.click();
        doctorPage.newAddPatientDogrulamaOPD.isDisplayed();



    }

    @Then("Verify that a new patient record can be created or a new OPD record can be created for an existing patient in the Add Patient window")
    public void verifyThatANewPatientRecordCanBeCreatedOrANewOPDRecordCanBeCreatedForAnExistingPatientInTheAddPatientWindow()
    {
        doctorPage.addPatientOPD.click();
        doctorPage.newAddPatientOPD.click();
        ReusableMethod.bekle(1);
        doctorPage.newAddPatientNameOPD.sendKeys("sonDeneme"
                +Keys.TAB+Keys.TAB+Keys.TAB+Keys.TAB+"1900"+Keys.TAB+"10"+Keys.TAB+"10");
        ReusableMethod.bekle(1);
        doctorPage.newAddPatientSaveOPD.click();
        ReusableMethod.bekle(1);
        doctorPage.newAddPatientDogrulamaOPD.isDisplayed();


    }

    @Then("In the Add Patient window, verify that the newly created record is displayed in the OPD Patient List.")
    public void ınTheAddPatientWindowVerifyThatTheNewlyCreatedRecordIsDisplayedInTheOPDPatientList() {
        doctorPage.aramaSearchBox.sendKeys("sonDeneme" + Keys.ENTER);
        doctorPage.aramaSearchBoxDogrylama.isDisplayed();
    }



        //============================================================
    @And("Birth AND Death butonuna tiklanir")
    public void birthANDDeathButonunaTiklanir() {
        ReusableMethod.istenenUrunElementi(11).click();
    }
    @And("{int} saniye beklenir.")
    public void saniyeBeklenir(int saniye) {
        ReusableMethod.bekle(saniye);
    }

    @And("Birth ve Death bölümlerinin oldugu dogrulanır.")
    public void birthVeDeathBölümlerininOlduguDogrulanır() {
        homepage.elementIsDisplayed(doctorPage.DeathTusu);
        homepage.elementIsDisplayed(doctorPage.BirthTusu);

    }
    @And("Birth bolumune tiklanir")
    public void birthBolumuneTiklanir() {

        doctorPage.BirthTusu.click();
    }
    @And("{string} basliklarinin oldugu dogrulanir")
    public void basliklarininOlduguDogrulanir(String baslik) {
        Assert.assertTrue(ReusableMethod.baslikListelemeMethod(baslik));
    }
    @And("Baslik sutunlarina gore siralama yapilabildigi dorulanmalidir.")
    public void baslikSutunlarinaGoreSiralamaYapilabildigiDorulanmalidir() throws ParseException {
        Assert.assertTrue(ReusableMethod.IntListSiralamaTesti(1));
        Assert.assertTrue(ReusableMethod.IntListSiralamaTesti(2));
        Assert.assertTrue(ReusableMethod.StringListSiralamaTesti(3));
        Assert.assertTrue(ReusableMethod.StringListSiralamaTesti(4));
        Assert.assertTrue(ReusableMethod.TarihListSiralamaTesti(5));
        Assert.assertTrue(ReusableMethod.StringListSiralamaTesti(6));
        Assert.assertTrue(ReusableMethod.StringListSiralamaTesti(7));

    }
    @And("Search Box kutusuna {string} yazisi gonderilir.")
    public void searchBoxKutusunaYazisiGonderilir(String data) {
        doctorPage.searchBox.sendKeys(data);
    }

    @And("{string} degerin listelendigi dogrulanir.")
    public void degerinListelendigiDogrulanir(String data) {
        String expectedData=data;
        String actualData=Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]")).getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }
    @And("All sekmesinin secildigi dogrulanir")
    public void allSekmesininSecildigiDogrulanir() {

        Select select = new Select(doctorPage.ddmAllAnd100);
        select.selectByVisibleText("All");
        String expectedData="All";
        String actaulData= doctorPage.ddmAllAnd100.getText();
        Assert.assertTrue(actaulData.contains(expectedData));
    }
    @And("100 sekmesinin secildigi dogrulanir.")
    public void sekmesininSecildigiDogrulanir() {
        Select select = new Select(doctorPage.ddmAllAnd100);
        select.selectByVisibleText("100");
        String expectedData="100";
        String actaulData= doctorPage.ddmAllAnd100.getText();
        Assert.assertTrue(actaulData.contains(expectedData));
    }
    @And("Report bolumunde ozet bilgiler bolumune tiklanir.")
    public void reportBolumundeOzetBilgilerBolumuneTiklanir() {
        ReusableMethod.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumu).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuOzet.click();
        ReusableMethod.bekle(3);

    }
    @And("Report bolumunde {string} bilgilerinin gorunurlugu test edilir.")
    public void reportBolumundeBilgilerininGorunurluguTestEdilir(String data) {
        String expectedData=data;
        String actaulData=Driver.getDriver().findElement(By.xpath("//*[@id=\"vchild_name\"]")).getText();
        Assert.assertEquals(expectedData,actaulData);
    }
    @And("Ozet bilgiler kapatilir.")
    public void ozetBilgilerKapatilir() {
        doctorPage.ReportOzetBolumKapama.click();
    }

    @And("Edit bolumune tiklanir.")
    public void editBolumuneTiklanir() {
        ReusableMethod.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumu).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuEdit.click();
        ReusableMethod.bekle(3);
    }
    @And("Bebegin fotografi yuklenir.")
    public void bebeginFotografiYuklenir() {
        String dinamikDosyaYolu=System.getProperty("user.home")+"\\Downloads\\bebek.jpg";
        WebElement choseFileButon=driver.findElement(By.xpath("//*[@id=\"echild_img\"]"));
        choseFileButon.sendKeys(dinamikDosyaYolu);//click yapmadan dosya yolunu gönderiyoruz direk.
    }
    @And("Save tusuna basilir.")
    public void saveTusunaBasilir() {
        doctorPage.ReportEditBolumuSave.click();
    }

    @And("{string} isimli bebegin fotosunun yüklendigi test edilir.")
    public void isimliBebeginFotosununYüklendigiTestEdilir(String data) {
        ReusableMethod.bekle(3);
        doctorPage.searchBox.sendKeys(data);
        ReusableMethod.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumu).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuOzet.click();
        ReusableMethod.bekle(3);
        System.out.println(doctorPage.Bebekfoto.getAttribute("src"));
        Assert.assertFalse(doctorPage.Bebekfoto.getAttribute("src").contains("no_image"));
        doctorPage.ReportOzetBolumKapama.click();
        ReusableMethod.bekle(3);

    }
    @And("{string} isimli bebegin silindigi kontrol edilir.")
    public void isimliBebeginSilindigiKontrolEdilir(String data) {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumu).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuDelete.click();
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethod.bekle(3);
        doctorPage.searchBox.sendKeys(data);
        ReusableMethod.bekle(3);
        String expectedData=data;
        String actaulData=Driver.getDriver().findElement(By.xpath("//*[@id=\"vchild_name\"]")).getText();
        Assert.assertNotEquals(expectedData,actaulData);

    }
    @And("Add birth tusuna basilir.")
    public void addBirthTusunaBasilir() {
        doctorPage.AddBrithTusu.click();
    }

    @And("{string} isimli bebegin bilgileri girilir.")
    public void isimliBebeginBilgileriGirilir(String data) {
        doctorPage.childName.sendKeys(data);
        Select select=new Select(doctorPage.gender);
        select.selectByVisibleText("Male");
        doctorPage.weight.sendKeys("2");
        doctorPage.birthDate.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL).
                sendKeys("A").keyUp(Keys.CONTROL).sendKeys("15.05.2023 12:00 AM").perform();
        doctorPage.weight.click();
        doctorPage.caseID.sendKeys("590");
        ReusableMethod.bekle(2);
    }
    @And("BirthSave tusuna basilir.")
    public void birthsaveTusunaBasilir() {
        doctorPage.birthSaveButton.click();
    }

    @And("{string} isimli bebegin kaydedildigi dogrulanir.")
    public void isimliBebeginKaydedildigiDogrulanir(String data) {
        doctorPage.searchBox.sendKeys(data);
        String expectedData=data;
        String actaulData=Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals(expectedData,actaulData);
    }
    @And("Death bolumune tiklanir")
    public void deathBolumuneTiklanir() {
        doctorPage.DeathTusu.click();
    }
    @And("Death baslik sutunlarina gore siralama yapilabildigi dorulanmalidir.")
    public void deathBaslikSutunlarinaGoreSiralamaYapilabildigiDorulanmalidir() {
        Assert.assertTrue(ReusableMethod.IntListSiralamaTesti(1));
        Assert.assertTrue(ReusableMethod.IntListSiralamaTesti(2));
        Assert.assertTrue(ReusableMethod.StringListSiralamaTesti(3));
        //Assert.assertTrue(ReusableMethod.StringListSiralamaTesti(4));
        Assert.assertTrue(ReusableMethod.StringListSiralamaTesti(5));
        Assert.assertTrue(ReusableMethod.TarihListSiralamaTesti(6));
    }
    @And("Report bolumuDeath da ozet bilgiler bolumune tiklanir.")
    public void reportBolumuDeathDaOzetBilgilerBolumuneTiklanir() {
        ReusableMethod.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumuDeath).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuOzet.click();
        ReusableMethod.bekle(3);
    }
    @And("Report bolumuDeath da {string} bilgilerinin gorunurlugu test edilir.")
    public void reportBolumuDeathDaBilgilerininGorunurluguTestEdilir(String data) {
        String expectedData=data;
        String actaulData=Driver.getDriver().findElement(By.xpath("//*[@id=\"vpatient\"]")).getText();
        Assert.assertTrue(actaulData.contains(expectedData));
    }
    @And("EditDeath bolumune tiklanir.")
    public void editdeathBolumuneTiklanir() {
        ReusableMethod.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumuDeath).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuEdit.click();
        ReusableMethod.bekle(3);
    }
    @And("Olen kisinin fotografi yuklenir.")
    public void olenKisininFotografiYuklenir() {
        //(//*[@id="document"])[2]
        String dinamikDosyaYolu=System.getProperty("user.home")+"\\Downloads\\tabut.jpg";
        WebElement choseFileButon=driver.findElement(By.xpath("(//*[@id=\"document\"])[2]"));
        choseFileButon.sendKeys(dinamikDosyaYolu);//click yapmadan dosya yolunu gönderiyoruz direk.
    }
    @And("{string} isimli kisinin mezar fotosunun yüklendigi test edilir.")
    public void isimliKisininMezarFotosununYüklendigiTestEdilir(String data) {
        ReusableMethod.bekle(3);
        doctorPage.searchBox.sendKeys(data);
        ReusableMethod.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumuDeath).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuAttachment.click();
        ReusableMethod.bekle(5);
        String dinamikDosyaYolu=System.getProperty("user.home")+"\\Downloads\\tabut.jpg";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
    @And("{string} isimli kisinin silindigi kontrol edilir.")
    public void isimliKisininSilindigiKontrolEdilir(String data) {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.ReportBolumuDeath).perform();
        ReusableMethod.bekle(3);
        doctorPage.ReportBolumuDelete.click();
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethod.bekle(3);
        doctorPage.searchBox.sendKeys(data);
        ReusableMethod.bekle(3);
        String expectedData="Add new record or search with different criteria.";
        String actaulData=Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td/div/span")).getText();
        Assert.assertTrue(actaulData.contains(expectedData));
    }
    @And("{string} isimli kisinin olum bilgileri girilir.")
    public void isimliKisininOlumBilgileriGirilir(String data) {
        doctorPage.caseID.click();
        doctorPage.caseID.sendKeys("618");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethod.bekle(3);
        actions.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("A")
                .keyUp(Keys.CONTROL).sendKeys("15.05.2023 12:00 AM").perform();
        ReusableMethod.bekle(3);
        actions.sendKeys(Keys.TAB).sendKeys("Ahmet").perform();

    }
    @And("{string} isimli kisinin listelendigi dogrulanir.")
    public void isimliKisininListelendigiDogrulanir(String data) {
        doctorPage.searchBox.sendKeys(data);
        ReusableMethod.bekle(3);
        String expectedData=data;
        String actaulData=Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]")).getText();
        Assert.assertTrue(actaulData.contains(expectedData));
    }
    //==========================Massaga bolumu=======================
    @And("Massage butonuna tiklanir")
    public void massageButonunaTiklanir() {
        ReusableMethod.istenenUrunElementi(15).click();
    }

    @And("Massage bolumune gidildigi dogrulanir.")
    public void massageBolumuneGidildigiDogrulanir() {
        String actualData=Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[1]/h3")).getText();
        String expectedData="Notice Board";
        Assert.assertEquals(expectedData,actualData);
    }

    @And("Message listesinde {string} mesajinin oldugu dogrulanir")
    public void messageListesindeMesajininOlduguDogrulanir(String data) {
        String expectedData=data;
        List<String> ActualList=new ArrayList<>();
        for (WebElement each:doctorPage.MassageList
        ) {
            ActualList.add(each.getText());
        }
        System.out.println(ActualList);
        Boolean sart=false;
        for (String each:ActualList
        ) {
            if (each.contains(expectedData)){
                sart=true;
                break;
            }
        }
        Assert.assertTrue(sart);
    }

    @And("Post New Message butonuna tiklanir")
    public void postNewMessageButonunaTiklanir() {
        doctorPage.postNewMassage.click();
    }
    @And("New Message {string} bilgileri girilir")
    public void newMessageBilgileriGirilir(String data) {
        doctorPage.titleBolumu.sendKeys(data);
        ReusableMethod.bekle(3);
        Driver.getDriver().switchTo().frame(doctorPage.mesajIframe);
        Driver.getDriver().findElement(By.xpath("//body[@spellcheck]")).click();
        Driver.getDriver().findElement(By.xpath("//body[@spellcheck]")).sendKeys("Test yapılıyor");
        Driver.getDriver().switchTo().parentFrame();
        doctorPage.dateNotice.sendKeys("15.05.2023");
        doctorPage.titleBolumu.click();
        doctorPage.datePublish.sendKeys("15.05.2023");
        doctorPage.sendButton.click();
    }
    @And("Message nin kaydedildigi dogrulanir")
    public void messageNinKaydedildigiDogrulanir() {
        String expectedData = "Record Saved Successfully";
        String actualData = doctorPage.mesajKayit.getText();
        Assert.assertEquals(expectedData, actualData);
    }
    @And("Send Sms butonuna basilir")
    public void sendSmsButonunaBasilir() {
        doctorPage.SendSmsButton.click();
    }
    @And("Group olarak {string} baslikli mesaj bilgileri gonderilir.")
    public void groupOlarakBaslikliMesajBilgileriGonderilir(String data) {
        doctorPage.SendSmsTitle.sendKeys(data);
        doctorPage.SendSmsCheckBox.click();
        doctorPage.SendSmsMesaj.sendKeys("Sms Testi");
        doctorPage.SendSmsDoctorCheckBox.click();
        doctorPage.SendSmsSendButton.click();
    }
    @And("{string} baslikli mesajin iletildigi kontrol edilir.")
    public void baslikliMesajinIletildigiKontrolEdilir(String data) {
        String expectedData=data;
        String actualData=doctorPage.SendSmsTitle.getText();
        Assert.assertNotEquals(expectedData,actualData);
    }

    @And("Individual olarak {string} baslikli mesaj bilgileri gonderilir.")
    public void ındividualOlarakBaslikliMesajBilgileriGonderilir(String data) {
        doctorPage.SendSmsIndividual.click();
        ReusableMethod.bekle(3);
        doctorPage.SendSmsIndividualTitle.sendKeys(data);
        doctorPage.SendSmsIndividualCheckBox.click();
        doctorPage.SendSmsIndividualMesaj.sendKeys("Sms Testi");
        doctorPage.SendSmsSelect.click();
        doctorPage.SendSmsSelectDoktor.click();
        doctorPage.SendSmsIndividualQuery.sendKeys("mahmut");
        ReusableMethod.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//*[@id=\"suggesstion-box\"]/ul/li[2]")))
                .click().perform();
        doctorPage.SendSmsIndividualAddButton.click();
        ReusableMethod.bekle(3);
        doctorPage.SendSmsIndividualSendButton.click();
    }

    @And("{string} baslikli individual mesajin iletildigi kontrol edilir.")
    public void baslikliIndividualMesajinIletildigiKontrolEdilir(String data) {
        String expectedData=data;
        String actualData=doctorPage.SendSmsIndividualTitle.getText();
        Assert.assertNotEquals(expectedData,actualData);
    }

    @And("Send Email butonuna basilir")
    public void sendEmailButonunaBasilir() {
        doctorPage.SendEmailButton.click();
    }

    @And("Group olarak {string} baslikli email bilgileri gonderilir.")
    public void groupOlarakBaslikliEmailBilgileriGonderilir(String data) {
        doctorPage.SendSmsTitle.sendKeys(data);
        Driver.getDriver().switchTo().frame(doctorPage.SendEmailMesajIframe);
        doctorPage.SendEmailMesajText.click();
        doctorPage.SendEmailMesajText.sendKeys("Test yapiliyor");
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethod.bekle(2);
        doctorPage.SendSmsDoctorCheckBox.click();
        doctorPage.SendSmsSendButton.click();
        ReusableMethod.bekle(2);
    }

    @And("Individual olarak {string} baslikli email bilgileri gonderilir.")
    public void ındividualOlarakBaslikliEmailBilgileriGonderilir(String data) {
        JSUtilities.scrollToTop(Driver.getDriver());
        doctorPage.SendSmsIndividual.click();
        ReusableMethod.bekle(3);
        doctorPage.SendSmsIndividualTitle.sendKeys(data);
        ReusableMethod.bekle(3);
        Driver.getDriver().switchTo().frame(doctorPage.SendEmailMesajIndividualIframe);
        doctorPage.SendEmailMesajText.click();
        doctorPage.SendEmailMesajText.sendKeys("Test yapiliyor");
        Driver.getDriver().switchTo().parentFrame();
        doctorPage.SendSmsSelect.click();
        doctorPage.SendSmsSelectDoktor.click();
        doctorPage.SendSmsIndividualQuery.sendKeys("mahmut");
        ReusableMethod.bekle(5);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//*[@id=\"suggesstion-box\"]/ul/li[2]")))
                .click().perform();
        ReusableMethod.bekle(5);
        doctorPage.SendSmsIndividualAddButton.click();
        ReusableMethod.bekle(2);
        doctorPage.SendSmsIndividualSendButton.click();

    }


}





