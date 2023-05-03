package com.brianonchari.datastructures.problems;

/*
* Alice has a binary string. She thinks a binary string is beautiful if and only if it
* doesn't contain the substring "010" .
In one step, Alice can change a 0 to 1 a  or vice versa. Count
* and print the minimum number of steps needed to make Alice see the string as beautiful.
* */
public class BeautifulBinaryString {
    public static void  main(String [] args){
        beautifulBinaryString("010");
    }

    public static int beautifulBinaryString(String b)
    {
        int n = b.length();
        int min = 0;
        String nonBeautifulString = "010";
        for(int i=0;i<=n-3;)
        {
            String b1 = b.substring(i,i+3);
            if(b1.contains(nonBeautifulString))
            {
                min++;
                i=i+3;
            }
            else
            {
                i++;
            }
        }
        return min;
    }
}
