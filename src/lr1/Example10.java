package lr1;

import java.util.Scanner;

public class Example10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Год рождения:");
            int num = in.nextInt();
            num = 2022 - num;
            System.out.println("Возраст пользователя = " + num);
        }
    }
