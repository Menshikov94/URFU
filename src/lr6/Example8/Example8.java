package lr6.Example8;

class Example8 {
    private static double result;

    private static void average(int... ints) {
        double colum = 0;
        int summ = 0;
        for (int i = 0; i < ints.length; i++) {
            summ += ints[i];
            colum ++;
        }
        result = summ / colum;
    }
    static double avg(){
        average(1, 2, 3, 4, 5);
        return result;
    }
}
