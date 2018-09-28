package com.rafel.fizzbuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class FizzBuzzTest {
    @Test
    public void firstTest(){
        assertTrue(true);
}
    @Test
    public void returnFizzDivisibleByThree(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 3;
        //Act
        boolean result = fizzBuzz.isFizz(value);
        //assertion
        assertTrue(result);
    }


}
