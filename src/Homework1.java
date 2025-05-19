import java.util.Scanner;

public class Homework1 {


    public static void task1(){

        Scanner scanner = new Scanner(System.in);
        int timeFirst = scanner.nextInt();
        int timeSecond = scanner.nextInt();
        int timeThird = scanner.nextInt();

        int totalTime = timeFirst + timeSecond + timeThird;
        int timeInMinutes = totalTime / 60;
        int timeInSeconds = totalTime % 60;

            if(timeInSeconds < 10){
                System.out.printf("%d:0%d",timeInMinutes,timeInSeconds);
            }
            else{
                System.out.printf("%d:%d",timeInMinutes,timeInSeconds);
            }

        scanner.close();
    }



}
