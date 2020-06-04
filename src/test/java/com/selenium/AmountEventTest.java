package com.selenium;

import org.junit.Test;

import com.selenium.event.AmountEvent;
import com.selenium.event.LoginEvent;
import com.selenium.listeners.AmountListener;
import com.selenium.listeners.LoginListener;

public class AmountEventTest {
	
	@Test
	public void test() {
		
		AmountListener event = new AmountListener(new AmountEvent());
		LoginListener login = new LoginListener(new LoginEvent());
		login.doEvent();
	}
}
