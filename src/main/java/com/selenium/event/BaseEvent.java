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
		System.out.println(this.getClass());
		service(ceb);
		if(hasNextEvent()) nextEvent.doEvent();
	}
	
	public BaseEvent(BaseEvent nextEvent) {
		this.nextEvent = nextEvent;
	}

	public BaseEvent getNextEvent() {
		return nextEvent;
	}

	
	protected boolean hasNextEvent() {
		return nextEvent != null;
	}

	public BaseEvent(BaseEvent nextEvent, CE ceb) {
		super();
		this.nextEvent = nextEvent;
		this.ceb = ceb;
	}
	
}
