package alpha;

public class Reference_Ex
{
   static private int a, b;
      static void ref()
      {
          System.out.println(a);
          System.out.println(b);
          System.out.println("Object Reference..,");
      }

    public static void main(String[] args)
    {
     // initializing the values.,
//     a = 5;
     b = 10;
        System.out.println(a+b);
        ref();
    }
}
