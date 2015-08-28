public class ExerciseOneThree extends Thread {
    public void run() {
        int number = 10;
        while (Main.taskThree) {
            System.out.println(number);
            number++;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
