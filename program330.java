//approach3
// sirs program331
//Evenfacts of number
import java.util.*;

class program330
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
        for(int iCnt = 1; iCnt<= iValue; iCnt++)
        {
            if(iValue % iCnt == 0)// factor aahe ka?
            {
                if(iCnt % 2 == 0)// factor even aahe ka?
                {
                    iMult = iMult * iCnt;
                }
            }
        }
          return iMult;
    }
}