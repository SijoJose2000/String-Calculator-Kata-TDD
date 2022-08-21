package com.company;

public class StringCalculator
{

    // Actual Add method
    public static int add(String str)
    {
        if(str.isEmpty())
        {
            return 0;
        }

        String strArr[] = splitter(str);

        return summation(strArr);
    }

    //Splitter method will split the given string by comma into a array of string
    private static String[] splitter(String str)
    {

        String strArr[] = str.split(",");
        return strArr;
    }


    //Will return specific numeric value of the lowercase alphabet
    private static int getAlphaValue(String s)
    {
        int val = s.compareTo("a") + 1;
        return val;
    }

    //Will confirm if a given element is a lowercase alphabet
    private static boolean isSmallAlpha(String s)
    {
        //This will always return value from 0 to 25 for lowercase alphabet
        int a = s.compareTo("a");

        if((a>=0 && a<=25))
            return true;
        else
            return false;
    }


    //Summation will take place in this method
    private static int summation(String strArr[])
    {
        int tot=0;
        for(String s : strArr)
        {
            if (isSmallAlpha(s))
            {
                int val = getAlphaValue(s);
                tot += val;
            }
            else
            {
                int item = Integer.parseInt(s);
                tot += item;
            }
        }
        return tot;
    }



}
