package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class, '9o-r')]/button[2]";
    public static final String XPATH_NEWACCOUNT = "//a[contains(@data-testid, 'open-registration-form-button')]";
    public static final String XPATH_DAY = "//select[contains(@id, 'day')]";
    public static final String XPATH_MONTH = "//select[contains(@id, 'month')]";
    public static final String XPATH_YEAR = "//select[contains(@id, 'year')]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_NEWACCOUNT)).click();

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_DAY)));
        Select selectMonth= new Select(driver.findElement(By.xpath(XPATH_MONTH)));
        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_YEAR)));
        selectDay.selectByIndex(12);
        selectMonth.selectByIndex(6);
        selectYear.selectByIndex(20);
    }
}