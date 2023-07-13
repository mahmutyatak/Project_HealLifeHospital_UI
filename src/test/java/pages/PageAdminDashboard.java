package pages;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class PageAdminDashboard extends Base{

    // Dashboard'un Url

    public @FindBy(xpath="//*[@class='treeview active']")
    WebElement dashboardLink;


    // Admin page login Dashboard get text is visible
    public @FindBy(xpath="//*[@class='fas fa-television']")
    WebElement adminPageLoginDashboardTextIcon;

    // Dashboard'un solundaki Billing linki

   public @FindBy(xpath="//*[@class='fas fa-file-invoice']")
    WebElement dashboardBillingLink;


    // Dashboard'un solundaki Appointment linki

  public   @FindBy(xpath="//*[text()='Appointment']")
    WebElement dashboardAppointmentLink;



    // Dashboard'un solundaki OPD linki

   public @FindBy(xpath="//*[@class='fas fa-stethoscope']")
    WebElement dashboardOPDLink;



    // Dashboard'un solundaki IPD linki

 public    @FindBy(xpath="(//*[@class='fas fa-procedures'])[1]")
    WebElement dashboardIPDLink;



    // Dashboard'un solundaki Pharmacy linki

   public @FindBy(xpath="//*[@class='fas fa-mortar-pestle']")
    WebElement dashboardPharmacyLink;

    // Dashboard'un solundaki Pathology linki

 public    @FindBy(xpath="//*[@class='fas fa-flask']")
    WebElement dashboardPathologyLink;

    // Dashboard'un solundaki Radiology linki

   public @FindBy(xpath="//*[@class='fas fa-microscope']")
    WebElement dashboardRadiologyLink;


    // Dashboard'un solundaki Blood Bank linki

   public @FindBy(xpath="//*[@class='fas fa-tint']")
    WebElement dashboardBloodBankLink;


    // Dashboard'un solundaki Ambulance linki

   public @FindBy(xpath="(//*[@class='fas fa-ambulance'])[1]")
    WebElement dashboardAmbulanceLink;


    // Dashboard'un solundaki Front office linki

   public @FindBy(xpath="//*[@class='fas fa-dungeon']")
    WebElement dashboardFrontOfficeLink;


    // Dashboard'un solundaki Birth Death Record linki

    public @FindBy(xpath="//*[@class='fa fa-birthday-cake']")
    WebElement dashboardBirthDeathRecordLink;


    // Dashboard'un solundaki Human Resource linki

    public @FindBy(xpath="//*[@class='fas fa-sitemap']")
    WebElement dashboardHumanResourceLink;

// Dashboard'un solundaki TPA Management linki


   public @FindBy(xpath="//*[@class='fas fa-umbrella']")
    WebElement dashboardTPAManagementLink;

    // Dashboard'un solundaki Finance linki

    public @FindBy(xpath="(//*[@class='treeview-menu'])[1]")
    WebElement dashboardFinanceLink;


    // Dashboard'un solundaki Messaging linki

   public @FindBy(xpath="(//*[@class='fas fa-bullhorn'])[1]")
    WebElement dashboardMessagingLink;


    // Dashboard'un solundaki Inventory linki

    public @FindBy(xpath="(//*[@class='fas fa-luggage-cart'])[1]")
    WebElement dashboardInventoryLink;

    //!!!!!!!!!!!!!!!!!!  ADMİN Navbar    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    //Admin/Navbar/healLIFE
    @FindBy(xpath = "//span[@class='logo-lg']")
    public WebElement logoHealLife;

    //Admin/Navbar/Button
    @FindBy(xpath = "//a[@role='button']")
    public WebElement buttonMenu;

    //Admin/Navbar/Image
    @FindBy(xpath = "//img[@height='19']")
    public WebElement imageMenu;

    //Admin/Navbar/Text
    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement textBoxHeallife;

    //Admin/Navbar/Search
    @FindBy(xpath = "//input[@type='text']")
    public WebElement iconSearch;

    //Admin/Navbar/Flag
    @FindBy(xpath = "//span[@class='flag-icon flag-icon-us']")
    public WebElement logoFlagUs;

    //Admin/Navbar/Flag
    @FindBy(xpath = "//span[@class='flag-icon flag-icon-tr']")
    public WebElement logoFlagTr;

    //Admin/Navbar/Notification
    @FindBy(xpath = "//i[@class='fa fa-bell-o']")
    public WebElement iconNotification;

    //Admin/Navbar/Notification/NotificationTitle
    @FindBy(xpath = "//h3[@class='box-title titlefix']")
    public WebElement TitleNotification;

    //Admin/Navbar/Notification/NotificationNo
    @FindBy(xpath = "//span[@class='label label-warning']")
    public WebElement notificationNo;

    //Admin/Navbar/Notification/Notification-Type
    @FindBy(xpath = "(//div[@class='notifyleft'])[1]")
    public WebElement notificationType;

    //Admin/Navbar/Notification/Notification-Subject
    @FindBy(xpath = "(//div[@class='notifymiddle'])[1]")
    public WebElement notificationSubject;

    //Admin/Navbar/Notification/Notification-Date
    @FindBy(xpath = "(//div[@class='notifyright'])[1]")
    public WebElement notificationDate;

 //Admin/Navbar/Notification/Notification-detail
 @FindBy(xpath = "(//div[@class='note-content'])[1]")
 public WebElement notificationDetail;

 //Admin/Navbar/Notification/Notification-TypeLogo
 @FindBy(xpath = "(//div[@class='notifyleft'])[2]")
 public WebElement notificationTypeLogo;

 //Admin/Navbar/Notification/deleteAllButton
 @FindBy(xpath = "//button[@class= 'btn btn-primary btn-sm checkbox-toggle delete_all']")
 public WebElement deleteAllButton;

 //Admin/Navbar/Notification/Notification-MessageIkon
 @FindBy(xpath = "//i[@class='fa fa-whatsapp']")
 public WebElement messageIkon;

 //Admin/Navbar/Notification/Notification-Message Page-ContactProfile
 @FindBy(xpath = "//p[@class='name']")
 public WebElement contactProfile;

 //Admin/Navbar/Notification/Notification-Message-Contact Button
 @FindBy(xpath = "//i[@class='fa fa-whatsapp']")
 public WebElement contactButton;

 //Admin/Navbar/Notification/Notification-Message-Contact Button-contactWarningButton
 @FindBy(xpath = "//span[@class='todo-indicator']")
 public WebElement contactWarningButton;


 //Admin/Navbar/Notification/Notification-Message-Chat System Icon
 @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
 public WebElement chatSystemIcon;

 //Admin/Navbar/Notification/Notification-Message-Chat System Icon-Add-Contact
 @FindBy(xpath = "//input[@class='search-query form-control']")
 public WebElement andContactSearch;

 //Admin/Navbar/Notification/Notification-Message-Chat System Icon-Add-Contact-Name
 @FindBy(xpath = "(//span[@class='name'])[3]")
 public WebElement andContactName;

 //Admin/Navbar/Notification/Notification-Message-Chat System Icon-Add-Contact>Add Button
 @FindBy(xpath = "(//button[@type='submit'])[3]")
 public WebElement addButton;

 //Admin/Navbar/Notification/Notification-Message-Chat System Icon-Add-Contact>addcontactNames
 @FindBy(xpath = "//p[@class='name']")
 public WebElement addcontactNames;

 //Admin/Navbar/Notification/Notification-Message-Chat-messageSection
 @FindBy(xpath = "//div[@class='messages']")
 public WebElement messageSection;

 //Admin/Navbar/Notification/Notification-Message-Chat-writeYourMessageIcon
 @FindBy(xpath = "(//input[@type='text'])[3]")
 public WebElement writeYourMessageIcon;

 //Admin/Navbar/Calender
 @FindBy(xpath = "//i[@class='fa fa fa-calendar']")
 public WebElement calenderIcon;

 //Admin/Navbar/Calender>CalenderPage
 @FindBy(xpath = "//div[@class='fc-center']")
 public WebElement calenderPage;

 //Admin/Navbar/Calender>CalenderPage-To Do List
 @FindBy(xpath = "//h3[@class='box-title']")
 public WebElement calenderTodoList;

 //Admin/Navbar/Calender>CalenderPage-Day
 @FindBy(xpath = "(//td[@class='fc-day fc-widget-content fc-wed fc-past'])[1]")
 public WebElement calenderDay;

 //Admin/Navbar/Calender>CalenderPage-Add New Event
 @FindBy(xpath = "(//input[@class='form-control'])[3]")
 public WebElement eventTitle;

 //Admin/Navbar/Calender>CalenderPage-Add New Event-Color
 @FindBy(xpath = "(//div[@class='calendar-cpicker cpicker cpicker-small'])[1]")
 public WebElement eventColor;

 //Admin/Navbar/Calender>CalenderPage-Add New Event-Typ-All Admin
 @FindBy(xpath = "(//input[@type='radio'])[3]")
 public WebElement eventTypeAllAdmin;

 //Admin/Navbar/Calender>CalenderPage-Add New Event-Save
 @FindBy(xpath = "//*[@id=\"formaddpabtn\"]")
 public WebElement eventSave;

 //Admin/Navbar/Calender>CalenderPage-Add New Event-Week
 @FindBy(xpath = "(//button[@type='button'])[6]")
 public WebElement eventWeekIcon;

 //Admin/Navbar/Calender>CalenderPage-Add New Event-WeekPage
 @FindBy(xpath = "(//div[@class='fc-bg'])[2]")
 public WebElement eventWeekPage;

 //Admin/Navbar>TaskIcon
 @FindBy(xpath = "//i[@class='fa fa-check-square-o']")
 public WebElement taskIcon;

 //Admin/Navbar>TaskIcon>View All
 @FindBy(xpath = "//a[@class='pull-right pt0']")
 public WebElement taskIconViewAll;

 //Admin/Navbar>TaskIcon>View All-Add Tasc-Date
 @FindBy(xpath = "(//input[@class='form-control date'])[1]")
 public WebElement taskAddTascDate;

 //Admin/Navbar>TaskIcon>View All-Add Tasc-Date-Day
 @FindBy(xpath = "/html/body/div[4]/div[1]/table/tbody/tr[5]/td[3]")
 public WebElement taskAddDateDay;

 //Admin/Navbar>TaskIcon>View All-Add>Save
 @FindBy(xpath = "//input[@type='submit']")
 public WebElement taskAddDateDaySave;

 //Admin/Navbar>TaskIcon-CalenderPage-To Do List-checkBox
 @FindBy(xpath = "//input[@type='submit']")
 public WebElement toDoListCheckBox;

 //Admin/Navbar>TaskIcon-CalenderPage-To Do List-todolistaddicon
 @FindBy(xpath = "//i[@class='fa fa-plus']")
 public WebElement toDoListAddIcon;

 //Admin/Navbar>TaskIcon-CalenderPage-To Do List-Updateicon
 @FindBy(xpath = "//i[@class='fa fa-pencil']")
 public WebElement toDoListUpdateIcon;

 //Admin/Navbar>TaskIcon-CalenderPage-To Do List-AddTittle
 @FindBy(xpath = "(//input[@class='form-control'])[1]")
 public WebElement addTascTittle;

 //Admin/Navbar>Bad Status
 @FindBy(id = "beddata")
 public WebElement bedStatus;

 //Admin/Navbar>Bad Status>Page
 @FindBy(xpath = "//legend[@class='text-center floorwardbg']")
 public WebElement badStatusPage;

 //Admin/Navbar>Profil Button
 @FindBy(xpath = "//img[@class='topuser-image']")
 public WebElement profilButton;

 @FindBy(xpath = "//*[@id='alert']/nav/div[2]/div/div/ul/li[6]/ul/li/div/div[4]/a[1]")
 public WebElement profilButtonn;

 //Admin/Navbar>Profil Button-Password icon
 @FindBy(xpath = "//a[@class='pl25']")
 public WebElement profilPasswordIcon;

 //Admin/Navbar>Profil Button-Profil icon
 @FindBy(xpath = "(//a[@data-toggle='tab'])[1]")
 public WebElement profilButtonIcon;

 //Admin/Navbar>Profil Button-Payroll Icon
 @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/div[1]/div[2]/div/ul/li[2]/a")
 public WebElement profilPayrollIcon;

 //Admin/Navbar>Profil Button-PayrollPage-Salary
 @FindBy(xpath = "//div[@class='staffprofile']")
 public WebElement profilPayrollPageSalary;

 //Admin/Navbar>Profil Button-Leaves
 @FindBy(xpath = "(//a[@data-toggle='tab'])[3]")
 public WebElement profilLeaves;

 //Admin/Navbar>Profil Button-Leaves>Casual
 @FindBy(xpath = "(//div[@class='staffprofile'])[10]")
 public WebElement profilLeavesCasual;

 //Admin/Navbar>Profil Button-Sttaf Addence
 @FindBy(xpath = "(//a[@data-toggle='tab'])[4]")
 public WebElement profilSttafAddence;

 //Admin/Navbar>Profil Button-Sttaf Addence>TotalPresent
 @FindBy(xpath = "(//div[@class='staffprofile'])[5]")
 public WebElement profilSttafAddenceTotalPresent;

 //Admin/Navbar>Profil Button-Documents
 @FindBy(xpath = "(//a[@data-toggle='tab'])[5]")
 public WebElement profilDocuments;

 //Admin/Navbar>Profil Button-Documents>No Record FoundText
 @FindBy(xpath = "//div[@class='alert alert-info']")
 public WebElement profilDocumentsNoRecordFoundText;

 //Admin/Navbar>Profil Button-TimeLine
 @FindBy(xpath = "(//a[@data-toggle='tab'])[5]")
 public WebElement profilTimeLine;

 //Admin/Navbar>Profil Button-TimeLine>AddButton
 @FindBy(xpath = "//button[@id='myTimelineButton']")
 public WebElement profilTimeLineAddButton;


 //Admin/Navbar>Profil Button-Loqout icon
 @FindBy(xpath = "//a[@class='pull-right']")
 public WebElement profilLoqoutIcon;

 //Admin/Navbar>Profil Button-PasswordIcon>Current Password
 @FindBy(xpath = "//input[@name='current_pass']")
 public WebElement profilCurrentPassword;

 //Admin/Navbar>Profil Button-PasswordIcon>New Password
 @FindBy(xpath = "(//input[@required='required'])[2]")
 public WebElement profilNewPassword;

 //Admin/Navbar>Profil Button-PasswordIcon>Confirm Password
 @FindBy(xpath = "//input[@name='confirm_pass']")
 public WebElement profilConfirmPassword;

 //Admin/Navbar>Profil Button-PasswordIcon>Chang Password
 @FindBy(xpath = "(//button[@type='submit'])[3]")
 public WebElement profilChangPassword;

 //Admin/Navbar>Profil Button-ProfilPage-Adress
 @FindBy(xpath = "(//h3[@class='pagetitleh2'])[1]")
 public WebElement profilPageAdress;

 //Admin/Navbar>Profil Button-ProfilPage-BankaAccaunt
 @FindBy(xpath = "(//h3[@class='pagetitleh2'])[2]")
 public WebElement profilBankaAccaunt;

 //Admin/Navbar>Profil Button-ProfilPage-Social Media Link
 @FindBy(xpath = "(//h3[@class='pagetitleh2'])[3]")
 public WebElement profilPageSocialMediaLink;


 @FindBy(xpath = "//*[text()='Admin Login']")
 public WebElement textAdminLogin;

 @FindBy(xpath = "//*[text()=' Forgot Password?']")
 public WebElement linkForgotPassword;

 @FindBy(xpath = "//*[@class='col-lg-6 col-sm-6 col-sm-6']")
 public WebElement panelLastestNew;

 @FindBy(xpath = "(//*[text()='Read More'])[1]")
 public WebElement linkReadMoreBlog;

 @FindBy(id = "form-username")
 public WebElement textBoxForgotPasswordEmail;

 @FindBy(xpath = "//*[@type='submit']")
 public WebElement buttonForgetPasswordSubmit;

 @FindBy(xpath = "//*[text()=' Admin Login']")
 public WebElement linkAdminLoginBack;

 @FindBy(xpath = "//*[text()='Your password has been sent to your e-mail address.']")
 public WebElement textForgetPasswordAlertAdmin;

 @FindBy(id = "email")
 public WebElement textBoxEmail;

 @FindBy(id = "password")
 public WebElement texBoxPassword;

 @FindBy(xpath = "//*[text()='Invalid Username or Password']")
 public WebElement textAlertEmailAndPassword;


 //Admin/Navbar>Profil Button-PasswordIcon>Chang Password-Not Password
 @FindBy(xpath = "//span[@jsselect='heading']")
 public WebElement profilChangNotPassword;

 //Admin/Dashboard>Biling Button
 @FindBy(xpath = "(//li[@class='treeview '])[1]")
 public WebElement dashboardBilingButton;

 //Admin/Dashboard>Biling Button-Biling Page
 @FindBy(xpath = "//h3[@class='box-title titlefix']")
 public WebElement bilingButtonBilingPage;

 //Admin/Dashboard>Biling Button-Biling Page>OPD/IPD Billing Through Case Id
 @FindBy(xpath = "(//h3[@class='box-title titlefix'])[2]")
 public WebElement bilingOpdIpdBiling;

 //Admin/Dashboard>Biling Button-Biling Page>OPD/IPD Billing Through Case Id>OPD
 @FindBy(xpath = "(//div[@class='billingbox-icon'])[1]")
 public WebElement bilingOpdButton;

 //Admin/Dashboard>Biling Button-Biling Page>OPD/IPD Billing Through Case Id>Pathology
 @FindBy(xpath = "(//div[@class='billingbox-icon'])[2]")
 public WebElement bilingPatologyButton;

 //Admin/Dashboard>Biling Button-Biling Page>OPD/IPD Billing Through Case Id>Radiology
 @FindBy(xpath = "(//div[@class='billingbox-icon'])[3]")
 public WebElement bilingRadiologyButton;

 //Admin/Dashboard>Biling Button-Biling Page>OPD/IPD Billing Through Case Id>Blood Issue
 @FindBy(xpath = "(//div[@class='billingbox-icon'])[4]")
 public WebElement bilingBloodIssueButton;

 //Admin/Dashboard>Biling Button-Biling Page>OPD/IPD Billing Through Case Id>Blood Components Issue
 @FindBy(xpath = "(//div[@class='billingbox-icon'])[5]")
 public WebElement bilingComponentsIssueButton;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >Search Tex Box
 @FindBy(xpath = "//input[@type='search']")
 public WebElement opdbilingSearcTexBox;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >Add Patient
 @FindBy(xpath = "//*[@id=\"load1\"]")
 public WebElement opdAddPatient;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >New Patient
 @FindBy(xpath = "//*[@id='add']/span")
 public WebElement opdNewPatient;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >New Patient-Name
 @FindBy(xpath = "//*[@id=\"name\"]")
 public WebElement opdNewPatientName;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >New Patient-AgiYear
 @FindBy(xpath = "//*[@id=\"age_year\"]")
 public WebElement opdNewPatientAgiYear;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >New Patient-AgiMonth
 @FindBy(xpath = "//*[@id=\"age_month\"]")
 public WebElement opdNewPatientAgiMonth;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >New Patient-AgiDay
 @FindBy(xpath = "//*[@id=\"age_day\"]")
 public WebElement opdNewPatientAgiDay;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >New Patient-Save
 @FindBy(xpath = "//*[@id=\"formaddpabtn\"]")
 public WebElement opdNewPatientSave;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >New Patient-NameTest
 @FindBy(xpath = "//span[@class='select2-selection__rendered']")
 public WebElement opdNewPatientTest;



 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >Total Recheckup
 @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[1]/div")
 public WebElement opdBilingRecheckup;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >Total Recheckup>Gender
 @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div/ul/li[2]/b")
 public WebElement opdBilingRecheckupGender;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >All
 @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
 public WebElement opdBilingSortall;

 //Admin/Dashboard>Biling Button-Biling Page>OPD Billing >Name
 @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")
 public WebElement opdBilingNames;

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >All
 @FindBy(xpath = "//*[@id=\"testreport_length\"]/label/select")
 public WebElement pathologyBilingSortall;

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)
 @FindBy(xpath = "//i[@class='fa fa-money']")
 public WebElement pathologyBilingBalanceAmount;

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)
 @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[1]/div/a[2]/i")
 public WebElement pathologyBilingBalanceAmounttt;

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)>Payments
 @FindBy(xpath = "(//button[@type='submit'])[7]")
 public WebElement pathologyBilingPaymentText;

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)>Payments-Date
 @FindBy(xpath = "//*[@id=\"date\"]")
 public WebElement pathologyBilingPaymentDate;

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)>Payments-Amaount
 @FindBy(xpath = "//*[@id=\"amount\"]")
 public WebElement pathologyBilingPaymentAmount;

 //  //*[@id="add_partial_payment"]/button

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)>Payments-Save
 @FindBy(xpath = "//*[@id=\"add_partial_payment\"]/button")
 public WebElement pathologyBilingPaymentSaveButton;
 @FindBy(xpath = "//*[@id=\"add_partial_payment\"]/div[5]/div/div")
 public WebElement pathologyBilingPaymentSaveButtonnn;



 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)>Payments-CashTest
 @FindBy(xpath = "//*[@id=\"addPaymentModal\"]/div/div/div[2]/div/div[2]/table/tbody/tr/td[1]")
 public WebElement pathologyBilingPaymentModeCashTest;

 @FindBy(xpath = "//*[@id=\"addPaymentModal\"]/div/div/div[2]/div[2]/div/div/table/thead/tr/th[1]")
 public WebElement pathologyBilingPaymentModeCashTests;

 @FindBy(xpath = "//*[@id=\"addPaymentModal\"]/div/div/div[2]/div[2]/div/div/table/thead/tr/th[1]")
 public WebElement pathologyBilingPaymentModeCashTestss;

 //Admin/Dashboard>Biling Button-Biling Page>Pathology Billing >Balance Amount ($)>Payments-CashDelete
 @FindBy(xpath = "//*[@id=\"addPaymentModal\"]/div/div/div[2]/div/div[2]/table/tbody/tr/td[6]/a[2]/i")
 public WebElement cashTestDelete;

 //Admin/Dashboard>Biling Button-Biling Page>Blood Issue >Blood Issue Biling-CashDetail_Delete
 @FindBy(xpath = "//*[@id='edit_delete']/a[3]/i")
 public WebElement cashTestDetailsDelete;

 //Admin/Dashboard>Biling Button-Biling Page>Blood Issue >Blood Issue Biling-CashDetail_Edit
 @FindBy(xpath = "//*[@id='edit_delete']/a[2]/i")
 public WebElement cashTestDetailsEdit;

  //Admin/Dashboard>Biling Button-Biling Page>Blood Issue >Blood Issue Biling-CashDetail_Delete>RecordSaveTest
 @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div")
 public WebElement cashRecordSavedTest;

 //Admin/Dashboard>Biling Button-Biling Page>Blood Issue >Blood Issue Biling-CashDetail_Delete>RecordSave-SaveButton
 @FindBy(xpath = "//*[@id='formaddbtn']/i")
 public WebElement cashRecordSaved;

 //Admin/Dashboard>Biling Button-Biling Page>Blood Issue >Blood Issue >Select Add Payment
 @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[5]/td[1]/div/a[2]/i")
 public WebElement cashAddPayment;

 //Admin/Dashboard>Biling Button-Biling Page>Blood Issue >Blood Issue >Select Delete
 @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[1]/div/a[3]")
 public WebElement cashDelete;

 @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[1]/div/a[3]/i")
 public WebElement cashDeleteee;

 //Admin/Dashboard>Biling Button-Biling Page>Blood Issue >Blood Issue >Select DeleteTestt
 @FindBy(xpath = "//*[@id=\"DataTables_Table_0_info\"]")
 public WebElement cashDeleteTestt;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Search
 @FindBy(xpath = "//input[@name='case_id']")
 public WebElement cashIdSearch;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >SearchButton
 @FindBy(xpath = "(//button[@type='submit'])[3]")
 public WebElement cashIdSearchButton;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >SearchButton
 @FindBy(xpath = "(//a[@data-toggle='tooltip'])[6]")
 public WebElement generateBillButton;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Bill Test
 @FindBy(xpath = "(//img[@class='img-responsive'])")
 public WebElement generateBillTest;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Bill Summary
 @FindBy(xpath = "//button[@class='btn btn-primary btn-sm showbill']")
 public WebElement billSummary;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Bill Summary>Close
 @FindBy(xpath = "(//button[@class='close'])[8]")
 public WebElement billSummaryclose;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Add Payment Button
 @FindBy(xpath = "(//*[@data-module='opd'])")
 public WebElement addpaymentButton;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Add Payment Date
 @FindBy(xpath = "(//*[@name='payment_date'])")
 public WebElement addpaymentDate;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Add Payment Amaount
 @FindBy(xpath = "(//*[@name='amount'])")
 public WebElement addpaymentDateAmaount;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Add Payment Save Button
 @FindBy(xpath = "(//*[@class='btn btn-info pull-right'])")
 public WebElement addpaymentSaveButton;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >View Payment Button
 @FindBy(xpath = "//*[@id='opd']/div[1]/a[2]")
 public WebElement viewPaymentsButton;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >viewPaymentsTest
 @FindBy(xpath = "(//td[@class='text-right'])[14]")
 public WebElement viewPaymentsTest;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module Billing
 @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/div/button")
 public WebElement singleModuleBillingButton;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module BillingOPD
 @FindBy(xpath = "(//i[@class='fas fa-stethoscope'])[2]")
 public WebElement singleModuleBillingOPD;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module BillingOPDTest
 @FindBy(xpath = "//h3[@class='box-title titlefix']")
 public WebElement singleModuleBillingOPDTest;

//Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module Pathology
 @FindBy(xpath = "(//i[@class='fas fa-flask'])[2]")
 public WebElement singleModulePathology;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module PathologyTest
 @FindBy(xpath = "//h3[@class='box-title titlefix']")
 public WebElement singleModulePathologyTest;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module Radiology
 @FindBy(xpath = "(//i[@class='fas fa-microscope'])[2]")
 public WebElement singleModuleRadiology;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module RadiologyTest
 @FindBy(xpath = "//h3[@class='box-title titlefix']")
 public WebElement singleModuleRadiologyTest;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module Blood ıssue
 @FindBy(xpath = "(//i[@class='fas fa-tint'])[2]")
 public WebElement singleModuleBloodIssue;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module Blood ıssueTest
 @FindBy(xpath = "//h3[@class='box-title titlefix']")
 public WebElement singleModuleBloodIssueTest;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module Blood Compenend
 @FindBy(xpath = "//i[@class='fas fa-burn']")
 public WebElement singleModuleBloodCompenend;

 //Admin/Dashboard>Biling Button-OPD/IPD Billing Through Case Id >Single Module Blood CompenendTest
 @FindBy(xpath = "//h3[@class='box-title titlefix']")
 public WebElement singleModuleBloodCompenendTest;

 // ******Dashboard TPA Managements Bolumu*********

// Dashboard/TPA Management Link
 @FindBy(xpath = "//i[@class='fas fa-umbrella']")
 public WebElement tpaManagementlink;

 // Dashboard/TPA Management Link_Test
 @FindBy(xpath = "//h3[@class='box-title titlefix']")
 public WebElement tpaManagementText;

 // Dashboard/TPA Management Link_Test-Deleteİcon
 @FindBy(xpath = "//i[@class='fa fa-trash']")
 public WebElement tpaDeleteIcon;

 // Dashboard/TPA Management Link_Test-Editİcon
 @FindBy(xpath = "//i[@class='fa fa-pencil']")
 public WebElement tpaEditIcon;

 // Dashboard/TPA Management Link_Test-Editİcon
 @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[1]/div/a[1]/i")
 public WebElement tpaOrganizationIcon;

 // Dashboard/TPA Management Link_Test-EditName
 @FindBy(xpath = "(//input[@type='text'])[8]")
 public WebElement tpaEditName;

 // Dashboard/TPA Management Link_Test-EditCode
 @FindBy(xpath = "(//input[@type='text'])[9]")
 public WebElement tpaEditCode;

 // Dashboard/TPA Management Link_Test-EditContactNo
 @FindBy(xpath = "(//input[@type='text'])[10]")
 public WebElement tpaEditContactNo;

 // Dashboard/TPA Management Link_Test-EditSave
 @FindBy(xpath = "//*[@id=\"formeditbtn\"]/i")
 public WebElement tpaEditSave;

 // Dashboard/TPA Management Link_Test-Organization-DetailsText
 @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover allajaxlist']//th[contains(text(),'Charge Type')]")
 public WebElement tpaorganizationDetailsText;

// Dashboard/TPA Management Link_Test-Organization-Add TPA iconu
 @FindBy(xpath = "//a[@class='btn btn-primary btn-sm organisation']")
 public WebElement tpaAddIcon;



// Dashboard'un solundaki Billingi dogrulama Texti

    public @FindBy(xpath="(//*[@class='box-title titlefix'])[1]")
    WebElement billingVerifyItem;

// Dashboard'un solundaki appontmenti dogrulama Texti

    public @FindBy(xpath="(//*[text()='Appointment Details'])[1]")
    WebElement appointmentVerifyItem;

// Dashboard'un solundaki OPD dogrulama Texti

    public @FindBy(xpath="//*[@class='box-tools addmeeting']")
    WebElement OPDVerifyItem;

    // Dashboard'un solundaki IPD dogrulama Texti

    public @FindBy(xpath="//*[@class='box-title titlefix']")
    WebElement IPDVerifyItem;



// Dashboard'un solundaki Pharmacy dogrulama Texti

    public @FindBy(xpath="//*[@class='fas fa-mortar-pestle']")
    WebElement PharmacyVerifyItem;



    // Dashboard'un solundaki Pathology dogrulama Texti

    public @FindBy(xpath="//*[@class='box-title titlefix']")
    WebElement pathologyVerifyItem;


    // Dashboard'un solundaki radyology dogrulama Texti

    public @FindBy(xpath="//*[@class='box-title titlefix']")
    WebElement radyologyVerifyItem;


    // Dashboard'un solundaki Bloot bank dogrulama Texti

    public @FindBy(xpath="//*[@class='box-title titlefix']")
    WebElement blootBankVerifyItem;

    // Dashboard'un solundaki ambulance dogrulama Texti

    public @FindBy(xpath="//*[@class='box-title titlefix']")
    WebElement ambulanceVerifyItem;

    // Dashboard'un solundaki Front office dogrulama Texti

    public @FindBy(xpath="//*[@class='box-tools pull-right']")
    WebElement frontOfficeVerifyItem;


    // Dashboard'un solundaki Front office dogrulama Texti

    public @FindBy(xpath="//*[@class='treeview-menu menu-open']")
    WebElement BirthDeathVerifyItem;


    // Dashboard'un solundaki Front office dogrulama Texti

    public @FindBy(xpath="(//*[@class='btn-group'])[1]")
    WebElement humanRecourceVerifyItem;

    // Dashboard'un solundaki TPA Management dogrulama Texti
    public @FindBy(xpath="(//*[@class='box-tools pull-right box-tools-md'])[1]")
    WebElement tpaManagementVerifyItem;



    // Dashboard'un solundaki Finance dogrulama Texti
    public @FindBy(xpath="(//*[@class='treeview-menu menu-open'])[1]")
    WebElement financeVerifyItem;


    // Dashboard'un solundaki Messaging dogrulama Texti
    public @FindBy(xpath="(//*[@class='box-tools pull-right'])[1]")
    WebElement messagingVerifyItem;



    // Dashboard'un solundaki Inventory dogrulama Texti
    public @FindBy(xpath="(//*[@class='box-tools pull-right'])[1]")
    WebElement inventoryVerifyItem;

    // Human Resource'i tiklayinca Card View dogrulama linki
    public @FindBy(xpath="//*[@class='fa fa-newspaper-o']")
    WebElement cardViewLinki;


    // Human Resource'i tiklayinca Card View dogrulama
    public @FindBy(xpath="(//*[@class='stafficons'])[1]")
    WebElement cardViewVerifyItem;



 // Human Resource'i tiklayinca List View dogrulama
 public @FindBy(xpath="(//*[@class='pull-right noExport'])[1]")
 WebElement listViewVerifyItem;


 // Human Resource'i tiklayinca List Linki
 public @FindBy(xpath="(//*[@class='fa fa-list'])[1]")
 WebElement listViewLinki;

 // Human Resource'i tiklayinca Card olarak bütün calisanlarin görüntülenmesi
 public @FindBy(xpath="//*[@class='tab-pane active']")
 WebElement allEmployeeAsCardView;


 // Human Resource'i tiklayinca Card olarak calisan bilgilerin  ve edit edilmesi

  public @FindBy(xpath="(//*[@class='fa fa-navicon'])[2]")
  WebElement emplyeeShowAsCardView;


 // Human Resource'i tiklayinca Card olarak calisan bilgilerin  ve edit edilmesi

 public @FindBy(xpath="//*[@class='fa fa-pencil']")
 WebElement emplyeeEditAsCardView;


   // Human Resource'i tiklayinca Liste olarak calisanlarinStaff id, name, role ve department in görülmesi

   public @FindBy(xpath="(//*[@class='sorting'])[1]")
   WebElement staffIdListViewItem;


 // Human Resource'i tiklayinca Liste olarak calisanlarinStaff id, name, role ve department in görülmesi

 public @FindBy(xpath="(//*[@class='sorting'])[2]")
 WebElement nameListViewItem;


 // Human Resource'i tiklayinca Liste olarak calisanlarinStaff id, name, role ve department in görülmesi

 public @FindBy(xpath="(//*[@class='sorting'])[3]")
 WebElement roleListViewItem;

 // Human Resource'i tiklayinca Liste olarak calisanlarinStaff id, name, role ve department in görülmesi

 public @FindBy(xpath="(//*[@class='sorting'])[4]")
 WebElement departmentListViewItem;


 // Human Resource'i tiklayinca Liste olarak calisanlarinStaff id, name, role ve department in görülmesi

 public @FindBy(xpath="(//*[@class='sorting'])[5]")
 WebElement designationListViewItem;

 // Human Resource'i tiklayinca Liste olarak calisanlarinStaff id, name, role ve department in görülmesi

 public @FindBy(xpath="(//*[@class='sorting'])[6]")
 WebElement mobileNumberListViewItem;



 // Human Resource'i tiklayinca Liste olarak calisanlarinStaff id, name, role ve department in görülmesi

 public @FindBy(xpath="//*[@class='text-right noExport sorting']")
 WebElement actionListViewItem;


 // Human Resource'i tiklayinca Liste olarak görüntülenen actionun altindaki show

 public @FindBy(xpath="(//*[@class='fa fa-reorder'])[5]")
 WebElement actionShowListViewItem;

 // Human Resource'i tiklayinca Liste olarak görüntülenen actionun altindaki edit

 public @FindBy(xpath="(//*[@class='fa fa-pencil'])[1]")
 WebElement actionEditListViewItem;


 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada searchboxin görüntülenmesi

 public @FindBy(xpath="(//*[@class='form-control'])[2]")
 WebElement searchBoxListViewItem;



 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada role searchboxin görüntülenmesi

 public @FindBy(xpath="(//*[@class='form-control'])[1]")
 WebElement roleSearchBoxListViewItem;

 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada add staff görüntülenmesi

 public @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm btnMDb2'])[1]")
 WebElement addStaffViewItem;


 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada add staffi tklarkden disabled staff görüntülenmesi

 public @FindBy(xpath = "//button[@class='btn btn-primary dropdown-toggle btn-sm']")
 WebElement disableStaffViewItem;



 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada add staffi tklarkden disabled staff görüntülenmesi

 public @FindBy(xpath = "//*[@class='dropdown-menu']")
 WebElement disableStaffButton;


// Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tiklamasi

 public @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm btnMDb2'])[1]")
 WebElement staffAttandance;



// Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance  ta Role search yapilmasi

 public @FindBy(xpath = "(//*[@class='form-control'])[1]")
 WebElement staffAttandanceSearchRole;



 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance  ta Date search yapilmasi

 public @FindBy(xpath = "(//*[@class='form-control date'])[1]")
 WebElement staffAttandanceSearchDate;


 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance  ta Date 31 olarak secmesi ve search yapilmasi

 public @FindBy(xpath = "(//*[@class='active day'])[1]")
 WebElement staffAttandanceSearchDate31;



 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance  ta Date 31 olarak secmesi ve search yapilmasi

 public @FindBy(xpath = "(//*[@value='Accountant'])[1]")
 WebElement staffAttandanceSearchDateAccount;


 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tan payrolla gecmesi

 public @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
 WebElement staffAttandancePayroll;



 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tan payroldaki month

 public @FindBy(xpath = "(//*[@class='form-control'])[2]")
 WebElement staffAttandancePayrollMonth;



 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tan payroldaki month

 public @FindBy(xpath = "(//*[@class='form-control'])[3]")
 WebElement staffAttandancePayrollYear;

 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tan my leaves

 public @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
 WebElement staffAttandanceMyLeaves;


 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tan my leaves te staff

 public @FindBy(xpath = "((//*[@class='sorting'])[1]")
 WebElement myLeavesStaff;

 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tan my leaves Leave Type

 public @FindBy(xpath = "((//*[@class='sorting'])[2]")
 WebElement myLeavesLeaveType;


 // Human Resource'i tiklayinca Liste olarak görüntülenen sayfada staff attandance tan my leaves Leave Date

 public @FindBy(xpath = "((//*[@class='sorting'])[3]")
 WebElement myLeavesLeavesLeaveDate;


 // Human Resource'i tiklayinca Liste olarak  sayfada staff attandance tan my leaves ta Days

 public @FindBy(xpath = "((//*[@class='sorting'])[4]")
 WebElement myLeavesLeavesLeaveDays;


 // Human Resource'i tiklayinca Liste olarak  sayfada staff attandance tan my leaves ta Apply Date

 public @FindBy(xpath = "((//*[@class='sorting'])[5]")
 WebElement myLeavesLeavesLeaveApplyDate;


 // Human Resource'i tiklayinca Liste olarak  sayfada staff attandance tan my leaves ta Status

 public @FindBy(xpath = "((//*[@class='sorting'])[6]")
 WebElement myLeavesLeavesStatus;

 // Human Resource'i tiklayinca Liste olarak  sayfada staff attandance tan my leaves ta Status

 public @FindBy(xpath = "(//*[@class='text-right noExport dt-body-right sorting_disabled'])")
 WebElement myLeavesLeavesAction;


}
