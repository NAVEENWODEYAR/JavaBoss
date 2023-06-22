package arrys;

import static java.lang.System.exit;

public class IntArr
{
    public static void main(String[] args)
    {
        // int array..,
        int num[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array,declaration & initialization,"+num);
        int n1[] = num;
        for (int n:num)
        {
            System.out.println(n);
//            break;
        }

    }
}
