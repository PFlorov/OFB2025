import java.util.*;
public class AA_lambda_stream_api {


  public static void countRealNum(){
    Scanner scanner = new Scanner(System.in);
    Map<Double, Integer> occurrences = new TreeMap<>();

    while (scanner.hasNextDouble()) {
      double number = scanner.nextDouble();
      occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
    }
    scanner.close();

    for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

  public static void wordSynonym(){
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());

    Map<String, List<String>> synonymsMap = new LinkedHashMap<>();

    for (int i = 0; i < n; i++) {
      String word = scanner.nextLine();
      String synonym = scanner.nextLine();

      synonymsMap.putIfAbsent(word, new ArrayList<>());
      synonymsMap.get(word).add(synonym);
    }
    scanner.close();

    for (Map.Entry<String, List<String>> entry : synonymsMap.entrySet()) {
      System.out.printf(
          "%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
    }
  }

  public static void oddOcurance(){
    Scanner scanner = new Scanner(System.in);
    String[] words = scanner.nextLine().split(" ");

    Map<String, Integer> counts = new LinkedHashMap<>();

    for (String word : words) {
      String lowerCaseWord = word.toLowerCase();
      counts.put(lowerCaseWord, counts.getOrDefault(lowerCaseWord, 0) + 1);
    }

    List<String> oddOccurringWords = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : counts.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        oddOccurringWords.add(entry.getKey());
      }
    }

    System.out.println(String.join(", ", oddOccurringWords));
    scanner.close();
  }

  public static void wordFilter(){
    Scanner scanner = new Scanner(System.in);
    String inputLine = scanner.nextLine();
    String[] words = inputLine.split(" ");

    Arrays.stream(words)
        .filter(word -> word.length() % 2 == 0)
        .forEach(System.out::println);

    scanner.close();
  }
  


  }


