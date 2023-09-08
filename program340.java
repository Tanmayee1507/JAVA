//accept no from user and count no of digits
//approach3
//sir's 340
// 987898=9+8+7+8+9+8=49=4+9=13=1+3=4
import java.util.*;

class program340
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iNo = sobj.nextInt();
        
        Digits dobj = new Digits();
        int iRet = dobj.GenericRoot(iNo);

        System.out.println("Generic Root is:"+iRet);
    }
}

class Digits
{
  public int GenericRoot(int iValue)
    {
        int iDigit= 0;
        int iSum = 0;
      
       while(iValue >= 10)
       {
            while(iValue != 0)
            {
            iDigit = iValue % 10;
            iSum = iSum + iDigit;
            iValue = iValue / 10;
            }
            if(iSum >=10)
            {
                iValue = iSum;
                iSum = 0;
            }
            else
            {
                iValue = iSum;
                break;
            }
        }
          return iValue;
    }
}