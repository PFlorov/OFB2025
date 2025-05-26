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


}


