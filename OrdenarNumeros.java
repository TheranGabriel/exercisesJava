public class OrdenarNumeros {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2, 7, 1, 10, 6, 9};

        bubbleSort(numbers);

        System.out.println("Números ordenados:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
