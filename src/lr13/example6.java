package lr13;

import java.util.Random;

public class example6 {

    public static void main(String[] args) {
        int n = 10000000;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("у процессора ядер: " + processors);
        int size = n / processors;
        System.out.println("количество элементов для суммирования на каждое ядро: " + size
                + " из: " + n);
        SumTask[] tasks = new SumTask[processors];
        Thread[] threads = new Thread[processors];
        for (int i = 0; i < processors; i++) {
            tasks[i] = new SumTask(arr, i * size, (i + 1) * size);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        int sum = 0;
        for (int i = 0; i < processors; i++) {
            try {
                threads[i].join();
                sum += tasks[i].getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сумма всех элементов в массиве " + sum);
    }
}

class SumTask implements Runnable {
    private int[] arr;
    private int start;
    private int end;
    private int sum;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
