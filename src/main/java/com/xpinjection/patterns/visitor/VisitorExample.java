package com.xpinjection.patterns.visitor;

import lombok.ToString;

public class VisitorExample {

  public static void main(String... __) {
    new VisitorExample().method(new Object());
    new VisitorExample().method(new A());
    new VisitorExample().method(new B());
    new VisitorExample().method(new C());

    new VisitorExample().method(null);
  }

  public void method(Object o) {
    System.out.println("o = " + o);
  }

  public void method(A a) {
    System.out.println("a = " + a);
  }

  public void method(B b) {
    System.out.println("b = " + b);
  }

  public void method(C c) {
    System.out.println("c = " + c);
  }
}

@ToString
class A {
}

@ToString
class B extends A {
}

@ToString
class C extends B {

}
