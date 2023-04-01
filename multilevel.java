class Multilevel
{
    public static void main(String Arg[])
    {
        DerivedX dobj = new DerivedX();
        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);
        System.out.println(dobj.Z);
    }
}
class Base
{
    public int A; 
    public int B;

    public Base()
    {
        System.out.println("Inside Base constructor");
        this.A = 11;
        this.B = 21;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base
{
    public int X;
    public int Y;

    public void Derived()
    {
        System.out.println("Inside Derived constructor");
    }

    public void gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

class DerivedX extends Derived
{
    public int Z;

    public DerivedX()
    {
        System.out.println("Inside DerivedX constructor");
        this.Z = 111;
    }
}
