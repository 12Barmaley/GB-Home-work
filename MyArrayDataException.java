package java2.hw2;

    public class MyArrayDataException extends Exception {
        private String index;
        private String value;

        public MyArrayDataException(String index, String value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyArrayDataException{" +
                    "index='" + index + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
