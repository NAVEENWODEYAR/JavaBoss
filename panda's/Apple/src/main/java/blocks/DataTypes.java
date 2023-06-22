package blocks;

public class DataTypes
{
    public static void main(String[] args)
    {
        // Data types
        byte a = 5;
        short b = 10;
        int c = 1000;
        long d = 100000;
        float e = 3.14f;
        double f = 987654321;

        // creating the array object..,
        int [] even_No = new int[10];
                even_No[0] = 2;
                even_No[1] = 4;
                even_No[2] = 6;
                even_No[3] = 8;
        System.out.println("Array,"+even_No);
        System.out.println("Array lenght-"+even_No.length);
        for (int n: even_No)
        {
            System.out.println(n);
        }

    }
}
