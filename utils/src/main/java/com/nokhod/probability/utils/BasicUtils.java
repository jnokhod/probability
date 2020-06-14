package com.nokhod.probability.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BasicUtils {

  public static int relativeFrequency(final int numberOfTrials, final int numberOfOccurences) {

    if (numberOfTrials <= 0) {
      throw new IllegalArgumentException("The number of trials cannot be zero or negative");
    }

    log.debug(
        "Calculating relative ferequency for {} of trials and {} of occurences",
        numberOfTrials,
        numberOfTrials);

    return numberOfOccurences / numberOfTrials;
  }
}
