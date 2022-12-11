package lr3;

import java.util.Arrays;
import java.util.Random;

public class Example9 {

    public static void main(String[] args) {

        int a = 6;
        int[] ints = new int[a];
        Random random = new Random();

        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(500);
            System.out.println("[" + i + "]" + ints[i]);
        }
        Arrays.sort(ints);
        int x = Math.min(ints[0], ints[a - 1]);
        System.out.println("Массив после сортировки: ");

        for (int i = 0; i < ints.length; i++) {
            System.out.println("[" + i + "]" + ints[i]);

        }
        System.out.println("Минимальное значение и индекс этого элемента или элементов,\n" +
                "если их несколько.");
        for (int i = 0; i < ints.length; i++) {
            if (x == ints[i]) {
                System.out.println("[" + i + "]" + x);
            }


        }
    }
}

