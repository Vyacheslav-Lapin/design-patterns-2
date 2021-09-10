package com.xpinjection.patterns.visitor;

import lombok.ToString;

public class VisitorExample2 {

  public static void main(String... __) {
    Visit[] visits = {new D(), new E(), new F()};
    for (Visit visit : visits)
      visit.visit(new Visitor1());
  }
}

interface Visitor {
  void method(D visit);
  void method(E visit);
  void method(F visit);
}

class Visitor1 implements Visitor {

  public void method(D d) {
    System.out.println("d = " + d);
  }

  public void method(E e) {
    System.out.println("e = " + e);
  }

  public void method(F f) {
    System.out.println("f = " + f);
  }
}

interface Visit {
  void visit(Visitor visitor);
}

@ToString
class D implements Visit {

  @Override
  public void visit(Visitor visitor) {
    visitor.method(this);
  }
}

@ToString
class E implements Visit {

  @Override
  public void visit(Visitor visitor) {
    visitor.method(this);
  }
}

@ToString
class F implements Visit {

  @Override
  public void visit(Visitor visitor) {
    visitor.method(this);
  }
}
