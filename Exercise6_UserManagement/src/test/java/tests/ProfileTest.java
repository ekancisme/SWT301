package tests;

import org.junit.jupiter.api.Test;
import pages.ProfilePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProfileTest extends BaseTest {
    @Test
    void testUpdateProfileName() {
        ProfilePage page = new ProfilePage(driver);
        page.navigate();
        page.updateName("Cuong Le");
        assertTrue(page.isProfileUpdated());
    }

    @Test
    void testUploadAvatar() {
        ProfilePage page = new ProfilePage(driver);
        page.navigate();
        page.uploadAvatar("D:\\SWT\\Exercise6_UserManagement\\IMG_7689.JPEG");
        assertTrue(page.isProfileUpdated());
    }
}
