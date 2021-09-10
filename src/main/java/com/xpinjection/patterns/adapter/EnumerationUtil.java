package com.xpinjection.patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

import lombok.experimental.UtilityClass;

@UtilityClass
public class EnumerationUtil {

  public <E> Iterator<E> asIterator(Enumeration<E> self) {

    return new Iterator<>() {
      @Override public boolean hasNext() {
        return self.hasMoreElements();
      }
      @Override public E next() {
        return self.nextElement();
      }
    };
  }
}
