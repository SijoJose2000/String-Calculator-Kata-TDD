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

    //Task 4 & 5
    //String Calculator should throw error when negative number is encountered
    @Test
    public void throwErrorIfNegativeNumberEncountered()
    {
        try
        {
            StringCalculator.add("1,-3,5,-2,-6");
            fail("Exception Excepted");
        }
        catch(Exception e)
        {

        }
    }

    //Task 6:-
    //Ignore number greater than 1000
    @Test
    public void shouldNotConsiderNumberGreaterThan1000()
    {
        assertEquals(2, StringCalculator.add("2,1001"));
    }

    //Task 7
    //Support newline (\n) as separator alongside comma (,)
    @Test
    public void returnSummationOfNextLineSeparatedInput()
    {
        assertEquals(12,StringCalculator.add("3,2\n1,6"));
    }

    //Task 8
    //Supports Custom separators
    @Test
    public void returnSummationOfCustomDelimiterSeparatedInput()
    {
        assertEquals(12,StringCalculator.add("//;\n3;2;1;6"));
    }
}
