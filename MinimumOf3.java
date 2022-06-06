import java.util.*;
public class MinimumOf3
{
    /*
        This program inputs a number initially which is the number of triplets that need to compared.
        Then there are that many triplets given in the input. We find the min of each triplet and print
        it in one line.
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("data:");
        int size = scan.nextInt();
        int[] results = new int[size];
        for (int i = 0; i < size; i++)
        {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int num3 = scan.nextInt();
            results[i] = getMin(num1, num2, num3);
        }

        for (int result : results)
        {
            System.out.print(result + " ");
        }

    }

    public static int getMin(int num1, int num2, int num3)
    {
        int min;
        if ((num1 < num2) && (num1 < num3)) {
            min = num1;
        } else if ((num2 < num1) && (num2 < num3)) {
            min = num2;
        } else {
            min = num3;
        }

        return min;

    }
}
