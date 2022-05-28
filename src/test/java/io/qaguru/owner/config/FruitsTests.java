package io.qaguru.owner.config;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTests {
    @Test
    public void testArray() {
        System.setProperty("array", "apple,banana,orange");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray())
                .containsExactly("apple", "banana", "orange");
    }

    @Test
    public void testList() {
        System.setProperty("list", "apple,banana,orange");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList())
                .containsExactly("apple", "banana", "orange");
    }

    @Test
    public void testDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListDefault())
                .containsExactly("apple", "banana");
    }

    @Test
    public void testSeparator() {
        System.setProperty("separator", "apple;banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListSeparator())
                .containsExactly("apple", "banana");
    }
}

