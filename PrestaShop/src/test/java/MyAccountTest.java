import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyAccountTest extends BaseTest {
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    MyAdressPage myAdressPage;
    MyOrdersPage myOrdersPage;
    ProductPage productPage;
    SearchPage searchPage;
    WishListPage wishListPage;


    @Test
    void userChangeName() {
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //pakeisti varda
        myAccountPage.setEditAccountInformation();
        myAccountPage.setEditFirstName();
        myAccountPage.setClearFirstName();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        myAccountPage.setEditedFirstName("Useris7");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        myAccountPage.setChangedFirstName();
        //assertion name update
        String expectedMessage = "Success: Your account has been successfully updated.";
        String actualMessage = myAccountPage.getAfterChangeFirtName();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Succesfuly Updated New Name in Automatic style!!!");
    }

    @Test
    void modifyAdress() {
        loginPage = new LoginPage(driver);
        myAdressPage = new MyAdressPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //ivesti adresa
        myAdressPage.setModifiedAdress();
        myAdressPage.setNewAdress();
        myAdressPage.insertFirstName("Useris");
        myAdressPage.insertLastName("Userisiauskas");
        myAdressPage.insertAdress("Gatve, 55-21");
        myAdressPage.insertCity("Vilnius");
        myAdressPage.insertPostCode("1234");
        myAdressPage.chooseCountry("Lithuania");
        myAdressPage.chooseRegion("Vilnius");
        myAdressPage.chooseDefaultAddress();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        myAdressPage.setContinueToSaveAddress();

        String expectedMessage = "Address Book Entries";
        String actualMessage = myAdressPage.getTextAfterInsertAdressInformation();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Succesfuly Address!!!");
    }
}