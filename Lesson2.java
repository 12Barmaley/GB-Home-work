package geekbrains.Lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(sumBetween10and20(5, 6));
     System.out.println("*****************");
        positiveNegative(15);
        System.out.println("*****************");
        System.out.println(trueNegativeFalsePositive (-1));
        System.out.println("*****************");//
        printOneLine("Hello", 15);

    }

     public static boolean sumBetween10and20(int a, int b) {
     if (((a + b) > 10) && ((a + b) <= 20)) {
            return true;
        } else {
            return false;
        }
        }

        public static void positiveNegative ( int c){
            if (c >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }

    public static boolean trueNegativeFalsePositive(int n) {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printOneLine(String l, int c) {
        for (int i = 1; i < c; i++) {
            System.out.println(l);
        }
    }
}






