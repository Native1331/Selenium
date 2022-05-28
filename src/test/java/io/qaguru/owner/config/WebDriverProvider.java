package io.qaguru.owner.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver>{

    private WebdriverConfig config;

    public  WebDriverProvider()  {

        this.config = ConfigFactory.create(WebdriverConfig.class,System.getProperties());
    }
    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
        }

        private WebDriver createWebDriver() {
            if (config.getBrowser().equals(Browser.CHROME)) {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            if (config.getBrowser().equals(Browser.FIREFOX)) {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            throw new RuntimeException("No such browser");


        }
}

