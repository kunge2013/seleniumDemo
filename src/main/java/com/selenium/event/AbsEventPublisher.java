package com.selenium.event;

import java.util.function.Consumer;

public abstract class AbsEventPublisher<T extends Event<Event.DataDTO>> implements EventPublisher<T> {

	public Consumer<T> listeners;

	public AbsEventPublisher() {
		// 处理事件
		listeners = (t) -> {
			publishEvent(t);
		};
	}

	@Override
	public void publishEvent(T event) {
		listeners.accept(event);
	}

}
