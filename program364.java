//convert string in lower class
//sirs program364,365,366
import java.util.*;
class program364
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.toLowerCase();

        char Arr[]= str.toCharArray();
        int Freq[] = new int[26];
        int iCnt = 0;
        System.out.println("Frequency is:");
        for(iCnt = 0; iCnt <Freq.length; iCnt++)
        {
            Freq[Arr[iCnt] - 'a']++;
        }
        System.out.println("Frequency of each letter is:");
        for(iCnt= 0 ; iCnt < Freq.length; iCnt++)
        if(Freq[iCnt]!= 0)
    {
        System.out.println("Frequency of"+(char)(iCnt+'a')+"is"+Freq[iCnt]);
    }
    }
}