package com.selenium.listeners;

import org.openqa.selenium.WebDriver;

import com.selenium.event.QuitEvent;

public class QuitListener extends BaseListener<QuitEvent, QuitEvent.QuitDTO>{

	public QuitListener(QuitEvent ceb, WebDriver driver) {
		super(ceb, driver);
	}

	@Override
	protected void service(QuitEvent ceb) {
		// TODO Auto-generated method stub
		
	}

}
