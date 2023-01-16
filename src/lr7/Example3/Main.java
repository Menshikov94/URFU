package lr7.Example3;

public class Main {
    public static void main(String[] args) {
        SubClass3_1 superClassTest = new SubClass3_1(512);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SubClass3_2 FirstSubClassTest = new SubClass3_2(1024,'K');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        SubClass3_3 SecondSubClassTest = new SubClass3_3(1024,'K',"текст");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
