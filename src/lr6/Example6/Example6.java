package lr6.Example6;

public class Example6 {
    private static int[] secondArray;

    static int[] array(int[] ints, int n) {
        if (n > ints.length) {
            return ints;
        }
        secondArray = new int[n];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = ints[i];

        }
        return secondArray;
    }
}

