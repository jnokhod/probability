package com.nokhod.probability.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicUtilsTest {

  @Test
  public void testZeroAsNumberOfTrials() {

    Assertions.assertThrows(
        IllegalArgumentException.class,
        () -> {
          BasicUtils.relativeFrequency(0, 10);
        });
  }
}
