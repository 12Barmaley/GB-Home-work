package java2.hw3;

      public class Orange extends Fruit {
        private static int id = 0;
        private final String name = "Orange";
        private float weight = 1.5f;

        public Orange() {
        }

        public float getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Orange{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
