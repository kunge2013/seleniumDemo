package com.selenium.event;

import com.selenium.event.AmountEvent.GoodAmountDTO;

public class AmountEvent extends Event<GoodAmountDTO> {

	public static class GoodAmountDTO extends Event.DataDTO {
		
		private String amount;

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}
		
	}

	@Override
	public int initEventType() {
		return 0;
	}
}
