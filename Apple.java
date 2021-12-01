package java2.hw3;

    public class Apple extends Fruit {
        private float weight = 1.0f;
        private String name = "Apple";

        public float getWeight() {
            return weight;
        }


        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
