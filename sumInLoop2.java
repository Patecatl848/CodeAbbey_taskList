import java.util.*;
public class sumInLoop2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        int a = scan.nextInt();
        int b = 0;
        int c = 0;
        int result = 0;

        for (int i = 0; i < a; i++)
        {
            b = scan.nextInt();
            c = scan.nextInt();
            result = b + c;
            System.out.print(result + " ");
        }

    }
}





