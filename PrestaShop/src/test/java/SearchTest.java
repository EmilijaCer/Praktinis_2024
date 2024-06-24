import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseTest{
    LoginPage loginPage;
    SearchPage searchPage;
    @Test
    void userCanSearch(){
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        searchPage.setClickSearch();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        searchPage.setSearchMacComputer("Mac");
        searchPage.setClickSearchButton();

        String expectedMessage = "Search - Mac";
        String actualMessage = searchPage.getAfterSearchGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

    }
}
