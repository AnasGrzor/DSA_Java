package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascArray = {2, 4, 6, 8, 10, 12};
        int[] descArray = {12, 10, 8, 6, 4, 2};
        System.out.println(orderAgnosticBS(ascArray, 8));  // Should print 3
        System.out.println(orderAgnosticBS(descArray, 8)); // Should print 2
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
