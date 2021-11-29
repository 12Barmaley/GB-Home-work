package java2.hw2;

    public class MyArraySizeException extends Exception {

        public MyArraySizeException(String msg) {
            super(msg);
        }

        @Override
        public String toString() {
            return "MyArraySizeException{" +
                    "Ожидаемый размер массива=" + getMessage() +
                    ", фактический размер массива отличается" +
                    '}';
        }
    }
