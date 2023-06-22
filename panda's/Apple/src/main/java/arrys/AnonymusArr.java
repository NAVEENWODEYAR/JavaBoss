package arrys;

public class AnonymusArr
{
    public static void disp(int a[])
    {
        for (int n: a)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args)
    {
    // Nameless array's are calles as Anonymous arrays..,creatig just for instant use only(one-time use only)to pass as argument to the function..,
    disp(new int[]{1,2,3,4,5,6,7,8});
    }
}
