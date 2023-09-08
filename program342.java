//aermstrong
//approach3
//sir's 342
// 371 = 3^3^3 + 7^7^7 + 1^1^1 =27+343+1= 371
import java.util.*;

class program342
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int Value = sobj.nextInt();
        
        Digits dobj = new Digits();
        boolean bRet = dobj.CheckArmstrong(Value);

        if(bRet == true)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
}

class Digits
{
    int CountDigits(int iNo)
    {
        int iCount = 0;
        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }

    int Power(int X,int Y)
    {
        int iPower = 1;

        for(int iCnt = 1 ;iCnt <= Y; iCnt++)
        { 
            iPower = iPower * X;
        }
        return iPower;
    }

    boolean CheckArmstrong(int iNo)
    {

        int iCount = 0;
        iCount = CountDigits(iNo);
        int iTemp = iNo;
        int iSum = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            int iRet = Power(iDigit, iCount);
            iSum = iSum + iRet;
            iNo = iNo / 10; 
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}