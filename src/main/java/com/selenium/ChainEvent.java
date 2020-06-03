package com.selenium;

public abstract class ChainEvent {
	
	private ChainEvent nextEvent;
	
	public abstract void doEvent();
	
}
