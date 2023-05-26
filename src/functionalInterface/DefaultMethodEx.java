package functionalInterface;

@FunctionalInterface
interface DefaultMtdEx
{
    // abstract method
    void m1();

    static void m2()
    {
      // code here
    };

    // static method
    public static int add_No(int a, int b)
    {
        System.out.println("Interface static method");
        return a+b;
    }
    // default method
    public default void msg()
    {
        System.out.println("Interface default method");
    }

}
public class DefaultMethodEx implements DefaultMtdEx
{
    public void m1()
    {
        System.out.println("Interface abstract method");
    }
    public static void main(String args[])
    {
     // object creation
     DefaultMethodEx obj = new DefaultMethodEx();
        obj.m1();
        obj.msg();
        System.out.println(DefaultMtdEx.add_No(4,4));
        System.out.println();

    }
}
