package com.selenium.event;

import com.selenium.dto.EventBean;
import com.selenium.dto.EventBean.DataDTO;

/**
 * 事件处理
 * @author zc
 * @param <F>
 *
 */
public abstract class ChainEvent<T extends EventBean<F>, F extends DataDTO> {
	
	private ChainEvent nextEvent;
	
	public abstract void doEvent(EventBean<F> event);
	
	public ChainEvent(ChainEvent nextEvent) {
		this.nextEvent = nextEvent;
	}
	
	public ChainEvent() {
		// TODO Auto-generated constructor stub
	}

	public ChainEvent getNextEvent() {
		return nextEvent;
	}

	public void setNextEvent(ChainEvent nextEvent) {
		this.nextEvent = nextEvent;
	}
	
	
}
