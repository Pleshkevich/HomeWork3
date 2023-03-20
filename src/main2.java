import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int size = input.nextInt();
        int[] test = new int[size];
        int max = test[0];
        int min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        int sum = 0;
        double av = 0.0;
        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(1, 100);
            if (max < test[i]) {
                max = test[i];
            }
            if (min > test[i]) {
                min = test[i];
            }
        }
        System.out.println(max + " максиимально число в массиве");
        System.out.println(min + " минимальное число в массиве");

        for (int i = 0; i < test.length; ++i) {
            sum += test[i];
        }
        av = (double) sum / (double) test.length;
        System.out.println(av + " среднее значение");
    }
}
