package pages;


import io.cucumber.java.zh_cn.假如;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.Collections;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethod;
import java.security.Key;
import java.security.KeyStore;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class PageDoctorDashboard extends Base {


    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement linkAppointments;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchIPD;

    @FindBy(xpath = "//*[text()='IPDN90']")
    public WebElement searchIPDNo;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_length\"]/label/select")
    public WebElement dropDownAllor100;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[1]/div/a/i")
    public WebElement creditLimitlist2;

    @FindBy(xpath = "(//i[@class='fa fa-reorder'])[2]")
    public WebElement iconShowDetails;

    @FindBy(xpath = " //*[text()=' Overview']")
    public WebElement verifyCreditLimit;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[1]/a")
    public WebElement overview;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[2]/a")
    public WebElement nurseNotePage;

    @FindBy(xpath = "//*[@id=\"nurse_note\"]/div[3]/div")
    public WebElement nurseNotes;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[3]/a")
    public WebElement medicationPage;

    @FindBy(xpath = "(//*[text()='Medication'])[2]")
    public WebElement medicationHistory;

    @FindBy(xpath = "//*[@id=\"medication\"]/div[1]/div/a")
    public WebElement addMedicationdose;

    @FindBy(xpath = "(//*[text()='Add Medication Dose'])[2]")
    public WebElement medicationDosePage;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[4]/a")
    public WebElement prescriptionPage;

    @FindBy(xpath = "(//*[text()='Prescription'])[2]")
    public WebElement prescriptionHistoy;

    @FindBy(xpath = "//*[@id=\"prescription\"]/div[1]/div/a")
    public WebElement addPrescription;

    @FindBy(xpath = "//*[text()='Add Prescription']")
    public WebElement patientPrescription;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[5]/a")
    public WebElement consultantRegisterPage;

    @FindBy(xpath = "//*[@id=\"consultant_register\"]/div[1]/h3")
    public WebElement listOfConsultantRegister;

    @FindBy(xpath = "//*[@id=\"consultant_register\"]/div[1]/div/a")
    public WebElement creataNewConsultantRegister;

    @FindBy(xpath = "//*[@id=\"consultant_register_form\"]/div[1]/div/div/div[1]/div/input")
    public WebElement consultantAppliedDate;

    @FindBy(xpath = "//*[@id=\"instruction_date\"]")
    public WebElement consultantaniInstructionDate;

    @FindBy(xpath = "//*[@id=\"consultant_register_form\"]/div[1]/div/div/div[4]/div/textarea")
    public WebElement instruction;

    @FindBy(xpath = "//*[@id=\"consultant_registerbtn\"]")
    public WebElement saveButtonOfConsultant;

    @FindBy(xpath = "//*[@id=\"consultant_register_form\"]")
    public WebElement pageOfNewConsultantRegister;

    @FindBy(xpath = "//*[@id=\"form_prescription\"]/div[1]/div/div/div[2]/div/div[1]/div/span/span[1]/span/span[2]")
    public WebElement prescriptionDoctorSelect;

    @FindBy(xpath = "(//*[text()=' ahmet.bicakci (9033) '])[2]")
    public WebElement doctorAhmetBicakci;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[10]")
    public WebElement medicineCategory;

    @FindBy(xpath = "//*[@id=\"row1\"]/td[1]/div[2]/div/span[1]/span[1]/span/span[2]")
    public WebElement medicine;

    @FindBy(xpath = "//*[@id=\"select2-dosage_1-6r-container\"]")
    public WebElement dosage;

    @FindBy(xpath = "//*[@id=\"form_prescription\"]/div[1]/div/div/div[2]/div/div[4]/div/div[4]/label/input")
    public WebElement pharmacist;

    @FindBy(xpath = "//*[@id=\"form_prescription\"]/div[2]/div/button[2]/button")
    public WebElement saveButtonPrescription;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_2\"]/tbody/tr[7]/td[1]")
    public WebElement datePrescription;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[6]/a")
    public WebElement labInvestigationPage;

    @FindBy(xpath = "(//*[text()='Lab Investigation'])[2]")
    public WebElement labPageHistory;

    @FindBy(xpath = "//*[text()=' Payments']")
    public WebElement paymentsPage;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[7]/a")
    public WebElement operationPage;

    @FindBy(xpath = "//*[@id=\"operationtheatre\"]/div[1]/div/a")
    public WebElement addOperation;

    @FindBy(xpath = "//*[@id=\"select2-operation_category-container\"]")
    public WebElement selectOperation;

    @FindBy(xpath = "//*[@id=\"date\"]")
    public WebElement operationDate;

    @FindBy(xpath = "//*[@id=\"select2-operation_name-container\"]")
    public WebElement operationNameSelect;

    @FindBy(xpath = "//*[@id=\"form_addoperationtheatrbtn\"]")
    public WebElement addSaveOperation;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[8]/a")
    public WebElement chargesPage;

    @FindBy(xpath = "//*[@id=\"charges\"]/div[1]/div/a")
    public WebElement addChargesPage;

    @FindBy(xpath = "//*[@id=\"select2-add_charge_type-container\"]")
    public WebElement chargesType;

    @FindBy(xpath = "//*[@id=\"select2-charge_category-container\"]")
    public WebElement selectChargeCategory;

    @FindBy(xpath = "(//b[@role='presentation'])[20]")
    public WebElement selectChargeName;

    @FindBy(xpath = "//*[@id=\"qty\"]")
    public WebElement qtyCharge;

    @FindBy(xpath = "//*[@id=\"charge_date\"]")
    public WebElement dateCharges;

    @FindBy(xpath = "//*[@id=\"add_charges\"]/div[2]/div/button[2]")
    public WebElement chargeSave;


    public void clickAndElementControl(WebElement element){
        String expElement=Driver.getDriver().findElement(By.tagName("h2")).getText();
        element.click();
        ReusableMethod.bekle(3);
        String actElement=Driver.getDriver().findElement(By.tagName("h2")).getText();
        Assert.assertNotEquals(expElement,actElement);
    }

    @FindBy(xpath = "//*[@id=\"charges\"]/div[1]/h3")
    public WebElement newChargesList;

    @FindBy(xpath = ("//*[@id=\"payment\"]/div[1]/div/a"))
    public WebElement addPaymentPage;

    @FindBy(xpath = "//input[@name='payment_date']")
    public WebElement addPaymentDate;

    @FindBy(xpath = "(//button[@name='charge_data'])[1]")
    public WebElement addCharges;

    @FindBy(xpath = "//*[@class='fa fa-chevron-right']")
    public WebElement homePageIPDSlide;

    @FindBy(xpath = "//a[@class='bed_history']")
    public WebElement bedHistoryPage;

    @FindBy(xpath = "(//i[@class='far fa-calendar-check'])[2]")
    public WebElement timelinePage;

    @FindBy(xpath = "(//a[@data-toggle='modal'])[4]")
    public WebElement addTimeline;

    @FindBy(xpath = "//*[@id=\"timeline_title\"]")
    public WebElement titleAddTimeLine;

    @FindBy(xpath = "(//*[text()='Timeline'])[2]")
    public WebElement verifyAddTimeline;

    @FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[13]/a")
    public WebElement addTreatmenHistory;

    @FindBy(xpath = "(//*[text()='Treatment History'])[2]")
    public WebElement verifyTreatmenHistory;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement dischargedPage;

    @FindBy(xpath = "//h3[text()=' IPD Discharged Patient']")
    public WebElement verifyDischargedPatient;

    @FindBy(xpath = "//input[@aria-controls='DataTables_Table_0']")
    public WebElement searchDischarged;

    @FindBy(xpath = "(//td[@class=' dt-body-right'])[3]")
    public WebElement totalDischarged;


    @FindBy(xpath = "//i[@class=\"fa fa-reorder\"]")
    public WebElement showIcon;

    @FindBy(xpath = "//*[text()='Zehra Cicek']")
    public WebElement dischargedNameInformation;

    @FindBy(xpath = "//*[text()='Pathology']")
    public WebElement patholgyDashboard;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBoxInPathology;

    @FindBy(xpath = "//*[text()='PATHOB155']")
    public WebElement patalogygySearchResult;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[1]")
    public WebElement patalogyTestList;

    @FindBy(xpath = "//*[text()='All']")
    public WebElement patalogyAllList;

    @FindBy(xpath = "//*[@id=\"testreport\"]/tbody/tr[1]/td[8]")
    public WebElement firstBalance;

    @FindBy(xpath = "//*[@id=\"testreport\"]/tbody/tr[1]/td[1]/div/a[1]/i")
    public WebElement viewReports;

    @FindBy(xpath = "(//*[text()='Bill Details'])[1]")
    public WebElement verifyPatologyBill;

    @FindBy(xpath = "//*[@id=\"testreport\"]/tbody/tr[1]/td[1]/div/a[2]/i")
    public WebElement billdeatilsPatology;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a")
    public WebElement patalogyTestPage;

    @FindBy(xpath = "(//td[@class=' dt-body-right'])[3]")
    public WebElement amountFirstPatologyTestBill;

    @FindBy(xpath = "(//*[@class='btn btn-default btn-xs'])[1]")
    public WebElement showPathologyIcon;


    //The method of headers listing


        WebDriver driver = Driver.getDriver();
        PageHomepage homepage = new PageHomepage();
        @FindBy(xpath = "//input[@type='search']")
        public WebElement panelSearch;

        @FindBy(xpath = "//*[text()='APPNO394']")
        public WebElement appSearchVerification;

    public  void patholgyList (String data) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//div//table//thead//tr//th"));

    }



    // DoctorDashboard--> Dashboardsidebar --> DashBoard Lists
    @FindBy(xpath = "(//li[@class='treeview '])[2]")
    public WebElement dashBoardList;
    @FindBy(id="task-title")
    public WebElement taskTitle;
    //

        @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[11]/small")
        public WebElement appointStatusApporoved;

        @FindBy(xpath = "//*[text()='All']")
        public WebElement allList;

        @FindBy(xpath = "(//i[@class='fa fa-reorder'])[3]")
        public WebElement statusShowLogo;

        @FindBy(xpath = "(//i[@class='fa fa-print'])[2]")
        public WebElement statusPrintLogo;

        @FindBy(xpath = "//h3[@class='box-title titlefix']")
        public WebElement statusSshowAppointDetails;

        @FindBy(xpath = "(//button[@type='button'])[5]")
        public WebElement statusShowAppExtButon;

        @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
        public WebElement doctorWise;

        @FindBy(xpath = "//span[@role='presentation']")
        public WebElement doctorWiseDoctor;

        @FindBy(xpath = "(//button[@type='submit'])[3]")
        public WebElement doctorWiseSearch;


        @FindBy(xpath = "(//a[@class='detail_popover'])[1]")
        public WebElement doctorWiseEmre;

        @FindBy(xpath = "(//i[@class='fa fa-reorder'])[2]")
        public WebElement doctorQueue;

        @FindBy(xpath = "//select[@name='doctor']")
        public WebElement queryDoctor;

        @FindBy(xpath = "//select[@name='global_shift']")
        public WebElement queryShift;

        @FindBy(xpath = "//select[@name='slot']")
        public WebElement querySlot;

        @FindBy(xpath = "(//button[@type='submit'])[3]")
        public WebElement querySelect;

        @FindBy(xpath = "//*[text()='tugba (552)']")
        public WebElement queryDogrulama;

        @FindBy(xpath = "(//td[@class=' dt-body-right'])[1]")
        public WebElement totalRechecupilkShow;

        @FindBy(xpath = "(//i[@class='fa fa-reorder'])[1]")
        public WebElement totalRechecupShowİkon;

        @FindBy(xpath = "//i[@class='fa fa-th']")
        public WebElement totalShowLogoDOgrulama;

        @FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
        public WebElement visitsOPD;

        @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div[2]/div/ul/li[3]/a")
        public WebElement labInvestigationOPD;

        @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div[2]/div/ul/li[4]/a")
        public WebElement treatmentHistoryOPD;

        @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div[2]/div/ul/li[5]/a")
        public WebElement timelineOPD;

        @FindBy(xpath = "//*[@id=\"timeline\"]/div[2]/a")
        public WebElement newTimelineOPD;

        @FindBy(xpath = "//input[@id='timeline_title']")
        public WebElement newTimelineTitleOPD;

        @FindBy(xpath = "//*[@id=\"add_timelinebtn\"]")
        public WebElement newTimelineSaveOPD;

        @FindBy(xpath = "(//*[@id=\"add\"])[1]")
        public WebElement addPatientOPD;

        @FindBy(xpath = "//*[@id=\"add\"]/span")
        public WebElement newAddPatientOPD;

        @FindBy(xpath = "//*[@id=\"name\"]")
        public WebElement newAddPatientNameOPD;

        @FindBy(xpath = "//*[@id=\"formaddpabtn\"]")
        public WebElement newAddPatientSaveOPD;

        @FindBy(xpath = "//*[@id=\"listname\"]")
        public WebElement newAddPatientDogrulamaOPD;

        @FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/form/div/input")
        public WebElement aramaSearchBox;

        @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")
        public WebElement aramaSearchBoxDogrylama;


        public void statusList ()
        {

            Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']")));
            ReusableMethod.bekle(3);
            select.selectByVisibleText("All");
        }

        // Doctor > Notice Message
        @FindBy(xpath = "//div[@class='col-md-12']")
        public WebElement noticeMessage;

        // Doctor --> Notification > 26. Notification
        @FindBy(xpath = "(//div[@class='dashalert alert alert-success alert-dismissible'])[1]")
        public WebElement notificationMessageFirst;
        // // Doctor --> Notification > 26. Notification > Not content
        @FindBy(xpath = "(//div[@class='col-md-9'])[26]")
        public WebElement notContent;

        // DoctorDashboard > Accountant
        @FindBy(xpath = "(//*[@class='info-box-content'])[10]")
        public WebElement employesAccounted;
        ////span[text()='Accountant']  //*[@class='box-body']

        // DoctorDashboard > box-body
        @FindBy(xpath = "(//*[@class='box-body'])[1]")
        public WebElement boxBody;

        @FindBy(xpath = "//*[@class='fc-content']")
        public WebElement doctorNowEvent;

        // DoctorDashboard --> AddDate--> Event Title Textbox
        @FindBy(id = "input-field")
        public WebElement eventTitleTextbox;

        // DoctorDashboard --> AddDate--> Description Textbox
        @FindBy(id = "desc-field")
        public WebElement descriptionTextbox;

        // DoctorDashboard --> AddDate--> Date Textbox
        @FindBy(id = "date-field")
        public WebElement dateTextbox;

        // DoctorDashboard --> AddDate--> Date Apply Button
        @FindBy(xpath = "(//button[text()='Apply'])[2]")
        public WebElement dateApplyButton;

        // DoctorDashboard --> AddDate--> Event Color
        @FindBy(xpath = "(//*[@class='calendar-cpicker cpicker cpicker-small'])[1]")
        public WebElement eventColor;

        // DoctorDashboard --> AddDate--> Event Type
        @FindBy(xpath = "((//*[@class='radio-inline'])[1]")
        public WebElement eventType;

        // DoctorDashboard --> AddDate--> Event Type
        @FindBy(xpath = "//td[@class='fc-event-container']")
        public WebElement eventContainer;


        public WebElement registeredEmployesElementi ( int i){

            String dinamikXpath = "(//*[@class='info-box-content'])[ " + i + "]";
            WebElement istenenUrun = Driver.getDriver().findElement(By.xpath(dinamikXpath));

            return istenenUrun;
        }

        public boolean titleListingMethod (String data, List < WebElement > actualList){
            //List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-12 col20']"));

            List<String> baslikListesiActual = new ArrayList<>();
            for (WebElement each : actualList
            ) {
                baslikListesiActual.add(each.getText());
            }
            System.out.println(baslikListesiActual);
            String[] liste = data.split(", ");
            int count = 0;
            for (int i = 0; i < liste.length; i++) {
                for (int j = 0; j < baslikListesiActual.size(); j++) {
                    if (baslikListesiActual.get(j).contains(liste[i])) {
                        count++;
                    }
                }
            }
            if (count == liste.length) {
                return true;
            }
            return false;
        }


        // Listedeki String siralama yapan sutunun siralamasini kontorl eder




        public void patalogySelectList ()
        {
            Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='testreport_length']")));

            ReusableMethod.bekle(3);
            select.selectByVisibleText("All");
        }

        public void allOr100patalogyTest ()
        {
            Select select = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0_length\"]/label/select")));

            ReusableMethod.bekle(3);
            select.selectByVisibleText("All");
        }


        public static boolean baslikListelemeMethod (String data){
            List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[1]/a"));
            List<String> baslikListesiActual = new ArrayList<>();
            for (WebElement each : actualList
            ) {
                baslikListesiActual.add(each.getText());
            }
            System.out.println(baslikListesiActual);
            String[] liste = data.split(", ");
            int count = 0;
            for (int i = 0; i < liste.length; i++) {
                for (int j = 0; j < baslikListesiActual.size(); j++) {
                    if (baslikListesiActual.get(j).contains(liste[i])) {
                        count++;
                    }
                }
            }
            if (count == liste.length) {
                return true;
            }
            return false;
        }

        public void EmployesClickAndQuary () {

            for (int i = 10; i <= 17; i++) {
                homepage.clickAndUrlQuery(registeredEmployesElementi(i),
                        "admin/staff", Driver.getDriver().getCurrentUrl());
                Driver.getDriver().navigate().back();
            }
        }

        // DoctorDashboard-> Calendar
        @FindBy(xpath = "(//*[@class='box box-info'])[3]")
        public WebElement calendar;
        // DoctorDashboard -> Calendar -> NextButton
        @FindBy(xpath = "//*[@class='fc-prev-button fc-button fc-state-default fc-corner-left']")
        public WebElement nextButton;

        // DoctorDashboard -> Calendar -> BackButton
        @FindBy(xpath = "//*[@class='fc-next-button fc-button fc-state-default']")
        public WebElement backButton;

        // DoctorDashboard -> Calendar -> TodayButton
        @FindBy(xpath = "//*[text()='today']")
        public WebElement todayButton;

        // DoctorDashboard -> Calendar -> MonthButton
        @FindBy(xpath = "//*[text()='month']")
        public WebElement monthButton;

        // DoctorDashboard -> Calendar -> WeekButton
        @FindBy(xpath = "//*[text()='week']")
        public WebElement weekButton;

        // DoctorDashboard -> Calendar -> DayButton
        @FindBy(xpath = "//*[text()='day']")
        public WebElement dayButton;

        // DoctorDashboard -> Calendar -> DayButton
        @FindBy(xpath = "(//table//tbody//tr//td[5][@class='fc-day fc-widget-content fc-thu fc-past'])[1]")
        public WebElement dayEvent;

        //
        // DoctorDashboard -> Calendar -> Event -> Add Event Title
        @FindBy(xpath = "//h4[text()='Add New Event']")
        public WebElement addEventTitle;





        public void todayControl () {
            dayButton.click();
            todayButton.click();
            String actDate = Driver.getDriver().findElement(By.tagName("h2")).getText();
            Date simdikiZaman = new Date();
            DateFormat df = new SimpleDateFormat("ddMMM,yyyy");
            String now = df.format(simdikiZaman);
            //Assert.assertEquals(now,actDate);
        }

        //  ------------------------ US_57----------------
        // DoctorDashboard--> Dashboard sidebar
        @FindBy(xpath = "//ul[@class='sidebar-menu verttop']")
        public WebElement dashboardSidebar;

        // DoctorDashboard--> Dashboardsidebar --> DashBoard Lists




    // DoctorDashboard--> Navbar --> Bed Status
    @FindBy(xpath = "(//div[@class='relative'])[1]")
    public WebElement bedStatus;

    //

    // DoctorDashboard--> Navbar -->Notification Icon
    @FindBy(xpath = "//span[@class='label label-warning']")
    public WebElement navbarNotificationIcon;

    @FindBy(xpath = "(//div[@class='accordianheader  readbg ui-accordion-header ui-state-default ui-corner-all ui-accordion-icons'])[1]")
    public WebElement firstNotification;

    @FindBy(xpath = "(//div[@class='note-content'])[1]")
    public WebElement firstNotificationResult;



    // DoctorDashboard--> Navbar -->Chat Icon
    @FindBy(xpath = "//i[@class='fa fa-whatsapp']")
    public WebElement navbarChatIcon;

        public void dashBoardListControl () {
            for (int i = 1; i <= 12; i++) {
                if (i != 5 & i != 10) {

                    WebElement dashBoardList = Driver.getDriver().findElement(By.xpath("(//li[@class='treeview '])[" + i + "]"));
                    homepage.elementIsDisplayed(dashBoardList);
                    System.out.println(dashBoardList.getText() + " ");
                }
            }
            ReusableMethod.bekle(2);
            JSUtilities.scrollToElement(Driver.getDriver(), Driver.getDriver().findElement(By.xpath("(//li[@class='treeview '])[17]")));
            ReusableMethod.bekle(2);
            for (int i = 14; i <= 17; i++) {
                if (i != 16) {

                    WebElement dashBoardList = Driver.getDriver().findElement(By.xpath("(//li[@class='treeview '])[" + i + "]"));
                    homepage.elementIsDisplayed(dashBoardList);
                    System.out.println(dashBoardList.getText() + " ");
                }
            }

        }


    // DoctorDashboard--> Navbar -->Chat Contacts
    @FindBy(xpath = "//div[@class='wrap']")
    public WebElement chatContacts;

    // DoctorDashboard--> Navbar -->Chat-- Add Contacats Icon
    @FindBy(id = "addcontact")
    public WebElement addContactIcon;


    // DoctorDashboard--> Navbar -->Chat-- Add Contacats  SearchTextBox
    @FindBy(xpath = "//div[@class='input-group col-md-12']")
    public WebElement contactSearchTextbox;

    // DoctorDashboard--> Navbar -->Chat--
    @FindBy(xpath = "//li[@class='contact']")
    public WebElement firstContactS;
    // DoctorDashboard--> Navbar -->Chat--
    @FindBy (xpath = "//input[@class='chat_input']")
    public WebElement sendMessage;
    // DoctorDashboard--> Navbar -->Chat--
    @FindBy(xpath = "//button[@class='submit input_submit']")
    public WebElement messageSubmit;

    // DoctorDashboard--> Navbar -->CalenderIcon
    @FindBy(xpath = "//i[@class='fa fa fa-calendar']")
    public WebElement navbarCalanderIcon;
    // DoctorDashboard--> Navbar -->CalenderDate
    @FindBy(xpath = "//td[@rowspan='2']")
    public WebElement calendarDate;


    @FindBy(id = "input-field")
    public WebElement taskEventTitle;
    @FindBy(xpath = "(//div[@class='calendar-cpicker cpicker cpicker-small'])[1]")
    public WebElement taskEventColor;
    @FindBy(id = "public")
    public WebElement taskEventType;
    @FindBy(id = "addevent_formbtn")
    public WebElement taskEventSaveButton;

      // (//div//table//tbody//tr//td[5][@data-date='2023-05-04'])[1]
     //
    // DoctorDashboard--> Navbar -->Calender Month Date
    @FindBy(xpath = "//div[@class='fc-center']")
    public WebElement monthDate;

    // DoctorDashboard--> Navbar -->Calender To Do List
    @FindBy(xpath = "//div[@class='box-tools pull-right']")
    public WebElement toDoList;

    // DoctorDashboard--> Navbar -->Calender To Do List
    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    public WebElement toDoListCheck;

    // DoctorDashboard--> Navbar -->Calender To Do List Remove
    @FindBy(xpath = "(//i[@class='fa fa-remove'])[5]")
    public WebElement toDoListRemove;

    // DoctorDashboard--> Navbar -->Calender To Do List- Add Task Page
    @FindBy(xpath = "(//div[@class='modal-content'])[1]")
    public WebElement addTaskPage;

    //

    // DoctorDashboard--> Navbar -->Task Icon
    @FindBy(xpath = "//a[@class='dropdown-toggle todoicon']")
    public WebElement navbarTaskIcon;

    // DoctorDashboard--> Navbar -->Task Icon-ViewALL
    @FindBy(xpath = "//*[@id=\"testreport\"]/tbody/tr[1]/td[1]/div/a[1]/i")
    public WebElement navbarTaskViewAll;
    @FindBy(xpath = "//a[@class='pull-right pt0']")
    public WebElement taskViewAll;
    //

    // DoctorDashboard--> Navbar profileIcon--> ProfileLink --> Profile
    @FindBy(xpath = "(//a[text()='Profile'])[2]")
    public WebElement profile;

    // DoctorDashboard--> Navbar profileIcon--> ProfileLink --> Leaves
    @FindBy(xpath = "//a[text()='Leaves']")
    public WebElement leaves;

    // DoctorDashboard--> Navbar profileIcon--> ProfileLink --> Documents
    @FindBy(xpath = "//a[text()='Documents']")
    public WebElement documents;

        // DoctorDashboard--> Dashboardsidebar --> Birth & Death Record
        @FindBy(xpath = "//span[text()=' Birth & Death Record']")
        public WebElement birthDeathRecord;

        // DoctorDashboard--> Dashboardsidebar --> Birth Record
        @FindBy(xpath = "//*[text()=' Birth Record ']")
        public WebElement birthRecord;

        // DoctorDashboard--> Dashboardsidebar --> Death Record
        @FindBy(xpath = "//*[text()=' Death Record']")
        public WebElement deathRecord;
        public void dashboardClickAndElementControl (WebElement element){
            element.click();
            ReusableMethod.bekle(3);
            homepage.elementIsDisplayed(birthRecord);
            homepage.clickAndUrlQuery(birthRecord, "birthordeath", Driver.getDriver().getCurrentUrl());
            ReusableMethod.bekle(2);
            homepage.elementIsDisplayed(deathRecord);
            homepage.clickAndUrlQuery(deathRecord, "/birthordeath/death", Driver.getDriver().getCurrentUrl());
        }
        //
        // DoctorDashboard--> Navbar --> Dashboard Category
        @FindBy(xpath = "//a[@class='sidebar-toggle']")
        public WebElement dashboardCategory;

        // DoctorDashboard--> Dashboardsidebar --> Dashboard Text
        @FindBy(xpath = "//span[text()=' Dashboard']")
        public WebElement dashboardText;
        //
        public void dashboardControl () {
            dashboardCategory.click();
            Assert.assertFalse(dashboardText.isDisplayed());
            ReusableMethod.bekle(3);
            dashboardCategory.click();
            Assert.assertTrue(dashboardText.isDisplayed());
        }
        public void dashBoardIconControl () {
            dashboardCategory.click();
            for (int i = 1; i <= 12; i++) {
                if (i != 5 & i != 10) {

                    WebElement dashBoardList = Driver.getDriver().findElement(By.xpath("(//li[@class='treeview '])[" + i + "]"));
                    homepage.elementIsDisplayed(dashBoardList);
                }
            }
            ReusableMethod.bekle(2);
            JSUtilities.scrollToElement(Driver.getDriver(), Driver.getDriver().findElement(By.xpath("(//li[@class='treeview '])[17]")));
            ReusableMethod.bekle(2);
            for (int i = 14; i <= 17; i++) {
                if (i != 16) {

                    WebElement dashBoardList = Driver.getDriver().findElement(By.xpath("(//li[@class='treeview '])[" + i + "]"));
                    homepage.elementIsDisplayed(dashBoardList);
                }
            }
        }
        //------------------US_56_------------------
        // DoctorDashboard--> Navbar

        @FindBy(xpath = "//nav[@class='navbar navbar-static-top']")
        public WebElement navbar;

        // DoctorDashboard--> Navbar --> Heal Life Hospital & Research Center Text
        @FindBy(xpath = "//div[@class='col-lg-4 col-md-4 col-sm-3 col-xs-3']")
        public WebElement navbarText;

        // DoctorDashboard--> Navbar --> SearchBox
        @FindBy(xpath = "//input[@class='form-control search-form search-form3']")
        public WebElement navbarSearchBox;

        // DoctorDashboard--> Search --> Search Result
        @FindBy(xpath = "//a[@class='btn btn-default btn-xs']")
        public WebElement searchResult;
        public void searchControl () {
            navbarSearchBox.sendKeys("tugba", Keys.ENTER);
            ReusableMethod.bekle(2);
            String expText = "tugba";
            String actText = searchResult.getText();
            System.out.println("sonuc : " + actText);
            Assert.assertTrue(actText.contains(expText));
        }
        // DoctorDashboard--> Navbar --> Language icon
        @FindBy(xpath = "//span[@class='filter-option pull-left']")
        public WebElement navbarLanguageIcon;

        // DoctorDashboard--> Navbar --> Language icons
        @FindBy(xpath = "//ul[@class='dropdown-menu inner selectpicker']")
        public WebElement navbarLanguages;

        // DoctorDashboard--> Navbar --> Language English
        @FindBy(xpath = "(//span[@class='flag-icon flag-icon-us'])[2]")
        public WebElement navbarEnglish;

        // DoctorDashboard--> Navbar --> Language Turkish
        @FindBy(xpath = "(//span[@class='flag-icon flag-icon-tr'])")
        public WebElement navbarTurkish;

        // DoctorDashboard--> Navbar --> Bed Status Tr
        @FindBy(xpath = "//span[text()='Yatak Durumu']")
        public WebElement navbarBedStatusTr;

        // DoctorDashboard--> Navbar --> Bed Status En
        @FindBy(xpath = "//span[text()='Bed Status']")
        public WebElement navbarBedStatusEn;

        // DoctorDashboard--> Navbar -->Notification Icon


        // DoctorDashboard--> Navbar -->Chat Icon



        //


        @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[11]/ul/li[1]/a")
        public WebElement BirthTusu;
        @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[11]/ul/li[2]/a")
        public WebElement DeathTusu;
        @FindBy(xpath = "//input[@type='search']")
        public WebElement searchBox;
        @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
        public WebElement ddmAllAnd100;
        @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[8]")
        public WebElement ReportBolumu;
        @FindBy(xpath = "(//a[@class=\"btn btn-default btn-xs\"])[1]")
        public WebElement ReportBolumuOzet;
        @FindBy(xpath = "//*[@id=\"viewModal\"]/div/div/div/button")
        public WebElement ReportOzetBolumKapama;
        @FindBy(xpath = "(//a[@class=\"btn btn-default btn-xs\"])[2]")
        public WebElement ReportBolumuEdit;
        @FindBy(xpath = "//*[@id=\"formeditbtn\"]")
        public WebElement ReportEditBolumuSave;
        @FindBy(xpath = "//*[@id=\"image\"]")
        public WebElement Bebekfoto;
        @FindBy(xpath = "(//a[@class=\"btn btn-default btn-xs\"])[3]")
        public WebElement ReportBolumuDelete;
        @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a")
        public WebElement AddBrithTusu;
        @FindBy(xpath = "//*[@id=\"child_name\"]")
        public WebElement childName;
        @FindBy(xpath = "//*[@id=\"formadd\"]/div[1]/div/div/div[2]/div/select")
        public WebElement gender;
        @FindBy(xpath = "//*[@id=\"weight\"]")
        public WebElement weight;
        @FindBy(xpath = "//*[@id=\"birth_date\"]")
        public WebElement birthDate;
        @FindBy(xpath = "//*[@id=\"case_id\"]")
        public WebElement caseID;
        @FindBy(xpath = "//*[@id=\"formaddbtn\"]")
        public WebElement birthSaveButton;
        @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[7]")
        public WebElement ReportBolumuDeath;
        @FindBy(xpath = "(//a[@class=\"btn btn-default btn-xs\"])[4]")
        public WebElement ReportBolumuAttachment;

        //Massage Bolumu
        @FindBy(xpath = "//*[@id=\"accordion\"]/div")
        public List<WebElement> MassageList;
        @FindBy(xpath = "/html/body/div[1]/div/section/div/div/div/div[1]/div/a[1]")
        public WebElement postNewMassage;
        @FindBy(xpath = "//*[@id=\"title\"]")
        public WebElement titleBolumu;
        @FindBy(xpath = "//*[@id=\"form1\"]/div/div[2]/div/div[1]/div[2]/iframe")
        public WebElement mesajIframe;
        @FindBy(xpath = "//*[@id=\"date\"]")
        public WebElement dateNotice;
        @FindBy(xpath = "//*[@id=\"publish_date\"]")
        public WebElement datePublish;
        @FindBy(xpath = "//*[@id=\"form1\"]/div/div[3]/div/button")
        public WebElement sendButton;
        @FindBy(xpath = "//*[@id=\"form1\"]/div/div[2]/div/div[1]")
        public WebElement mesajKayit;
        @FindBy(xpath = "/html/body/div[1]/div/section/div/div/div/div[1]/div/a[2]")
        public WebElement SendSmsButton;
        @FindBy(xpath = "//*[@id=\"group_form\"]/div[1]/div/div[1]/div[1]/input")
        public WebElement SendSmsTitle;
        @FindBy(xpath = "//*[@id=\"group_form\"]/div[1]/div/div[1]/div[3]/label[2]/input")
        public WebElement SendSmsCheckBox;
        @FindBy(xpath = "//*[@id=\"group_msg_text\"]")
        public WebElement SendSmsMesaj;
        @FindBy(xpath = "//*[@id=\"group_form\"]/div[1]/div/div[2]/div/div/div[4]/label/input")
        public WebElement SendSmsDoctorCheckBox;
        @FindBy(xpath = "//*[@id=\"group_form\"]/div[2]/div/button")
        public WebElement SendSmsSendButton;
        @FindBy(xpath = "//*[@id=\"individual_form\"]/div[1]/div/div[2]/div[1]/div/div[1]/button")
        public WebElement SendSmsSelect;
        @FindBy(xpath = "//*[@id=\"individual_form\"]/div[1]/div/div[2]/div[1]/div/div[1]/ul/li[4]")
        public WebElement SendSmsSelectDoktor;
        @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/ul/li[2]/a")
        public WebElement SendSmsIndividual;
        @FindBy(xpath = "//*[@id=\"individual_form\"]/div[1]/div/div[1]/div[1]/input")
        public WebElement SendSmsIndividualTitle;
        @FindBy(xpath = "//*[@id=\"individual_form\"]/div[1]/div/div[1]/div[2]/label[2]/input")
        public WebElement SendSmsIndividualCheckBox;
        @FindBy(xpath = "//*[@id=\"individual_msg_text\"]")
        public WebElement SendSmsIndividualMesaj;
        @FindBy(xpath = "//*[@id=\"search-query\"]")
        public WebElement SendSmsIndividualQuery;
        @FindBy(xpath = "//*[@id=\"individual_form\"]/div[1]/div/div[2]/div[1]/div/span/button")
        public WebElement SendSmsIndividualAddButton;
        @FindBy(xpath = "//*[@id=\"individual_form\"]/div[2]/div/button")
        public WebElement SendSmsIndividualSendButton;
        @FindBy(xpath = "/html/body/div[1]/div/section/div/div/div/div[1]/div/a[3]")
        public WebElement SendEmailButton;
        @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/iframe")
        public WebElement SendEmailMesajIframe;
        @FindBy(xpath = "(/html/body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders'])[1]")
        public WebElement SendEmailMesajText;
        @FindBy(xpath = "//*[@id=\"cke_2_contents\"]/iframe")
        public WebElement SendEmailMesajIndividualIframe;




    // DoctorDashboard--> Navbar profileIcon--> ProfileLink --> Documents
    @FindBy(xpath = "//a[text()='Timeline']")
    public WebElement timeline;


    // //*[@id="testreport"]/tbody/tr[1]/td[1]/div/a[2]/i //input[@class='form-control datetime']

    // DoctorDashboard--> Calender -->Task
    @FindBy(xpath = "//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end']")
    public WebElement calanderTask;

    // DoctorDashboard--> Navbar --> Profile Icon
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement navbarProfileIcon;
    // DoctorDashboard--> Profile Icon --> ProfileLink
    @FindBy(xpath = "//a[text()='Profile']")
    public WebElement profileLink;
    // DoctorDashboard--> Profile Icon --> Password Link
    @FindBy(xpath = "//a[text()='Password']")
    public WebElement passwordLink;
    // DoctorDashboard--> ProfileIcon/PasswordLink// -- CurrentPassword
    @FindBy(xpath = "(//div[@class='col-md-6 col-sm-6 col-xs-12'])[1]")
    public WebElement passwordCurrent;

    // DoctorDashboard--> ProfileIcon/PasswordLink// -- NewPassword
    @FindBy(xpath = "(//div[@class='col-md-6 col-sm-6 col-xs-12'])[2]")
    public WebElement passwordNew;

    // DoctorDashboard--> ProfileIcon/PasswordLink// -- NewPassword
    @FindBy(xpath = "(//div[@class='col-md-6 col-sm-6 col-xs-12'])[3]")
    public WebElement passwordCunfirm;

    // DoctorDashboard--> Profile Icon --> Logout Link
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutLink;





    // DoctorDashboard--> Radyology
    @FindBy(xpath = " (//li[@class='treeview '])[7]")
    public WebElement radiologyLink;

    // DoctorDashboard--> Radyology -- Search Result
    @FindBy(xpath = "//td[@class=' dt-body-left']")
    public WebElement radiologySearchReuslt;

    // DoctorDashboard--> Radyology -- Radiolagy
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")
    public WebElement radiologyTestSearchReuslt;
  //
     public void selectList()
        {
           Select select=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='testreport_length']")));
           ReusableMethod.bekle(3);
            select.selectByVisibleText("All");
       }
    public void radiologyTestselectList()
    {
        Select select=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']  ")));
        ReusableMethod.bekle(3);
        select.selectByVisibleText("All");
    }

       //
    // DoctorDashboard--> Radyology -- BalanceAmount altinda View rapor
    @FindBy(xpath = "//a[@class='btn btn-default btn-xs view_detail']")
    public WebElement radiologyVievRapor;

    // DoctorDashboard--> Radyology -- BalanceAmount
    @FindBy(xpath = "//*[@id=\"testreport\"]/tbody/tr[1]/td[8]")
    public WebElement radiologyBalance;

    // DoctorDashboard--> Radyology -- BalanceAmount altinda View rapor
    @FindBy(xpath = "(//*[text()='Bill Details'])[1]")
    public WebElement radiologyBillDeatils;
    @FindBy(xpath = "//html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a")
    public WebElement radiologyTestButonu;

    @FindBy(xpath = "(//td[@class=' dt-body-right'])[3]")
    public WebElement radiologyAmountFirst;
    @FindBy (xpath = "(//*[@class='btn btn-default btn-xs'])[1]")
    public WebElement radiologyTestShow;




    public boolean StringListSiralamaTestiPathology(int sutunNo){
        Select select=new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"testreport_length\"]/label/select")));
        ReusableMethod.bekle(3);
        select.selectByVisibleText("All");
        ReusableMethod.bekle(3);
        WebElement baslik= Driver.getDriver().findElement(By.xpath("//div//table//thead//tr//th["+sutunNo+"]"));
        baslik.click();
        ReusableMethod.bekle(3);
        List<WebElement> ActualList=Driver.getDriver().findElements(By.xpath("//div//table//thead//tr//th["+sutunNo+"]"));
        List<String> ActualStringList=new ArrayList<>();
        for (WebElement each:ActualList
        ) {
            ActualStringList.add(each.getText().toLowerCase().replaceAll("\\d","").replace("."," "));
        }
        List<String> ExpectedList=new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        System.out.println(ActualStringList);
        System.out.println(ExpectedList);
        if (ActualStringList.equals(ExpectedList)){
            return true;
        }
        return false;
    }
       //
    /*
     public WebElement istenenKayitElementi(int index){
        String dinamikXpath = "(//tr//td[@class='sorting_1'])["+index+"]";
        WebElement istenenKayitElementi=Driver.getDriver().findElement(By.xpath(dinamikXpath));
        return  istenenKayitElementi;
    }
    for (int i = 2; i <= 10; i++) {
            try {
                ReusableMethods.waitMillis(1);
                char a=admin_dashboard.istenenKayitElementi(i-1).getText().toLowerCase().charAt(0);
                char b=admin_dashboard.istenenKayitElementi(i).getText().toLowerCase().charAt(0);
                if (a>=b){
                    Assert.assertTrue(true);
                }else {
                    Assert.assertTrue(false);
                }
     */




}





















