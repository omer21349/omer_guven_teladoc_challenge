package com.teladoc.webTables.step_definitions;

import com.teladoc.webTables.pages.WebTableAddUser;
import com.teladoc.webTables.pages.WebTableBasePage;
import com.teladoc.webTables.utilities.ConfigurationReader;
import com.teladoc.webTables.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WebTableStepDefinitions {
    WebTableAddUser webTableAddUser=new WebTableAddUser();
    WebTableBasePage webTableBasePage=new WebTableBasePage();
    @Given("User navigate to web table page")
    public void user_navigate_to_web_table_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
    }
    @When("User click the Add User button and open the user table")
    public void user_click_the_add_user_button_and_open_the_user_table() {
       webTableBasePage.addUser.click();
    }
    @When("User enters First Name {string}")
    public void user_enters_first_name(String firstname) {
        webTableAddUser.fistName.sendKeys(firstname);
    }
    @When("User enters Last Name {string}")
    public void user_enters_last_name(String lastName) {
       webTableAddUser.lastName.sendKeys(lastName);
    }
    @When("User enters User Name {string}")
    public void user_enters_user_name(String username) {
        webTableAddUser.userName.sendKeys(username);
    }

    @When("User enters Password {string}")
    public void user_enters_password(String password) {
       webTableAddUser.password.sendKeys(password);
    }
    @When("User select Customer {string}")
    public void user_select_customer(String companyName) {
       webTableAddUser.selectCompany(companyName);
    }
    @When("User select Role {string}")
    public void user_select_role_admin(String role) {
      webTableAddUser.selectRole(role);
    }
    @When("User enter E-mail {string}")
    public void user_enter_e_mail_aaa_hotmail_com(String email) {
       webTableAddUser.email.sendKeys(email);
    }
    @When("User enter Cell Phone {string}")
    public void user_enter_cell_phone(String cellPhone) {
        webTableAddUser.cellPhone.sendKeys(cellPhone);
    }
    @When("User click the save button")
    public void user_click_the_save_button() {
        webTableAddUser.save.click();
    }
    @Then("User validated new user {string} has been added to web table")
    public void user_validated_new_user_has_been_added_to_web_table(String username) {
        webTableBasePage.verifyUserDisplayed(username);
    }

    @When("User delete the username {string} from web tables")
    public void user_delete_the_username_from_web_tables(String username) {
        webTableBasePage.deleteUser(username);
    }
    @Then("User validate the username {string} has been deleted")
    public void user_validate_the_username_has_been_deleted(String username) {
        webTableBasePage.verifyUserDeleted(username);
    }
}
