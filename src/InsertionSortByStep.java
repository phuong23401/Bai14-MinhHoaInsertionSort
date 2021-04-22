import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSortByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > currentElement; j--) {
                    System.out.println("Đổi chỗ " + arr[j + 1] + " với " + arr[j]);
                    arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentElement;
            showArray(arr, i);
        }
    }

    private static void showArray(int[] arr, int i) {
        System.out.print("Danh sách sau " + i + " lần sắp xếp: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Nhập " + arr.length + " giá trị: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Danh sách vừa nhập: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nBắt đầu sắp xếp danh sách...");
        insertionSortByStep(arr);
    }
}
