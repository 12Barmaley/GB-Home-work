package geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSigh();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("*****************");
    }

    public static void checkSumSigh() {
        int a = 0;
        int b = 4;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("*****************");
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        System.out.println("*****************");
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 7;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }

    }}


