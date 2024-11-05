public class Main {
  public static void main(String[] args) {
    // make a binary search
    BinarySearch binarySearch = new BinarySearch();
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int target = 5;
    int index = binarySearch.binarySearch(arr, target);
    System.out.println("Index of " + target + " is: " + index);

    // make a bubble sort
    BubbleSort bubbleSort = new BubbleSort();
    int[] arr2 = { 10, 5, 8, 2, 7, 1, 9, 3, 6 };
    System.out.println("Original array: ");
    bubbleSort.printArray(arr2);
    bubbleSort.bubbleSort(arr2);
    System.out.println("Sorted array: ");
    bubbleSort.printArray(arr2);

    // make a selection sort
    SelectionSort selectionSort = new SelectionSort();
    int[] arr3 = { 10, 5, 8, 2, 7, 1, 9, 3, 6 };
    System.out.println("Original array: ");
    selectionSort.printArray(arr3);
    selectionSort.sort(arr3);
    System.out.println("Sorted array: ");
  }
}
