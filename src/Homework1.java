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

    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        int intputNumber = scanner.nextInt();
        double bonus = 0;

        if(intputNumber <= 100){
            bonus= 5;
        }
        else if (intputNumber > 1000){
            bonus = intputNumber * 0.1;
        }
        else{
            bonus = intputNumber * 0.2;
        }

        if(intputNumber % 2 == 0){
            bonus = bonus + 1;
        }
        else if  (intputNumber % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(intputNumber + bonus);

        scanner.close();
    }


}
