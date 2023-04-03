import java.util.*;

class ArrayFor1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Elements of array are:");

        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        System.out.println("Elements of array are:");

        for(iCnt = 0; iCnt <iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
}
