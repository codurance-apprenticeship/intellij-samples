package com.jetbrains.refactoring;

import org.jetbrains.annotations.NotNull;

public class ExtractDelegateDelegate {
  @NotNull
  static String[] getStrings(String hotKey) {
    String[] steps1 = new String[5];
    steps1[0] = "First select a block of code";
    steps1[1] = "Then press " + hotKey;
    steps1[2] = "Give the method a name";
    steps1[3] = "Assign it a visibility";
    steps1[4] = "Apply the refactoring";
    return steps1;
  }
}