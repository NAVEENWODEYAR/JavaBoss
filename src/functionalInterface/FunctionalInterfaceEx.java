package functionalInterface;

@FunctionalInterface
interface FunctionalInterfce
{
    int m1();
}
public class FunctionalInterfaceEx implements FunctionalInterfce
{

    public int m1()
        {
            return 0;
         }
    public static void main(String args[])
    {
        System.out.println("Functional Interface");
        System.out.println();
    }
}