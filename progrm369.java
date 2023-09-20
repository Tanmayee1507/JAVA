//remove whte spaces
//sirs program369
import java.util.*;
class program369
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+","");
        str = str.trim();
        System.out.println("Updated String is : "+str);
    }
}