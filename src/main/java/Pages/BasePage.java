package Pages;


public class BasePage {

    public void getSystemProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\Progs\\chromedriver_win32\\chromedriver.exe");
        //Doesn't matter chrome or Chrome as this is case insensitive.
        System.setProperty("selenide.browser", "Chrome");
        System.setProperty("selenide.timeouts", "6000");
    }
}
