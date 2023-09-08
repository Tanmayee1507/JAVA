//aermstrong
//approach3
//sir's 341
// 371 = 3^3^3 + 7^7^7 + 1^1^1 =27+343+1= 371
import java.util.*;


class program341
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
  boolean CheckArmstrong(int iNo)
    {
        int iTemp = iNo;
        int iCount = 0;
        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp /10;
        }
        iTemp = iNo;
        int iSum = 0;
        int iPower = 1;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            for(int iCnt =1; iCnt<= iCount; iCnt++)
            {
                iPower = iPower * iDigit;
            } 
            iSum = iSum + iPower;
            iPower = 1;
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