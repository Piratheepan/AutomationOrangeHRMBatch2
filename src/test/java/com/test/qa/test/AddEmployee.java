package com.test.qa.test;

import com.test.qa.pageobjects.pages.EmployeePage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddEmployee extends TestBase {


    @Test(groups  ="REGRESSION",priority = 1)
    public void addEmployee() {
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
        EmployeePage.setEmail("jnne@nef.com");
        EmployeePage.clickSaveBtn();
        softAssert.assertAll();
    }
    @Test(groups  ="REGRESSION",priority = 2)
    public void addEmployeeWithoutId() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickCompanyMenu();
        EmployeePage.clickEmployee();
        softAssert.assertTrue(EmployeePage.isEmployeePageDisplayed(), "Employee Page is not Displayed");
        EmployeePage.clickAddEmployee();
        EmployeePage.setEmployeeName("bffnfnk");
        EmployeePage.setEmployeeFirstName("vjnfvnev");
        EmployeePage.setDesignation();
        EmployeePage.setEmail("jnne@nef.com");
        EmployeePage.clickSaveBtn();
        softAssert.assertEquals(EmployeePage.getIdValid(),"Please input employeeId!", "Employee Page is not Displayed");
        softAssert.assertAll();
    }

}
