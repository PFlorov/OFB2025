import java.util.*;


public class Homework_arrays_L1_1 {

 static void dayOfWeek(){
   ArrayList <String> daysOfWeek = new ArrayList<String>();

   Scanner scanner = new Scanner(System.in);

   int input = scanner.nextInt();

   daysOfWeek.add("Monday");
   daysOfWeek.add("Tuesday");
   daysOfWeek.add("Wednesday");
   daysOfWeek.add("Thursday");
   daysOfWeek.add("Friday");
   daysOfWeek.add("Saturday");
   daysOfWeek.add("Sunday");

   if (input >= 1 && input <= daysOfWeek.size()){
     System.out.println(daysOfWeek.get(input-1));
   }else {
     System.out.println("Invalid day");
   }

 }

 static void reverse(){
   Scanner scanner = new Scanner(System.in);

   int n = scanner.nextInt();
   ArrayList<Integer> arr = new ArrayList<Integer>();


   for (int i = 0; i < n; i++ ){
     arr.add(scanner.nextInt());
   }

   Collections.reverse(arr);

   for(int num: arr){
     System.out.println(num + " ");
   }
 }

 static void sumEven(){
   Scanner scanner = new Scanner(System.in);

   String input = scanner.nextLine();

   int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

   int sumEven = 0;

   for(int num: numbers){
     if(num%2 == 0){
       sumEven+= num;
     }
   }
   System.out.println(sumEven);

 }

 static void reverseArrayOfStrings(){

   Scanner scanner = new Scanner(System.in);

   String input = scanner.nextLine();

   String[] array = input.split(" ");

  List<String> wordsList = Arrays.asList(array);

  Collections.reverse(wordsList);

   System.out.println(String.join(" ",wordsList));
 }

 static void evenOddSub(){

   Scanner scanner = new Scanner(System.in);

   String input = scanner.nextLine();
   int[] numbers = Arrays.stream(input.split(" "))
       .mapToInt(Integer::parseInt)
       .toArray();

   int sumEven=0;
   int sumOdd=0;


   for (int num: numbers){
     if(num%2==0){
       sumEven+=num;
     }
     else{
       sumOdd+=num;
     }
   }
   System.out.println(sumEven-sumOdd);
 }

 static void eqArr(){
   Scanner scanner = new Scanner(System.in);

   String inputLine1 = scanner.nextLine();
   int[] arr1 = Arrays.stream(inputLine1.split(" "))
       .mapToInt(Integer::parseInt)
       .toArray();

   String inputLine2 = scanner.nextLine();
   int[] arr2 = Arrays.stream(inputLine2.split(" "))
       .mapToInt(Integer::parseInt)
       .toArray();

   boolean areIdentical = true;
   int differenceIndex = -1;
   int sumOfArray1 = 0;

   if (arr1.length != arr2.length) {
     areIdentical = false;
     differenceIndex = Math.min(arr1.length, arr2.length);
   } else {
     for (int i = 0; i < arr1.length; i++) {
       if (arr1[i] != arr2[i]) {
         areIdentical = false;
         differenceIndex = i;
         break;
       }
       sumOfArray1 += arr1[i];
     }
   }

   if (areIdentical) {
     System.out.println("Arrays are identical. Sum: " + sumOfArray1);
   } else {
     System.out.println("Arrays are not identical. Found difference at " + differenceIndex + " index.");
   }
 }

}
