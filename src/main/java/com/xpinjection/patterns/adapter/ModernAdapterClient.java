package com.xpinjection.patterns.adapter;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import com.xpinjection.patterns.adapter.canonical.CharCounterTask;
import lombok.experimental.ExtensionMethod;
import lombok.val;

/**
 * @author Alimenkou Mikalai
 */
@ExtensionMethod(Arrays.class)
public class ModernAdapterClient {
  public static void main(String[] args) throws InterruptedException {
    val executor = Executors.newFixedThreadPool(3);

    val counter = new AtomicInteger();
    "af, bdf, c".split(", ").stream()
        .map(s -> new CharCounterTask(s, counter))
        .forEach(executor::execute);

    executor.shutdown();
    executor.awaitTermination(1, TimeUnit.SECONDS);
    System.out.println("Total count: " + counter.get());
  }
}
