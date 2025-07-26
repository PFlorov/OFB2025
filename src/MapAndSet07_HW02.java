import java.util.*;
import java.util.stream.Collectors;

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

  public static void cards(){
    Scanner scanner = new Scanner(System.in);
    Map<String, Set<String>> playerHands = new LinkedHashMap<>();

    Map<String, Integer> powerValues = new HashMap<>();
    for (int i = 2; i <= 10; i++) {
      powerValues.put(String.valueOf(i), i);
    }
    powerValues.put("J", 11);
    powerValues.put("Q", 12);
    powerValues.put("K", 13);
    powerValues.put("A", 14);

    Map<Character, Integer> typeMultipliers = new HashMap<>();
    typeMultipliers.put('S', 4);
    typeMultipliers.put('H', 3);
    typeMultipliers.put('D', 2);
    typeMultipliers.put('C', 1);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      if (line.endsWith("JOKER")) {
        break;
      }

      String[] parts = line.split(": ");
      String personName = parts[0];
      String[] cards = parts[1].split(", ");

      playerHands.putIfAbsent(personName, new HashSet<>());

      for (String card : cards) {
        playerHands.get(personName).add(card);
      }
    }

    for (Map.Entry<String, Set<String>> entry : playerHands.entrySet()) {
      String personName = entry.getKey();
      Set<String> cardsInHand = entry.getValue();
      long totalValue = 0;

      for (String card : cardsInHand) {
        String powerStr;
        char typeChar;

        if (card.length() == 3) {
          powerStr = card.substring(0, 2);
          typeChar = card.charAt(2);
        } else {
          powerStr = card.substring(0, 1);
          typeChar = card.charAt(1);
        }

        int powerValue = powerValues.get(powerStr);
        int typeMultiplier = typeMultipliers.get(typeChar);

        totalValue += (long) powerValue * typeMultiplier;
      }
      System.out.println(personName + ": " + totalValue);
    }

    scanner.close();
  }



  // HW 03

  public static void catapult(){
    Scanner scanner = new Scanner(System.in);

    int numPiles = Integer.parseInt(scanner.nextLine());
    ArrayDeque<Integer> walls = Arrays.stream(scanner.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toCollection(ArrayDeque::new));

    ArrayDeque<Integer> rocks = new ArrayDeque<>();

    for (int i = 1; i <= numPiles; i++) {
      if (walls.isEmpty()) {
        break;
      }

      if (i % 3 == 0) {
        int newWall = Integer.parseInt(scanner.nextLine());
        walls.add(newWall);
      }

      Arrays.stream(scanner.nextLine().split(" "))
          .map(Integer::parseInt)
          .forEach(rocks::push);

      while (!rocks.isEmpty() && !walls.isEmpty()) {
        int currentRock = rocks.peek();
        int currentWall = walls.peek();

        if (currentRock > currentWall) {
          rocks.pop();
          walls.removeFirst();
          currentRock -= currentWall;
          if (currentRock > 0) {
            rocks.push(currentRock);
          }
        } else if (currentWall > currentRock) {
          rocks.pop();
          walls.removeFirst();
          currentWall -= currentRock;
          walls.addFirst(currentWall);
        } else {
          rocks.pop();
          walls.removeFirst();
        }
      }
    }

    if (!walls.isEmpty()) {
      System.out.println(
          "Walls left: " +
              walls.stream().map(String::valueOf).collect(Collectors.joining(", "))
      );
    } else {
      System.out.println(
          "Rocks left: " +
              rocks.stream()
                  .map(String::valueOf)
                  .collect(Collectors.joining(", "))
      );
    }

    scanner.close();
  }


  // HW 05
  public static void travelMap(){
    Scanner scanner = new Scanner(System.in);

    Map<String, Map<String, Integer>> destinations = new TreeMap<>();

    String line;
    while (!(line = scanner.nextLine()).equals("END")) {
      String[] parts = line.split(" > ");
      String country = parts[0];
      String town = parts[1];
      int cost = Integer.parseInt(parts[2]);

      destinations.putIfAbsent(country, new LinkedHashMap<>());

      Map<String, Integer> townsInCountry = destinations.get(country);


      if (!townsInCountry.containsKey(town) || cost < townsInCountry.get(town)) {
        townsInCountry.put(town, cost);
      }
    }

    for (Map.Entry<String, Map<String, Integer>> countryEntry : destinations.entrySet()) {
      String countryName = countryEntry.getKey();
      Map<String, Integer> towns = countryEntry.getValue();



      towns
          .entrySet()
          .stream()
          .sorted(Map.Entry.comparingByValue())
          .forEach(townEntry ->
              System.out.printf(
                  "%s -> %s -> %d ",
                  countryName,
                  townEntry.getKey(),
                  townEntry.getValue()
              )
          );
      System.out.println();
    }

    scanner.close();

  }


}
