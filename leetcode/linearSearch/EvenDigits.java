package leetcode.linearSearch;
/* 1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.

*/

public class EvenDigits {
  public static void main(String[] args) {
    int[] arr = { 12, 345, 2, 6, 7896 };
    System.out.println(findEvenNumbers(arr));
  }

  static int findEvenNumbers(int[] nums) {
    int count = 0;

    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  static boolean even(int num) {
    int numberOfDigits = digits(num);
    return numberOfDigits % 2 == 0;
  }

  static int digits(int num) {
    int count = 0;

    while (num > 0) {
      count++;
      num /= 10;
    }

    return count;
  }
}
