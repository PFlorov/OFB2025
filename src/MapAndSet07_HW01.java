import java.util.*;
import java.util.stream.Collectors;

public class MapAndSet07_HW01 {

 public static void parkingLot(){
   List<String> parkedCars = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);
   String input;

   while (true) {
     input = scanner.nextLine();
     if (input.equals("END")) {
       break;
     }

     String[] parts = input.split(", ");
     String direction = parts[0];
     String carNumber = parts[1];

     if (direction.equals("ENTER")) {
       parkedCars.add(carNumber);
     } else if (direction.equals("EXIT")) {
       parkedCars.remove(carNumber);
     }
   }

   for (String car : parkedCars) {
     System.out.println(car);
   }

   scanner.close();

  }

 public static void party(){
   Scanner scanner = new Scanner(System.in);

   Set<String> vipReservations = new TreeSet<>();
   Set<String> regularReservations = new TreeSet<>();

   String reservationInput;
   while (!(reservationInput = scanner.nextLine()).equals("PARTY")) {
     if (Character.isDigit(reservationInput.charAt(0))) {
       vipReservations.add(reservationInput);
     } else {
       regularReservations.add(reservationInput);
     }
   }

   Set<String> arrivedGuests = new LinkedHashSet<>();
   String guestArrivalInput;
   while (!(guestArrivalInput = scanner.nextLine()).equals("END")) {
     arrivedGuests.add(guestArrivalInput);
   }


   vipReservations.removeAll(arrivedGuests);
   regularReservations.removeAll(arrivedGuests);


   for (String vip : vipReservations) {
     System.out.println(vip);
   }


   for (String regular : regularReservations) {
     System.out.println(regular);
   }

   scanner.close();
 }

 public static void voina(){
   Scanner scanner = new Scanner(System.in);

   Set<Integer> player1Numbers = Arrays.stream(scanner.nextLine().split(" "))
       .map(Integer::parseInt)
       .collect(Collectors.toCollection(LinkedHashSet::new));

   Set<Integer> player2Numbers = Arrays.stream(scanner.nextLine().split(" "))
       .map(Integer::parseInt)
       .collect(Collectors.toCollection(LinkedHashSet::new));

   for (int round = 0; round < 50; round++) {
     if (player1Numbers.isEmpty()) {
       System.out.println("Second Player Win!");
       return;
     }
     if (player2Numbers.isEmpty()) {
       System.out.println("First Player Win!");
       return;
     }

     int player1Card = player1Numbers.iterator().next();
     player1Numbers.remove(player1Card);

     int player2Card = player2Numbers.iterator().next();
     player2Numbers.remove(player2Card);

     if (player1Card > player2Card) {
       player1Numbers.add(player1Card);
       player1Numbers.add(player2Card);
     } else if (player2Card > player1Card) {
       player2Numbers.add(player2Card);
       player2Numbers.add(player1Card);
     }
   }

   if (player1Numbers.size() > player2Numbers.size()) {
     System.out.println("First Player Win!");
   } else if (player2Numbers.size() > player1Numbers.size()) {
     System.out.println("Second Player Win!");
   } else {
     System.out.println("Draw!");
   }

   scanner.close();
 }

 public static void count(){
   Scanner scanner = new Scanner(System.in);

   String[] inputStrings = scanner.nextLine().split(" ");

   double[] numbers = new double[inputStrings.length];
   for (int i = 0; i < inputStrings.length; i++) {
     numbers[i] = Double.parseDouble(inputStrings[i]);
   }

   Map<Double, Integer> occurrences = new HashMap<>();

   for (double number : numbers) {
     occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
   }


   for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
     System.out.printf("%.1f - %d times%n", entry.getKey(), entry.getValue());
   }

   scanner.close();
 }

 public static void academy(){
   Scanner scanner = new Scanner(System.in);

   int numberOfStudents = Integer.parseInt(scanner.nextLine());

   for (int i = 0; i < numberOfStudents; i++) {
     String studentName = scanner.nextLine();
     String[] scoreStrings = scanner.nextLine().split(" ");

     double sumScores = 0;
     for (String scoreString : scoreStrings) {
       sumScores += Double.parseDouble(scoreString);
     }

     double averageScore = sumScores / scoreStrings.length;

     System.out.printf("%s is graduated with %.2f%n", studentName, averageScore);
   }

   scanner.close();
 }
}
