package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = in.nextInt();
        int x1 = x - 1;
        int x2 = x + 1;
        int x3 = (x+x1+x2)*(x+x1+x2);
        System.out.println(+x1);
        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);
    }
}