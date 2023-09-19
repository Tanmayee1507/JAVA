//Accept string and  capital characters change to small
// sirs 363
//inc
import java.util.*;
class program363
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sret = obj.RemoveWhiteSpace(name);
        System.out.println("Result is:"+sret);
       
    }  
}  

class StringX
{
      public String Reverse(String str)
    {
        char Arr[] = str.toCharArray();
        int iStart = 0;
        int iEnd = 
    }

}