package com.selenium.listeners;

import org.openqa.selenium.WebDriver;

import com.selenium.event.LoginEvent;
import com.selenium.event.LoginEvent.LoginDTO;

public class LoginListener extends BaseListener<LoginEvent, LoginDTO> {
		

	public LoginListener(LoginEvent ceb, WebDriver driver) {
		super(ceb, driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(LoginEvent ceb) {
		// TODO Auto-generated method stub
		
	}
}
