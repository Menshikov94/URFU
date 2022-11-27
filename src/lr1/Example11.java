package lr1;

import java.util.Scanner;

    public class Example11 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите имя: ");
            String name = in.nextLine();

            System.out.println("Год рождения: ");
            String year = in.nextLine();

            System.out.println("Имя: " + name);
            System.out.println("Год рождения: " + year);
            in.close();

        }
    }
