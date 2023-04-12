class BAse
{
public int A;
public Base()
  {
system.out.println("Inside Base default constructor");
  this.A = 11;
  }
  public Base(int i)
  {
  System.out.println("Inside parameterised base constructor");
  this.A = i;
  }
  public void fun()
  {
  System,.out.println("Inside Base fun");
  }
  }
  class Derived extends Base
  {
  public int A;
  public Derived()
  {
  super(11);
  System.out.println("Inside derived constructor");
  this.A = 51;
  }
  public void gun()
  {
  System.out.println("Inside Derived gun");
  System.out.println("Value of A:"+this.A);
  System.out.println("Value of A:"+A);
  System.out.println("Value of A:"+super.A);

fun();
}
}

class SuperDemo
{
public static void main(String Arg[])
{
Derived dobj = new Derived();
dobj.gun();
}
}
