package lr6.Example1;

public class Example1 {
    //символьное поле
    char ch;
    //текстовое поле
    String str;
    //перегруженный метод, который присваивает значение символьному полю
    void Set (char ch1) {
        ch = ch1;

    }
    //перегруженный метод, который присваивает значение текстовому полю
    void Set (String str1) {
        str = str1;
    }
    //перегруженный метод, который присваивает значение текстовому или символьному полю
    //взависимости от длины символьного массива
    void Set (char[] chars) {
        if (chars.length == 1) {
            ch = chars[0];
        } else if (chars.length > 1) {
            str = String.valueOf(chars);
        }
    }


}
