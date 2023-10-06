import java.util.Arrays;

public class Lesson3_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i = i + 1) {
            System.out.println("Hello " + i);
        }
        for (int i = 1; i <= 10; i++) { // i++ => i = i + 1 инкрементация
            System.out.println("5 x " + i + " = " + 5 * i);
        }

        System.out.println("--------------");
        for (int i = 10; i >= 1; i--) { // i-- => i = i - 1 декрементация
            System.out.println("7 x " + i + " = " + 7 * i);
        }

        System.out.println("--------------");
        for (int i = 10; i >= 1; i -= 2) { // i-=2 => i = i - 2; i*=8 => i = i * 8
            System.out.println("9 x " + i + " = " + 9 * i);
        }

        int a = 0;
        while (a < 5) {
            System.out.println("Java " + a);
            a++;
        }

        String str = "#";
        System.out.println(str.length());

        while (str.length() < 5) {
            System.out.println(str);
            str = str + "#";
        }

        String[] robots = new String[7];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = "Robot00" + (i + 1);
        }
        System.out.println(Arrays.toString(robots));

        String[] names = {"Bekzat", "Sezim", "Said"};
        for (String currentElem : names) {
            System.out.println("Hi " + currentElem);
        }

        int[] numbers = {87, -25, 9, -17, 96};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                break; // прерывает экстренно работу цикла
            }
            System.out.println(numbers[i]);
        }
        System.out.println("-------");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                continue; // прерывает экстренно работу текущего круга
            }
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Внешний цикл " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Внутренний цикл " + j);
            }
        }
    }
}
