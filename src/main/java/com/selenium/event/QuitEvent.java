package com.selenium.event;

import com.selenium.dto.AmountBean;
import com.selenium.dto.QuitBean;

public class QuitEvent extends BaseEvent<QuitBean, QuitBean.QuitDTO>{


	public QuitEvent(BaseEvent nextEvent, QuitBean ceb) {
		super(nextEvent, ceb);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(QuitBean ceb) {
		// TODO Auto-generated method stub
		
	}

}
