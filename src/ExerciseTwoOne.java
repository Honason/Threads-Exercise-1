public class ExerciseTwoOne extends Thread {
    public void run() {
        while (MainTwo.running) {
            next();
            System.out.println(MainTwo.n);
        }
    }

    public static synchronized int next() {
        MainTwo.n++;
        MainTwo.n++;
        return MainTwo.n;
    }
}
