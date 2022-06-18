import java.util.*;
public class MaximumArray
{
    /*
        This program takes an input of 300 numbers and outputs
        the min and max values in a line seperated by a space.
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Data:");
        String nums = scan.nextLine();
        String[] nums2 = nums.split(" ");
        int[] numsFinal = new int[300];
        for (int i = 0; i < 300; i++)
        {
            numsFinal[i] = Integer.parseInt(nums2[i]);
        }
        int max = findMax(numsFinal);
        int min = findMin(numsFinal);
        System.out.println(max + " " + min);
    }

    public static int findMax (int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int findMin(int[] array)
    {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
