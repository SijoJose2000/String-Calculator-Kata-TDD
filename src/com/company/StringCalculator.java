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

    //Summation will take place in this method
    private static int summation(String strArr[])
    {
        int tot=0;
        for(String s : strArr)
        {
            int item = Integer.parseInt(s);
            tot += item;

        }
        return tot;
    }
}
