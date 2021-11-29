package java2.hw2;
    public class Main {
        public static void main(String[] args) {

            String[][] strings = {
                    {"13", "4", "16"},
                    {"46", "56", "82", "38"},
                    {"74", "24", "27", "34"},
                    {"8", "3", "2", "7"}};

            try {
                System.out.println(task1(strings));
            } catch (MyArraySizeException | MyArrayDataException e) {
                e.printStackTrace();
            }

        }

        public static int task1(String[][] strings) throws MyArraySizeException, MyArrayDataException {
            int width = 4;
            int high = 4;
            int sum = 0;

            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length; j++) {
                    if (strings.length != high || strings[i].length != width) {
                        throw new MyArraySizeException("4х4");
                    }
                    try {
                        sum += Integer.parseInt(strings[i][j]);
                    } catch (IllegalArgumentException e) {
                        throw new MyArrayDataException(i + "x" + j, strings[i][j]);
                    }
                }
            }
            return sum;
        }
    }
