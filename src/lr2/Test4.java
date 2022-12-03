package lr2;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {

        System.out.println("Введите число в диапазоне от 5 до 10: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x > 4 && x < 11) {
            System.out.println("Введеное число удовлетворяет требованиям");
        } else System.out.println("Введеное число не удовлетворяет требованиям");
        in.close();
}
}
