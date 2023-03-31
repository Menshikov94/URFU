package lr9.Task2.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try {
            positivAvg();
        } catch (NullPointerException e) {
            System.out.println("Отсутствуют положительные элементы");
        } catch (InputMismatchException e) {
            System.out.println("– несоответствие числового типа данных");
        } catch (NumberFormatException e) {
            System.out.println("– ввод строки вместо числа;");
        }

    }
    private static final int[] ints = new int[5];

    private static void positivAvg () throws NullPointerException {
        int a = 0;
        int count = 0;
        int z;
        Scanner in = new Scanner(System.in);
        System.out.println("введите 5 чисел для вычисления\n");
        for (int i = 0; i < ints.length; i ++) {
            z = Integer.parseInt(in.next());
            if (z >= 2147483647 || z <= -2147483648) {
                throw new InputMismatchException();
            }
            ints[i] = z;
        }
        for (int anInt : ints) {
            if (anInt >= 0) {
                a += anInt;
                count++;
            }


        }
        if (count == 0) {
            throw new NullPointerException();
        }
        System.out.println("среднее значение положительных элементов [" + a / count + "]");

    }
}
