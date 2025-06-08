import javax.net.ssl.SSLContext;
import java.util.Scanner;



public class Homework4_L4_2 {


  static void task1(){

    for (int i = 7; i<=997; i++){

      if( i % 10 == 7 ) System.out.println(i);

    }

  }

  static void task2(){

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    int totalSum = 0;
    int maxNumber = 0;

    int[] numbers = new int[input];

    for (int i = 0; i < input; i++) {

      int currentNumber = scanner.nextInt();

      numbers[i] = currentNumber;
      totalSum += currentNumber;

      if (currentNumber > maxNumber) maxNumber = currentNumber;

    }

    boolean found = false;
    int foundValue = 0;

    for (int number : numbers) {

      if (number == (totalSum - number)) {
        found = true;
        foundValue = number;
        break;

      }

    }

    if (found) {

      System.out.println("Yes");
      System.out.printf("Sum = %d%n",foundValue);

    } else {

      int diff = Math.abs(maxNumber - (totalSum - maxNumber));
      System.out.println("No");
      System.out.printf("Diff = %d%n",diff);

    }

    scanner.close();
  }

  static void task3(){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int countP1 = 0;
    int countP2 = 0;
    int countP3 = 0;
    int countP4 = 0;
    int countP5 = 0;


    for (int i = 0; i < n; i++) {

      int number = scanner.nextInt();

        if (number < 200) {
          countP1++;
        } else if (number <= 399) {
          countP2++;
        } else if (number <= 599) {
          countP3++;
        } else if (number <= 799) {
          countP4++;
        } else {
          countP5++;
        }

    }

    double p1 = (countP1 * 100.0) / n;
    double p2 = (countP2 * 100.0) / n;
    double p3 = (countP3 * 100.0) / n;
    double p4 = (countP4 * 100.0) / n;
    double p5 = (countP5 * 100.0) / n;


    System.out.printf("%.2f%n", p1);
    System.out.printf("%.2f%n", p2);
    System.out.printf("%.2f%n", p3);
    System.out.printf("%.2f%n", p4);
    System.out.printf("%.2f%n", p5);

    scanner.close();
  }

  static void task4(){
    Scanner scanner = new Scanner(System.in);

    int age = scanner.nextInt();
    double price = scanner.nextDouble();
    int priceForToy = scanner.nextInt();

    int sumOfMoney = 0;
    int countOfToys = 0;
    int timesMoneyTaken = 0;


    for(int i = 1; i<=age; i++){
      if (i % 2 == 0) {
        if (i == 2) {
          sumOfMoney += 10;
        } else {
          sumOfMoney += i * 5;
        }
        timesMoneyTaken++;
      } else {
        countOfToys++;
      }
    }

    int overalSum = (sumOfMoney + countOfToys * priceForToy) - timesMoneyTaken;

    if(overalSum>=price){
      System.out.printf("Yes! %.2f",(double)overalSum-price);
    }
    else {
      System.out.printf("No! %.2f",price-(double)overalSum);
    }


  }

  static void task5(){

    Scanner scanner = new Scanner(System.in);

    int inputTab = scanner.nextInt();
    int salary = scanner.nextInt();


    for(int i = 0; i<=inputTab ; i++){
        String tabName = scanner.nextLine();

        if("Facebook".equals(tabName)) {
          salary -= 150;
        }
        else if("Instagram".equals(tabName)) {
          salary -= 100;
        }
        else if ("Reddit".equals(tabName)) {
          salary -= 50;
        }
    }
    if(salary <= 0){
      System.out.println("You have lost your salary.");
    }
    else {
      System.out.println(salary);
    }

  }

  static void task6(){
    Scanner scanner = new Scanner(System.in);


    String actorName = scanner.nextLine();
    double academyPoints = scanner.nextDouble();
    int evaluatorsCount = scanner.nextInt();

    scanner.nextLine();

    double totalPoints = academyPoints;
    boolean nominated = false;


    for (int i = 0; i < evaluatorsCount; i++) {
      String evaluatorName = scanner.nextLine();
      double evaluatorPoints = scanner.nextDouble();

      if (i < evaluatorsCount - 1) {
        scanner.nextLine();
      }

      double currentEvaluatorScore = (evaluatorName.length() * evaluatorPoints) / 2.0;

      totalPoints += currentEvaluatorScore;

      if (totalPoints > 1250.5) {
        nominated = true;
        break;
      }
    }


    if (nominated) {
      System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n",
          actorName, totalPoints);
    } else {
      double neededPoints = 1250.5 - totalPoints;
      System.out.printf("Sorry, %s you need %.1f more!%n",
          actorName, neededPoints);
    }

    scanner.close();
  }

  static void task7(){
    Scanner scanner = new Scanner(System.in);


    int numberOfGroups = scanner.nextInt();


    int musalaClimbers = 0;
    int montBlancClimbers = 0;
    int kilimanjaroClimbers = 0;
    int k2Climbers = 0;
    int everestClimbers = 0;

    int totalClimbers = 0;

    for (int i = 0; i < numberOfGroups; i++) {

      int peopleInGroup = scanner.nextInt();

      totalClimbers += peopleInGroup;

      if (peopleInGroup <= 5) {
        musalaClimbers += peopleInGroup;
      } else if (peopleInGroup <= 12) {
        montBlancClimbers += peopleInGroup;
      } else if (peopleInGroup <= 25) {
        kilimanjaroClimbers += peopleInGroup;
      } else if (peopleInGroup <= 40) {
        k2Climbers += peopleInGroup;
      } else {
        everestClimbers += peopleInGroup;
      }
    }

    System.out.printf("%.2f%%%n", (musalaClimbers * 100.0) / totalClimbers);
    System.out.printf("%.2f%%%n", (montBlancClimbers * 100.0) / totalClimbers);
    System.out.printf("%.2f%%%n", (kilimanjaroClimbers * 100.0) / totalClimbers);
    System.out.printf("%.2f%%%n", (k2Climbers * 100.0) / totalClimbers);
    System.out.printf("%.2f%%%n", (everestClimbers * 100.0) / totalClimbers);

    scanner.close();
  }

  static void task8(){
    Scanner scanner = new Scanner(System.in);

    int numberOfTournaments = scanner.nextInt();
    int initialPoints = scanner.nextInt();

    int totalPointsFromTournaments = 0;
    int winsCount = 0;


    for (int i = 0; i < numberOfTournaments; i++) {
      String stageReached = scanner.next();

      switch (stageReached) {
        case "W":
          totalPointsFromTournaments += 2000;
          winsCount++;
          break;
        case "F":
          totalPointsFromTournaments += 1200;
          break;
        case "SF":
          totalPointsFromTournaments += 720;
          break;
      }
    }


    int finalPoints = initialPoints + totalPointsFromTournaments;

    int averagePoints = totalPointsFromTournaments / numberOfTournaments;

    double winPercentage = (winsCount * 100.0) / numberOfTournaments;

    System.out.printf("Final points: %d%n", finalPoints);
    System.out.printf("Average points: %d%n", averagePoints);
    System.out.printf("%.2f%%%n", winPercentage);

    scanner.close();
  }
}
