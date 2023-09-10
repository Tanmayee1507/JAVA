//Accept array from user, accept elements and display
//Approach2
//sirs program345
import java.util.*;

class program345
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        System.out.println("Enter number of elements:");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();
        aobj.Display();
    }
}

class ArrayX
{
   public int Arr[];

   public ArrayX (int iSize)
   {
    Arr = new int [iSize];
   }

   public void Accept()
   {
     Scanner sobj = new Scanner (System.in);

    System.out.println("Enter the elements:");

    for(int iCnt = 0; iCnt < Arr.length; iCnt ++)
    {
        Arr[iCnt] = sobj.nextInt();
    }
   }
   public void Display()
   {
        System.out.println("Elements of Array are:");
    
    for(int iCnt = 0; iCnt < Arr.length; iCnt ++)
    {
        System.out.print(Arr[iCnt]+"\t");
    }
    System.out.println();
   }

}