package lr4;

    public class Example3 {

        public static void main(String[] args) {
            int a = 15;
            int b = 10;
            System.out.println("Будет выведен прямоугольник из цифр 2" +
                    " с шириной: " + a + " символов");

            System.out.println("высотой: " + b + " строк");
            int[][] graph = new int[b][a];
            int z = 0;
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    graph[i][j] = 2;
                }
            }
            for (int i = 0; i < b; i++) {
                int count = i + 1;

                if (count > 9) {
                    System.out.print("номер строки " + count + " : ");
                } else System.out.print("номер строки  " + count + " : ");

                for (int j = 0; j < a; j++) {
                    System.out.print(graph[i][j] + " ");
                    z++;
                }
                System.out.println(" Количество символов в строке " + z);
                z = 0;
            }
        }
    }
