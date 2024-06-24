import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class RegisterTest extends BaseTest{
    MainPage mainPage;
    RegisterPage registerPage;

    @Test
    void userCanRegister () throws InterruptedException {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);

        registerPage.setClickMyAccount();
        registerPage.setClickRegister();

        Random randomGenerator = new Random();
        String userName = randomGenerator.nextInt(1000) + "useris";
        registerPage.inputFirstName(userName);
        Random randomGeneratorL = new Random();
        String lastName = randomGeneratorL.nextInt(1000) + "useriukas";
        registerPage.inputLastName(lastName);
        Random randomGeneratorE = new Random();
        String mail = randomGeneratorE.nextInt(1000) + "cern@gmail.com";
        registerPage.inputEmail(mail);
        Random randomGeneratorP = new Random();
        String password = randomGeneratorP.nextInt(1000) + "password";
        registerPage.inputPassword(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        registerPage.setPrivatePolicy();
        Thread.sleep(5000);
        registerPage.setContinue();
//Assertion

        String expectedMessage = "Congratulations! Your new account has been successfully created!";
        String actualMessage = registerPage.getAfterCreatedUserGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Succesfuly Created New Account in Automatic style!!!");
    }
}
