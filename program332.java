//approach3
// sirs program333
//Evenfacts of number
import java.util.*;

class program332
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
        for(int iCnt = 2; iCnt<= iValue; iCnt = iCnt +2)//n/2
        {
            if((iValue % iCnt == 0))// factor aahe ka?
            {
                
                    iMult = iMult * iCnt;
            }
        }
          return iMult;
    }
}