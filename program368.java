//remove whte spaces
//sirs program364,365,366
import java.util.*;
class program368
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+","");
        System.out.println("Updated String is : "+str);
    }
}