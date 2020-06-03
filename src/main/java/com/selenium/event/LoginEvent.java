package com.selenium.event;

import com.selenium.dto.LoginBean;
import com.selenium.dto.LoginBean.LoginDTO;

public class LoginEvent extends BaseEvent<LoginBean, LoginDTO> {
		

	public LoginEvent(BaseEvent nextEvent, LoginBean ceb) {
		super(nextEvent, ceb);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(LoginBean ceb) {
		// TODO Auto-generated method stub
		
	}
}
