//accept no from user and count no of digits
//approach3
// sirs program338
//Evenfacts of number
import java.util.*;

class program337
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iNo = sobj.nextInt();
        
        Digits dobj = new Digits();
        int iRet = dobj.SumDigits(iNo);

        System.out.println("Sum of Digits are:"+iRet);
    }
}

class Digits
{
  public int SumDigits(int iValue)
    {
        int iCount = 0;
        int iDigit= 0;
        int iSum = 0;
      
       while(iValue != 0)
       {
        iDigit = iValue %10;
        iSum = iSum +iDigit;
        iValue = iValue/10;
       }
          return iSum;
    }
}