package com.xpinjection.patterns.observer;

import java.util.function.Consumer;

import com.xpinjection.patterns.observer.canonical.Event;

/**
 * @author Alimenkou Mikalai
 */
public interface ModernObserver {
  void addListener(Consumer<Event> listener);
}
