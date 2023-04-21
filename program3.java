/*
Function name: Addition while user gives the input
Author: Tanmayee Kadam
Date:18th April 2023
language :Java programming
*/

import java.util.*;

class Program3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0;
        int No2 = 0;
        int Ans = 0;

        System.out.println("Enter first number:");
        No1 = sobj.nextInt();

        System.out.println("Enter second number:");
        No2 = sobj.nextInt();

        Ans = No1 + No2;

        System.out.println("Addition is:"+Ans);

        sobj.close();

    }
}