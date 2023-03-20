import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int k = sc.nextInt();
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < test.length; i++) {
            if (test[i] == k) {
                System.out.println("Число входит в массив");
                break;
            } else {
                System.out.println("Число не входит в массив");
            }
        }
    }
}