package com.abstraction.Problem01.RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n + 1; i++) {
            System.out.println(printRow(i, n));
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(printRow(i, n));
        }
    }

    private static String printRow(int numberOfStars, int n) {
        int numberOfSpaces = n - numberOfStars;
        String valueToPrint = repeatNTimes(" ", numberOfSpaces) + repeatNTimes("* ", numberOfStars);

        return valueToPrint;
    }

    // we need that because Java version in Judge is 10 and str.repeat is no supported
    private static String repeatNTimes(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(s);
        }
        return builder.toString();
    }
}
