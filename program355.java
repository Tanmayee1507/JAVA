//Accept string and count small and capital characters
// sirs 355
// using charAt
import java.util.*;
class program355
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        int iRet = obj.CountCapital(name);
        System.out.println("Number of capital characters are:"+iRet);

         iRet = obj.CountSmall(name);
        System.out.println("Number of small characters are:"+iRet);
    }
}  

class StringX
{
    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;
        for(int iCnt = 0; iCnt<Arr.length;iCnt++)
        {
            if((str.charAt(iCnt)>= 'A')&&(str.charAt(iCnt) <= 'Z'))
            {
                iCount ++;
            }
        }
        return iCount;
    }

     public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;
        for(int iCnt = 0; iCnt<Arr.length;iCnt++)
        {
            if((str.charAt(iCnt)>= 'a')&&(str.charAt(iCnt) <= 'z'))
            {
                iCount ++;
            }
        }
        return iCount;
    }
}