package tests;

import org.junit.jupiter.api.Test;
import pages.RegisterPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterTest extends BaseTest {
    @Test
    void testRegisterValidUser() {
        RegisterPage page = new RegisterPage(driver);
        page.navigate();
        page.register("cuong123", "cuong@gmail.com", "12345678");
        assertTrue(page.isSuccessDisplayed());
    }
}
