package lr4;

    public class Example4 {

        public static void main(String[] args) {
            int a = 10;
            int[][] figure = new int[a][];
            for (int i = 0; i < a; i++) {
                int j = i + 1;
                figure[i] = new int[j];
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < i + 1; j++) {
                    figure[i][j] = 2;
                }
            }
            System.out.print("Сейчас будет выведен прямоугольный треугольник," +
                    "\nнарисованный значениями из двухмерного массива - " +
                    "\nт.е. состоящий из числа 2: ");
            for (int i = 0; i < a; i++) {
                System.out.println();
                for (int j = 0; j < figure[i].length; j++) {
                    System.out.print(figure[i][j] + " ");
                }

            }
        }
    }

