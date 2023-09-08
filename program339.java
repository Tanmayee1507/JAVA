//accept no from user and count no of digits
//approach3
// sirs program339
//Evenfacts of number
import java.util.*;

class program339
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iNo = sobj.nextInt();
        
        Digits dobj = new Digits();
        int iRet = dobj.SumDigits(iNo);

        System.out.println("Sum of Digits is:"+iRet);
    }
}

class Digits
{
  public int SumDigits(int iValue)
    {
        int iSum = 0;
        if(iValue < 0)
        {
            iValue = -iValue;
        }
      
       while(iValue != 0)
       {
        
        iSum = iSum +(iValue % 10);
        iValue = iValue/10;
       }
          return iSum;
    }
}