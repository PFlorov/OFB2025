import java.util.*;
public class Homework_arrays_L1_2 {

  static void train(){
    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());

    ArrayList<Integer> wagons = new ArrayList<Integer>();

    int totalPeople = 0;

    for (int i = 0; i < n; i++) {
      int peopleInWagon = Integer.parseInt(scanner.nextLine());
      wagons.add(peopleInWagon);
      totalPeople += peopleInWagon;
    }

    for (int i = 0; i < wagons.size(); i++) {
      System.out.print(wagons.get(i));
      if (i < wagons.size() - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();

    System.out.println(totalPeople);
  }

  static void cE() {
    Scanner scanner = new Scanner(System.in);

    String[] arr1 = scanner.nextLine().split(" ");
    String[] arr2 = scanner.nextLine().split(" ");

    for (String element2 : arr2) {
      for (String element1 : arr1) {
        if (element2.equals(element1)) {
          System.out.print(element2 + " ");
          break;
        }
      }
    }
    System.out.println();
  }

  static void zigZag(){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] array1 = new int[n];

      int[] array2 = new int[n];

    for (int i = 0; i < n; i++) {
      String line = scanner.nextLine();
      String[] parts = line.split(" ");

      int num1 = Integer.parseInt(parts[0]);
      int num2 = Integer.parseInt(parts[1]);


      if (i % 2 == 0) {
        array1[i] = num1;
        array2[i] = num2;
      } else {
        array1[i] = num2;
        array2[i] = num1;
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(array1[i]);
      if (i < n - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();

    for (int i = 0; i < n; i++) {
      System.out.print(array2[i]);
      if (i < n - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  static void rotations(){
    Scanner scanner = new Scanner(System.in);

    String[] inputArrStr = scanner.nextLine().split(" ");

    int[] arr = Arrays.stream(inputArrStr)
        .mapToInt(Integer::parseInt)
        .toArray();

    int rotations = scanner.nextInt();

    for (int r = 0; r < rotations; r++) {
      int firstElement = arr[0];

      for (int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
      }
      arr[arr.length - 1] = firstElement;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  static void top(){
    Scanner scanner = new Scanner(System.in);

    int[] arr = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    for (int i = 0; i < arr.length; i++) {
      boolean isTop = true;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] <= arr[j]) {
          isTop = false;
          break;
        }
      }
      if (isTop) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();

    scanner.close();
  }

  static void eqSums(){
    Scanner scanner = new Scanner(System.in);

    int[] arr = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    boolean found = false;
    int eq = -1;

    for (int i = 0; i < arr.length; i++) {
      int leftSum = 0;
      for (int l = 0; l < i; l++) {
        leftSum += arr[l];
      }

      int rightSum = 0;
      for (int r = i + 1; r < arr.length; r++) {
        rightSum += arr[r];
      }

      if (leftSum == rightSum) {
        found = true;
        eq = i;
        break;
      }
    }

    if (found) {
      System.out.println(eq);
    } else {
      System.out.println("no");
    }
  }

  static void magic(){
    Scanner scanner = new Scanner(System.in);

    int[] arr = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    int targetSum = Integer.parseInt(scanner.nextLine());

    Set<String> printedPairs = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == targetSum) {

          int num1 = arr[i];
          int num2 = arr[j];
          String pairString;
          if (num1 < num2) {
            pairString = num1 + "," + num2;
          }
          else {
            pairString = num2 + "," + num1;
          }


          if (!printedPairs.contains(pairString)) {
            System.out.println(num1 + " " + num2);
            printedPairs.add(pairString);
          }
        }
      }
    }
  }
  
}
