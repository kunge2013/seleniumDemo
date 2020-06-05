package com.selenium.listeners;

import org.openqa.selenium.WebDriver;

import com.selenium.event.Event;
import com.selenium.event.Event.DataDTO;

/**
 * @author zc
 * @param <F>
 *
 */
public abstract class BaseListener<CE extends Event<ced>, ced extends DataDTO> {
	
	
	protected CE ceb;
	
	WebDriver driver;
	
	protected abstract void service(CE ceb);
	
	public void  doEvent() {
		System.out.println(this.getClass());
		service(ceb);
	}
	
	public BaseListener(CE ceb, WebDriver driver) {
		super();
		this.ceb = ceb;
		this.driver = driver;
	}

	
	
	
}
