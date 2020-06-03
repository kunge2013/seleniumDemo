package com.selenium.event;

import com.selenium.dto.EventBean;
import com.selenium.dto.LoginBean;
import com.selenium.dto.LoginBean.LoginDTO;

public class LoginEvent extends ChainEvent<LoginBean, LoginDTO> {
	
	@Override
	public void doEvent(EventBean<LoginDTO> event) {
		// TODO Auto-generated method stub
		
	}
	
}
