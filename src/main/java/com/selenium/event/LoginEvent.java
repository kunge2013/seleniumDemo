package com.selenium.event;

import com.selenium.event.Event.DataDTO;
import com.selenium.event.LoginEvent.LoginDTO;

public class LoginEvent extends Event<LoginDTO>{

	public static class LoginDTO extends DataDTO {
		
		private String username;
		
		private String password;
		
		private String verifyCode;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getVerifyCode() {
			return verifyCode;
		}

		public void setVerifyCode(String verifyCode) {
			this.verifyCode = verifyCode;
		}
		
		
		
	}

	@Override
	public int initEventType() {
		// TODO Auto-generated method stub
		return 0;
	}
}
