public class MainTwo {

    public static int n = 0;
    public static boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        ExerciseTwoOne exTwoOne = new ExerciseTwoOne();
        ExerciseTwoOne exTwoTwo = new ExerciseTwoOne();
        ExerciseTwoOne exTwoThree = new ExerciseTwoOne();
        ExerciseTwoOne exTwoFour = new ExerciseTwoOne();
        exTwoOne.start();
        exTwoTwo.start();
        exTwoThree.start();
        exTwoFour.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false;
    }
}
