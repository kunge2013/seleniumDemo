package com.selenium.event;

import com.selenium.dto.QuitBean;

public class QuitEvent extends ChainEvent<QuitBean, QuitBean.QuitDTO>{

	@Override
	public void doEvent() {
		if(hasNextEvent()) nextEvent.doEvent();
	}
	

}
