package operators;

public class Infinity_Ex2
{
    public static void main(String[] args)
    {
        // Infinity & NaN
        try
        {
            int a = 5;
//            System.out.println(a/0);

            float f = 3.14f;
            System.out.println(f/0);
            System.out.println(0/0.0);
            System.out.println(-0/0.0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("floating point & double represents the infinity..,");
        }
    }
}
