import java.util.Objects;
import java.util.Scanner;

public class Homework5_L4_1 {

  static void task1(){

    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();

    while(!"Stop".equals(input)){
      System.out.println(input);
      input= scanner.next();

    }
  }

  static void task2(){

    Scanner scanner = new Scanner(System.in);

    String username = scanner.nextLine();
    String password = scanner.nextLine();
    String input = scanner.nextLine();

    while(!input.equals(password)){
      System.out.println("Invalid password!");
      input = scanner.nextLine();

    }
    System.out.printf("Welcome %s",username);

  }

  static void task3(){
    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());
    int sum = 0;


    while(n>sum){
      int currentNum = Integer.parseInt(scanner.nextLine());
      sum+=currentNum;
    }
    System.out.println(sum);
  }

  static void task4(){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int currentNumber = 1;

    while (currentNumber <= n) {
      System.out.println(currentNumber);

      currentNumber = (currentNumber * 2) + 1;
    }
  }

  static void task5(){
    Scanner scanner = new Scanner(System.in);
    double totalBalance = 0;

    while (true) {
      String input = scanner.nextLine();

      if (input.equals("NoMoreMoney")) {
        break;
      }

      double amount = Double.parseDouble(input);

      if (amount < 0) {
        System.out.println("Invalid operation!");
        totalBalance += amount;
        break;
      } else {
        System.out.printf("Increase: %.2f%n",amount);
        totalBalance += amount;
      }
    }

    System.out.printf("Total: %.2f",totalBalance);
    scanner.close();
  }

  static void task6(){
    Scanner scanner = new Scanner(System.in);
    int maxNumber = 0;

    while (true) {
      String input = scanner.nextLine();

      if (input.equals("Stop")) {
        break;
      }

      int currentNumber = Integer.parseInt(input);

      if (currentNumber > maxNumber) {
        maxNumber = currentNumber;
      }
    }

    System.out.println(maxNumber);
    scanner.close();
  }

  static void task7(){
    Scanner scanner = new Scanner(System.in);
    int minNumber = 0;

    while (true) {
      String input = scanner.nextLine();

      if (input.equals("Stop")) {
        break;
      }

      int currentNumber = Integer.parseInt(input);

      if (currentNumber < minNumber) {
        minNumber = currentNumber;
      }
    }

    System.out.println(minNumber);
    scanner.close();
  }

  static void task8(){
    Scanner scanner = new Scanner(System.in);

    String studentName = scanner.nextLine();

    int currentGrade = 1;
    int excludedCounter = 0;
    double totalGradeSum = 0;
    boolean isGraduated = false;

    while (currentGrade <= 12) {
      double annualGrade = Double.parseDouble(scanner.nextLine());

      if (annualGrade >= 4.00) {
        totalGradeSum += annualGrade;
        currentGrade++;
      } else {
        excludedCounter++;
        if (excludedCounter > 1) {
          System.out.println(studentName + " has been excluded at " + currentGrade + " grade");
          break;
        }
      }

      if (currentGrade > 12) {
        isGraduated = true;
      }
    }

    if (isGraduated) {
      double averageGrade = totalGradeSum / 12;
      System.out.printf("%s graduated. Average grade: %.2f",studentName,averageGrade);
    }

    scanner.close();
  }

}
