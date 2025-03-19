public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 3 ,5, 6 ,14};
        System.out.println(linearSearchInRange(arr, 1, 4, 1));
    }

    static int linearSearchInRange(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
