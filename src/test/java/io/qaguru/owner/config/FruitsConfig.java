package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {
    @Key("array")
    String[] getFruitsArray();

    @Key("list")
    List<String> getFruitsList();

    @Key("default")
    @DefaultValue("apple,banana")
    List<String> getFruitsListDefault();

    @Key("separator")
    @Separator(";")
    List<String> getFruitsListSeparator();
}
