//accept no from user and count no of digits
//approach3
// sirs program336
//Evenfacts of number
import java.util.*;

class program335
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iNo = sobj.nextInt();
        
        Digits dobj = new Digits();
        int iRet = dobj.CountDigits(iNo);

        System.out.println("Number of Digits are:"+iRet);
    }
}

class Digits
{
  public int CountDigits(int iValue)
    {
        int iCount = 0;
        int iDigit = 0;
       while(iValue != 0)
       {
        iDigit = iValue % 10;
        iCount++;
        iValue = iValue/10;
       }
          return iCount;
    }
}