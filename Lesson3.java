package geekbrains.Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        lenArray(6, 10);
        searchMinMaxArray();
    }
//задание 1
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        } System.out.println("\n***");
    }
    //задание 2.
    public static void fillArray() {
        int[] arri = new int[100];

        for (int i = 0; i < arri.length; i++) {
            arri[i] = i + 1;
            System.out.print(arri[i] + " ");
        }
        System.out.println("\n***");
    }
    //задание 3.
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n***");
    }
//задание 4.
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n***");
    }
//задание 5.//

    public static void lenArray(int len, int initialValue) {
        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n***");
    }

    //        задание 6
    public static void searchMinMaxArray() {
        int[] arr = {1, -99, 0, 984};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}






