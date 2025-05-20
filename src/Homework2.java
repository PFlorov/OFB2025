import java.util.Scanner;

public class Homework2 {

    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        switch (inputNumber){

            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Error");
                break;


        }


        scanner.close();
    }




}
