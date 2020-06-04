package com.selenium.event;

public interface EventPublisher<T> {

	default void publishEvent(T event) {
		
	}
	
}
