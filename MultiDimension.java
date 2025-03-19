import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // int[][] arr = {
        //   {1,2,3},
        //   {4,5,6}
        // };

        // for (int row = 0; row < arr.length; row++) {
        //   System.out.println(Arrays.toString(arr[row]));
        // }

        int[][] arr2d = new int[3][3];

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter 9 numbers: ");

            for (int row = 0; row < arr2d.length; row++) {
              for (int col=0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
              }
            }
        }

        // for (int row = 0; row < arr2d.length; row++) {
        //   System.out.println(Arrays.toString(arr2d[row]));
        // }

        for (int[] a: arr2d) {
            System.out.println(Arrays.toString(a));
        }
     }
}