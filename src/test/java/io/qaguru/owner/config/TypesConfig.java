package io.qaguru.owner.config;

import org.aeonbits.owner.Config;
import java.net.URL;

public interface TypesConfig extends Config {
    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("enum")
    Enum getEnum();

    @Key("url")
    URL getUrl();

    boolean getURL();
}

