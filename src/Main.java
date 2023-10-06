import java.util.Arrays;
import java.util.Random;

public class Main {
    public static double nextDoubleBetween(double min, double max) {
        double randomValue = (new Random().nextDouble() * (max - min)) + min;
        // Round to two decimal places
        randomValue = Math.round(randomValue * 100.0) / 100.0;
        return randomValue;
    }


    public static void main(String[] args) {

        //hw_1
        double[] digits = new double[15];

        for (int i = 0; i < digits.length; i++) {
            if (i % 3 == 0) {
                digits[i] = -nextDoubleBetween(0, 10);
            } else {
                digits[i] = nextDoubleBetween(0, 10);
            }

        }

        System.out.println(Arrays.toString(digits));

        //hw_2
        double sumOfPositiveDigits = 0;
        double indexOfNegativeDigit = 0;
        double countOfPositiveDigits = 0;

        for (double integer : digits) {
            if (indexOfNegativeDigit > 0) {
                if (integer > 0) {
                    sumOfPositiveDigits += integer;
                    countOfPositiveDigits++;
                }
            } else {
                if (integer < 0) {
                    indexOfNegativeDigit++;
                }
            }
        }

        System.out.println(Arrays.toString(digits) + " = " + sumOfPositiveDigits + "/" + countOfPositiveDigits);
        System.out.println("____________________");
        //hw_3
        double[] integers2 = digits;


        for (int i = 0; i < integers2.length - 1; i++) {
            int minIntIndex = i;
            for (int j = i + 1; j < integers2.length; j++) {
                if (integers2[j] < integers2[minIntIndex]) {
                    minIntIndex = j;
                }
            }
            System.out.println(Arrays.toString(integers2));
            double currentInt = integers2[i];
            integers2[i] = integers2[minIntIndex];
            integers2[minIntIndex] = currentInt;
        }
    }
}