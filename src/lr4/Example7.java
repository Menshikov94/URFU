package lr4;

    public class Example7 {

        public static void main(String[] args) {

            int a = 10;
            int b = 10;
            int[][] arrayZmeyka = new int[a][b];
            int hvost = 0;
            int telo = 0;
            int h = 0;
            for (int i = 0; h < arrayZmeyka.length ; h++) {
                for (int j = 0; j <(arrayZmeyka[i].length - hvost); j++) {
                    arrayZmeyka[i][j] = telo;
                    telo++;
                }
                if(i< arrayZmeyka.length-1) {
                    i++;}
                for (int o = a-1; o > hvost; o--) {
                    arrayZmeyka[o][arrayZmeyka[i].length-1-hvost] = telo;
                    telo++;
                }
                hvost++;
            }
            int z = 0;
            for (int i = 0; i < arrayZmeyka.length; i++){
                int count = i+1;
                if (count < 10) {
                    System.out.print("номер строки " + count + " :  ");
                } else {
                    System.out.print("номер строки " + count + " : ");
                }
                for (int j = 0; j < arrayZmeyka[i].length; j++){
                    if (arrayZmeyka[i][j] < 10) {
                        System.out.print(arrayZmeyka[i][j] + "  ");
                    } else {
                        System.out.print(arrayZmeyka[i][j] + " ");
                    }
                    z++;
                }
                System.out.println(" Количество символов в строке " + z);
                z = 0;
            }
        }


    }
