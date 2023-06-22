package operators;

public class Infinity_Ex
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            System.out.println(a/0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("learn the basics..,");
            System.exit(0);         // finally block won't executes.,
        }
        finally
        {
            System.out.println("Finally block executes irrespective of the exception.,");
        }
    }
}
