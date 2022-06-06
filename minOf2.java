import java.util.*;
public class minOf2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        int numArray = scan.nextInt();
        String lineNums = scan.nextLine();

        for (int i = 0; i < numArray; i++)
        {
            lineNums = scan.nextLine();
            String[] sepNums = (lineNums.split(" ", 0));
//            System.out.println(lineNums + " " + i);

            int one = Integer.parseInt(sepNums[0]);
//            System.out.println(one + ": 1 ");
            int two = Integer.parseInt(sepNums[1]);
//            System.out.println(two + ": 2 ");

            if (one < two)
                System.out.print(one + " ");
            else
                System.out.print(two + " ");
        }

    }
}
