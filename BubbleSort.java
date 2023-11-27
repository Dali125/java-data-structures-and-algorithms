public class BubbleSort {

  public int[] sort(int arr[]) {
    int length = arr.length;

    for (int i = 0; i < length - 1; i++) {
      for (int k = 0; k < length - i - 1; k++) {
        if (arr[k] > arr[k + 1]) {
          // Swap arr[k] and arr[k+1]
          int temp = arr[k];
          arr[k] = arr[k + 1];
          arr[k + 1] = temp;
        }
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    // Example usage
    int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
    BubbleSort bubbleSort = new BubbleSort();
    int[] sortedArray = bubbleSort.sort(arrayToSort);

    // Print the sorted array
    for (int value : sortedArray) {
      System.out.print(value + " ");
    }
  }
}
