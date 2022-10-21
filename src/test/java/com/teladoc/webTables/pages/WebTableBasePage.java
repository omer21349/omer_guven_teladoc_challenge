package com.teladoc.webTables.pages;

import com.teladoc.webTables.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class WebTableBasePage {

    public WebTableBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButtonForDelete;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButtonForDelete;

    @FindBy(xpath = "//button[@type='add']")
    public WebElement addUser;



    public void deleteUser(String username){
        Driver.getDriver().findElement(By.xpath("//table/tbody/tr//td[.='"+username+"']/../td[11]//i[@ng-class='iconClass']")).click();
        okButtonForDelete.click();
    }

    public void verifyUserDisplayed(String username){
       try {
           WebElement element= Driver.getDriver().findElement(By.xpath("//table/tbody/tr//td[text()='"+username+"']"));
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("User name not found: "+username);
        }
    }

    public void verifyUserDeleted(String username) {
        By by=By.xpath("//table/tbody/tr//td[text()='"+username+"']");
        try {
            Assert.assertFalse("Element "+username+" should not be in the table: "+ by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

}
