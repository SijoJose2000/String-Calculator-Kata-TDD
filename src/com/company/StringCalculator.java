package com.company;

import java.util.ArrayList;

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


        throwExceptionIfNegative(strArr);
        return summation(strArr);
    }


    //Splitter method will split the given string by comma and space(\n) also with custom delimiter
    private static String[] splitter(String str)
    {
        char delimiter = ',';


        if(str.startsWith("//"))
        {
            delimiter = str.charAt(2);
            str = str.replace("//"+ delimiter + "\n", "");
        }

        String strArr[] = str.split(delimiter + "|\n");
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

                //This condition will take care of ignoring the number greater than thousand
                if (item <= 1000)
                {
                    tot += item;
                }
            }
        }
        return tot;
    }


    /*
    Will throw exception if negative number is encountered and will also pass the list of
    Negative number encountered. To protect the proper flow of the program. Negative number should be checked
    right after splitting
    */

    private static void throwExceptionIfNegative(String[] strArr)
    {
        ArrayList<String> list = new ArrayList<>();
        for(String s : strArr)
        {
            if(!isSmallAlpha(s))
            {
                int item = Integer.parseInt(s);
                if(item < 0)
                {
                    list.add(s);
                }
            }
        }

        if(!list.isEmpty())
        {
            throw new RuntimeException("Negative numbers are not allowed " + String.join(", ", list));
        }
    }


}
