import java.util.Scanner;

public class Homework1_L2 {


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

    public static void task4(){
            Scanner scanner = new Scanner(System.in);

            double puzzlePrice = 2.60;
            int talkingDollPrice = 3;
            double teddyBearPrice = 4.10;
            double minionPrice = 8.20;
            int truckPrice = 2;

            double tripCost = scanner.nextDouble();
            int numberOfPuzzles = scanner.nextInt();
            int numberOfTalkingDolls = scanner.nextInt();
            int numberOfTeddyBears = scanner.nextInt();
            int numberOfMinions = scanner.nextInt();
            int numberOfTrucks = scanner.nextInt();

            int totalToys = numberOfPuzzles + numberOfTalkingDolls + numberOfTeddyBears + numberOfMinions + numberOfTrucks;
            double totalCostOfOrder = numberOfPuzzles * puzzlePrice +
                    numberOfTalkingDolls * talkingDollPrice +
                    numberOfTeddyBears * teddyBearPrice +
                    numberOfMinions * minionPrice +
                    numberOfTrucks * truckPrice;
            if(totalToys >= 50){
                totalCostOfOrder = totalCostOfOrder * 0.75;

            }

            double moneyLeftAfterRent = totalCostOfOrder * 0.90;


            if (moneyLeftAfterRent > tripCost){
                moneyLeftAfterRent -= tripCost;
                System.out.printf("Yes! %.2f lv left.",moneyLeftAfterRent );
            }
            else{
                tripCost -= moneyLeftAfterRent;
                System.out.printf("Not enough money! %.2f lv needed.",tripCost);
            }

    }

    public static void task5(){

        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int extras = scanner.nextInt();
        double priceForClothing= scanner.nextDouble();

        double decorCost = budget * 0.10;
        double totalPriceForClothing = extras * priceForClothing;

        if (extras > 150) {
            totalPriceForClothing *= 0.90;
        }

        double totalExpenses = decorCost + totalPriceForClothing;
        double moneyLeft = budget - totalExpenses;

        if (moneyLeft >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }

        else {

            double moneyNeeded = Math.abs(moneyLeft);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
        }

    }

    public static void task6(){

        Scanner scanner = new Scanner(System.in);

        double worldRecordInSec= scanner.nextDouble();
        double distanceInMeters = scanner.nextDouble();
        double timeInSecForOneMeter = scanner.nextDouble();

        double timeForDistance = distanceInMeters * timeInSecForOneMeter;

        double addedTime = (Math.floor(distanceInMeters / 15)) * 12.5;
        double totalTime = timeForDistance + addedTime;

        double quickChek = totalTime - worldRecordInSec;

        if(totalTime > worldRecordInSec){
            System.out.printf("No, he failed! He was %.2f seconds slower.",quickChek);
        }
        else  {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }


        scanner.close();
    }

    public static void task7(){
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int videoCards = scanner.nextInt();
        int processors = scanner.nextInt();
        int ramMemory = scanner.nextInt();

        double videoCardPrice = 250.0;
        double videoCardsTotal = videoCards * videoCardPrice;

        double processorPricePerUnit = videoCardsTotal * 0.35;
        double processorsTotal = processors * processorPricePerUnit;

        double ramMemoryPricePerUnit = videoCardsTotal * 0.10;
        double ramMemoryTotal = ramMemory * ramMemoryPricePerUnit;

        double totalCost = videoCardsTotal + processorsTotal + ramMemoryTotal;

        if (videoCards > processors) {
            totalCost *= 0.85;
        }

        if (budget >= totalCost) {
            double remainingBudget = budget - totalCost;
            System.out.printf("You have %.2f leva left!", remainingBudget);
        } else {
            double neededMoney = totalCost - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
        }

        scanner.close();
    }

    public static void task8(){
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = scanner.nextInt();
        int breakDuration = scanner.nextInt();

        double lunchTime = breakDuration / 8.0;
        double restTime = breakDuration / 4.0;

        double remainingTime = breakDuration - lunchTime - restTime;

        if (remainingTime >= episodeDuration) {
            double timeLeft = remainingTime - episodeDuration;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(timeLeft));
        } else {
            double neededTime = episodeDuration - remainingTime;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(neededTime));
        }

        scanner.close();
    }
    }



