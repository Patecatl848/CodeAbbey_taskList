import java.util.*;
public class sumInLoop1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input: ");
        int lenArray = scan.nextInt();
        int[] nums = new int[lenArray];
        for (int i = 0; i < lenArray; i++)
        {
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        System.out.println(sum);

    }
}
