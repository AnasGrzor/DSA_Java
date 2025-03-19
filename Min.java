public class Min {
  public static void main(String[] args) {
    int[] arr = {30, 45, 55, 6};
    System.out.println(MinValue(arr));
  }

  static int MinValue(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }
    int min = arr[0];

    for (int element: arr) {
      if (element < min) {
        min = element;
      }
    }
    return min;
  }
}
