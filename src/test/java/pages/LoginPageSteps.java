package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPageSteps {
    By homeLogo=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='path'][8]");
    By loginLogo=By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
    By loginHeader=By.cssSelector(".login-form__title");
    By emailButton=By.cssSelector("input[value='Email']");
    By phoneButton=By.cssSelector("input[value='Phone']");
    By emRadioText=By.cssSelector("label[class='login-form__radio-buttons--first-label'] span[class='login-form__radio-buttons--span']");
    By phRadioText=By.cssSelector("label[class='login-form__radio-buttons--second-label'] span[class='login-form__radio-buttons--span']");
    By emailPlace=By.cssSelector("input[placeholder='E-Posta Adresiniz']");
    By passwordPlace=By.cssSelector("input[placeholder='Şifreniz']");
    By phoneTextBox=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By loginButton=By.cssSelector("button[type='submit']");
    By emailError=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]");
    By phoneError=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]");
    By pswdError=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]");
    By falseEmailError=By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) " +
            "> div:nth-child(1) > form:nth-child(3) > div:nth-child(2) > div:nth-child(2)");
    By loginError=By.cssSelector(".login-form__header-errors--p");
    By passwordIcon=By.cssSelector(".login-form__show-password-icon");
    By rememberText=By.cssSelector("label[class='checkbox-input'] span");
    By forgotLink=By.cssSelector(".login-form__forgot-password-link");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    //Initialize driver
    public LoginPageSteps(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new ElementHelper(driver);
    }
    //Check home page
    public void checkHome(){
        elementHelper.checkElementVisible(homeLogo);
    }
    //Click login
    public void clickLogin(){
        elementHelper.click(loginLogo);
    }
    //Check login header
    public void checkLoginHeader(){
        String textHeader=elementHelper.getText(loginHeader);
        elementHelper.checkElementText(loginHeader,textHeader);
    }
    //Click email button
    public void clickEmailButton(String emButton){
        elementHelper.clickElementWithText(emailButton,emButton);
    }
    //Click phone button
    public void clickPhoneButton(String phButton){
        elementHelper.clickElementWithText(phoneButton,phButton);
    }
    //Check login text header
    public void checkLoginTextHeader(String Header){
        elementHelper.checkElementText(loginHeader,Header);
    }
    //Check email button
    public void checkEmailButton(String emailButton){
        elementHelper.checkElementText(emRadioText,emailButton);
    }
    //Check phone button
    public void checkPhoneButton(String phoneButton){
        elementHelper.checkElementText(phRadioText,phoneButton);
    }
    //Check email placeholder
    public void checkEmailPlaceholder(String emPlaceholder){
        elementHelper.checkElementText(emailPlace,emPlaceholder);
    }
    //Check password placeholder
    public void checkPasswordPlaceholder(String psPlaceholder){
        elementHelper.checkElementText(passwordPlace,psPlaceholder);
    }
    //Check password ıcon
    public void checkPasswordIcon(){
        elementHelper.checkElementVisible(passwordIcon);
    }
    //Check remember me radio button
    public void checkRememberBtn(String remember){
        elementHelper.checkElementText(rememberText,remember);
    }
    ////Check password forgot
    public void checkForgot(String forgot){
        elementHelper.checkElementText(forgotLink,forgot);
    }
    //Check login button
    public void checkLoginBtn(String login){
        elementHelper.checkElementText(loginButton,login);
    }
    //Check phone text box
    public void checkPhoneTextBox(){
        elementHelper.checkElementVisible(phoneTextBox);
    }
    //Click login button
    public void clickLoginButton(){
        elementHelper.click(loginButton);
    }
    //Check email empty message
    public void emailEmptyMessage(String mailEmptyMessage){
        elementHelper.checkElementText(emailError,mailEmptyMessage);
    }
    //Check phone empty message
    public void phoneEmptyMessage(String phoneEmptyMessage){
        elementHelper.checkElementText(phoneError,phoneEmptyMessage);
    }
    //Type e-mail
    public void typeMail(String email){
        elementHelper.sendKey(emailPlace,email);
    }
    //Check empty email message
    public void emailEmptyMessage(){
        elementHelper.checkElementVisible(emailError);
    }
    //Type password
    public void typePassword(String pswd){
        elementHelper.sendKey(passwordPlace,pswd);
    }
    //Check password empty message
    public void passwordEmptyMessage(){
        elementHelper.checkElementVisible(pswdError);
    }
    //Type mail and login
    public void typeMailAndLogin(String email){
        elementHelper.sendKey(emailPlace,email);
        elementHelper.click(loginButton);
    }
    //Check false mail message
    public void falseMailMessage(String error){
        elementHelper.checkElementText(falseEmailError,error);
    }
    //Type mail, password and login
    public void typeMailPasswordLogin(String email, String password){
        elementHelper.sendKey(emailPlace,email);
        elementHelper.sendKey(passwordPlace,password);
        elementHelper.click(loginButton);

    }
    //Check login error message
    public void loginErrorMessage(String logError){
        elementHelper.checkElementText(loginError,logError);
    }

}
