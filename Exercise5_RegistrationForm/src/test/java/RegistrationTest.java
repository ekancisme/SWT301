import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    @Test
    @DisplayName("Test form đăng ký thành công")
    void testValidRegistration() {
        RegistrationPage page = new RegistrationPage(driver);
        page.navigate();
        page.fillForm("Nguyen", "Cuong", "cuong@example.com", "0912345678");
        page.submitForm();
        // Đình nghĩa assert tuý theo popup/response sau khi submit
    }

    @Test
    @DisplayName("Test đăng ký lỗi do thiếu số điện thoại")
    void testMissingPhone() {
        RegistrationPage page = new RegistrationPage(driver);
        page.navigate();
        page.fillForm("Nguyen", "Cuong", "cuong@example.com", "");
        page.submitForm();
        // Đình nghĩa assert để kiểm tra báo lỗi
    }
}