package com.xpinjection.patterns.builder;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

/**
 * @author Alimenkou Mikalai
 */
@Builder
@Getter
public class LombokCluster {
  @Singular
  private List<String> hosts;
  private int port;
  private int retryAttempts;
  private boolean metricsEnabled;
}
