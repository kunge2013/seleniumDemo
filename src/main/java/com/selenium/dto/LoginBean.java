package com.selenium.dto;

import com.selenium.dto.EventBean.DataDTO;
import com.selenium.dto.LoginBean.LoginDTO;

public class LoginBean extends EventBean<LoginDTO>{

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
}
