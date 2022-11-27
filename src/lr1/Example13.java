package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Первое число: ");
        int x = in.nextInt();

        System.out.println("Второе число: ");
        int y = in.nextInt();
        int sum = x+y;
        System.out.println("Сумма :" +sum);
  }
}
