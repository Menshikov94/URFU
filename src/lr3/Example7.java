package lr3;

    public class Example7 {

        public static void main(String[] args) {
            int n = 10;
            char[] chars = new char[n];
            char b = 'a';

            System.out.println("Отобразим массив символов в консольном окне: ");

            for (int i = 0; i < chars.length; i++) {
                chars[i] = b;
                b+=2;
                System.out.print(chars[i] + ", ");
            }

            System.out.println("\nОтобразим массив символов в консольном окне, в обратном порядке: ");
            for (int i = chars.length - 1 ; i >= 0; i--) {
                System.out.print(chars[i] + ", ");
            }
        }
    }
