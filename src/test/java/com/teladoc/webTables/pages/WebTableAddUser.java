package com.teladoc.webTables.pages;

import com.teladoc.webTables.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableAddUser {

    public WebTableAddUser(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "FirstName")
    public WebElement fistName;

    @FindBy(name = "LastName")
    public WebElement lastName;

    @FindBy(name = "UserName")
    public WebElement userName;

    @FindBy(name = "Password")
    public WebElement password;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> companyNames;

    @FindBy(name ="RoleId" )
    public WebElement allRoles;

    @FindBy(name = "Email")
    public WebElement email;

    @FindBy(name = "Mobilephone")
    public WebElement cellPhone;

    @FindBy(css = "button[ng-click='save(user)']")
    public WebElement save;

    @FindBy(css = "button[ng-click='close()']")
    public WebElement close;

    public void selectRole(String roleName){
        Select select=new Select(allRoles);
        select.selectByVisibleText(roleName);
    }

    public void selectCompany(String companyName){
        if(companyName.equalsIgnoreCase("Company AAA")) companyNames.get(0).click();
        else if(companyName.equalsIgnoreCase("Company BBB")) companyNames.get(1).click();
    }



}
