public class Main {

    public static boolean taskThree = true;

    public static void main(String[] args) throws InterruptedException{

        ExerciseOneOne exOne = new ExerciseOneOne();
        ExerciseOneTwo exOneT = new ExerciseOneTwo();
        ExerciseOneThree exOneTh = new ExerciseOneThree();
        exOne.start();
        exOneT.start();
        exOneTh.start();
        System.out.println("After start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        taskThree = false;

        exOne.join();

        exOneT.join();
        exOneTh.join();
        System.out.println("After finish");
    }
}