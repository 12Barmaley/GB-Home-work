package java2.hw3;

public class Main {

        public static void main(String[] args) {
            System.out.println("* * *" + "\n" + "Задание №2");
            Box<Apple> appleBox = new Box(1.0f);
            Apple apple = new Apple();
            appleBox.put(apple);
            appleBox.put(apple);
            appleBox.put(apple);
            System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

            Box<Orange> orangeBox = new Box(1.5f);
            Orange orange = new Orange();
            orangeBox.put(orange);
            orangeBox.put(orange);
            System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

            System.out.println("Сравнение коробок по весу: " + appleBox.compare(orangeBox));

            Box<Orange> orangeBox2 = new Box(1.5f);
            orangeBox2.put(orange);
            System.out.println("Вес первой коробки с апельсинами до трансфера: " + orangeBox.getWeight());
            System.out.println("Вес второй коробки с апельсинами до трансфера: " + orangeBox2.getWeight());
            orangeBox.putInAnotherBox(orangeBox2);
            System.out.println("Вес первой коробки с апельсинами после трансфера: " + orangeBox.getWeight());
            System.out.println("Вес второй коробки с апельсинами после трансфера: " + orangeBox2.getWeight());
        }

        public static <T> T[] changeItems(T[] arr, int first, int second) {
            if ((first >= 0 && first < arr.length) && (second >= 0 && second < arr.length)) {
                T temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
            }
            return arr;
        }


    }

