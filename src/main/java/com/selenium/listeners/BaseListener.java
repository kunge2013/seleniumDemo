package com.selenium.listeners;

import com.selenium.event.Event;
import com.selenium.event.Event.DataDTO;

/**
 * �¼�����
 * @author zc
 * @param <F>
 *
 */
public abstract class BaseListener<CE extends Event<ced>, ced extends DataDTO> {
	
	
	protected CE ceb;
	
	protected abstract void service(CE ceb);
	
	public void  doEvent() {
		System.out.println(this.getClass());
		service(ceb);
	}

	public BaseListener(CE ceb) {
		super();
		this.ceb = ceb;
	}
	
	
	
}
