package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class EmployeePage extends PageBase {

    private static By employeeMenu = By.xpath("//a[text()=\"Employee\"]");
    private static By btnAdd = By.xpath("//*[@id=\"root\"]/div/section/section/main/div[2]/div[1]/div");
    private static By txtEmpId = By.id("employeeId");
    private static By txtEmpName = By.id("employeeName");
    private static By txtEmpFname = By.id("employeeFirstName");
    private static By txtEmpDesignation = By.id("gender");
    private static By txtEmpEmail = By.id("employeeEmail");
    private static By btnSave = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/div/button[2]");
    private static By idValidMsg = By.xpath("//div[text()=\"Please input employeeId!\"]");
    private static By nameValidMsg = By.xpath("//div[text()=\"Please input employeeName!\"]");

    private static By fnameValidMsg = By.xpath("//div[text()=\"Please input employeeFirstName!\"]");

    private static By designationValidMsg = By.xpath("//div[text()=\"Please select designation!\"]");

    private static By emailValidMsg = By.xpath("//div[text()=\"Please input employeeEmail!\"]");





    public static boolean isEmployeePageDisplayed() {
        staticWait(4);
        return getDriver().findElement(btnAdd).isDisplayed();
    }
    public static void clickEmployee(){
        implicitWait(5);
        getDriver().findElement(employeeMenu).click();
    }
    public static void clickAddEmployee(){
        implicitWait(5);
        getDriver().findElement(btnAdd).click();
    }
    public static void setEmployeeId(String id){
       implicitWait(5);
        getDriver().findElement(txtEmpId).sendKeys(id);
    }
    public static void setEmployeeName(String name){
        implicitWait(5);
        getDriver().findElement(txtEmpName).sendKeys(name);
    }
    public static void setEmployeeFirstName(String fname){
        implicitWait(5);
        getDriver().findElement(txtEmpFname).sendKeys(fname);
    }
    public static void setDesignation(){
//        implicitWait(5);
//        getDriver().findElement(txtEmpDesignation).sendKeys(designation);
        Actions type = new Actions(getDriver());
        type.moveToElement(getDriver().findElement(txtEmpDesignation)).click().build().perform();
        type.click(getDriver().findElement(By.xpath("//li[text()=\"user\"]"))).build().perform();

    }
    public static void setEmail(String email){
        implicitWait(5);
        getDriver().findElement(txtEmpEmail).sendKeys(email);
    }
    public static void clickSaveBtn(){
        implicitWait(5);
        getDriver().findElement(btnSave).click();
    }

    public static String getIdValid(){
        implicitWait(5);
        return getDriver().findElement(idValidMsg).getText();
    }
    public static String getNameValid(){
        implicitWait(5);
        return getDriver().findElement(nameValidMsg).getText();
    }
    public static String getFnameValid(){
        implicitWait(5);
        return getDriver().findElement(fnameValidMsg).getText();
    }
    public static String getDesignationValid(){
        implicitWait(5);
        return getDriver().findElement(designationValidMsg).getText();
    }
    public static String getEmailValid(){
        implicitWait(5);
        return getDriver().findElement(emailValidMsg).getText();
    }

}
