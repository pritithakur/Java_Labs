public class ThreadDemo {
    public static void main(String[] args) {
        int[] arr = {1, 20, 50, 15, 30};
        Thread average = new Thread(new AvgCal(arr));
        Thread square = new Thread(new Sq(arr));
        average.start();
        square.start();
    }
}

class AvgCal implements Runnable {
    private int[] arr;

    public AvgCal(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double result = (double) sum / arr.length;
        System.out.printf("The Average of the array is: %.2f%n", result);
    }
}

class Sq implements Runnable {
    private int[] arr;

    public Sq(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int num : arr) {
            System.out.println("Square of " + num + ": " + (num * num));
            try {
                Thread.sleep(1000); // Sleep for 1 second between printing squares
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
