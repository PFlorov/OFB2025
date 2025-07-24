import java.util.*;
public class MapAndSet07_HW02 {

  public static void username(){
    Scanner scanner = new Scanner(System.in);

    Set<String> uniqueUsernames = new LinkedHashSet<>();

    String usernameInput;
    while (scanner.hasNextLine()) {
      usernameInput = scanner.nextLine();
      if (usernameInput.isEmpty()) {
        break;
      }
      uniqueUsernames.add(usernameInput);
    }

    for (String username : uniqueUsernames) {
      System.out.println(username);
    }

    scanner.close();
  }

  public static void uniqSet(){
    Scanner scanner = new Scanner(System.in);

    String[] lengths = scanner.nextLine().split(" ");
    int n = Integer.parseInt(lengths[0]);
    int m = Integer.parseInt(lengths[1]);

    Set<String> set1 = new LinkedHashSet<>();
    Set<String> set2 = new LinkedHashSet<>();

    for (int i = 0; i < n; i++) {
      set1.add(scanner.nextLine());
    }

    for (int i = 0; i < m; i++) {
      set2.add(scanner.nextLine());
    }

    for (String element : set1) {
      if (set2.contains(element)) {
        System.out.println(element);
      }
    }

    scanner.close();
  }

  public static void periodicTable(){
    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());

    Set<String> uniqueElements = new TreeSet<>();

    for (int i = 0; i < n; i++) {
      String[] elementsInCompound = scanner.nextLine().split(" ");
      for (String element : elementsInCompound) {
        uniqueElements.add(element);
      }
    }

    for (String element : uniqueElements) {
      System.out.print(element + " ");
    }
    System.out.println();

    scanner.close();
  }

  public static void charCounter(){
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    Map<Character, Integer> charCounts = new TreeMap<>();

    for (char ch : text.toCharArray()) {
      charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    scanner.close();
  }

  public static void phonebook(){
    Scanner scanner = new Scanner(System.in);
    Map<String, String> phonebook = new HashMap<>();

    String inputLine;
    while (!(inputLine = scanner.nextLine()).equals("search")) {
      String[] parts = inputLine.split("-");
      String name = parts[0];
      String number = parts[1];
      phonebook.put(name, number);
    }

    while (true) {
      String searchName = scanner.nextLine();
      if (searchName.equals("stop")) {
        break;
      }

      if (phonebook.containsKey(searchName)) {
        System.out.println(searchName + " -> " + phonebook.get(searchName));
      } else {
        System.out.println("Contact " + searchName + " does not exist.");
      }
    }

    scanner.close();
  }

  public static void minerTask(){
    Scanner scanner = new Scanner(System.in);
    Map<String, Long> resources = new LinkedHashMap<>();

    while (true) {
      String resourceName = scanner.nextLine();
      if (resourceName.equals("stop")) {
        break;
      }
      long quantity = Long.parseLong(scanner.nextLine());

      resources.put(resourceName, resources.getOrDefault(resourceName, 0L) + quantity);
    }

    for (Map.Entry<String, Long> entry : resources.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    scanner.close();
  }

  public static void emails(){
    Scanner scanner = new Scanner(System.in);
    Map<String, String> contacts = new LinkedHashMap<>();

    String name;
    while (!(name = scanner.nextLine()).equals("stop")) {
      String email = scanner.nextLine();
      contacts.put(name, email);
    }

    for (Map.Entry<String, String> entry : contacts.entrySet()) {
      String email = entry.getValue();

      if (!(email.toLowerCase().endsWith(".us")
          || email.toLowerCase().endsWith(".uk")
          || email.toLowerCase().endsWith(".com"))) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
      }
    }

    scanner.close();
  }
}
