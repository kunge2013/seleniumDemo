package com.selenium;

import org.openqa.selenium.WebDriver;

import com.selenium.qiandang.QianDanConfig;

public class WebDriverFactory {

	public WebDriver createWebDriver(QianDanConfig config) {
		System.setProperty(config.driverKey, config.driverPath);
		WebDriver driver = null;
		try {
			driver = (WebDriver) ClassLoader.getSystemClassLoader().loadClass(config.driverClass).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
}
