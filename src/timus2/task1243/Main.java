package timus2.task1243;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String out = in.nextLine();
        long n = Integer.parseInt(out);
        System.out.println(n % 7);
    }
}
