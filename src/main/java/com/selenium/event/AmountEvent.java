package com.selenium.event;

import com.selenium.dto.AmountBean;

public class AmountEvent extends BaseEvent<AmountBean, AmountBean.GoodAmountDTO> {

	public AmountEvent(BaseEvent nextEvent, AmountBean ceb) {
		super(nextEvent, ceb);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(AmountBean ceb) {
		// TODO Auto-generated method stub
		
	}

}
