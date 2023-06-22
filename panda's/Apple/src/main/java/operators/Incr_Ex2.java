package operators;

public class Incr_Ex2
{
    public static void main(String[] args)
    {
     // Increment & Decrement can be applied to all the primitive datatypes except boolean..,
     try
     {
         int a = 5;
         System.out.println("Incrementing the integer value,"+ ++a);
         final int b = 1;
//         System.out.println(++b);
     }
     catch (Exception e)
     {
         e.printStackTrace();
         System.out.println("We can't apply the increment & decrement to the constant & literals,,");
     }
    }
}
