import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest extends BaseTest{
        MainPage mainPage;
        LoginPage loginPage;
        @Test
        void userCanLogin () {
            mainPage = new MainPage(driver);
            loginPage = new LoginPage(driver);

            loginPage.setClickMyAccount();
            loginPage.setClickLogin();
            loginPage.inputFirstName("useris@gmail.com");
            loginPage.inputPassword("useris123");
            loginPage.clickLogin();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            loginPage.setClickAccount();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            loginPage.setClickLogOut();

            String expectedMessage = "Account Logout";
            String actualMessage = loginPage.getAfterLogoutGettedText();
            Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
            System.out.println("Succesfuly Login & Logout!!!");
            loginPage.setAfterLogoutContinueButton();
        }
        }


