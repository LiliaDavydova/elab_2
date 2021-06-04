package com.epam.test.automation.java.practice2;

public class Main {

    private static final String POSITIVE_NUMBER_ERROR_MSG = "Number must be positive";

    private Main() {

    }

    public static int task1(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException(POSITIVE_NUMBER_ERROR_MSG);
        }
        int sum = 0;
        String s = String.valueOf(value);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c - '0') % 2 == 1) {
                sum += (c - '0');
            }
        }
        return sum;
    }

    public static int task2(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException(POSITIVE_NUMBER_ERROR_MSG);
        }

        String binary = Integer.toBinaryString(value);

        int amount = 0;

        for (int b = 0; b < binary.length(); b++) {
            if (binary.charAt(b) == '1') {
                amount++;
            }
        }

        return amount;
    }

    public static int task3(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException(POSITIVE_NUMBER_ERROR_MSG);
        }
        if (value == 1) {
            return 0;
        }
        int n0 = 0;
        int n1 = 1;
        int n2;
        int sum = n0 + n1;
        for (int i = 3; i <= value; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            sum += n2;
        }
        return sum;
    }
}
