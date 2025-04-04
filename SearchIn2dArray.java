import java.util.Arrays;

public class SearchIn2dArray {
  public static void main(String[] args) {
    int[][] arr = {
      {1,2,3},
      {4,5,6}
    };
    int target = 4;
    int ans = max(arr); 
    System.out.println(ans);

    System.out.println(Arrays.toString(search(arr, target)));
      }

      private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
          for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] == target) {
              return new int[]{row,col};
            }
          }
        }
        return new int[]{-1,-1};
      }

      private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints: arr) {
          for (int element: ints) {
            if (element > max) {
              max = element;
            }
          }
        }
        return max;
      }
}
