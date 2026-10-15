package Tasks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTasks {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTasks (WebDriver driver){

        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }
    public void efetuarLogin(){
        loginPage.getUserNameInput().sendKeys("standard_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }


}



