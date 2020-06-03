package com.selenium.dto;

import com.selenium.dto.GoodAmountBean.GoodAmountDTO;

public class GoodAmountBean extends EventBean<GoodAmountDTO> {

	public static class GoodAmountDTO extends EventBean.DataDTO {
		
		private String amount;

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}
		
	}
}
