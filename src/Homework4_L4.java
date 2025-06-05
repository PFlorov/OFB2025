import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Homework4_L4 {

    static void task1(){

    for (int i = 0 ; i <= 100 ; i++){
        System.out.println(i);
    }
}

    static void task2(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = input; i >= 1; i-- ){
            System.out.println(i);
        }
    }

    static void task3(){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1 ; i <= n ; i+=3){
            System.out.println(i);
        }
    }

    static void task4(){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0 ; i<= n ; i+=2){
            long power = (long) Math.pow(2,i);
            System.out.println(power);
        }
    }

    static void task5(){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String[] substrings = str.split("");

        for (String letter : substrings){
            System.out.println(letter + " ");
        }


    }

    static void task6(){

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

            int sum = 0;
        for (int i = 0 ; i < input.length(); i++){
            char letter = input.charAt(i);

            switch(letter){
                case 'a' -> sum+=1;
                case 'e' -> sum+=2;
                case 'i' -> sum+=3;
                case 'o' -> sum+=4;
                case 'u' -> sum+=5;

                default -> sum+=0;
            }
        }
            System.out.println(sum);
    }

    static void task7(){

        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i<inputNum; i++){
            int num = scanner.nextInt();
            sum+= num;
        }
        System.out.println(sum);
    }

    static void task8(){
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i<inputNum; i++){
            int userInput = scanner.nextInt();
            nums.add(userInput);
        }
        System.out.printf("Max number is: %d%n",Collections.max(nums));
        System.out.printf("Min number is: %d",Collections.min(nums));
    }

    static void task9(){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {

            int number = scanner.nextInt();
            leftSum += number;
        }


        for (int i = 0; i < n; i++) {

                int number = scanner.nextInt();
                rightSum += number;
        }

        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            long diff = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + diff);
        }

        scanner.close();


    }

    static void task10(){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {

            int number = scanner.nextInt();

            if (i % 2 == 0) {
                evenSum += number;
                } else {
                oddSum += number;
                }
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        } else {
            int diff = Math.abs(oddSum - evenSum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

        scanner.close();
    }
}




