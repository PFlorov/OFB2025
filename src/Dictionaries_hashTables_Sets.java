import java.util.*;
public class Dictionaries_hashTables_Sets {

  public static void countSymbols(){
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    Map<Character, Integer> charCounts = new TreeMap<>();

    for (char ch : text.toCharArray()) {
      charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
      System.out.printf("%c: %d%n", entry.getKey(), entry.getValue());
    }
    scanner.close();
  }

  public static void phonebook(){
    Scanner scanner = new Scanner(System.in);
    Map<String, String> phonebook = new LinkedHashMap<>();

    String line;
    while (!"search".equals(line = scanner.nextLine())) {
      String[] parts = line.split("-");
      String name = parts[0];
      String number = parts[1];
      phonebook.put(name, number);
    }

    while (!"end".equals(line = scanner.nextLine())) {
      String searchName = line;
      if (phonebook.containsKey(searchName)) {
        System.out.printf("%s -> %s%n", searchName, phonebook.get(searchName));
      } else {
        System.out.printf("Contact %s does not exist.%n", searchName);
      }
    }
    scanner.close();
  }

}
