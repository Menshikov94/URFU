package lr4;

import java.util.Random;

    public class Example6 {

        public static void main(String[] args) {
            // Создание объекта класса Random
            Random random = new Random(200);
            int a = 5;
            int b = 5;
            Random random1 = new Random();
            // создание первого массива
            int[][] firstArray = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    firstArray[i][j] = random.nextInt(100);
                    System.out.println("[" + i + "][" + j + "] " + firstArray[i][j]);
                }
            }
            System.out.println("===================================");
            int deleteS = random1.nextInt(a - 1);
            int deleteK = random1.nextInt(b - 1);

            System.out.println("delete_S = " + deleteS + "; delete_K= " + deleteK);
            System.out.println("===================================");
            int[][] secondArray = new int[a - 1][b - 1];
            for (int i = 0, s = 0; i < a - 1; s++) {
                for (int j = 0, k = 0; j < b - 1; k++) {
                    if (k != deleteK | s != deleteS) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("[" + i + "][" + j + "] " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;

            }
        }
    }
