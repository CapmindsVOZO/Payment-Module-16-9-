package com.paymentmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Billing_Runner extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "Admin3");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		/////////// click appointment cal//////

		// get appointment
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

////////////////New Appointment ////////////

// Get Appointment Option

		Clickonelement(pom.getschedloc().getAppointmentoption());

// get Appointment Text
// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getAppointmentclick());

// sele Type

// Clickonelement(pom.getschedloc().getAppointtyp());

// Clcik Patient

//Thread.sleep(7000);

// driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement sera = wait2.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[normalize-space()='Search Patient'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sera);

		sendkeys(pom.getschedloc().getClcikpatient(), "test");

// Select Patient

		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getSelectpatient());

		// Select Date
		sendkeys1(pom.getschedloc().getClcikpatient(), Keys.TAB);
		// clear(pom.getschedloc().getSelectdate());

		sendkeys(pom.getschedloc().getSelectdate(), "09/09/2022");

		// Click Today
		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getclcitoda());

		// Click Time

		sendkeys1(pom.getschedloc().getSelectdate(), Keys.TAB);

		sendkeys(pom.getschedloc().getSelecttime(), "11:19 AM");

//				Clickonelement(pom.getschedloc().getSelecttime2());
		//
//				Clickonelement(pom.getschedloc().getSelecttime1());
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getSelecttimeok());
//

// Send Min

		clear(pom.getschedloc().getSendmin());

		sendkeys(pom.getschedloc().getSendmin(), "40");

		// select Provider

		Clickonelement(pom.getschedloc().getprosel());

		Clickonelement(pom.getschedloc().getproselected());
//
// Click Profile

		Clickonelement(pom.getschedloc().getClickprofile());

// Select Profile

		Clickonelement(pom.getschedloc().getSelectprofile());

// Click Location

		Thread.sleep(2000);

//Clickonelement(pom.getschedloc().getLocation());
//
//// Select Loction
//
//Clickonelement(pom.getschedloc().getSelectLocation());

// Clcik Status

		Clickonelement(pom.getschedloc().getClickstatus());

// select status

		Clickonelement(pom.getschedloc().getSelectstatus());

		// save appointmen
		Clickonelement(pom.getschedloc().getClicksave());

		System.out.println("Appointment Created Successfully ");
		////////////// Payment////////////////

		// click pre

		// Clickonelement(pom.getAppointmentService().getclickpre());

		// click appoi

		// Thread.sleep(3000);

		// Clickonelement(pom.getAppointmentService().getcliccal());
		// clic Date

		// Clickonelement(pom.getAppointmentService().getclidate());

		// click appoi

//		Thread.sleep(8000);
//
//		Clickonelement(pom.getAppointmentService().getclicapp());

		WebDriverWait pats = new WebDriverWait(driver, 20);
		WebElement patsele = pats
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sc-hbjaKc iemQOA'])[6]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);

		/////////// ICD ///////////

		// Click Sevices

		Thread.sleep(5000);
		WebDriverWait ser = new WebDriverWait(driver, 20);
		WebElement sersel = ser
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Services')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sersel);

		// Clickonelement(pom.getAppointmentService().getClickServices());

		Thread.sleep(3000);
		// click CPT Codes
		Clickonelement(pom.getAppointmentService().getClickCPTCodes());

		// Enter CPT codes
		sendkeys(pom.getAppointmentService().getEnterCPTCodes(), "v");

		Thread.sleep(2000);

		// click CPT Codes
		Clickonelement(pom.getAppointmentService().getSelectCPTCodes());

		Thread.sleep(4000);
		// Clear fees
		clear(pom.getAppointmentService().getClearFees());

		// Enter Fees
		sendkeys(pom.getAppointmentService().getEnterFees(), "200");

		// click A1 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA1(), "23");

		// select A1 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA1());

		Thread.sleep(3000);

		// click Level 2 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA2(), "24");

		// select Level 2 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA2());

		Thread.sleep(3000);

		// click Level 3 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA3(), "23");

		// select Level 3 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA3());

		// click Level 4 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA4(), "25");

		// select Level 4 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA4());

		// Clear quantity
		clear(pom.getAppointmentService().getclearquantity());

		// Enter quantity
		sendkeys(pom.getAppointmentService().getEnterquantity(), "5");

		// Enter pointer
		sendkeys(pom.getAppointmentService().getEnterPointer(), "5");

		// save data
		Clickonelement(pom.getAppointmentService().getsavecpt());

		////// ICD 10/////

		// //click search ICD-10-CM codes
		sendkeys(pom.getAppointmentService().getsearchcodes(), "v");

		// select code
		Clickonelement(pom.getAppointmentService().getselectcode());

		// //click Billing
//		Clickonelement(pom.getAppointmentService().getClickBilling());
//
//		// click Billing status
//		Clickonelement(pom.getAppointmentService().getClickBillingStatus());
//
//		// select Billing status
//		Clickonelement(pom.getAppointmentService().getselectBillingStatus());
		//
		//// //click Create Invoice
////	    //Clickonelement(pom.getAppointmentService().getClickCreateInvoice());
		////
////	    //click Add payment
////	    Clickonelement(pom.getAppointmentService().getClickAddPayment());
		////
////	    Thread.sleep(3000);
		////
		//// //click Invoice Balance Button
////	    Clickonelement(pom.getAppointmentService().getClickInvoiceBalance());
		////
////		//select payment method
////	    Selectone(pom.getAppointmentService().getSelectPaymentMethod(),"Cash" );
		////
////	    //click Invoice Balance Button
////	    Clickonelement(pom.getAppointmentService().getClickaddpayment());
		////
		//
		// ICD-10-CM
		// Thread.sleep(4000);

		// Click Sevices
		// Clickonelement(pom.getAppointmentService().getclcikservice());

//		// click Billing
//		Clickonelement(pom.getAppointmentService().getClickBilling());
//
//		// click Billing status
//		Clickonelement(pom.getAppointmentService().getClickBillingStatus());
//
//		Thread.sleep(2000);
//
//		// select Billing status
//		Clickonelement(pom.getAppointmentService().getselectBillingStatus());

		////// click Create Invoice
		//// //Clickonelement(pom.getAppointmentService().getClickCreateInvoice());
		////
		//// //click Add payment
		//// Clickonelement(pom.getAppointmentService().getClickAddPayment());
		////
		//// Thread.sleep(3000);
		////
		////// click Invoice Balance Button
		//// Clickonelement(pom.getAppointmentService().getClickInvoiceBalance());
		////
////		//select payment method
		//// Selectone(pom.getAppointmentService().getSelectPaymentMethod(),"Cash" );
		////
		//// //click Invoice Balance Button
		//// Clickonelement(pom.getAppointmentService().getClickaddpayment());
		////

		// Clickonelement(pom.getAppointmentService().getclickcancel());

		// click appoi
//
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getAppointmentService().getclicserv());

		/////////// HCPCS Code//////////

		// click HCPCS Code

		Thread.sleep(4000);

		sendkeys(pom.getAppointmentService().getclicfindhcpc(), "1");

		// click appoi

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclichcpcs());

		// click HCPCS Code

		// sendkeys(pom.getAppointmentService().getsendfee(), "500");

		// clci mod1 TODO

		selecttwo(pom.getAppointmentService().getclicmod1(), "22");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselecmod1());

		// clci mod1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getclicmod2(), "23");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod2());

		// clci mod1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getclicmod3(), "24");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod3());

		// clci mod1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getclicmod4(), "25");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod4());

		// sele quan
		clear(pom.getAppointmentService().getquant());

		sendkeys(pom.getAppointmentService().getquant(), "2");

		// sele poin

		clear(pom.getAppointmentService().getpointe());

		sendkeys(pom.getAppointmentService().getpointe(), "2");

		// save data

		Clickonelement(pom.getAppointmentService().getsavehcpc());
		// sele ndc

		Clickonelement(pom.getAppointmentService().getNDCPL());

		// sele ndcq
		Thread.sleep(5000);

//		sendkeys(pom.getAppointmentService().getNDCPLqua(), "1");
//		
//		Clickonelement(pom.getAppointmentService().getselNDCPLqua());

		// sele ndcq

//		sendkeys(pom.getAppointmentService().getNDCPLqua(), "2");
//
//		// sele ndcq
//
//		selectone(pom.getAppointmentService().getNDCPUnits(), "ML (MilliLiter)");

		// sele ndcq

		sendkeys(pom.getAppointmentService().geticd9(), "1");

		// sele icd9

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().geticd9sele());

		// clic cus code
		sendkeys(pom.getAppointmentService().getcusco(), "1");
		// sele cus cod

		Thread.sleep(6000);
		WebDriverWait cus = new WebDriverWait(driver, 20);
		WebElement selcus = cus.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[contains(text(),'123456--Testers HCPCS')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selcus);

		// Clickonelement(pom.getAppointmentService().getcuscosele());

		// mod 1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getcusmod1(), "23");

		// mod 2

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getcusmod2(), "24");

		// mod 3

		selecttwo(pom.getAppointmentService().getcusmod3(), "24");

		// mod 4

		selecttwo(pom.getAppointmentService().getcusmod4(), "25");

		// quan

		clear(pom.getAppointmentService().getquantcus());

		sendkeys(pom.getAppointmentService().getquantcus(), "2");

		// poin

		sendkeys(pom.getAppointmentService().getpoincus(), "2");
		// TODO

		// ADD codes
		Clickonelement(pom.getAppointmentService().getaddcod());

		// sele cod ty
		selecttwo(pom.getAppointmentService().getcoty(), "100");

		// code name
		sendkeys(pom.getAppointmentService().getadcod(), "200");

		// code name
		sendkeys(pom.getAppointmentService().getadfee(), "500");

		// des

		sendkeys(pom.getAppointmentService().getaddes(), "xyz");

		// save code
		Clickonelement(pom.getAppointmentService().getsaveco());

		// sele Billing

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getBillingsel());

		// crea invo

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getsupbill());

		// clos in

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclosenvo());

		// click Billing status
		selectone(pom.getAppointmentService().getClickBillingStatus(), "Paid In Full");

		// get text

		// Clickonelement(pom.getAppointmentService().getgetbal());

		gettext(pom.getAppointmentService().getgetbal());

		// click paym pro
		selecttwo(pom.getAppointmentService().getpaypro(), "2");

		// appoin tot

		Thread.sleep(5000);

		System.out.println("Appointment Balance");
		gettext(pom.getAppointmentService().getappbal());
		// ins bal

		System.out.println("Insurance Balance");
		gettext(pom.getAppointmentService().getinsbal());

		System.out.println("Payment Module Tested Successfully");

		//

	}

}
