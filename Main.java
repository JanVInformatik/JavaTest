public class Main {
  public static void main(String[] args) {
    System.out.println("Test");
    // make a binary search
    BinarySearch binarySearch = new BinarySearch();
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int target = 5;
    int index = binarySearch.binarySearch(arr, target);
    System.out.println("Index of " + target + " is: " + index);
  }
}
