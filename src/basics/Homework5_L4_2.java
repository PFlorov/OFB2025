package basics;

import java.util.Scanner;
public class Homework5_L4_2 {

  static void task1(){

    Scanner scanner = new Scanner(System.in);

    int counter = 0;
    boolean isFound = false;
    String bookName = scanner.nextLine();
    String input = scanner.nextLine();

    while(!"No More Books".equals(input)){

      if(input.equals(bookName)){
        isFound= true;
        break;
      }
      counter++;
      input= scanner.nextLine();
    }

    if(isFound){
      System.out.printf("You checked %d books and found it.",counter);
    }
    else{
      System.out.printf("The book you searched for is not here! %nYou checked %d books.",counter);
    }

  }

  static void task2(){
    Scanner scanner = new Scanner(System.in);

    int allowedPoorGrades = Integer.parseInt(scanner.nextLine());

    int poorGradesCount = 0;
    int problemsCount = 0;
    double totalScore = 0;
    String lastProblemName = "";
    boolean needsBreak = false;

    while (true) {
      String problemName = scanner.nextLine();

      if (problemName.equals("Enough")) {
        break;
      }

      int score = Integer.parseInt(scanner.nextLine());

      lastProblemName = problemName;
      problemsCount++;
      totalScore += score;

      if (score <= 4) {
        poorGradesCount++;
      }

      if (poorGradesCount == allowedPoorGrades) {
        needsBreak = true;
        break;
      }
    }

    if (needsBreak) {
      System.out.printf("You need a break, %d poor grades.",poorGradesCount);
    } else {
      double averageScore = totalScore / problemsCount;
      System.out.printf("Average score: %.2f%n",(averageScore));
      System.out.printf("Number of problems: %d%n",problemsCount);
      System.out.printf("Last problem: %s",lastProblemName);
    }

    scanner.close();
  }

  static void task3(){
    Scanner scanner = new Scanner(System.in);

    double tripCost = Double.parseDouble(scanner.nextLine());
    double availableMoney = Double.parseDouble(scanner.nextLine());

    int days = 0;
    int spendCounter = 0;

    while (availableMoney < tripCost && spendCounter < 5) {
      String action = scanner.nextLine();
      double amount = Double.parseDouble(scanner.nextLine());
      days++;

      if (action.equals("spend")) {
        availableMoney -= amount;
        if (availableMoney < 0) {
          availableMoney = 0;
        }
        spendCounter++;
      } else if (action.equals("save")) {
        availableMoney += amount;
        spendCounter = 0;
      }
    }

    if (spendCounter == 5) {
      System.out.printf("You can't save the money.%n");
      System.out.printf("%d%n", days);
    } else {
      System.out.printf("You saved the money for %d days.%n", days);
    }
  }

  static void task4(){
    Scanner scanner = new Scanner(System.in);

    int totalSteps = 0;
    int targetSteps = 10000;

    while (totalSteps < targetSteps) {
      String input = scanner.nextLine();

      if (input.equals("Going home")) {
        int stepsToHome = Integer.parseInt(scanner.nextLine());
        totalSteps += stepsToHome;
        break;
      }

      int currentSteps = Integer.parseInt(input);
      totalSteps += currentSteps;
    }

    if (totalSteps >= targetSteps) {
      System.out.println("Goal reached! Good job!");
      System.out.printf("%d steps over the goal!%n", totalSteps - targetSteps);
    } else {
      System.out.printf("%d more steps to reach goal.%n", targetSteps - totalSteps);
    }
    scanner.close();
  }

  static void task5(){
    Scanner scanner = new Scanner(System.in);

    double change = Double.parseDouble(scanner.nextLine());
    int coins = 0;
    double cents = Math.round(change * 100);

    while (cents > 0) {
      if (cents >= 200) {
        cents -= 200;
      } else if (cents >= 100) {
        cents -= 100;
      } else if (cents >= 50) {
        cents -= 50;
      } else if (cents >= 20) {
        cents -= 20;
      } else if (cents >= 10) {
        cents -= 10;
      } else if (cents >= 5) {
        cents -= 5;
      } else if (cents >= 2) {
        cents -= 2;
      } else if (cents >= 1) {
        cents -= 1;
      }
      coins++;
    }
    System.out.println(coins);
  }

  static void task6(){
    Scanner scanner = new Scanner(System.in);

    int width = Integer.parseInt(scanner.nextLine());
    int length = Integer.parseInt(scanner.nextLine());

    int totalPieces = width * length;

    String input = scanner.nextLine();
    while (!input.equals("STOP")) {
      int currentPieces = Integer.parseInt(input);
      totalPieces -= currentPieces;

      if (totalPieces <= 0) {
        break;
      }
      input = scanner.nextLine();
    }

    if (totalPieces > 0) {
      System.out.printf("%d pieces are left.%n", totalPieces);
    } else {

      System.out.printf("No more cake left! You need %d piece more.%n", Math.abs(totalPieces));

    }
  }

  static void task7(){
    Scanner scanner = new Scanner(System.in);

    int width = Integer.parseInt(scanner.nextLine());
    int length = Integer.parseInt(scanner.nextLine());
    int height = Integer.parseInt(scanner.nextLine());

    int freeSpace = width * length * height;

    String input = scanner.nextLine();
    while (!input.equals("Done")) {
      int boxes = Integer.parseInt(input);
      freeSpace -= boxes;

      if (freeSpace <= 0) {
        break;
      }
      input = scanner.nextLine();
    }

    if (freeSpace > 0) {
      System.out.printf("%d Cubic meters left.%n", freeSpace);
    } else {
      System.out.printf("No more free space! You need %d Cubic meters more.%n", Math.abs(freeSpace));
    }
  }
}
