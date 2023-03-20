import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class main1 {
    public static void main(String[] args) {
        int[] test = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        List<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int number = input.nextInt();
        for (int j : test) {
            if (j != number) {
                result.add(j);
            }
        }
        if (test.length == result.size()) {
            System.out.println("Введенный элемент не найден в массиве");
        } else {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

}
