//accept no from user and count no of digits
//approach3
// sirs program335
//Evenfacts of number
import java.util.*;

class program334
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iNo = sobj.nextInt();
        
        Numbers nobj = new Numbers();
        int iRet = nobj.EvenFact(iNo);

        System.out.println("Multiplication of even factors is:"+iRet);
    }
}

class Numbers
{
  public int EvenFact(int iValue)
    {
        int iMult = 1;
        for(int iCnt = 2; iCnt<= iValue; iCnt += 2)//n/2
        {
            if((iValue % iCnt == 0))// factor aahe ka?
            {
                
                    iMult = iMult * iCnt;
            }
        }
        if(iMult == 1)
        {
            return 0;
        }
          return iMult;
    }
}