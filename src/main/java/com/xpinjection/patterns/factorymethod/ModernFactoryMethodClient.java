package com.xpinjection.patterns.factorymethod;

import java.util.function.Function;

import com.xpinjection.patterns.factorymethod.canonical.Document;
import com.xpinjection.patterns.factorymethod.canonical.DocumentFactory;
import com.xpinjection.patterns.factorymethod.canonical.JsonDocument;
import lombok.SneakyThrows;
import lombok.Value;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * @author Alimenkou Mikalai
 */
public class ModernFactoryMethodClient {
  public static void main(String[] args) {
    DocumentFactory factory = JsonDocument::new;
    printUserDetails(factory.create("USER"));

    Function<String, Document> plainFactory = JsonDocument::new;

    printUserDetails(plainFactory.apply("USER"));

    //    var date = new Date(15);

    System.out.println(switch ("kuhsdfgdsf") {
      case "kjhsf" -> "1";
      case "kljhgdshfjdb" -> "2";
      case "kuhsdfgdsf" -> "3";
      default -> "0";
    });

    final String s = """
        jkasdkjhdafgdafg
        dsaf
        adsf
        asdf
        asdf
        sdf
        sdf
        `sef
        `sdf
        sd
        fdsf
        dsf
        sdf
        """;

    Object a = new A(5, "kjghsdf");
//    a.method();

//    if (a instanceof A aaa) {
//
//    }
  }

  private static void printUserDetails(Document document) {
    document.addField("name", "Mikalai");
    document.addField("surname", "Alimenkou");
    System.out.println(document);
  }
}

//record A(int x, String s) {
//
//  @SneakyThrows
//  public final @NotNull String method() {
//    return new String("jhgsdfgkjhdsf");
//  }
//
//
//}

@Value
@Accessors(fluent = true)
class A {

  int x;
  String s;

  @SneakyThrows
  public final @NotNull String method() {
    return "jhgsdfgkjhdsf";
  }
}
