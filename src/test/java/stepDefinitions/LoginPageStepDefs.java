package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageSteps;
import util.DriverFactory;

public class LoginPageStepDefs {
    LoginPageSteps logPage=new LoginPageSteps(DriverFactory.getDriver());

    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {
        logPage.checkHome(); //Check home page
    }

    @When("click {string} card in the top right")
    public void clickCardInTheTopRight(String card) {
        logPage.clickLogin(); //Click login logo on the right
    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        logPage.checkLoginHeader(); //Check login page header
    }

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        logPage.checkLoginHeader(); //Check login page header
    }

    @When("click {string} radio button")
    public void clickEmailRadioButton(String mailButton) {
        logPage.clickEmailButton(mailButton); //Click email radio button
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String Header) {
        logPage.checkLoginTextHeader(Header); //Check header title
    }

    @Then("should see {string} radio button")
    public void shouldSeeEmailRadioButton(String emailButton) {
        logPage.checkEmailButton(emailButton); //Check email radio button
    }

    @Then("should see {string} radio button !")
    public void shouldSeePhoneRadioButton(String phoneButton) {
        logPage.checkPhoneButton(phoneButton); //Check phone radio button
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String email) {
        logPage.checkEmailPlaceholder(email); //Check email placeholder
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String pswd) {
        logPage.checkPasswordPlaceholder(pswd); //Check password placeholder
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        logPage.checkPasswordIcon(); //Check password ıcon
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String remember) {
        logPage.checkRememberBtn(remember); //Check remember me button
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String forgot) {
        logPage.checkForgot(forgot); //Check password forgot link
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String loginBtn) {
        logPage.checkLoginBtn(loginBtn); //Check login button
    }

    @When("click {string} radio button !")
    public void clickPhoneRadioButton(String phoneButton) {
        logPage.clickPhoneButton(phoneButton); //Click phone button
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        logPage.checkPhoneTextBox(); //Check phone text box
    }

    @When("click login button")
    public void clickLoginButton() {
        logPage.clickLoginButton(); //Click login button
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String emailErr) {
        logPage.emailEmptyMessage(emailErr);
        //Check email empty message
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String pswdEmptyMsg) {
        logPage.phoneEmptyMessage(pswdEmptyMsg);
        //Check phone empty message
    }

    @When("type Email {string}")
    public void typeEmail(String mail) {
        logPage.typeMail(mail);
        //Type email
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        logPage.emailEmptyMessage();
        //Check email empty or not
    }

    @When("type Password {string}")
    public void typePassword(String pswd) {
        logPage.typePassword(pswd);
        //Type password
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        logPage.passwordEmptyMessage();
        //Check password empty message
    }
    //Type mail and login
    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String mail) {
        logPage.typeMailAndLogin(mail);
    }
    //Check email false message
    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String error) {
        logPage.falseMailMessage(error);
    }
    //Type mail,password and login
    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String mail, String pswd) {
        logPage.typeMailPasswordLogin(mail,pswd);
    }
    //Check login error message
    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String err) {
        logPage.loginErrorMessage(err);
    }

}
