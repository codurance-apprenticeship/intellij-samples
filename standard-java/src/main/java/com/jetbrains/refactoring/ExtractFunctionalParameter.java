package com.jetbrains.refactoring;


import java.util.function.BiConsumer;

public class ExtractFunctionalParameter {
    public static void main(String[] args) {
        doStuff(new BiConsumer<Long, String>() {
          public void accept(Long i, String s) {
            Double d = stringToDouble(i + s);
          }
        });
    }

    private static void doStuff(BiConsumer<Long, String> biConsumer) {
      long i = 0;
      String s = "d";
      biConsumer.accept(i, s);
    }


    @FunctionalInterface
    public interface MyFunction<A, B, C, D> {
        public D convert(A a, B b, C c);
    }

    private static double stringToDouble(String s) {
        return Double.valueOf(s);
    }

    class MyClass {
        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        String s = "";
        Integer i = 1;
    }
}
