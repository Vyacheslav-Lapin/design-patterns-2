package com.xpinjection.patterns.observer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

import com.xpinjection.patterns.observer.canonical.Event;

/**
 * @author Alimenkou Mikalai
 */
public class ModernTimeServer implements ModernObserver {
  private static final String TIME_FORMAT = "HH:mm:ss";

  private final Queue<Consumer<Event>> listeners = new ConcurrentLinkedQueue<>();

  @Override
  public void addListener(Consumer<Event> listener) {
    listeners.add(listener);
  }

  public void reportTime() {
    Event event = new Event(new SimpleDateFormat(TIME_FORMAT).format(new Date()));
    listeners.forEach(listener -> listener.accept(event));
  }
}
