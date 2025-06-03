import java.util.Arrays;
import java.util.Scanner;

public class Homework1_L4 {

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

}



