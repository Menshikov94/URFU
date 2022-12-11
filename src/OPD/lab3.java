package OPD;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Плановый бюджет, y.e.");
        float a = in.nextInt();
        System.out.println("Запланированный срок, мес:");
        float b = in.nextInt();
        System.out.println("Время проверки (сегодня), мес");
        float c = in.nextInt();
        System.out.println("Степень готовности проекта (сегодня), %:");
        float d = in.nextInt();
        System.out.println("Расходы на сегодня, у.е.");
        float f = in.nextInt();

        float x = (c * 100);
        float z = x / d;
        float y = z - b;
        System.out.println("Задержка срока составляет: " + y);

        float k = (z * f) / c;
        System.out.println("Новый бюджет составит: " + k);

        float m = k - a;
        System.out.println("Перерасход бюджета составил: " + m);

        float l = b + y;
        System.out.println("Новый срок сдачи проекта: " + l);

    }
}
