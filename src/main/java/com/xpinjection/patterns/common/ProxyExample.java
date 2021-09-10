package com.xpinjection.patterns.common;

import lombok.RequiredArgsConstructor;

public class ProxyExample {
  public static void main(String... __) {
    A a = new AProxy(new AImpl());
    System.out.println("a.method(5) = " + a.method(5));
  }
}

interface A {
  String method(int x);
}

class AImpl implements A {

  @Override
  public String method(int x) {
    return "" + x;
  }
}

@RequiredArgsConstructor
class AProxy implements A {

  final A a;

  @Override
  public String method(int x) {
    System.out.println("Нас вызвали!");
    return a.method(x);
  }
}
