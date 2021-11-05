public class Bubble {
    public static void main(String[] args) {
        int temp;
        int[] arr = {52, 26, 93, 17, 77, 31, 44, 55, 20};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Result:");
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }
}
