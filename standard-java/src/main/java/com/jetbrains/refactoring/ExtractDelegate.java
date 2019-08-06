package com.jetbrains.refactoring;


import org.jetbrains.annotations.NotNull;

public class ExtractDelegate {
  public static void main(String[] args) {
    String s = "How to extract a delegate: ";

    String hotKey = "unknown";

    String[] steps = getSteps(hotKey);

    System.out.println(s);


    for (String step : steps) {
      System.out.println(step);
    }
  }

  @NotNull
  private static String[] getSteps(String hotkey) {
    String[] steps = new String[5];
    steps[0] = "First select a block of code";
    steps[1] = "Then press " + hotkey;
    steps[2] = "Give the method a name";
    steps[3] = "Assign it a visibility";
    steps[4] = "Apply the refactoring";
    return steps;
  }
}
