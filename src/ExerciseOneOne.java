public class ExerciseOneOne extends Thread {

    public void run() {
        long sum = 0;
        for (int i = 1; i < 1000000001; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
