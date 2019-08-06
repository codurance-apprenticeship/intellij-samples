package com.jetbrains.refactoring;


public class ExtractDelegate {
  public static void main(String[] args) {
    String s = "How to extract a delegate: ";

    String hotKey = "unknown";

    String[] steps = ExtractDelegateDelegate.getStrings(hotKey);

    System.out.println(s);


    for (String step : steps) {
      System.out.println(step);
    }
  }

}
