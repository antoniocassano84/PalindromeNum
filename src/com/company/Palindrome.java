package com.company;

public class Palindrome {

    static int palindrome() {

        int max = Integer.MIN_VALUE;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                String str = Integer.toString(product);
                String reversed = new StringBuilder(str).reverse().toString();
                if(str.equals(reversed)) {
                    System.out.println(str + " = " + i + " X " + j);
                    if(product > max) max = product;
                }
            }
        } return max;
    }
}
