package com.paymentmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentService {

	public WebDriver driver;

	public AppointmentService(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(xpath = "(//a[normalize-space()='Schedule'])[1]")
	private WebElement clickpre;

	public WebElement getclickpre() {
		return clickpre;

	}

	@FindBy(xpath = "(//button[@id='e-tbr-btn_2'])[1]")
	private WebElement cliccal;

	public WebElement getcliccal() {
		return cliccal;

	}

	@FindBy(xpath = "(//span[@title='Monday, March 21, 2022'])[1]")
	private WebElement clidate;

	public WebElement getclidate() {
		return clidate;

	}

	@FindBy(xpath = "//*[@id=\"e-appointment-wrapper-0\"]/div[4]/div[2]")
	private WebElement clicapp;

	public WebElement getclicapp() {
		return clicapp;

	}

	////////////// ICD //////

	@FindBy(xpath = "(//button[@class='e-tbar-btn e-tbtn-txt e-control e-btn e-lib'])[5]")
	private WebElement ClickPreviousDate;

	public WebElement getClickPreviousDate() {
		return ClickPreviousDate;
	}

	@FindBy(xpath = "//span[text()='23']")
	private WebElement ClickSelectDate;

	public WebElement getSelectDate() {
		return ClickSelectDate;
	}

	@FindBy(xpath = "//tbody/tr/td/div[contains(@class,'e-content-wrap')]/table[contains(@class,'e-schedule-table e-content-table')]/thead/tr/td[contains(@class,'e-day-wrapper')]/div[@id='e-appointment-wrapper-0']/div[1]")
	private WebElement ClickAppointment;

	public WebElement getClickAppointment() {
		return ClickAppointment;
	}

	@FindBy(xpath = "//div[@id='new-app-status_1']//input[@type='text']")
	private WebElement ClickArrivedLobby;

	public WebElement getClickArrivedLobby() {
		return ClickArrivedLobby;
	}

	@FindBy(xpath = "(//span[normalize-space()='@ Arrived/Lobby'])[1]")
	private WebElement SelectArrivedLobby;

	public WebElement getSelectArrivedLobby() {
		return SelectArrivedLobby;
	}

	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
	private WebElement ClickServices;

	public WebElement getClickServices() {
		return ClickServices;
	}

	@FindBy(xpath = "//input[@placeholder='Find Diagnosi Codes']")
	private WebElement ClickCPTCodes;

	public WebElement getClickCPTCodes() {
		return ClickCPTCodes;
	}

	@FindBy(xpath = "//input[@placeholder='Find Diagnosi Codes']")
	private WebElement EnterCPTCodes;

	public WebElement getEnterCPTCodes() {
		return EnterCPTCodes;
	}

	@FindBy(xpath = "//div[contains(text(),'Vkard--fdfdsfds')]")
	private WebElement SelectCPTCodes;

	public WebElement getSelectCPTCodes() {
		return SelectCPTCodes;
	}

	@FindBy(xpath = "//input[contains(@value,'23')]")
	private WebElement ClearFees;

	public WebElement getClearFees() {
		return ClearFees;
	}

	@FindBy(xpath = "//input[contains(@value,'23')]")
	private WebElement EnterFees;

	public WebElement getEnterFees() {
		return EnterFees;
	}

	@FindBy(xpath = "//select[@id='MA_CPT_40']")
	private WebElement clickModifiersA1;

	public WebElement getclickModifiersA1() {
		return clickModifiersA1;
	}

	@FindBy(xpath = "//select[@id='MA_CPT_40']//option[@value='22'][contains(text(),'22')]")
	private WebElement selectkModifiersA1;

	public WebElement getselectkModifiersA1() {
		return selectkModifiersA1;
	}

	@FindBy(xpath = "//select[@id='MB_CPT_40']")
	private WebElement clickModifiersA2;

	public WebElement getclickModifiersA2() {
		return clickModifiersA2;
	}

	@FindBy(xpath = "//select[@id='MB_CPT_40']//option[@value='24'][contains(text(),'24')]")
	private WebElement selectkModifiersA2;

	public WebElement getselectkModifiersA2() {
		return selectkModifiersA2;
	}

	@FindBy(xpath = "//select[@id='MC_CPT_40']")
	private WebElement clickModifiersA3;

	public WebElement getclickModifiersA3() {
		return clickModifiersA2;
	}

	@FindBy(xpath = "//select[@id='MC_CPT_40']//option[@value='25'][contains(text(),'25')]")
	private WebElement selectkModifiersA3;

	public WebElement getselectkModifiersA3() {
		return selectkModifiersA2;
	}

	@FindBy(xpath = "//select[@id='MD_CPT_40']")
	private WebElement clickModifiersA4;

	public WebElement getclickModifiersA4() {
		return clickModifiersA4;
	}

	@FindBy(xpath = "//select[@id='MD_CPT_40']//option[contains(@value,'33')][contains(text(),'33')]")
	private WebElement selectkModifiersA4;

	public WebElement getselectkModifiersA4() {
		return selectkModifiersA4;
	}

	@FindBy(xpath = "//input[@id='cpt_4_units0']")
	private WebElement clearquantity;

	public WebElement getclearquantity() {
		return clearquantity;
	}

	@FindBy(xpath = "//input[@id='cpt_4_units0']")
	private WebElement Enterquantity;

	public WebElement getEnterquantity() {
		return Enterquantity;
	}

	@FindBy(xpath = "//input[@id='cpt_4_pointer0']")
	private WebElement EnterPointer;

	public WebElement getEnterPointer() {
		return EnterPointer;
	}

	@FindBy(xpath = "//div[text()='Billing']")
	private WebElement ClickBilling;

	public WebElement getClickBilling() {
		return ClickBilling;
	}

	@FindBy(xpath = "//select[@id='getbillingstatus']")
	private WebElement ClickBillingStatus;

	public WebElement getClickBillingStatus() {
		return ClickBillingStatus;
	}

	@FindBy(xpath = "//option[@value='Settled']")
	private WebElement selectBillingStatus;

	public WebElement getselectBillingStatus() {
		return selectBillingStatus;
	}

	@FindBy(xpath = "//span[normalize-space()='Create Invoice']")
	private WebElement ClickCreateInvoice;

	public WebElement getClickCreateInvoice() {
		return ClickCreateInvoice;
	}

	@FindBy(xpath = "//div[normalize-space()='Add Payment']")
	private WebElement ClickAddPayment;

	public WebElement getClickAddPayment() {
		return ClickAddPayment;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[10]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement ClickInvoiceBalance;

	public WebElement getClickInvoiceBalance() {
		return ClickInvoiceBalance;
	}

	@FindBy(xpath = "//select[@id='paymethod']")
	private WebElement SelectPaymentMethod;

	public WebElement getSelectPaymentMethod() {
		return SelectPaymentMethod;
	}

	@FindBy(xpath = "//button[normalize-space()='Add Payment']")
	private WebElement Clickaddpayment;

	public WebElement getClickaddpayment() {
		return Clickaddpayment;
	}

//	ICD10 Codes
	@FindBy(xpath = "//div[text()='Services']")
	private WebElement clcikservice;

	public WebElement getclcikservice() {
		return clcikservice;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Find ICD10 Codes')]")
	private WebElement searchcodes;

	public WebElement getsearchcodes() {
		return searchcodes;
	}

	@FindBy(xpath = "//div[contains(text(),'H50.07--Alternating esotropia with V pattern')]")
	private WebElement selectcode;

	public WebElement getselectcode() {
		return selectcode;
	}

	@FindBy(xpath = "//td[contains(@class,'MuiTableCell-root MuiTableCell-body MuiTableCell-sizeSmall')]//button[contains(@type,'button')]//*[name()='svg']//*[name()='g']//*[name()='path' and contains(@d,'M4 8h16v13')]")
	private WebElement clickdelete;

	public WebElement getclickdelete() {
		return clickdelete;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Cancel'])[3]")
	private WebElement clickcancel;

	public WebElement getclickcancel() {
		return clickcancel;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
	private WebElement clicserv;

	public WebElement getclicserv() {
		return clicserv;

	}

	@FindBy(xpath = "(//input[@placeholder='Find HCPCS Codes'])[1]")
	private WebElement clicfindhcpc;

	public WebElement getclicfindhcpc() {
		return clicfindhcpc;

	}

	@FindBy(xpath = "(//div[contains(text(),'V2782--Lens, 1.54-1.65 p/1.60-1.79g')])[1]")
	private WebElement clichcpcs;

	public WebElement getclichcpcs() {
		return clichcpcs;

	}

	@FindBy(xpath = "(//input[@id='totalbill'])[10]")
	private WebElement sendfee;

	public WebElement getsendfee() {
		return sendfee;

	}

	@FindBy(xpath = "(//select[@id='MA_HCPCS0'])[1]")
	private WebElement clicmod1;

	public WebElement getclicmod1() {
		return clicmod1;

	}

	@FindBy(xpath = "(//option[@value='26'][contains(text(),'26')])[33]")
	private WebElement selecmod1;

	public WebElement getselecmod1() {
		return selecmod1;

	}

	@FindBy(xpath = "(//select[@id='MB_HCPCS0'])[1]")
	private WebElement clicmod2;

	public WebElement getclicmod2() {
		return clicmod2;

	}

	@FindBy(xpath = "(//option[@value='25'][contains(text(),'25')])[34]")
	private WebElement selemod2;

	public WebElement getselemod2() {
		return selemod2;

	}

	@FindBy(xpath = "(//select[@id='MC_HCPCS0'])[1]")
	private WebElement clicmod3;

	public WebElement getclicmod3() {
		return clicmod3;

	}

	@FindBy(xpath = "(//option[@value='23'][contains(text(),'23')])[35]")
	private WebElement selemod3;

	public WebElement getselemod3() {
		return selemod3;

	}

	@FindBy(xpath = "(//select[@id='MD_HCPCS0'])[1]")
	private WebElement clicmod4;

	public WebElement getclicmod4() {
		return clicmod4;

	}

	@FindBy(xpath = "(//option[@value='24'][contains(text(),'24')])[36]")
	private WebElement selemod4;

	public WebElement getselemod4() {
		return selemod3;

	}

	@FindBy(xpath = "(//input[@id='HCPCS_units0'])[1]")
	private WebElement quant;

	public WebElement getquant() {
		return quant;

	}

	@FindBy(xpath = "(//input[@id='HCPCS_pointer0'])[1]")
	private WebElement pointe;

	public WebElement getpointe() {
		return pointe;

	}

	@FindBy(xpath = "(//button[@id='HCNDAdd0'])[1]")
	private WebElement NDCPL;

	public WebElement getNDCPL() {
		return NDCPL;

	}

	@FindBy(xpath = "(//input[@id='HSPSC_NDC_Code0'])[1]")
	private WebElement finNDCP;

	public WebElement getfinNDCP() {
		return finNDCP;

	}

	@FindBy(xpath = "(//input[@id='HSPSC_NDCQty0'])[1]")
	private WebElement NDCPLqua;

	public WebElement getNDCPLqua() {
		return NDCPLqua;

	}

	@FindBy(xpath = "(//div[@class='content'])[1]")
	private WebElement selNDCPLqua;

	public WebElement getselNDCPLqua() {
		return selNDCPLqua;

	}

	@FindBy(xpath = "(//select[@id='HSPSC_NDCUnit0'])[1]")
	private WebElement NDCPUnits;

	public WebElement getNDCPUnits() {
		return NDCPUnits;

	}

	@FindBy(xpath = "(//input[@placeholder='Find ICD9 Codes'])[1]")
	private WebElement icd9;

	public WebElement geticd9() {
		return icd9;

	}

	@FindBy(xpath = "(//div[contains(text(),'765.04-- Extreme immaturity, 1,000-1,249 grams')])[1]")
	private WebElement icd9sele;

	public WebElement geticd9sele() {
		return icd9sele;

	}

	@FindBy(xpath = "(//div[contains(text(),'123--Viral Fever 2')])[1]")
	private WebElement cuscosele;

	public WebElement getcuscosele() {
		return cuscosele;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Custom Codes'])[1]")
	private WebElement cusco;

	public WebElement getcusco() {
		return cusco;

	}

	@FindBy(xpath = "(//span[@class='blue-color'])[1]")
	private WebElement getbal;

	public WebElement getgetbal() {
		return getbal;

	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-3'])[1]")
	private WebElement Billingsel;

	public WebElement getBillingsel() {
		return Billingsel;

	}

	@FindBy(xpath = "(//button[normalize-space()='Patient Super Bill'])[1]")
	private WebElement supbill;

	public WebElement getsupbill() {
		return supbill;

	}

	@FindBy(xpath = "(//span[@aria-hidden='true'][normalize-space()='×'])[2]")
	private WebElement closenvo;

	public WebElement getclosenvo() {
		return closenvo;

	}
}
