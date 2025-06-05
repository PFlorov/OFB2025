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
}
