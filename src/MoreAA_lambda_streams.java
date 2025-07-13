import java.util.*;
public class MoreAA_lambda_streams {

  public static void ranking(){
    Scanner scanner = new Scanner(System.in);

    Map<String, String> contests = new LinkedHashMap<>();
    String inputLine;

    while (!"end of contests".equals(inputLine = scanner.nextLine())) {
      String[] parts = inputLine.split(":");
      String contestName = parts[0];
      String password = parts[1];
      contests.put(contestName, password);
    }

    Map<String, Map<String, Integer>> userSubmissions = new TreeMap<>();

    while (!"end of submissions".equals(inputLine = scanner.nextLine())) {
      String[] parts = inputLine.split("=>");
      String contestName = parts[0];
      String password = parts[1];
      String username = parts[2];
      int points = Integer.parseInt(parts[3]);

      if (contests.containsKey(contestName)
          && contests.get(contestName).equals(password)) {

        userSubmissions.putIfAbsent(username, new LinkedHashMap<>());
        Map<String, Integer> userContestPoints = userSubmissions.get(username);

        userContestPoints.put(
            contestName,
            Math.max(userContestPoints.getOrDefault(contestName, 0), points));
      }
    }
    scanner.close();

    String bestCandidate = "";
    int maxTotalPoints = -1;

    for (Map.Entry<String, Map<String, Integer>> userEntry :
        userSubmissions.entrySet()) {
      String username = userEntry.getKey();
      Map<String, Integer> contestPoints = userEntry.getValue();

      int currentTotalPoints =
          contestPoints.values().stream().mapToInt(Integer::intValue).sum();

      if (currentTotalPoints > maxTotalPoints) {
        maxTotalPoints = currentTotalPoints;
        bestCandidate = username;
      }
    }

    System.out.printf(
        "Best candidate is %s with total %d points.%n",
        bestCandidate, maxTotalPoints);

    for (Map.Entry<String, Map<String, Integer>> userEntry :
        userSubmissions.entrySet()) {
      String username = userEntry.getKey();
      Map<String, Integer> contestPoints = userEntry.getValue();

      System.out.println(username);

      contestPoints.entrySet().stream()
          .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
          .forEach(
              entry -> System.out.printf("# %s -> %d%n", entry.getKey(), entry.getValue()));
    }
  }
}
