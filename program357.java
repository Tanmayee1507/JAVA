//Accept string and  capital characters change to small
// sirs 357
//inc
import java.util.*;
class program357
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sret = obj.StrUpper(name);
        System.out.println("Converyed string is:"+sret);
    }  
}  

class StringX
{
    public String StrUpper(String str)
    {
        char Arr[] = str.toCharArray();
        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'a')&&(Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt] - 32);
            }
        }

        String ret = new String(Arr);

        return ret;
    }

}