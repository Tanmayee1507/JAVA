//Accept array from user, accept elements and display
//Approach2
//sirs program344
import java.util.*;

class program344
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        System.out.println("Enter number of elements:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements:");
        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt ++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

         System.out.println("Elements of array are:");
        for(iCnt = 0; iCnt < Arr.length; iCnt ++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}