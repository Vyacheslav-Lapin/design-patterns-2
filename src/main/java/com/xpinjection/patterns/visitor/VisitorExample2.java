package com.xpinjection.patterns.visitor;

import lombok.ToString;
import org.jetbrains.annotations.NotNull;

public class VisitorExample2 {

  public static void main(String... __) {
    Element[] visits = {new G()}; // new D(), new E(), new F(),
    for (Element visit : visits)
      visit.accept(new Visitor1());
  }
}

interface Visitor {
  void method(D visit);
  void method(E visit);
  void method(F visit);
  default void method(G visit) {
    method((F) visit);
  }
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

  public void method(G g) {
    System.out.println("g = " + g);
  }
}

sealed interface Element permits D, E, F {
  void accept(Visitor visitor);
}

@ToString
final class D implements Element {

  @Override
  public void accept(@NotNull Visitor visitor) {
    visitor.method(this);
  }
}

@ToString
final class E implements Element {

  @Override
  public void accept(@NotNull Visitor visitor) {
    visitor.method(this);
  }
}

@ToString
sealed class F implements Element permits G {

  @Override
  public void accept(@NotNull Visitor visitor) {
    visitor.method(this);
  }
}

@ToString
final class G extends F {
  @Override
  public void accept(@NotNull Visitor visitor) {
    visitor.method(this);
  }
}
