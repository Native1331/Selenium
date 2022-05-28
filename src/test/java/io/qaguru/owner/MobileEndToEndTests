package io.qaguru.owner;

import io.qaguru.owner.config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileEndToEndTest {

    @Test
    public void testAndroid() {
        // проходит в случае запуска из консоли
        // ./gradlew clean test --tests MobileEndToEndTest -Ddevice=pixel
        MobileConfig config = ConfigFactory
                .create(MobileConfig.class, System.getProperties());

        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("27.0");
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
    }

    @Test
    public void testIos() {
        // проходит в случае запуска из консоли
        // ./gradlew clean test --tests MobileEndToEndTest -Ddevice=iphone12
        MobileConfig config = ConfigFactory
                .create(MobileConfig.class, System.getProperties());

        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("14.0");
        assertThat(config.deviceName()).isEqualTo("iPhone 12 Pro Max Ulra High");
    }
