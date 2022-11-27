package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String name = in.nextLine();

        System.out.println("Дата: ");
        String day = in.nextLine();

        System.out.println("Месяц: ");
        String mounth = in.nextLine();

        System.out.println("День недели: " + name);
        System.out.println("Дата: " + day);
        System.out.println("Месяц: " + mounth);
        in.close();

    }
}
