import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BuyProductPageTest extends BaseTest{
    ProductPage productPage;
    LoginPage loginPage;
    SearchPage searchPage;
    MyOrdersPage myOrdersPage;

    @Test
    void userChooseProductToBuy() throws InterruptedException {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        searchPage.setClickSearch();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        searchPage.setSearchMacComputer("MacBook");
        searchPage.setClickSearchButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        productPage.setProductToChart();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        productPage.setToSeeShopingCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        productPage.setToCheckOut();

//        String expectedMessage = "Address Book Entries";
//        String actualMessage = productPage.getTextAfterInsertAdressInformation();
//        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
//        System.out.println("Succesfuly Address!!!");
    }
         @Test
        void viewOderHistory() {
        loginPage = new LoginPage(driver);
        myOrdersPage = new MyOrdersPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        myOrdersPage.getOrderHistory();

        String expectedMessage = "Orders";
        String actualMessage = myOrdersPage.getAfterOrders();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Succesfuly view order list!!!");
    }
}
