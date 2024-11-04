public class SelectionSort {
  SelectionSort() {
    int[] arr = { 64, 25, 12, 22, 11 };
    sort(arr);
    System.out.println("Sorted array:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  // write sort method
  public void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      // Swap arr[i] and arr[minIndex]
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

  // print array method
  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
