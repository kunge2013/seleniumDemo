package com.selenium;

import org.junit.Test;

import com.selenium.dto.AmountBean;
import com.selenium.dto.LoginBean;
import com.selenium.event.AmountEvent;
import com.selenium.event.LoginEvent;

public class AmountEventTest {
	
	@Test
	public void test() {
		
		AmountEvent event = new AmountEvent(null, new AmountBean());
		LoginEvent login = new LoginEvent(event, new LoginBean());
		login.doEvent();
	}
}
