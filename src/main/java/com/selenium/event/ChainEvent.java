package com.selenium.event;

import com.selenium.dto.EventBean;
import com.selenium.dto.EventBean.DataDTO;

/**
 * 事件处理
 * @author zc
 * @param <F>
 *
 */
public abstract class ChainEvent<CE extends EventBean<ced>, ced extends DataDTO> {
	
	protected ChainEvent nextEvent;
	
	protected CE ceb;
	
	
	public abstract void doEvent();
	
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
	
	protected boolean hasNextEvent() {
		return nextEvent == null;
	}
	
}
