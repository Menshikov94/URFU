package lr9.Task2.Task2;

import java.util.Random;
import java.util.Scanner;

public class Example2 {
        public static void main(String[] args) {
            arr();
            Scanner in = new Scanner(System.in);
            boolean b;
            System.out.println("Введите номер столбца");
            do {
                try {
                    b = false;
                    print(in.next());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("– нет столбца с таким номером.\n" +
                            "введите корректное значение");
                    b = true;
                } catch (NumberFormatException e) {
                    System.out.println("– ввод строки вместо числа. \n" +
                            "введите корректное значение");
                    b = true;
                }

            }while (b);



        }
        private static final int [][] matrix = new int[4][4];


        private static void arr() {
            Random random = new Random();
            for (int i = 0; i < matrix.length; i ++) {
                for (int j = 0; j < matrix.length; j ++) {
                    matrix[i][j] = random.nextInt(100);
                }

            }
        }
        private static void print(String a) {
            for (int i = 0; i < matrix.length; i ++) {
                System.out.print("[" + matrix[Integer.parseInt(a) - 1][i] + "] ");
            }
        }
}
