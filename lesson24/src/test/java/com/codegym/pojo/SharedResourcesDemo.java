package com.codegym.pojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.ResourceLock;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ_WRITE;
import static org.junit.jupiter.api.parallel.Resources.SYSTEM_PROPERTIES;

/**
 * @author JC Liu
 * @date 2022/5/7$
 */
public class SharedResourcesDemo {

    private Properties backup;

    @BeforeEach
    void backup() {
        System.out.println("start");
        backup = new Properties();
        backup.putAll(System.getProperties());
    }

    @AfterEach
    void restore() {
        System.out.println("end");
        System.setProperties(backup);
    }

    @Test
    @ResourceLock(value = SYSTEM_PROPERTIES, mode = READ)
    void customPropertyIsNotSetByDefault() {
        System.out.println("customPropertyIsNotSetByDefault");
        assertNull(System.getProperty("my.prop"));
    }

    @Test
    @ResourceLock(value = SYSTEM_PROPERTIES, mode = READ_WRITE)
    void canSetCustomPropertyToFoo() {
        System.out.println("canSetCustomPropertyToFoo");
        System.setProperty("my.prop", "foo");
        assertEquals("foo", System.getProperty("my.prop"));
    }

    @Test
    @ResourceLock(value = SYSTEM_PROPERTIES, mode = READ_WRITE)
    void canSetCustomPropertyToBar() {
        System.out.println("canSetCustomPropertyToBar");
        System.setProperty("my.prop", "bar");
        assertEquals("bar", System.getProperty("my.prop"));
    }
}
