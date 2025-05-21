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

    public static void task6(){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num >= -100 && num <= 100 && num != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    public static void task7(){
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        String dayOfWeek = scanner.next();

        boolean isWorkingDay = dayOfWeek.equals("Monday") ||
                dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday") ||
                dayOfWeek.equals("Saturday");

        boolean isWorkingHour = hour >= 10 && hour <= 18;

        if (isWorkingDay && isWorkingHour) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

        scanner.close();
    }

    public static void task8(){
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.next();

        switch (userInput){
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;

            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;

            case "Saturday":
            case "Sunday":
                System.out.println(16);
                break;

            default :
                System.out.println("Enter a valid user input");
                break;
        }
        scanner.close();
    }

    public static void task9(){

        Scanner scanner = new Scanner(System.in);

        String fruitOrVegetable= scanner.next();

        switch(fruitOrVegetable){

            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;

            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":

                System.out.println("vegetable");
                break;

            default:
                System.out.println("unknown");
                break;
        }

        scanner.close();
    }

    public static void task10(){

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

     boolean isValid = (input >= 100 && input <= 200) || input == 0;

     if (!isValid){
         System.out.println("invalid");
     }

        scanner.close();
    }

    public static void task11(){

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = scanner.nextDouble();
        double price = 0;
        boolean isValidInput = true;


        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday")) {

            switch (fruit) {
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    isValidInput = false;
                    break;
            }
        }

        else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {

            switch (fruit) {
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
                default:
                    isValidInput = false;
                    break;
            }
        }

        else {
            isValidInput = false;
        }


        if (isValidInput) {
            double totalCost = price * quantity;
            System.out.printf("%.2f", totalCost); // Форматиране до 2
        } else {
            System.out.println("error");
        }

        scanner.close();
    }

    public static void task12(){
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = scanner.nextDouble();
        double commission = 0;
        boolean isValidInput = true;


        if (sales < 0) {
            isValidInput = false;
        } else {
            switch (city) {
                case "Sofia":
                    if (sales >= 0 && sales <= 500) {
                        commission = sales * 0.05;
                    } else if (sales > 500 && sales <= 1000) {
                        commission = sales * 0.07;
                    } else if (sales > 1000 && sales <= 10000) {
                        commission = sales * 0.08;
                    } else if (sales > 10000) {
                        commission = sales * 0.12;
                    }
                    break;
                case "Varna":
                    if (sales >= 0 && sales <= 500) {
                        commission = sales * 0.045;
                    } else if (sales > 500 && sales <= 1000) {
                        commission = sales * 0.075;
                    } else if (sales > 1000 && sales <= 10000) {
                        commission = sales * 0.10;
                    } else if (sales > 10000) {
                        commission = sales * 0.13;
                    }
                    break;
                case "Plovdiv":
                    if (sales >= 0 && sales <= 500) {
                        commission = sales * 0.055;
                    } else if (sales > 500 && sales <= 1000) {
                        commission = sales * 0.08;
                    } else if (sales > 1000 && sales <= 10000) {
                        commission = sales * 0.12;
                    } else if (sales > 10000) {
                        commission = sales * 0.145;
                    }
                    break;
                default:
                    isValidInput = false;
                    break;
            }
        }

        if (isValidInput) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }

        scanner.close();
    }

    }

