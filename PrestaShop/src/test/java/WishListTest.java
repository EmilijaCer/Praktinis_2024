import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class WishListTest extends BaseTest{
    LoginPage loginPage;
    ProductPage productPage;
    SearchPage searchPage;
    WishListPage wishListPage;
    @Test
    void addToWishList() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);
        wishListPage = new WishListPage(driver);

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
        wishListPage.setToAddToWishList();

        String expectedMessage = "Success: You have added MacBook to your wish list!";
        String actualMessage = wishListPage.getAfterToAddToWishListGetText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Succesfuly Updated order list!!!");
    }
    @Test
    void viewWishList() {
        loginPage = new LoginPage(driver);
        wishListPage = new WishListPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wishListPage.setToCheckWishList();

        String expectedMessage = "My Wishlist";
        String actualMessage = wishListPage.getAfterToAddToWishListGetText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Succesfuly view order list!!!");
    }
}
