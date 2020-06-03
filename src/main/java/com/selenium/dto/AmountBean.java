package com.selenium.dto;

import com.selenium.dto.AmountBean.GoodAmountDTO;

public class AmountBean extends EventBean<GoodAmountDTO> {

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
