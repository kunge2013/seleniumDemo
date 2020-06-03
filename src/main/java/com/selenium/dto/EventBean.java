package com.selenium.dto;

import com.selenium.dto.EventBean.DataDTO;
/**
 * 基础事件处理类
 * @author zc
 *
 * @param <T>
 */
public class EventBean<T extends DataDTO> {

	private T param;
	
	public T getParam() {
		return param;
	}

	public void setParam(T param) {
		this.param = param;
	}

	public static class DataDTO {
		
	}
}
