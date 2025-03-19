package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 23, 14, 55, 77};
        Arrays.sort(arr);
        System.out.println(search(arr, 55));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
        int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
