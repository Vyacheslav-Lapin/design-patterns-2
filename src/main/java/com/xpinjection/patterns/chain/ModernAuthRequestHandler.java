package com.xpinjection.patterns.chain;

import java.util.function.Consumer;

import com.xpinjection.patterns.chain.canonical.Request;

/**
 * @author Alimenkou Mikalai
 */
public class ModernAuthRequestHandler implements Consumer<Request> {
  private static final ThreadLocal<Long> currentUser = new ThreadLocal<>();

  public static Long getCurrentUser() {
    return currentUser.get();
  }

  @Override
  public void accept(Request request) {
    currentUser.set(request.getUserId());
    System.out.println("Current user is set to: " + request.getUserId());
    request.addParam("AUTH_PASSED", "TRUE");
  }
}
