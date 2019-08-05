package com.test.qa.test;

import com.test.qa.pageobjects.pages.EmployeePage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EmployeeForRegression extends TestBase {



    @Test(priority = 3)
    public void addEmployeeWithoutName() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickCompanyMenu();
        EmployeePage.clickEmployee();
        softAssert.assertTrue(EmployeePage.isEmployeePageDisplayed(), "Employee Page is not Displayed");
        EmployeePage.clickAddEmployee();
        EmployeePage.setEmployeeId("EMP123");
        EmployeePage.setEmployeeFirstName("vjnfvnev");
        EmployeePage.setDesignation();
        EmployeePage.setEmail("jnne@nef.com");
        EmployeePage.clickSaveBtn();
        softAssert.assertEquals(EmployeePage.getNameValid(),"Please input employeeName!", "Employee Page is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority = 4)
    public void addEmployeeWithoutFname() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickCompanyMenu();
        EmployeePage.clickEmployee();
        softAssert.assertTrue(EmployeePage.isEmployeePageDisplayed(), "Employee Page is not Displayed");
        EmployeePage.clickAddEmployee();
        EmployeePage.setEmployeeId("EMP123");
        EmployeePage.setEmployeeName("bffnfnk");
        EmployeePage.setDesignation();
        EmployeePage.setEmail("jnne@nef.com");
        EmployeePage.clickSaveBtn();
        softAssert.assertEquals(EmployeePage.getFnameValid(),"Please input employeeFirstName!", "Employee Page is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority = 5)
    public void addEmployeeWithoutDesignation() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickCompanyMenu();
        EmployeePage.clickEmployee();
        softAssert.assertTrue(EmployeePage.isEmployeePageDisplayed(), "Employee Page is not Displayed");
        EmployeePage.clickAddEmployee();
        EmployeePage.setEmployeeId("EMP123");
        EmployeePage.setEmployeeName("bffnfnk");
        EmployeePage.setEmployeeFirstName("vjnfvnev");
        EmployeePage.setEmail("jnne@nef.com");
        EmployeePage.clickSaveBtn();
        softAssert.assertEquals(EmployeePage.getDesignationValid(),"Please select designation!", "Employee Page is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority = 6)
    public void addEmployeeWithoutEmail() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickCompanyMenu();
        EmployeePage.clickEmployee();
        softAssert.assertTrue(EmployeePage.isEmployeePageDisplayed(), "Employee Page is not Displayed");
        EmployeePage.clickAddEmployee();
        EmployeePage.setEmployeeId("EMP123");
        EmployeePage.setEmployeeName("bffnfnk");
        EmployeePage.setEmployeeFirstName("vjnfvnev");
        EmployeePage.setDesignation();
        EmployeePage.clickSaveBtn();
        softAssert.assertEquals(EmployeePage.getEmailValid(),"Please input employeeEmail!", "Employee Page is not Displayed");
        softAssert.assertAll();
    }

}
