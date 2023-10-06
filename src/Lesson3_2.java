import java.util.Arrays;

public class Lesson3_2 {
    public static void main(String[] args) {
        int[] numbers = {3, 81, -3, 4, 0, 26};
        System.out.println(numbers[2]);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        numbers[4] = 77;
        System.out.println(Arrays.toString(numbers));
        double[] digits = new double[3];
        System.out.println(Arrays.toString(digits));
        digits[1] = 1.2;
        System.out.println(Arrays.toString(digits));
        // digits[11] = 8.5;
        digits = new double[5];
        System.out.println(Arrays.toString(digits));

        int[][] arr2D = new int[3][4];
        System.out.println(Arrays.deepToString(arr2D));
        arr2D[1][2] = 6;
        System.out.println(Arrays.deepToString(arr2D));

        String[][] students = {{"Jim", "Jack"}, {"Julie", "Jenny"}};
        System.out.println(Arrays.deepToString(students));
    }
}
