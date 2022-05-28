package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebdriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://github.com")
    String getBaseUrl();

    @Key("getBrowser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key ("getRemoteUrl")
    @DefaultValue("http://localhost:4444/wd/hub")
    URL getRemoteUrl();
}
