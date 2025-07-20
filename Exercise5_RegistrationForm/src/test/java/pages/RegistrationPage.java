package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By userEmail = By.id("userEmail");


    private By genderMale = By.xpath("//label[text()='Male']");

    private By userNumber = By.id("userNumber");
    private By submitButton = By.id("submit");


    private By confirmationPopup = By.id("example-modal-sizes-title-lg");

    public void navigate() {
        navigateTo("https://demoqa.com/automation-practice-form");
    }

    public void fillForm(String fname, String lname, String email, String phone) {
        type(firstName, fname);
        type(lastName, lname);
        type(userEmail, email);
        click(genderMale);
        type(userNumber, phone);
    }

    public void submitForm() {
        jsClick(submitButton);
    }

    public By getConfirmationPopup() {
        return confirmationPopup;
    }

}
