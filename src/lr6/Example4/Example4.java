package lr6.Example4;

public class Example4 {
    static int result;
    //это рекурсивный метод

    static int fact(int n) {
        System.out.println("*" + n);
        if (n == 1) return 1;
        if (n == 2) return 2;
        result = fact (n - 2) * n;
        return result;
    }
    //это метод без рекурсии
    static int fact2(int n) {
        result = n;
        int j = n;
        System.out.println();
        for(int i = n; i > 2; i = i - 2) {
            System.out.println("*" + j);
            j = j - 2;
            result *= j;
        }
        return result;
    }


}
