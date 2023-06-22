package operators;

public class Incr_Ex1
{
    public static void main(String[] args)
    {
     // Increment & Decrement can be applied to all the primitive datatypes except boolean..,
     try
     {
        int a = 1;
        char b = 'a';
        String st = "AB";
        int ar[] = {1,2,3,4};
         System.out.println(0/0.0);  // NaN
         System.out.println("Incrementing the integer value,"+ ++a);
         System.out.println("Incrementing the character value,"+ ++b);
         System.out.println("Decrementing the character value,"+ --a);
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
