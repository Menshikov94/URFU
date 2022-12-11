package lr3;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите количество чисел в последовательности:");
        n = in.nextInt();
        int a = 1, b = 1;
        System.out.println("Сейчас будет выведено число Фибонначи используя операцию цикла while,\n" +
                "количество чисел в последовательности введено пользователем");
        System.out.print(a + ", " + b);
        int c, i = 2;
        while (i < n) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(", " + c);
            i++;
        }
        System.out.println("\nСейчас будет выведено число Фибонначи используя операцию цикла for,\n" +
                "количество чисел в последовательности введено также пользователем");
        a = 1;
        b = 1;
        System.out.print(a + ", " + b);
        for (i = 0; i < n - 2; i ++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(", " + c);

        }
    }
}
