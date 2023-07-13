package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.PageAdminDashboard;
import pages.PageHomepage;
import pages.PageLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.awt.*;
import java.lang.reflect.AnnotatedType;
import java.security.Key;
import java.sql.ResultSet;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


public class adminDashboardStepDefinition {


    PageLogin pageLogin = new PageLogin();
    PageHomepage homepage = new PageHomepage();
    WebDriver driver = Driver.getDriver();
    Actions actions = new Actions(driver);

    PageAdminDashboard pageAdminDashboard = new PageAdminDashboard();

    @Given("User must be verify go to dashboard")
    public void userMustBeVerifyGoToDashboard() {

        pageAdminDashboard.adminPageLoginDashboardTextIcon.isDisplayed();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(2000));


    }

    @And("dashboard must be refreshed")
    public void dashboardMustBeRefreshed() {
        pageAdminDashboard.dashboardLink.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    }

    @Given("Start browser , go  to {string}")
    public void start_browser_go_to(String string) {
        homepage.goToUrl(string);
    }

    @Given("User fills  {string} and {string} textBoxes")
    public void user_fills_and_text_boxes(String string, String string2) {
        pageLogin.adminLoginMethod(string, string2);
    }

    @Given("User clicks sign in  button")
    public void user_clicks_sign_in_button() {
        homepage.clickAndUrlQuery(pageLogin.buttonSignInAdminLoginPage, "admin/dashboard", Driver.getDriver().getCurrentUrl());
    }

    @Then("Browser Closed")
    public void browser_closed() {
        Driver.quitDriver();
    }


    @Then("User clicks Billing Link")
    public void userClicksBillingLink() {
        pageAdminDashboard.dashboardBillingLink.click();
    }

    @Then("User verifies the relevant Page")
    public void userVerifiesTheRelevantPage() {

        pageAdminDashboard.billingVerifyItem.isDisplayed();
    }


    @Then("User clicks appointment Link")
    public void userClicksAppointmentLink() {

        pageAdminDashboard.dashboardAppointmentLink.click();
    }

    @Then("User verifies the appointment Page")
    public void userVerifiesTheAppointmentPage() {

        pageAdminDashboard.appointmentVerifyItem.isDisplayed();
    }

    @Then("User clicks OPD Link")
    public void userClicksOPDLink() {
        pageAdminDashboard.dashboardOPDLink.click();
    }

    @Then("User verifies the OPD Page")
    public void userVerifiesTheOPDPage() {
        pageAdminDashboard.OPDVerifyItem.isDisplayed();
    }

    @Then("User clicks on the IPD Link")
    public void userClicksOnTheIPDLink() {
        pageAdminDashboard.dashboardIPDLink.click();
    }

    @Then("User verifies the IPD Page")
    public void userVerifiesTheIPDPage() {

        pageAdminDashboard.IPDVerifyItem.isDisplayed();
    }

    @Then("User clicks on the pharmacy Link")
    public void userClicksOnThePharmacyLink() {
        pageAdminDashboard.dashboardPharmacyLink.click();
    }

    @Then("User verifies the pharmacy Page")
    public void userVerifiesThePharmacyPage() {

        pageAdminDashboard.PharmacyVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Pathology Link")
    public void userClicksOnThePathologyLink() {
        pageAdminDashboard.dashboardPathologyLink.click();
    }

    @Then("User verifies the Pathology Page")
    public void userVerifiesThePathologyPage() {

        pageAdminDashboard.pathologyVerifyItem.isDisplayed();

    }

    @Then("User clicks on the Radyology Link and verifies the Pathology Page")
    public void userClicksOnTheRadyologyLinkAndVerifiesThePathologyPage() {

        pageAdminDashboard.dashboardRadiologyLink.click();
        pageAdminDashboard.radyologyVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Bloot bank Link and verifies the relevant Page")
    public void userClicksOnTheBlootBankLinkAndVerifiesTheRelevantPage() {

        pageAdminDashboard.dashboardBloodBankLink.click();
        pageAdminDashboard.blootBankVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Ambulance Link and verifies the relevant Page")
    public void userClicksOnTheAmbulanceLinkAndVerifiesTheRelevantPage() {

        pageAdminDashboard.dashboardAmbulanceLink.click();
        pageAdminDashboard.ambulanceVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Front office Link and verifies the relevant Page")
    public void userClicksOnTheFrontOfficeLinkAndVerifiesTheRelevantPage() {

        pageAdminDashboard.dashboardFrontOfficeLink.click();
        pageAdminDashboard.frontOfficeVerifyItem.isDisplayed();
    }

    @Then("User clicks on the BirthDateRecord Link and verifies the relevant Page")
    public void userClicksOnTheBirthDateRecordLinkAndVerifiesTheRelevantPage() {

        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();
        pageAdminDashboard.dashboardBirthDeathRecordLink.click();
        pageAdminDashboard.BirthDeathVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Human Recource Link and verifies the relevant Page")
    public void userClicksOnTheHumanRecourceLinkAndVerifiesTheRelevantPage() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.dashboardHumanResourceLink.click();
        pageAdminDashboard.humanRecourceVerifyItem.isDisplayed();
    }

    @Then("User clicks on the TPA Management Link and verifies the relevant Page")
    public void userClicksOnTheTPAManagementLinkAndVerifiesTheRelevantPage() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.dashboardTPAManagementLink.click();
        pageAdminDashboard.tpaManagementVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Finance Link and verifies the relevant Page")
    public void userClicksOnTheFinanceLinkAndVerifiesTheRelevantPage() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.dashboardFinanceLink.click();
        pageAdminDashboard.financeVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Messaging Link and verifies the relevant Page")
    public void userClicksOnTheMessagingLinkAndVerifiesTheRelevantPage() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();


        pageAdminDashboard.dashboardMessagingLink.click();
        pageAdminDashboard.messagingVerifyItem.isDisplayed();
    }

    @Then("User clicks on the Inventory Link and verifies the relevant Page")
    public void userClicksOnTheInventoryLinkAndVerifiesTheRelevantPage() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.dashboardInventoryLink.click();
        pageAdminDashboard.inventoryVerifyItem.isDisplayed();
    }

    @Then("User verifies the Employee as Card")
    public void userVerifiesTheEmployeeAsCard() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.cardViewLinki.click();
        pageAdminDashboard.cardViewVerifyItem.isDisplayed();
    }


    @Then("User verifies the Employee as List")
    public void userVerifiesTheEmployeeAsList() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.listViewLinki.click();
        pageAdminDashboard.listViewVerifyItem.isDisplayed();
    }

    @Then("User displayes the Employee as Card view")
    public void userDisplayesTheEmployeeAsCardView() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        List<WebElement> employee = Driver.getDriver().findElements(By.xpath("//*[@class='tab-pane active']"));


        for (int i = 0; i < employee.size(); i++) {
            i++;

        }
    }


    @Then("User must be employee show and edit  as Card")
    public void userMustBeEmployeeShowAndEditAsCard() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.emplyeeShowAsCardView.click();

        pageAdminDashboard.emplyeeEditAsCardView.click();
    }


    @And("User clicks on the Human Resource Link")
    public void userClicksOnTheHumanResourceLink() {
        actions.scrollToElement(pageAdminDashboard.dashboardInventoryLink).perform();

        pageAdminDashboard.dashboardHumanResourceLink.click();
    }

    @And("User clicks on the Human Recource Link")
    public void userClicksOnTheHumanRecourceLink() {
    }

    @Then("User must be verify the personel staff ID in the list")
    public void userMustBeVerifyThePersonelStaffIDInTheList() {
        pageAdminDashboard.staffIdListViewItem.isDisplayed();

    }

    @Then("User must be verify the personel Name in the list")
    public void userMustBeVerifyThePersonelNameRoleDepartmentInTheList() {
        pageAdminDashboard.nameListViewItem.isDisplayed();
    }

    @Then("User must be verify the personel Role in the list")
    public void userMustBeVerifyThePersonelRoleDepartmentInTheList() {
        pageAdminDashboard.roleListViewItem.isDisplayed();
    }

    @Then("User must be verify the personel Department in the list")
    public void userMustBeVerifyThePersonelDepartmentInTheList() {
        pageAdminDashboard.departmentListViewItem.isDisplayed();
    }

    @Then("User must be verify the personel Designation in the list")
    public void userMustBeVerifyThePersonelDesignationInTheList() {
        pageAdminDashboard.designationListViewItem.isDisplayed();
    }

    @Then("User must be verify the personel Mobile number in the list")
    public void userMustBeVerifyThePersonelMobileNumberInTheList() {
        pageAdminDashboard.mobileNumberListViewItem.isDisplayed();
    }

    @Then("User must be verify the personel action in the list")
    public void userMustBeVerifyThePersonelActionInTheList() {
        pageAdminDashboard.actionListViewItem.isDisplayed();
    }

    @Then("User verifies the Employee in action show as List")
    public void userVerifiesTheEmployeeInActionShowAsList() {
        pageAdminDashboard.actionListViewItem.isDisplayed();
    }

    @Then("User must be employee in action edit  as Card")
    public void userMustBeEmployeeInActionEditAsCard() {
        pageAdminDashboard.actionEditListViewItem.isDisplayed();
    }

    @And("User verifies the searchbox is visible")
    public void userVerifiesTheSearchboxIsVisible() {
        pageAdminDashboard.searchBoxListViewItem.isDisplayed();
    }

    @And("User verifies the  role searchbox is visible")
    public void userVerifiesTheRoleSearchboxIsVisible() {
        pageAdminDashboard.roleSearchBoxListViewItem.isDisplayed();
    }

    @And("User verifies the add staff item")
    public void userVerifiesTheAddStaffItem() {
        pageAdminDashboard.addStaffViewItem.isDisplayed();
    }

    @And("User clicks on the disabled staff")
    public void userClicksOnTheDisabledStaff() {
        pageAdminDashboard.disableStaffViewItem.click();
        pageAdminDashboard.disableStaffButton.click();
    }

    @And("User clicks on the staff attandance")
    public void userClicksOnTheStaffAttandance() {
        pageAdminDashboard.staffAttandance.click();
    }

    @And("User verifies the payroll page")
    public void userVerifiesThePayrollPage() {

        pageAdminDashboard.staffAttandancePayroll.isDisplayed();
    }

    @And("user verifies Role, month and year information")
    public void userVerifiesRoleMonthAndYearInformation() {
        pageAdminDashboard.staffAttandanceSearchRole.isDisplayed();
        pageAdminDashboard.staffAttandancePayrollMonth.isDisplayed();
        pageAdminDashboard.staffAttandancePayrollYear.isDisplayed();

    }

    @And("User clicks on the payroll page")
    public void userClicksOnThePayrollPage() {

        pageAdminDashboard.staffAttandancePayroll.click();
    }


    @And("user verifies my leaves")
    public void userVerifiesMyLeaves() {
        pageAdminDashboard.staffAttandanceMyLeaves.isDisplayed();
    }

    @And("user clicks my leaves")
    public void userClicksMyLeaves() {
        pageAdminDashboard.staffAttandanceMyLeaves.click();
    }

    @And("User verifies leaves list")
    public void userVerifiesLeavesList() {
        pageAdminDashboard.staffAttandanceMyLeaves.isDisplayed();

    }

    @And("User verifies the attandance dropdown")
    public void userVerifiesTheAttandanceDropdown() {
        pageAdminDashboard.myLeavesLeaveType.isDisplayed();

    }

    @And("User verifies leaves LeaveTpye")
    public void userVerifiesLeavesLeaveTpye() {
        pageAdminDashboard.myLeavesLeavesLeaveDate.isDisplayed();

    }

    @And("User verifies leaves days")
    public void userVerifiesLeavesDays() {
        pageAdminDashboard.myLeavesLeavesLeaveDays.isDisplayed();

    }

    @And("User verifies leaves date")
    public void userVerifiesLeavesDate() {
        pageAdminDashboard.myLeavesLeavesLeaveApplyDate.isDisplayed();

    }

    @And("User verifies leaves apply date")
    public void userVerifiesLeavesApplyDate() {
        pageAdminDashboard.myLeavesLeavesStatus.isDisplayed();

    }

    @And("Menu icon is clicked")
    public void menuIconIsClicked() {
        pageAdminDashboard.buttonMenu.click();
    }

    @Then("Heallife image clicked")
    public void heallifeImageClicked() {
        pageAdminDashboard.imageMenu.click();
    }

    @And("It is tested whether the Dashboard menu is opened and closed.")
    public void itIsTestedWhetherTheDashboardMenuIsOpenedAndClosed() {
        homepage.elementIsEnabled(pageAdminDashboard.imageMenu);

    }

    @When("Visibility of text Heal Life Hospital & Research Center is tested in Navbar")
    public void visibilityOfTextHealLifeHospitalResearchCenterIsTestedInNavbar() {
        String expectedText = "Heal Life Hospital & Research Center";
        String actualText = pageAdminDashboard.textBoxHeallife.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Given("The visibility of the Search By Patient Name search box is tested")
    public void the_visibility_of_the_search_by_patient_name_search_box_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.iconSearch);
    }

    @Given("Click the flag icon in the navbar")
    public void click_the_flag_icon_in_the_navbar() {
        pageAdminDashboard.logoFlagUs.click();

    }

    @Given("Turkish flag is clicked")
    public void turkish_flag_is_clicked() {
        pageAdminDashboard.logoFlagTr.click();
    }

    @Given("Testing that the page language has changed")
    public void testing_that_the_page_language_has_changed() {
        homepage.elementIsDisplayed(pageAdminDashboard.logoFlagTr);
    }

    @Given("Click the notification icon in the navbar")
    public void click_the_notification_icon_in_the_navbar() {
        pageAdminDashboard.iconNotification.click();
    }

    @Given("Visibility of the Notifications header is tested")
    public void visibility_of_the_notifications_header_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.TitleNotification);
    }

    @When("Visibility of site log is tested in navbar")
    public void visibility_of_site_log_is_tested_in_navbar() {
        homepage.elementIsDisplayed(pageAdminDashboard.logoHealLife);
    }

    @When("Site logo clicked")
    public void site_logo_clicked() {
        pageAdminDashboard.logoHealLife.click();
    }

    @When("It is tested that the admin panel page is renewed")
    public void it_is_tested_that_the_admin_panel_page_is_renewed() {
        homepage.elementIsEnabled(pageAdminDashboard.logoHealLife);
    }

    @When("The visibility of the menu icon in the navbar is tested")
    public void theVisibilityOfTheMenuIconInTheNavbarIsTested() {
        homepage.elementIsEnabled(pageAdminDashboard.buttonMenu);
    }

    @Given("Visibility of unread notification count is tested")
    public void visibility_of_unread_notification_count_is_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.notificationNo);
    }

    @Given("Visibility of \\(Type, Subject, Date) titles are tested")
    public void visibility_of_type_subject_date_titles_are_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.notificationType);
        homepage.elementIsEnabled(pageAdminDashboard.notificationSubject);
        homepage.elementIsDisplayed(pageAdminDashboard.notificationDate);
    }

    @Given("Click the first Type logo in the notification")
    public void click_the_first_type_logo_in_the_notification() {
        pageAdminDashboard.notificationTypeLogo.click();
    }

    @Given("The visibility of the message detail is tested")
    public void the_visibility_of_the_message_detail_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.notificationDetail);
    }

    @Given("Click the number icon in the notification in the navbar")
    public void click_the_number_icon_in_the_notification_in_the_navbar() {
        pageAdminDashboard.notificationNo.click();
    }

    @Given("It is tested that the message has been read")
    public void ıt_is_tested_that_the_message_has_been_read() {
        homepage.elementIsEnabled(pageAdminDashboard.notificationDetail);

    }

    @Given("wait {int} seconds")
    public void wait_seconds(Integer int1) {
        ReusableMethod.bekle(3);
    }

    @Given("Messages are tested to be deleted")
    public void messages_are_tested_to_be_deleted() {
        String expectedDeleteButton = "Delete All";
        assertTrue(pageAdminDashboard.deleteAllButton.getText().equals(expectedDeleteButton));
    }

    @Given("The visibility of the message icon is tested")
    public void the_visibility_of_the_message_icon_is_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.messageIkon);

    }

    @Given("Visibility of unread message count is tested")
    public void visibility_of_unread_message_count_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.contactWarningButton);
    }

    @Given("Click the message icon in the navbar")
    public void click_the_message_icon_in_the_navbar() {
        pageAdminDashboard.messageIkon.click();
    }

    @Given("The Chat System window is tested to open")
    public void the_chat_system_window_is_tested_to_open() {
        homepage.elementIsDisplayed(pageAdminDashboard.contactButton);
    }

    @Given("Visibility is tested for those who have sent messages before")
    public void visibility_is_tested_for_those_who_have_sent_messages_before() {
        homepage.elementIsDisplayed(pageAdminDashboard.contactProfile);
    }

    @Given("Click the Chat System icon")
    public void click_the_chat_system_icon() {
        pageAdminDashboard.chatSystemIcon.click();
    }

    @Given("Click on Add Contact search section")
    public void click_on_add_contact_search_section() {

        pageAdminDashboard.andContactSearch.click();
    }

    @Given("In the Add Contact section, the desired name is written")
    public void ın_the_add_contact_section_the_desired_name_is_written() {
        pageAdminDashboard.andContactSearch.sendKeys("hasan.sen");
        ReusableMethod.bekle(2);
    }

    @Given("Click on the desired name")
    public void click_on_the_desired_name() {
        pageAdminDashboard.andContactName.click();
    }

    @Given("Click the Add icon")
    public void click_the_add_icon() {
        pageAdminDashboard.addButton.click();

    }

    @Given("It is confirmed that a contact has been added to the Chat System.")
    public void ıt_is_confirmed_that_a_contact_has_been_added_to_the_chat_system() {
        homepage.elementIsEnabled(pageAdminDashboard.addcontactNames);
    }

    @Given("Visibility of Calender icon in Navbar is tested")
    public void visibility_of_calender_icon_in_navbar_is_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.calenderIcon);
    }

    @Given("The accuracy of the section where the messages are displayed is tested")
    public void the_accuracy_of_the_section_where_the_messages_are_displayed_is_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.messageSection);
    }

    @Given("Write Your Message visibility is tested")
    public void write_your_message_visibility_is_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.writeYourMessageIcon);
    }

    @Given("Click the Calender icon in the navbar")
    public void click_the_calender_icon_in_the_navbar() {
        pageAdminDashboard.calenderIcon.click();
    }

    @Given("The visibility of the To Do List is tested on the page that opens.")
    public void the_visibility_of_the_to_do_list_is_tested_on_the_page_that_opens() {
        homepage.elementIsDisplayed(pageAdminDashboard.calenderTodoList);
    }

    @Given("On the page that opens, the visibility of the calendar is tested")
    public void on_the_page_that_opens_the_visibility_of_the_calendar_is_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.calenderPage);
    }

    @Given("Click on any day in the calendar on the page that opens.")
    public void click_on_any_day_in_the_calendar_on_the_page_that_opens() {
        pageAdminDashboard.calenderDay.click();
        ReusableMethod.bekle(2);
    }

    @Given("From the Add New Event page, click the Event Title section and enter the title")
    public void from_the_page_click_the_section_and_enter_the_title() {
        pageAdminDashboard.eventTitle.click();
        pageAdminDashboard.eventTitle.sendKeys("Dogum Gunum Bana Geldigin Gundur");
    }

    @Given("Click on the desired color from the Event Color section.")
    public void click_on_the_desired_color_from_the_section() {
        pageAdminDashboard.eventColor.click();
    }

    @Given("Click on the desired type from the Event Type section.")
    public void click_on_the_desired_type_from_the_section() {
        pageAdminDashboard.eventTypeAllAdmin.click();
    }

    @Given("Save button is clicked")
    public void save_button_is_clicked() {
        pageAdminDashboard.eventSave.click();
    }

    @Given("It is tested that the desired information is recorded.")
    public void it_is_tested_that_the_desired_information_is_recorded() {
        homepage.elementIsEnabled(pageAdminDashboard.calenderDay);
    }

    @Given("On the page that opens, the week icon is clicked.")
    public void on_the_page_that_opens_the_week_icon_is_clicked() {
        pageAdminDashboard.eventWeekIcon.click();
    }

    @Given("On the page that opens, it is verified that the event is filtered.")
    public void on_the_page_that_opens_it_is_verified_that_the_event_is_filtered() {
        homepage.elementIsEnabled(pageAdminDashboard.eventWeekPage);
    }

    @Given("On the page that opens, the Add To Do List icon is clicked.")
    public void on_the_page_that_opens_the_add_to_do_list_icon_is_clicked() {
        pageAdminDashboard.toDoListAddIcon.click();
    }

    @Given("Enter the relevant title from the Add Task section to the title section.")
    public void enter_the_relevant_title_from_the_add_task_section_to_the_title_section() {
        pageAdminDashboard.addTascTittle.click();
        pageAdminDashboard.addTascTittle.sendKeys("mesai basladi");
    }

    @Given("Click on the Date section")
    public void click_on_the_date_section() {
        pageAdminDashboard.taskAddTascDate.click();
    }

    @Given("In the Date section, the relevant date is clicked.")
    public void ın_the_date_section_the_relevant_date_is_clicked() {
        pageAdminDashboard.taskAddDateDay.click();
    }

    @Given("Save button is clickedd")
    public void save_button_is_clickedd() {
        pageAdminDashboard.taskAddDateDaySave.click();
    }

    @Then("Click the CalenderTask icon in the navbar")
    public void click_the_calender_task_icon_in_the_navbar() {
        pageAdminDashboard.taskIcon.click();
    }

    @Then("Click the View All icon")
    public void click_the_view_all_icon() {
        pageAdminDashboard.taskIconViewAll.click();
    }

    @Then("Title icon is clicked from the window that opens.")
    public void title_icon_is_clicked_from_the_window_that_opens() {
        pageAdminDashboard.toDoListCheckBox.click();
    }

    @Then("Update icon is clicked")
    public void update_icon_is_clicked() {
        pageAdminDashboard.toDoListUpdateIcon.click();
    }

    @Then("The title is changed from the Edit Task page")
    public void the_title_is_changed_from_the_edit_task_page() {
        pageAdminDashboard.addTascTittle.sendKeys("test");
    }

    @Then("The visibility of the task icon in the navbar is tested")
    public void the_visibility_of_the_task_icon_in_the_navbar_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.taskIcon);
    }

    @Given("Visibility of Bed Status link in navbar is tested")
    public void visibility_of_bed_status_link_in_navbar_is_tested() {
        homepage.elementIsDisplayed(pageAdminDashboard.bedStatus);
    }

    @Given("Click the Bed Status link in the navbar")
    public void click_the_bed_status_link_in_the_navbar() {
        pageAdminDashboard.bedStatus.click();
    }

    @Given("The visibility of the Bed Status floor and room information in the navbar is tested")
    public void the_visibility_of_the_bed_status_floor_and_room_information_in_the_navbar_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.badStatusPage);
    }

    @Given("Click the profile link in the navbar")
    public void click_the_profile_link_in_the_navbar() {
        pageAdminDashboard.profilButton.click();

    }

    @Then("My profile link is clicked")
    public void my_profile_link_is_clicked() {
        pageAdminDashboard.profilButtonn.click();
    }

    @Given("Visibility of profile,password,loqout icons is tested")
    public void visibility_of_profile_password_loqout_icons_is_tested() {
        homepage.elementIsEnabled(pageAdminDashboard.profilButtonIcon);
        homepage.elementIsEnabled(pageAdminDashboard.profilPasswordIcon);
        homepage.elementIsEnabled(pageAdminDashboard.profilLoqoutIcon);
    }

    @Given("Loqout icon is clicked")
    public void loqout_icon_is_clicked() {
        pageAdminDashboard.profilLoqoutIcon.click();
    }

    @Given("Loqout is tested")
    public void loqout_is_tested() {
        homepage.elementIsDisplayed(pageLogin.textBoxAdminUsername);
    }

    @Given("On the page that opens, the visibility of the profile titles is tested.")
    public void on_the_page_that_opens_the_visibility_of_the_profile_titles_is_tested() {

        ReusableMethod.bekle(2);
        homepage.elementIsDisplayed(pageAdminDashboard.profilPayrollIcon);
        homepage.elementIsDisplayed(pageAdminDashboard.profilLeaves);
        homepage.elementIsDisplayed(pageAdminDashboard.profilSttafAddence);
        homepage.elementIsDisplayed(pageAdminDashboard.profilDocuments);
        homepage.elementIsDisplayed(pageAdminDashboard.profilTimeLine);
        homepage.elementIsDisplayed(pageAdminDashboard.profilPageAdress);
        homepage.elementIsDisplayed(pageAdminDashboard.profilBankaAccaunt);
        homepage.elementIsDisplayed(pageAdminDashboard.profilPageSocialMediaLink);
    }

    @Given("The visibility of Address, Bank Account Details, Social Media Link information on the profile page is tested.")
    public void the_visibility_of_address_bank_account_details_social_media_link_information_on_the_profile_page_is_tested() {
        pageAdminDashboard.profilPayrollIcon.click();
        pageAdminDashboard.profilPayrollPageSalary.isDisplayed();
        ReusableMethod.bekle(1);
        pageAdminDashboard.profilLeaves.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.profilLeavesCasual.isDisplayed();
        ReusableMethod.bekle(1);
        pageAdminDashboard.profilSttafAddence.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.profilSttafAddenceTotalPresent.isDisplayed();
        ReusableMethod.bekle(1);
        pageAdminDashboard.profilDocuments.click();
        String expectedDocumentText = "No Record Found";
        Assert.assertTrue(pageAdminDashboard.profilDocumentsNoRecordFoundText.getText().contains(expectedDocumentText));
        ReusableMethod.bekle(1);
        pageAdminDashboard.profilTimeLine.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.profilTimeLineAddButton.isSelected();
    }


    @Given("Visibility of adminLogin is verified")
    public void visibilityOfAdminLoginIsVerified() {
        homepage.elementIsDisplayed(pageAdminDashboard.textAdminLogin);

    }

    @And("Visibility of adminLogin page Latest News information is verified")
    public void visibilityOfAdminLoginPageLatestNewsInformationIsVerified() {
        homepage.elementIsDisplayed(pageAdminDashboard.panelLastestNew);
    }

    @When("Verify that  adminLogin page Latest News information is accessible")
    public void verifyThatAdminLoginPageLatestNewsInformationIsAccessible() {
        homepage.clickAndUrlQuery(pageAdminDashboard.linkReadMoreBlog,"alexander-smith", driver.getCurrentUrl());
    }

    @Given("Admin Login Click on the forgot password link on the page that opens")
    public void adminLoginClickOnTheForgotPasswordLinkOnThePageThatOpens() {
        homepage.clickAndUrlQuery(pageAdminDashboard.linkForgotPassword,"forgotpassword", driver.getCurrentUrl());
    }

    @And("Admin Login Enter valid email into email textBox")
    public void adminLoginEnterValidEmailIntoEmailTextBox() {
        pageAdminDashboard.textBoxForgotPasswordEmail.sendKeys("aydinliefe@gmail.com");
        ReusableMethod.bekle(2);
    }

    @And("Admin Login  Click the Submit button")
    public void adminLoginClickTheSubmitButton() {
        pageAdminDashboard.buttonForgetPasswordSubmit.click();
        ReusableMethod.bekle(2);
    }

    @And("Admin Login sentToMailText text visibility is verified")
    public void adminLoginSentToMailTextTextVisibilityIsVerified() {
        homepage.elementIsDisplayed(pageAdminDashboard.textForgetPasswordAlertAdmin);
        ReusableMethod.bekle(2);
    }

    @Then("Clicking on the Admin Login link will return to the login page again.")
    public void clickingOnTheAdminLoginLinkWillReturnToTheLoginPageAgain() {
        homepage.clickAndUrlQuery(pageAdminDashboard.linkAdminLoginBack,"site/login", driver.getCurrentUrl());
    }

    @Given("Enters {string} from examples as username for admin panel")
    public void entersFromExamplesAsUsernameForAdminPanel(String username) {
        pageAdminDashboard.textBoxEmail.sendKeys(username);
    }

    @And("Enters {string} from examples as password for admin panel")
    public void entersFromExamplesAsPasswordForAdminPanel(String password) {
        pageAdminDashboard.texBoxPassword.sendKeys(password);
    }

    @And("Presses the Sign In button for admin panel")
    public void pressesTheSignInButtonForAdminPanel() {
        pageLogin.buttonSignIn.click();
        ReusableMethod.bekle(2);
    }

    @And("Tests that login is not possible for admin panel")
    public void testsThatLoginIsNotPossibleForAdminPanel() {
        homepage.elementIsDisplayed(pageAdminDashboard.textAlertEmailAndPassword);
    }

    @Then("Click the passwordl button on the profile link")
    public void click_the_passwordl_button_on_the_profile_link() {
        pageAdminDashboard.profilPasswordIcon.click();
    }

    @Then("Current Password is entered")
    public void current_password_is_entered() {
        pageAdminDashboard.profilCurrentPassword.click();
        pageAdminDashboard.profilCurrentPassword.sendKeys(ConfigReader.getProperty("passwordHasan"));
    }

    @Then("New Password is entered")
    public void new_password_is_entered() {
        pageAdminDashboard.profilNewPassword.sendKeys("heallife1234");
    }

    @Then("Confirm Password is entered")
    public void confirm_password_is_entered() {
        pageAdminDashboard.profilConfirmPassword.sendKeys("heallife1234");
    }

    @Then("Click the Change Password button")
    public void click_the_change_password_button() {
        pageAdminDashboard.profilChangPassword.click();
    }

    @Then("It is verified that the password information is updated")
    public void ıt_is_verified_that_the_password_information_is_updated() {
        String expectedText = "Bu sayfa çalışmıyor";
        assertTrue(pageAdminDashboard.profilChangNotPassword.getText().equals(expectedText));
    }

    @Then("Click on the Biling link on the Dashboard")
    public void click_on_the_biling_link_on_the_dashboard() {
        pageAdminDashboard.dashboardBilingButton.click();
    }

    @Then("The visibility of the knowing page is tested")
    public void the_visibility_of_the_knowing_page_is_tested() {
        pageAdminDashboard.bilingButtonBilingPage.isEnabled();
    }

    @Then("Visibility of Single Module Billing and OPDIPD Billing Through Case Id windows is tested")
    public void visibility_of_single_module_billing_and_opd_ıpd_billing_through_case_ıd_windows_is_tested() {
        pageAdminDashboard.bilingButtonBilingPage.isDisplayed();
        pageAdminDashboard.bilingOpdIpdBiling.isDisplayed();
    }

    @Then("Click on OPD button")
    public void click_on_opd_button() {
        pageAdminDashboard.bilingOpdButton.click();
    }

    @Then("OPD Billing List listed under {string} is tested to see that the titles are listed")
    public void opd_billing_list_listed_under_is_tested_to_see_that_the_titles_are_listed(String data) {
        assertTrue(ReusableMethod.baslikListelemeMethod(data));
    }

    @Then("TestTextBox is tested")
    public void test_text_box_is_tested() {
        pageAdminDashboard.opdbilingSearcTexBox.isDisplayed();
    }

    @Then("click the first Add Patient, then the new patient button")
    public void click_the_first_add_patient_then_the_new_patient_button() {
        pageAdminDashboard.opdAddPatient.click();
        ReusableMethod.bekle(2);
        pageAdminDashboard.opdNewPatient.click();
        ReusableMethod.bekle(2);
    }

    @Then("Click the Name field and enter the information")
    public void click_the_name_field_and_enter_the_information() {
        pageAdminDashboard.opdNewPatientName.click();
        pageAdminDashboard.opdNewPatientName.sendKeys("hasan sen");
    }

    @Then("Age field is clicked and birth date year month day information is entered.")
    public void age_field_is_clicked_and_birth_date_year_month_day_information_is_entered() {
        pageAdminDashboard.opdNewPatientAgiYear.click();
        pageAdminDashboard.opdNewPatientAgiYear.sendKeys("1982");
        pageAdminDashboard.opdNewPatientAgiMonth.click();
        pageAdminDashboard.opdNewPatientAgiMonth.sendKeys("12");
        pageAdminDashboard.opdNewPatientAgiDay.click();
        pageAdminDashboard.opdNewPatientAgiDay.sendKeys("31");
    }

    @Then("Save button is clickdd")
    public void save_button_is_clickdd() {
        pageAdminDashboard.opdNewPatientSave.click();
    }

    @Then("It is tested that the new name information is saved")
    public void it_is_tested_that_the_new_name_information_is_saved() {
        pageAdminDashboard.opdNewPatientTest.isEnabled();
    }

    @Then("Click the Total Recheckup icon")
    public void click_the_total_recheckup_icon() {
        Actions actions = new Actions(driver);
        actions.click(pageAdminDashboard.opdBilingRecheckup).perform();
        ReusableMethod.bekle(1);
    }

    @Then("It is tested that Total Recheckup information is visible.")
    public void it_is_tested_that_total_recheckup_information_is_visible() {
        String expectedGenderText = "Gender";
        assertTrue(pageAdminDashboard.opdBilingRecheckupGender.getText().contains(expectedGenderText));
    }

    @Then("Number of patients button is clicked")
    public void number_of_patients_button_is_clicked() {
        pageAdminDashboard.opdBilingSortall.click();
        Select select = new Select(pageAdminDashboard.opdBilingSortall);
        select.selectByVisibleText("All");
    }

    @Then("It is tested that the number of patients can be selected")
    public void it_is_tested_that_the_number_of_patients_can_be_selected() {
        pageAdminDashboard.opdBilingSortall.isDisplayed();
    }

    @Then("Name icon is clicked")
    public void name_icon_is_clicked() {
        pageAdminDashboard.opdBilingNames.click();
    }

    @Then("It is tested that the name information is visible")
    public void it_is_tested_that_the_name_information_is_visible() {
        String expectedGenderText = "Gender";
        assertTrue(pageAdminDashboard.opdBilingRecheckupGender.getText().contains(expectedGenderText));
    }

    @Then("Click on the Pathology link on the Dashboard")
    public void click_on_the_pathology_link_on_the_dashboard() {
        pageAdminDashboard.bilingPatologyButton.click();
    }

    @Then("Pathology Billing List {string} test showing that the titles are listed")
    public void pathology_billing_list_test_showing_that_the_titles_are_listed(String data2) {
        assertTrue(ReusableMethod.baslikListelemeMethod2(data2));
        System.out.println(data2);
    }

    @Then("Number of patients buttonn is clicked")
    public void number_of_patients_buttonn_is_clicked() {
        pageAdminDashboard.pathologyBilingSortall.click();
        Select select = new Select(pageAdminDashboard.pathologyBilingSortall);
        select.selectByVisibleText("All");
    }

    @Then("It is tested that the numberr of patients can be selected")
    public void it_is_tested_that_the_numberr_of_patients_can_be_selected() {
        pageAdminDashboard.pathologyBilingSortall.isDisplayed();
    }

    @Then("Click the Balance Amount icon")
    public void click_the_balance_amount_icon() {
        Actions actions = new Actions(driver);
        actions.click(pageAdminDashboard.pathologyBilingBalanceAmount).perform();
        ReusableMethod.bekle(1);

    }

    @Then("It is tested that the Balance Amount information is displayed.")
    public void it_is_tested_that_the_balance_amount_information_is_displayed() {
        pageAdminDashboard.pathologyBilingPaymentText.isDisplayed();
    }

    @Then("Date and amount are entered on the Balance Amount page.")
    public void date_and_amount_are_entered_on_the_balance_amount_page() {
        pageAdminDashboard.pathologyBilingPaymentDate.sendKeys("16.05.2023", Keys.ENTER);
        pageAdminDashboard.pathologyBilingPaymentAmount.click();
        // pageAdminDashboard.pathologyBilingPaymentAmount.sendKeys("50");
        pageAdminDashboard.pathologyBilingPaymentSaveButton.click();
    }

    @Then("It is tested that additional payment is made to the invoice.")
    public void it_is_tested_that_additional_payment_is_made_to_the_invoice() {
        //  String expectedCash="No Record Found";
        // pageAdminDashboard.pathologyBilingPaymentModeCash.isDisplayed();
        assertTrue(pageAdminDashboard.pathologyBilingPaymentModeCashTest.isDisplayed());
        pageAdminDashboard.cashTestDelete.click();
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("In the Dashboard, click on the Radiology board")
    public void in_the_dashboard_click_on_the_radiology_board() {
        pageAdminDashboard.bilingRadiologyButton.click();
    }

    @Then("Radiology Billing List is tested to see the titles listed {string} test showing that the titles are listed")
    public void radiology_billing_list_is_tested_to_see_the_titles_listed_test_showing_that_the_titles_are_listed(String data3) {
        assertTrue(ReusableMethod.baslikListelemeMethod2(data3));
    }

    @Then("Click on the Blood Issue board")
    public void click_on_the_blood_issue_board() {
        pageAdminDashboard.bilingBloodIssueButton.click();
    }

    @Then("Blood Issue Billing List {string} is tested to see that the titles are listed")
    public void blood_ıssue_billing_list_is_tested_to_see_that_the_titles_are_listed(String data4) {
        assertTrue(ReusableMethod.baslikListelemeMethod2(data4));
    }

    @Then("Visibility of billing \\(Blood Issue Details) information is tested")
    public void visibility_of_billing_blood_issue_details_information_is_tested() {
        pageAdminDashboard.bilingButtonBilingPage.isDisplayed();
    }

    @Then("Erasability and editability of Blood Issue Details data are tested")
    public void erasability_and_editability_of_blood_issue_details_data_are_tested() {
        Actions actions1 = new Actions(driver);
        actions1.click(pageAdminDashboard.actionShowListViewItem).perform();
        ReusableMethod.bekle(1);
        pageAdminDashboard.cashTestDetailsDelete.click();
        Driver.getDriver().switchTo().alert().accept();
        pageAdminDashboard.cashTestDetailsEdit.click();
        pageAdminDashboard.cashRecordSaved.click();
        pageAdminDashboard.cashRecordSavedTest.isDisplayed();
    }

    @Then("Click the Balance Amount Select")
    public void click_the_balance_amount_select() {
        Actions actions2 = new Actions(driver);
        actions2.click(pageAdminDashboard.cashAddPayment).perform();
    }

    @Then("Date and amount are entered on the Balance Amount pagee.")
    public void date_and_amount_are_entered_on_the_balance_amount_pagee() {
        pageAdminDashboard.pathologyBilingPaymentDate.sendKeys("16.05.2023", Keys.ENTER);
        pageAdminDashboard.pathologyBilingPaymentAmount.click();
        pageAdminDashboard.pathologyBilingPaymentSaveButtonnn.click();
    }

    @Then("It is tested that additional payment is made to the invoicee.")
    public void it_is_tested_that_additional_payment_is_made_to_the_invoicee() {
        assertTrue(pageAdminDashboard.pathologyBilingPaymentModeCashTests.isDisplayed());

    }

    @Then("Delete button is clicked")
    public void delete_button_is_clicked() {
        Actions actions1 = new Actions(driver);
        actions1.click(pageAdminDashboard.cashDelete).perform();
        ReusableMethod.bekle(1);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("It is tested that the Bild data has been deleted")
    public void it_is_tested_that_the_bild_data_has_been_deleted() {
        pageAdminDashboard.cashDeleteTestt.isDisplayed();
    }

    @Then("Click on the Blood Component Issue board")
    public void click_on_the_blood_component_issue_board() {
        pageAdminDashboard.bilingComponentsIssueButton.click();
    }

    @Then("Blood Component Issue Billing List is {string} tested to see that the titles are listed")
    public void blood_component_issue_billing_list_is_tested_to_see_that_the_titles_are_listed(String data5) {
        assertTrue(ReusableMethod.baslikListelemeMethod2(data5));
    }

    @Then("Click the Balance Amount iconnn")
    public void click_the_balance_amount_iconnn() {
        Actions actions = new Actions(driver);
        actions.click(pageAdminDashboard.pathologyBilingBalanceAmounttt).perform();
        ReusableMethod.bekle(1);

    }

    @Then("Date and amount are entered on the Balance Amount pageee.")
    public void date_and_amount_are_entered_on_the_balance_amount_pageee() {
        pageAdminDashboard.pathologyBilingPaymentDate.sendKeys("16.05.2023", Keys.ENTER);
        pageAdminDashboard.pathologyBilingPaymentAmount.click();
        // pageAdminDashboard.pathologyBilingPaymentAmount.sendKeys("50");
        pageAdminDashboard.pathologyBilingPaymentSaveButtonnn.click();
    }

    @Then("It is tested that additional payment is made to the invoiceee.")
    public void it_is_tested_that_additional_payment_is_made_to_the_invoiceee() {
        assertTrue(pageAdminDashboard.pathologyBilingPaymentModeCashTestss.isDisplayed());
    }

    @Then("Click the delete button under the Balance Amount heading and test it for deletion.")
    public void click_the_delete_button_under_the_balance_amount_heading_and_test_it_for_deletion() {
        Actions actions1 = new Actions(driver);
        actions1.click(pageAdminDashboard.cashDeleteee).perform();
        ReusableMethod.bekle(1);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Click the Search section and enter the patient Case ID and click the search button")
    public void click_the_search_section_and_enter_the_patient_case_ıd_and_click_the_search_button() {
        ReusableMethod.bekle(1);
        pageAdminDashboard.cashIdSearch.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.cashIdSearch.sendKeys("250");
        ReusableMethod.bekle(1);
        pageAdminDashboard.cashIdSearchButton.click();
        ReusableMethod.bekle(1);
    }

    @Then("The Generate Bill button is clicked on the page that opens and the Billing is tested.")
    public void the_generate_bill_button_is_clicked_on_the_page_that_opens_and_the_billing_is_tested() {
        pageAdminDashboard.generateBillButton.click();
        pageAdminDashboard.generateBillTest.isDisplayed();
    }

    @Then("The Bill Summary button is clicked and the invoice is tested.")
    public void the_bill_summary_button_is_clicked_and_the_invoice_is_tested() {
        pageAdminDashboard.billSummary.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.billSummaryclose.isDisplayed();
        ReusableMethod.bekle(1);
        pageAdminDashboard.billSummaryclose.click();
        ReusableMethod.bekle(1);
    }

    @Then("Click the Add Payment button, enter the date and amount, click the save button")
    public void click_the_add_payment_button_enter_the_date_and_amount_click_the_save_button() {
        pageAdminDashboard.addpaymentButton.click();
        pageAdminDashboard.addpaymentDate.sendKeys("21.05.2023");
        pageAdminDashboard.addpaymentDateAmaount.sendKeys("50");
        pageAdminDashboard.addpaymentSaveButton.click();
        ReusableMethod.bekle(1);
    }

    @Then("Click the View Payments button and test that the new amount has been added")
    public void click_the_view_payments_button_and_test_that_the_new_amount_has_been_added() {
        pageAdminDashboard.viewPaymentsButton.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.viewPaymentsTest.isDisplayed();
    }

    @Then("Single Module Billing icon is clicked, it is tested to switch to OPD, Pathology, Radiology, Bllod Issue, Blood Component Issue page.")
    public void single_module_billing_icon_is_clicked_it_is_tested_to_switch_to_opd_pathology_radiology_bllod_issue_blood_component_issue_page() {
        pageAdminDashboard.singleModuleBillingButton.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModuleBillingOPD.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModuleBillingOPDTest.isDisplayed();
        driver.navigate().back();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModuleBillingButton.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModulePathology.click();
        pageAdminDashboard.singleModulePathologyTest.isDisplayed();
        driver.navigate().back();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModuleBillingButton.click();
        pageAdminDashboard.singleModuleRadiology.click();
        pageAdminDashboard.singleModuleRadiologyTest.isDisplayed();
        driver.navigate().back();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModuleBillingButton.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModuleBloodIssue.click();
        pageAdminDashboard.singleModuleBloodIssueTest.isDisplayed();
        driver.navigate().back();
        ReusableMethod.bekle(1);
        pageAdminDashboard.singleModuleBillingButton.click();
        pageAdminDashboard.singleModuleBloodCompenend.click();
        pageAdminDashboard.singleModuleBloodCompenendTest.isDisplayed();
    }

    // *****************Dashboard>TPA Managements*****************
    @Then("Click on the TPA Management link on the Dashboard")
    public void click_on_the_tpa_management_link_on_the_dashboard() {
        pageAdminDashboard.tpaManagementlink.click();
    }

    @Then("It is tested that it is directed to the relevant page")
    public void it_is_tested_that_it_is_directed_to_the_relevant_page() {
        pageAdminDashboard.tpaManagementText.isDisplayed();
    }

    @Then("TPA Management List {string} headings is tested to be displayed")
    public void tpa_management_list_headings_is_tested_to_be_displayed(String data6) {
        baslikListelemeMethod3(data6);
    }

    public static boolean baslikListelemeMethod3(String data6) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        System.out.println(baslikListesiActual);
        String[] liste = data6.split(", ");
        System.out.println(Arrays.toString(liste));
        int count = 0;
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).equals(liste[i])) {
                    count++;
                }
            }
        }
        if (count == liste.length) {
            return true;
        }
        return false;


    }

    @Then("It is tested that the titles in the TPA Management List are listed in the list.")
    public void it_is_tested_that_the_titles_in_the_tpa_management_list_are_listed_in_the_list() {
     assertTrue(ReusableMethod.IntListSiralamaTesti(2));
    }

    @Then("Click the Delete Edit, Organization, icon one after the other.")
    public void click_the_delete_edit_organization_icon_one_after_the_other() {
        Actions actions1 = new Actions(driver);
        actions1.click(pageAdminDashboard.tpaDeleteIcon).perform();
        ReusableMethod.bekle(2);
      //  pageAdminDashboard.tpaDeleteIcon.click();
        Driver.getDriver().switchTo().alert().accept();
        pageAdminDashboard.tpaEditIcon.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditName.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditName.sendKeys("Murtaza Ak");
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditCode.sendKeys("125");
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditContactNo.sendKeys("100");
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditSave.click();
        ReusableMethod.bekle(3);
      //  assertTrue(pageAdminDashboard.cashRecordSavedTest.isDisplayed());
        ReusableMethod.bekle(1);
    }
    @Then("It is tested that the Delete Edit, Oranization operations are done")
    public void it_is_tested_that_the_delete_edit_oranization_operations_are_done() {
       // actions.click(pageAdminDashboard.tpaOrganizationIcon).perform();
        actions.moveToElement(pageAdminDashboard.tpaOrganizationIcon).pause(Duration.ofMillis(5000)).click().perform();
          assertTrue (pageAdminDashboard.tpaorganizationDetailsText.isDisplayed());
    }
    @Then("Tests access to the Add TPA window")
    public void tests_access_to_the_add_tpa_window() {
      pageAdminDashboard.tpaAddIcon.click();
      pageAdminDashboard.tpaEditName.isDisplayed();
    }
    @Then("Name, Code, Contact No, Address , Contact Person Name, Contact Person Phone Boxes visibility is tested")
    public void name_code_contact_no_address_contact_person_name_contact_person_phone_boxes_visibility_is_tested() {
       pageAdminDashboard.tpaAddIcon.click();
       pageAdminDashboard.tpaEditName.isDisplayed();
       pageAdminDashboard.tpaEditCode.isDisplayed();
       pageAdminDashboard.tpaEditContactNo.isDisplayed();
    }
    @Then("A new record is made and its visibility is tested in the new record list.")
    public void a_new_record_is_made_and_its_visibility_is_tested_in_the_new_record_list() {
        pageAdminDashboard.tpaAddIcon.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditName.click();
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditName.sendKeys("Murtaza Ak");
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditCode.sendKeys("125");
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditContactNo.sendKeys("100");
        ReusableMethod.bekle(1);
        pageAdminDashboard.tpaEditSave.click();
        pageAdminDashboard.tpaorganizationDetailsText.isDisplayed();

    }




}












