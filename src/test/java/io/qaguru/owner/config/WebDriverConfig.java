package io.qaguru.owner.config;




public class WebDriverConfig {

    public Browser getBrowser() {
        return Browser.FIREFOX;
    }

    public String getBaseUrl() {
        return "https://github.com";
    }
}
