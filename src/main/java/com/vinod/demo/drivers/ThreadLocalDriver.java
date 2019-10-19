package com.vinod.demo.drivers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.openqa.selenium.WebDriver;

public class ThreadLocalDriver {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public ThreadLocalDriver() {
        Injector i = Guice.createInjector(new DriverModule());
        driver.set(i.getInstance(WebDriver.class));
    }

    public WebDriver getDriver() {
        return this.driver.get();
    }
}
