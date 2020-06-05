package com.selenium.listeners;

import org.openqa.selenium.WebDriver;

import com.selenium.event.AmountEvent;

public class AmountListener extends BaseListener<AmountEvent, AmountEvent.GoodAmountDTO> {


	public AmountListener(AmountEvent ceb, WebDriver driver) {
		super(ceb, driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(AmountEvent ceb) {
		// TODO Auto-generated method stub
		
	}

}
