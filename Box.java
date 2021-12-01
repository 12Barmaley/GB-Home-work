package java2.hw3;

import java.util.ArrayList;

    public class Box<T extends Fruit> {
        private ArrayList<T> list;
        private float itemWeight;

        public Box(float itemWeight) {
            this.itemWeight = itemWeight;
            list = new ArrayList<>();
        }

        public ArrayList<T> getList() {
            return list;
        }

        public float getWeight() {
            return itemWeight * list.size();
        }

        public boolean compare(Box anotherBox) {
            return anotherBox.getWeight() == getWeight();
        }

        public void putInAnotherBox(Box<T> anotherBox) {
            anotherBox.getList().addAll(list);
            list.clear();

        }

        public void put(T fruit) {
            list.add(fruit);
        }
    }
