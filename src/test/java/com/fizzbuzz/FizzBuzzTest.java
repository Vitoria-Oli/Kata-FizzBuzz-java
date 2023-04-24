package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz TestFizzBuzz = new FizzBuzz();

    @Test
    public void test_fizzbuzz_example() {
        String response = TestFizzBuzz.Fizzbuzz(15);
        assertEquals("FizzBuzz", response);

    }

    @Test
    public void test_fizzbuzz_example2() {
        String response = TestFizzBuzz.Fizzbuzz(3);
        assertEquals("Fizz", response);

    }

    @Test
    public void test_fizzbuzz_example3() {
        String response = TestFizzBuzz.Fizzbuzz(5);
        assertEquals("Buzz", response);

    }

    @Test
    public void test_fizzbuzz_example4() {
        String response = TestFizzBuzz.Fizzbuzz(4);
        assertEquals("4", response);
    }

    @Test
    public void test_fizzbuzz_exampleContain3() {
        String response = TestFizzBuzz.Fizzbuzz(351);
        assertEquals("Fizz", response);
    }

    @Test
    public void test_fizzbuzz_exampleContain5() {
        String response = TestFizzBuzz.Fizzbuzz(581);
        assertEquals("Buzz", response);
    }
    
}