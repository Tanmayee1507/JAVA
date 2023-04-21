/*
Function Name:Addition
input: unsigned integer, unsigned integer
output: unsigned integer
Description: addition of 2 numbers
Author: Tanmayee Kadam
Date: 18 April 2023
Language: Java Programming
*/
import java.util.*;

class Program4
{
    public static void main(String Arg[])
    {
        Addition obj1 = new Addition();
     int iAns = 0, iNo1,iNo2;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter first number:\n");
    iNo1 = sobj.nextInt();

    System.out.println("Enter second number:\n");
    iNo2 = sobj.nextInt();

    iAns =obj1.Add(iNo1,iNo2);

    System.out.println("Addition is:"+iAns);

    }
    
}

class Addition  extends Program4
{

    public int iNo1;
    public int iNo2;
    public int Add (int Value1, int Value2)
{
     int iResult = 0;
     this.iNo1 = Value1;
     this.iNo2 = Value2;

    iResult = Value1 + Value2;

    return iResult;
}

}
