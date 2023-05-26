package functionalInterface;

interface StaticMtdEx
{
    public static int add_No(int a,int b)
    {
        System.out.println("Static method of the interface");
        return a+b;
    };
}
public class StaticMethodEx
{
    public static int sub_No(int a, int b)
    {
        System.out.println("Class static method");
        return a-b;
    }
    public static void main(String args[])
    {
        System.out.println("Accessing the static method of the interface");
        System.out.println(StaticMtdEx.add_No(5,5));
        System.out.println(StaticMethodEx.sub_No(10,1));

    }
}
