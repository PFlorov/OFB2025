import java.util.Scanner;

public class Homework3_L3 {

    public static void task1(){
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        int row = sc.nextInt();
        int col = sc.nextInt();


        double price = switch(type){
            case "Premiere"-> 12;
            case "Normal" -> 7.50;
            case "Discount" -> 5;
            default -> 0;
        };

    String output = (price !=0 && row>=0 && col>=0)
            ? String.format("%.2f leva",row * col * price)
            : "invalid input";

        System.out.println(output);

        sc.close();


    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);

        int degrees = sc.nextInt();
        String timeOfDay = sc.next();

        String outfit = "";
        String shoes = "";


            switch (timeOfDay) {
                case "Morning":
                    if (degrees >= 10 && degrees <= 18) {
                        outfit = "Sweatshirt";
                        shoes = "Sneakers";
                    } else if (degrees > 18 && degrees <= 24) {
                        outfit = "Shirt";
                        shoes = "Moccasins";
                    } else if (degrees >= 25) {
                        outfit = "T-Shirt";
                        shoes = "Sandals";
                    }
                    break;

                case "Afternoon":
                    if (degrees >= 10 && degrees <= 18) {
                        outfit = "Shirt";
                        shoes = "Moccasins";
                    } else if (degrees > 18 && degrees <= 24) {
                        outfit = "T-Shirt";
                        shoes = "Sandals";
                    } else if (degrees >= 25) {
                        outfit = "Swim Suit";
                        shoes = "Barefoot";
                    }
                    break;

                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

                default:
                    break;
            }



            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);


        sc.close();
    }

    public static void task3(){
        Scanner sc = new Scanner(System.in);

        String flowerType = sc.next();
        int flowerCount = sc.nextInt();
        int budget = sc.nextInt();

        double pricePerFlower = switch (flowerType) {
            case "Roses" -> 5.00;
            case "Dahlias" -> 3.80;
            case "Tulips" -> 2.80;
            case "Narcissus" -> 3.00;
            case "Gladiolus" -> 2.50;
            default -> 0;
        };

        double totalCost = flowerCount * pricePerFlower;

            if (flowerType.equals("Roses") && flowerCount > 80) {
                totalCost *= 0.90;
            } else if (flowerType.equals("Dahlias") && flowerCount > 90) {
                totalCost *= 0.85;
            } else if (flowerType.equals("Tulips") && flowerCount > 80) {
                totalCost *= 0.85;
            }

            if (flowerType.equals("Narcissus") && flowerCount < 120) {
                totalCost *= 1.15;
            } else if (flowerType.equals("Gladiolus") && flowerCount < 80) {
                totalCost *= 1.20;
            }

            if (budget >= totalCost) {
                double moneyLeft = budget - totalCost;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, moneyLeft);
            } else {
                double neededMoney = totalCost - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }

            sc.close();
    }

    public static void task4(){
        Scanner scanner = new Scanner(System.in);

        int budget = scanner.nextInt();
        String season = scanner.next();
        int numberOfFishers = scanner.nextInt();

        double boatRent = switch (season) {
            case "Spring"-> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter"-> 2600;
            default -> throw new Error("Invalid Season");
        };


        if (numberOfFishers <= 6) {
            boatRent *= 0.90;
        } else if (numberOfFishers >= 7 && numberOfFishers <= 11) {
            boatRent *= 0.85;
        } else if (numberOfFishers >= 12) {
            boatRent *= 0.75;
        }

        if (numberOfFishers % 2 == 0 && !season.equals("Autumn")) {
            boatRent *= 0.95;
        }

        if (budget >= boatRent) {
            double moneyLeft = budget - boatRent;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double neededMoney = boatRent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }

        scanner.close();
    }

    public static void task5(){
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        String season = scanner.next();

        String destination = "";
        String accommodationType = "";
        double spentAmount = 0;

        if (budget <= 100) {
            destination = "Bulgaria ";
            if (season.equals("summer")) {
                accommodationType = "Camp";
                spentAmount = budget * 0.30;
            } else if (season.equals("winter")) {
                accommodationType = "Hotel";
                spentAmount = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans ";
            if (season.equals("summer")) {
                accommodationType = "Camp";
                spentAmount = budget * 0.40;
            } else if (season.equals("winter")) {
                accommodationType = "Hotel";
                spentAmount = budget * 0.80;
            }
        } else {
            destination = "Europe ";
            accommodationType = "Hotel";
            spentAmount = budget * 0.90;
        }

        System.out.printf("Somewhere in %s", destination);
        System.out.printf("%s - %.2f", accommodationType, spentAmount);

        scanner.close();
    }

    public static void task6(){
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        String operator = scanner.next();

        double result = 0;
        int remainder = 0;
        boolean specialCase = false;


        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    specialCase = true;
                } else {
                    result = (double) n1 / n2;
                }
                break;
            case "%":
                if (n2 == 0) {
                    specialCase = true;
                } else {
                    remainder = n1 % n2;
                }
                break;
            default:
                break;
        }

        if (specialCase) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else {

            switch (operator) {
                case "+":
                case "-":
                case "*":
                    String evenOrOdd = (result % 2 == 0) ? "even" : "odd";
                    System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
                    break;
                case "/":
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
                    break;
                case "%":
                    System.out.printf("%d %s %d = %d", n1, operator, n2, remainder);
                    break;
                default:
                    break;
            }
        }

        scanner.close();
    }

    public static void task7(){
        Scanner scanner = new Scanner(System.in);

        String month = scanner.next();
        int numberOfNights = scanner.nextInt();
        double studioPricePerNight = 0;
        double apartmentPricePerNight = 0;

        switch (month) {
            case "May", "October"->{
                studioPricePerNight = 50;
                apartmentPricePerNight = 65;
            }
            case "June","September"->{
                studioPricePerNight = 75.20;
                apartmentPricePerNight = 68.70;
            }
            case "July","August"->{
                studioPricePerNight = 76;
                apartmentPricePerNight = 77;
            }
        }

        if (month.equals("May") || month.equals("October")) {
            if (numberOfNights > 14) {
                studioPricePerNight *= 0.70;
            } else if (numberOfNights > 7) {
                studioPricePerNight *= 0.95;
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (numberOfNights > 14) {
                studioPricePerNight *= 0.80;
            }
        }

        if (numberOfNights > 14) {
            apartmentPricePerNight *= 0.90;
        }

        double totalStudioCost = studioPricePerNight * numberOfNights;
        double totalApartmentCost = apartmentPricePerNight * numberOfNights;

        System.out.printf("Apartment: %.2f lv.%n", totalApartmentCost);
        System.out.printf("Studio: %.2f lv.%n", totalStudioCost);

        scanner.close();
    }

    public static void task8(){

        Scanner scanner = new Scanner(System.in);

        int examHour = scanner.nextInt();
        int examMinute = scanner.nextInt();
        int arrivalHour = scanner.nextInt();
        int arrivalMinute = scanner.nextInt();

        int examTotalMinutes = examHour * 60 + examMinute;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinute;

        int timeDifference = arrivalTotalMinutes - examTotalMinutes;

        String status = "";
        String details = "";


        if (timeDifference > 0) {
            status = "Late";
        } else if (timeDifference >= -30) {
            status = "On time";
        } else {
            status = "Early";
        }

        if (timeDifference != 0) {
            int absoluteDifference = Math.abs(timeDifference);
            int hours = absoluteDifference / 60;
            int minutes = absoluteDifference % 60;

            if (hours > 0) {
                details += hours + (hours == 1 ? " hour" : " hours");
                if (minutes > 0) {
                    details += " and " + minutes + (minutes == 1 ? " minute" : " minutes");
                }
            } else {
                details += minutes + (minutes == 1 ? " minute" : " minutes");
            }

            if (timeDifference < 0) {
                details += " before the start";
            } else {
                details += " after the start";
            }
        }

        System.out.println(status);
        if (!details.isEmpty()) {
            System.out.println(details);
        }

        scanner.close();
    }

    public static void task9(){
        Scanner scanner = new Scanner(System.in);

        int daysOfStay = scanner.nextInt();
        scanner.nextLine();
        String roomType = scanner.nextLine();
        String evaluation = scanner.nextLine();

        int nights = daysOfStay - 1;
        double pricePerNight = 0;
        double discountPercentage = 0;


        switch (roomType) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                break;
            case "president apartment":
                pricePerNight = 35.00;
                break;
        }


        switch (roomType) {
            case "apartment":
                if (nights < 10) {
                    discountPercentage = 0.30;
                } else if (nights >= 10 && nights <= 15) {
                    discountPercentage = 0.35;
                } else if (nights > 15) {
                    discountPercentage = 0.50;
                }
                break;
            case "president apartment":
                if (nights < 10) {
                    discountPercentage = 0.10;
                } else if (nights >= 10 && nights <= 15) {
                    discountPercentage = 0.15;
                } else if (nights > 15) {
                    discountPercentage = 0.20;
                }
                break;
        }

        double totalCostBeforeEvaluation = pricePerNight * nights;
        totalCostBeforeEvaluation -= totalCostBeforeEvaluation * discountPercentage;


        if (evaluation.equals("positive")) {
            totalCostBeforeEvaluation *= 1.25;
        } else if (evaluation.equals("negative")) {
            totalCostBeforeEvaluation *= 0.90;
        }


        System.out.printf("%.2f%n", totalCostBeforeEvaluation);

        scanner.close();
    }
}


