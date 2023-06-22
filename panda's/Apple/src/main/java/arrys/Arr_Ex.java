package arrys;

public class Arr_Ex
{
    public static void main(String[] args)
    {
    // Array's are immutabe
    String students[] = new String[5];
            students[0] = "Emma";
            students[1] = "Watson";
            students[2] = "Angelina";
            students[3] = "Jolie";
            students[4] = "Kate";
        for (Object name:students)
        {
            System.out.println(name);
        }
    }
}
