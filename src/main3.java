import java.util.Random;

public class main3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] test1 = new int[5];
        int[] test2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double av1 = 0.0;
        double av2 = 0.0;
        System.out.print("1 массив: ");
        for (int i = 0; i < test1.length; ++i) {
            test1[i] = random.nextInt(1, 100);
            System.out.print(test1[i] + " ");
            sum1 += test1[i];
        }
        av1 = (double) sum1 / (double) test1.length;
        System.out.println();
        System.out.println("Среднее значение 1 массива: " + av1);
        System.out.print("2 массив: ");
        for (int i = 0; i < test2.length; ++i) {
            test2[i] = random.nextInt(1, 100);
            System.out.print(test2[i] + " ");
            sum2 += test2[i];
        }
        av2 = (double) sum2 / (double) test2.length;
        System.out.println();
        System.out.println("Среднее значение 2 массива: " + av2);
        if (av1 > av2) {
            System.out.println("Средней значение 1 массива (" + av1 + ") больше, чем среднее значение 2 массива (" + av2 + ")");
        } else if (av1 < av2) {
            System.out.println("Средней значение 2 массива (" + av2 + ") больше, чем среднее значение 1 массива (" + av1 + ")");
        } else {
            System.out.println("Средней значение 1 массива (" + av1 + ") равно среднему значению 2 массива (" + av2 + ")");

        }
    }
}