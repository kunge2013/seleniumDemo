package com.selenium.event;

import com.selenium.dto.EventBean;
import com.selenium.dto.EventBean.DataDTO;

/**
 * 事件处理
 * @author zc
 * @param <F>
 *
 */
public abstract class BaseEvent<CE extends EventBean<ced>, ced extends DataDTO> {
	
	protected BaseEvent nextEvent;
	
	protected CE ceb;
	
	protected abstract void service(CE ceb);
	
	public void  doEvent() {
		service(ceb);
		if(hasNextEvent()) nextEvent.doEvent();
	}
	
	public BaseEvent(BaseEvent nextEvent) {
		this.nextEvent = nextEvent;
	}
	
	public BaseEvent() {
		// TODO Auto-generated constructor stub
	}

	public BaseEvent getNextEvent() {
		return nextEvent;
	}

	public void setNextEvent(BaseEvent nextEvent) {
		this.nextEvent = nextEvent;
	}
	
	protected boolean hasNextEvent() {
		return nextEvent == null;
	}
	
}
