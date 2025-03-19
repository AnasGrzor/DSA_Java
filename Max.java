public class Max {
    public static void main(String[] args) {
        int[] arr = {10,2,23,4,5};

        System.out.println(maxRange(arr, 1, 3));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int maxRange(int[] arr, int start, int end) {
        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
