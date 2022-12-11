package lr3;
import java.util.Scanner;

    public class Example2 {

        public static void main(String[] args) {
            System.out.println("Введи название дня недели: ");

            Scanner in = new Scanner(System.in);

            String dayOfWeek = in.nextLine();
            String s = dayOfWeek.toLowerCase();

            System.out.println("Результат выполнения кода с использованием оператора выбора switch.\n");

            switch (s) {
                case "понедельник":
                    System.out.println("Вы ввели: Понедельник, порядковый номер - 1");
                    break;
                case "вторник":
                    System.out.println("Вы ввели: Вторник, порядковый номер - 2");
                    break;
                case "среда":
                    System.out.println("Вы ввели: Среда, порядковый номер - 3");
                    break;
                case "четверг":
                    System.out.println("Вы ввели: Четверг, порядковый номер - 4");
                    break;
                case "пятница":
                    System.out.println("Вы ввели: Пятница, порядковый номер - 5");
                    break;
                case "суббота":
                    System.out.println("Вы ввели: Суббота, порядковый номер - 6");
                    break;
                case "воскресенье":
                    System.out.println("Вы ввели: Воскресенье, порядковый номер - 7");
                default:
                    System.out.println("\n такого дня нет, проверьте введенные данные");

            }

            System.out.println("\nА это результат выполнения кода\n с использованием вложенных условных операторов.\n");


            if(s.equals("понедельник")) {
                System.out.println("Вы ввели: Понедельник, порядковый номер - 1");

            } else if(s.equals("вторник")) {
                System.out.println("Вы ввели: Вторник, порядковый номер - 2");

            } else if(s.equals("среда")) {
                System.out.println("Вы ввели: Среда, порядковый номер - 3");
            } else if(s.equals("четверг")) {
                System.out.println("Вы ввели: Четверг, порядковый номер - 4");
            } else if(s.equals("пятница")) {
                System.out.println("Вы ввели: Понедельник, порядковый номер - 5");

            } else if(s.equals("суббота")) {
                System.out.println("Вы ввели: Суббота, порядковый номер - 6");
            } else if(s.equals("воскресенье")) {
                System.out.println("Вы ввели: Воскресенье, порядковый номер - 7");
            } else System.out.println("\nтакого дня нет, проверьте введенные данные");

        }
    }
