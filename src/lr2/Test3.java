package lr2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("Введите целое число, которое делится на 4 без остатка и больше 10: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int result = x % 4;

        if (result == 0 && x > 10) {
            System.out.println("Введеное число удовлетворяет требованиям");
        } else System.out.println("Введеное число не удовлетворяет требованиям");
in.close();
            }
        }
