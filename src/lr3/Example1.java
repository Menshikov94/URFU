package lr3;
import java.util.Scanner;
public class Example1 {

        public static void main(String[] args) {
            System.out.println("Введите целое число в диапазоне от 1 до 7: ");
            Scanner in = new Scanner(System.in);

            int number = in.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Вы ввели: " + number + " - Это понедельник");
                    break;
                case 2:
                    System.out.println("Вы ввели: " + number + " - Это вторник");
                    break;
                case 3:
                    System.out.println("Вы ввели: " + number + " - Это среда");
                    break;
                case 4:
                    System.out.println("Вы ввели: " + number + " - Это четверг");
                    break;
                case 5:
                    System.out.println("Вы ввели: " + number + " - Это пятница");
                    break;
                case 6:
                    System.out.println("Вы ввели: " + number + " - Это суббота");
                    break;
                case 7:
                    System.out.println("Вы ввели: " + number + " - Это воскресенье");
                default:
                    System.out.println("Введены некоррректные данные");
            }
        }
    }