package com.selenium.event;

import com.selenium.event.Event.DataDTO;
/**
 * @author zc
 *
 * @param <T>
 */
public abstract class Event<T extends DataDTO> {

	private int eventtype = 0;
	
	public abstract int initEventType();
	
	public Event() {
		this.eventtype = initEventType();
	}
	
	
	public Event(int eventtype, T param) {
		this();
		this.eventtype = eventtype;
		this.param = param;
	}

	public int getEventtype() {
		return eventtype;
	}

	public void setEventtype(int eventtype) {
		this.eventtype = eventtype;
	}

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
