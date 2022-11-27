package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваш возраст:");
        int num = in.nextInt();
        num = 2022 - num;
        System.out.println("Год рождения = " + num);
    }
}
