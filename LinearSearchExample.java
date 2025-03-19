public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch3(arr, 1));

    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        for (int element: arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
    static boolean linearSearch3(int[] arr, int target) {
        for (int element: arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
