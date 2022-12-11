package lr3;

public class Example8 {

    public static void main(String[] args) {
        int n = 10;
        char[] chars = new char[n];
        char[] onlyChars = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        int i;
        int j;


        for(i = 0; i < n; i++) {
            int q = 1;
            for(j = 0; j < onlyChars.length; j++) {
                if(b == onlyChars[j]) {
                    i--;
                    q = 0;
                }
            }
            if(q == 1) {
                chars[i] = b;
            }
            b++;
        }
        for(int k = 0; k < n; k++){
            System.out.print(chars[k] + ", ");
        }
    }
}
