package java2.hw3;
//*задание 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {

        System.out.println("* * *" + "\n" + "Задание №1");
        String[] arr = {"book", "chair", "PC"};
        Integer[] arr1 = {1,9,8};
        System.out.println("Оригинальный массив: " + Arrays.toString(arr1));
        System.out.println("Массив после изменения элеметов местами: " + Arrays.toString(changeItems(arr1, 2, 0)));

    }
        public static <T > T[]changeItems(T[]arr,int first, int second){
            if ((first >= 0 && first < arr.length) && (second >= 0 && second < arr.length)) {
                T temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
            }
            return arr;
        }

    }