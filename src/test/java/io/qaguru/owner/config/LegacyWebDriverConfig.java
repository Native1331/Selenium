package io.qaguru.owner.config;


import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {
    public URL getRemoteUrl() {
        //Зачитывает данные из командной строки
        String remoteUrl = System.getProperty("remoteUrl");
        //Обрабатывает дефолтные значение
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "https://selenium:4444/wd/hub";
        }
        //конвертируем в возвращаемый тип
        try{
        return new URL(remoteUrl);
    } catch(MalformedURLException e) {
        throw new RuntimeException(e);
    }
}


    public Browser getBrowser() {
        //Зачитывает данные из командной строки
        String browser = System.getProperty("browser");
        //Обрабатывает дефолтные значение
        if (Objects.isNull(browser)){
            browser="CHROME";
        }
        //конвертируем в возвращаемый тип
        return  Browser.valueOf(browser);


    }

    public String getBaseUrl() {
        return "https://github.com";
    }
}
