package com.selenium.event;

import com.selenium.event.QuitEvent.QuitDTO;

public class QuitEvent extends Event<QuitDTO>{

	public static class QuitDTO extends Event.DataDTO {
		
	}

	@Override
	public int initEventType() {
		// TODO Auto-generated method stub
		return 0;
	}
}
