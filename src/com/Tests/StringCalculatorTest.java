package com.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.company.StringCalculator;

public class StringCalculatorTest
{
    //Task1:- Creating a Simple String Calculator

    //String calculator should return 0 if empty string is passed
    @Test
    public void ShouldReturnZeroOnEmpty()
    {
        assertEquals(0,StringCalculator.add(""));
    }

    //If a single element is passed as argument then the same element should be the answer
    @Test
    public void returnSameIntegerOnSingleInteger()
    {
        assertEquals(5, StringCalculator.add("5"));
    }

    //Task 2:
    //If a string of comma separated value is passed, summation of those value should be returned
    @Test
    public void returnSummationOfCommaSeparatedInput()
    {
        assertEquals(12,StringCalculator.add("3,2,1,6"));
    }

    //Task 3:
    //Allowing Alphabets to be included
    @Test
    public void supportsSummationOfLowerCaseAlphabets()
    {
        assertEquals(3, StringCalculator.add("1,b"));
    }

}
