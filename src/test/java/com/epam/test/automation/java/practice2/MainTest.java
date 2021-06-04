package com.epam.test.automation.java.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testTask1PositiveTest() {
        Assert.assertEquals(Main.task1(12340), 4, "Should return the sum of the odd numbers");
    }

    @Test
    public void testTask1SumOfOddNumbers() {
        Assert.assertEquals(Main.task1(135), 9, "Should return the sum of the odd numbers");
    }

    @Test
    public void testTask1SumOfOddNumbersWhenAllEven() {
        Assert.assertEquals(Main.task1(246), 0, "Should return the sum of the odd numbers");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask1ShouldThrowExceptionWhenNLessThan0() {
        Main.task1(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask1ShouldThrowExceptionWhenNEquals0() {
        Main.task1(0);
    }

    @Test
    public void testTask2PositiveTest() {
        Assert.assertEquals(Main.task2(14), 3, "Should return the amount of the “1” in the binary representation of number");
    }

    @Test
    public void testTask2AmountOfNumbersInMaxValueOfBinaryValue() {
        Assert.assertEquals(Main.task2(255), 8, "Should return the amount of the “1” in the binary representation of number");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask2ShouldThrowExceptionWhenNLessThan0() {
        Main.task2(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask2ShouldThrowExceptionWhenNEquals0() {
        Main.task2(0);
    }

    @Test
    public void testTask3PositiveTest() {
        Assert.assertEquals(Main.task3(8), 33, "Should calculate the result value, which is equal to the sum of the first n Fibonacci numbers.");
    }

    @Test
    public void testTask3CalculateFibonacciOf1() {
        Assert.assertEquals(Main.task3(1), 0, "Should calculate the result value, which is equal to the sum of the first n Fibonacci numbers.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask3ShouldThrowExceptionWhenNEquals0() {
        Main.task3(0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask3ShouldThrowExceptionWhenNLessThan0() {
        Main.task3(-1);
    }
}
