//accept no from user and count no of digits
//approach3

//Evenfacts of number
import java.util.*;

class program338
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iNo = sobj.nextInt();
        
        Digits dobj = new Digits();
        int iRet = dobj.MulDigits(iNo);

        System.out.println("Mul of Digits are:"+iRet);
    }
}

class Digits
{
  public int MulDigits(int iValue)
    {
        int iDigit= 0;
        int iMul = 1;
      
       while(iValue != 0)
       {
        iDigit = iValue %10;
        iMul = iMul *iDigit;
        iValue = iValue/10;
       }
          return iMul;
    }
}