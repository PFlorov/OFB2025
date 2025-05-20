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

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Error");
                break;


        }

            scanner.close();
    }

    public static void task3(){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){

            case "dog":
                System.out.println("mammal");
                break;

            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;

            default:
                System.out.println("unknown");
                break;
        }


        scanner.close();

    }

    public static void task4(){
        Scanner scanner = new Scanner(System.in);

        double age = scanner.nextDouble();
        String gender = scanner.next();


        if("m".equals(gender)){
            if(age>=16){
                System.out.println("Mr.");
            }
            else{
                System.out.println("Master");
            }
        }

        if("f".equals(gender)){
            if(age>=16){
                System.out.println("Ms.");
            }
            else{
                System.out.println("Miss");
            }
        }

        scanner.close();
        }

    }

