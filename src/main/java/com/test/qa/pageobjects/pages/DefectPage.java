package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import java.io.File;


public class DefectPage extends PageBase {
    private static final Logger logger = Logger.getLogger(DefectPage.class);

    private static By welcomeDefect = By.xpath("//span[@class='ant-page-header-title-view-title']");
    private static By defectTable = By.xpath("//div[@class='ant-table-wrapper']");
    private static By defectTab = By.xpath("//*[@id=\"root\"]/div/section/aside/div/ul/li[8]/div");
    private static By subDefectTab = By.xpath("//*[@id=\"sub3$Menu\"]/li/a");
    private static By addDefectButton = By.xpath("//*[@id=\"root\"]/div/section/section/main/div[2]/div[2]/button");
    private static By defectId = By.name("defectId");
    private static By moduleId = By.name("moduleId");
    private static By projectId = By.name("projectId");
    private static By defectDescription = By.name("defectDescription");
    private static By stepstoRecerate = By.name("stepsToRecreate");
    //private static By typeDropDown = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div[1]/div/div[2]/div/span/div/div/span");
    private static By severityDropDown = By.xpath("(//div[@class='ant-select-selection__rendered'])[11]");
    private static By priorityDropDown = By.xpath("(//div[@class='ant-select-selection__rendered'])[12]");
    private static By foundinDropDown = By.xpath("(//div[@class='ant-select-selection__rendered'])[13]");
    private static By assignedDropDown = By.xpath("(//div[@class='ant-select-selection__rendered'])[14]");
    private static By comment = By.name("comments");
    private static By uploadButton = By.xpath("//button[@class='ant-btn']");
    private static By okButton = By.xpath("(//button[@class='ant-btn ant-btn-primary'])[2]");

    public static boolean isDefectPageDisplayed() {
        return getDriver().findElement(welcomeDefect).isDisplayed();
    }

    public static boolean isDefectTableDisplayed() {
        return getDriver().findElement(defectTable).isDisplayed();
    }

    public static void isAddDefectButton() {
        getDriver().findElement(addDefectButton).click();
    }

    public static void clicDefectTab() {
        getDriver().findElement(defectTab).click();
    }

    public static void clickSubDefectTab() {
        getDriver().findElement(subDefectTab).click();
    }

    public static void setDefectId(String defectid) {
        getDriver().findElement(defectId).sendKeys(defectid);
    }

    public static void setModuleId(String moduleid) {
        getDriver().findElement(moduleId).sendKeys(moduleid);
    }

    public static void setProjectId(String projectid) {
        getDriver().findElement(projectId).sendKeys(projectid);
    }

    public static void setDescription(String description) {
        getDriver().findElement(defectDescription).sendKeys(description);
    }

    public static void setStepsToRecreate(String steps) {
        getDriver().findElement(stepstoRecerate).sendKeys(steps);
    }

    public static void setTypeDropDown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div[1]/div/div[2]/div/span/div/div/div"))).click().build().perform();
        builder.click(getDriver().findElement(By.xpath("(//*[@role='option'])[1]"))).build().perform();
    }

    public static void setSeverityDropDown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div[2]/div/div[2]/div/span/div/div/div"))).click().build().perform();
        builder.click(getDriver().findElement(By.xpath("(//*[@role ='option'])[7]"))).build().perform();
    }

    public static void setPriorityDropDown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div[3]/div/div[2]/div/span/div/div/div"))).click().build().perform();
        builder.click(getDriver().findElement(By.xpath("(//*[@role ='option'])[10]"))).build().perform();
    }

    public static void setFoundinDropDown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[6]/div[1]/div/div[2]/div/span/div/div/div"))).click().build().perform();
        builder.click(getDriver().findElement(By.xpath("(//*[@role ='option'])[13]"))).build().perform();
    }

    public static void setAssignedDropDown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[6]/div[2]/div/div[2]/div/span/div/div/div"))).click().build().perform();
        builder.click(getDriver().findElement(By.xpath("(//*[@role ='option'])[14]"))).build().perform();
    }

    public static void setComment(String comments) {
        getDriver().findElement(comment).sendKeys(comments);
    }

    public static void uploadFile(String filename) {
        getDriver().findElement(uploadButton).sendKeys(PageBase.uploadFilepath + File.separator + filename);
    }
    public static void clickOkButton(){
        getDriver().findElement(okButton).click();
    }
}
