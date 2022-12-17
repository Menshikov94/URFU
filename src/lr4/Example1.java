package lr4;

    public class Example1 {

        public static void main(String[] args) {
            int rows = 11;
            int columns = 23;
            int z;
            System.out.println("сейчас будет выведен прямоугольник с длиной " + rows + " строк\nи шириной " + columns + " колонки " +
                    "\n");
            for (int i = 1 ; i <= rows; i++){
                if (i < 10) {
                    System.out.print("  " + i + " ");
                } else {
                    System.out.print(" " + i + " ");
                }
                z = 0;
                for (int j = 1; j <= columns; j++){
                    System.out.print("*");
                    z = z + 1;
                }
                System.out.println();
            }
        }
    }
