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

    public static void task5(){
        Scanner scanner = new Scanner(System.in);

        String product = scanner.next();
        String town = scanner.next();
        double quantity = scanner.nextDouble();


        switch(product){
            case "coffee":
                if("Sofia".equals(town)){
                   double sofiaC= quantity * 0.50;
                    System.out.println(sofiaC);
                }
                else if ("Plovdiv".equals(town)){
                    double plovdivC= quantity * 0.40;
                    System.out.println(plovdivC);
                }
                else{
                    double varnaC = quantity * 0.45;
                    System.out.println(varnaC);
                }
                break;

            case "water":
                if("Sofia".equals(town)){
                    double sofiaW = quantity * 0.80;
                    System.out.println(sofiaW);
                }
                else if ("Plovdiv".equals(town) || "Varna".equals(town)){
                    double plovdivOrVarnaW = quantity * 0.70;
                    System.out.println(plovdivOrVarnaW);
                }
                break;

            case "beer":
                if("Sofia".equals(town)){
                    double sofiaB = quantity * 1.20;
                    System.out.println(sofiaB);
                }
                else if ("Plovidv".equals(town)){
                    double plovdivB = quantity * 1.15;
                    System.out.println(plovdivB);
                }
                else{
                    double varnaB = quantity * 1.10;
                    System.out.println(varnaB);
                }
                break;

            case "sweets":
                if("Sofia".equals(town)){
                    double sofiaS = quantity * 1.45;
                    System.out.println(sofiaS);
                }
                else if("Plovdiv".equals(town)){
                    double plovdivS = quantity * 1.30;
                    System.out.println(plovdivS);
                }
                else{
                    double varnaS = quantity * 1.35;
                    System.out.println(varnaS);
                }
                break;

            case "peanuts":
                if("Sofia".equals(town)){
                    double sofiaP= quantity * 1.60;
                    System.out.println(sofiaP);
                }
                else if ("Plovdiv".equals(town)){
                    double plovdivP = quantity * 1.50;
                    System.out.println(plovdivP);
                }
                else{
                    double varnaP = quantity * 1.55;
                    System.out.println(varnaP);
                }
                break;

            default:
                System.out.println("please enter valid input");
                break;
        }

        scanner.close();
    }

    }

