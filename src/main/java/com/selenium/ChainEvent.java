package com.selenium;
/**
 * 事件处理
 * @author zc
 *
 */
public abstract class ChainEvent {
	
	private ChainEvent nextEvent;
	
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
	
	
}
