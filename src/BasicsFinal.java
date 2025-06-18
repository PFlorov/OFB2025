import java.util.Scanner;
public class BasicsFinal {


  static void gymnastics(){
    Scanner scanner = new Scanner(System.in);


    String country = scanner.nextLine();
    String apparatus = scanner.nextLine();

    double difficultyScore = 0.0;
    double executionScore = 0.0;


    if ("Russia".equals(country)) {
      if ("ribbon".equals(apparatus)) {
        difficultyScore = 9.100;
        executionScore = 9.400;
      } else if ("hoop".equals(apparatus)) {
        difficultyScore = 9.300;
        executionScore = 9.600;
      } else if ("rope".equals(apparatus)) {
        difficultyScore = 9.600;
        executionScore = 9.000;
      }
    } else if ("Bulgaria".equals(country)) {
      if ("ribbon".equals(apparatus)) {
        difficultyScore = 9.600;
        executionScore = 9.400;
      } else if ("hoop".equals(apparatus)) {
        difficultyScore = 9.550;
        executionScore = 9.450;
      } else if ("rope".equals(apparatus)) {
        difficultyScore = 9.500;
        executionScore = 9.400;
      }
    } else if ("Italy".equals(country)) {
      if ("ribbon".equals(apparatus)) {
        difficultyScore = 9.200;
        executionScore = 9.500;
      } else if ("hoop".equals(apparatus)) {
        difficultyScore = 9.450;
        executionScore = 9.350;
      } else if ("rope".equals(apparatus)) {
        difficultyScore = 9.700;
        executionScore = 9.150;
      }
    }

    double totalScore = difficultyScore + executionScore;
    double maxScore = 20.000;
    double neededPercentage = ((maxScore - totalScore) / maxScore) * 100;

    System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, apparatus);
    System.out.printf("%.2f%%%n", neededPercentage);

    scanner.close();
  }

  static void oscarsWeek(){
    Scanner scanner = new Scanner(System.in);

    String movieName = scanner.nextLine();
    String typeOfHall = scanner.nextLine();
    int ticketsBought = Integer.parseInt(scanner.nextLine());
    double ticketPrice = 0;

    if("A Star Is Born".equals(movieName)) {
      if ("normal".equals(typeOfHall)) {
        ticketPrice = 7.50;
      }
      else if ("luxury".equals(typeOfHall)) {
        ticketPrice = 10.50;
      }
      else if ("ultra luxury".equals(typeOfHall)) {
        ticketPrice = 13.50;
      }
    }
      else if ("Bohemian Rhapsody".equals(movieName)) {
        if ("normal".equals(typeOfHall)) {
          ticketPrice = 7.35;
        }
        else if ("luxury".equals(typeOfHall)) {
          ticketPrice = 9.45;
        }
        else if ("ultra luxury".equals(typeOfHall)) {
          ticketPrice = 12.75;
        }
      }

      else if ("Green Book".equals(movieName)) {
        if ("normal".equals(typeOfHall)) {
          ticketPrice = 8.15;
        }
        else if ("luxury".equals(typeOfHall)) {
          ticketPrice = 10.25;
        }
        else if ("ultra luxury".equals(typeOfHall)) {
          ticketPrice = 13.25;
        }
      }

      else if ("The Favourite".equals(movieName)) {
        if ("normal".equals(typeOfHall)) {
          ticketPrice = 8.75;
        }
        else if ("luxury".equals(typeOfHall)) {
          ticketPrice = 11.55;
        }
        else if ("ultra luxury".equals(typeOfHall)) {
          ticketPrice = 13.95;
        }
      }

    System.out.printf("%s -> %.2f lv",movieName,ticketPrice*ticketsBought);

      scanner.close();
  }

  static void wsch(){
    Scanner scanner = new Scanner(System.in);

    String stage = scanner.nextLine();
    String ticketType = scanner.nextLine();
    int ticketsCount = Integer.parseInt(scanner.nextLine());
    char photoOption = scanner.nextLine().charAt(0);


    double pricePerTicket = 0.0;

    if ("Quarter final".equals(stage)) {
      if ("Standard".equals(ticketType)) {
        pricePerTicket = 55.50;
      } else if ("Premium".equals(ticketType)) {
        pricePerTicket = 105.20;
      } else if ("VIP".equals(ticketType)) {
        pricePerTicket = 118.90;
      }
    } else if ("Semi final".equals(stage)) {
      if ("Standard".equals(ticketType)) {
        pricePerTicket = 75.88;
      } else if ("Premium".equals(ticketType)) {
        pricePerTicket = 125.22;
      } else if ("VIP".equals(ticketType)) {
        pricePerTicket = 300.40;
      }
    } else if ("Final".equals(stage)) {
      if ("Standard".equals(ticketType)) {
        pricePerTicket = 110.10;
      } else if ("Premium".equals(ticketType)) {
        pricePerTicket = 160.66;
      } else if ("VIP".equals(ticketType)) {
        pricePerTicket = 400.00;
      }
    }

    double totalCost = pricePerTicket * ticketsCount;


    boolean hasFreePhotos = false;

    if (totalCost > 4000) {
      totalCost *= 0.75;
      hasFreePhotos = true;
    } else if (totalCost > 2500) {
      totalCost *= 0.90;
    }

    if (photoOption == 'Y' && !hasFreePhotos) {
      totalCost += (40.0 * ticketsCount);
    }

    System.out.printf("%.2f%n", totalCost);

    scanner.close();
  }

  static void cinemaTickets(){
  Scanner scanner = new Scanner(System.in);

  int voucherValue = Integer.parseInt(scanner.nextLine());

  int ticketsBought = 0;
  int otherPurchasesBought = 0;
  double remainingVoucher = voucherValue;

  String purchaseName = scanner.nextLine();

  while (!"End".equals(purchaseName)) {
    double price = 0;


    if (purchaseName.length() > 8) {
      price = purchaseName.charAt(0) + purchaseName.charAt(1);
    } else {
      price = purchaseName.charAt(0);
    }

    if (remainingVoucher >= price) {
      remainingVoucher -= price;

      if (purchaseName.length() > 8) {
        ticketsBought++;
      } else {
        otherPurchasesBought++;
      }
    } else {
      break;
    }

    purchaseName = scanner.nextLine();
  }

  System.out.println(ticketsBought);
  System.out.println(otherPurchasesBought);

    scanner.close();
}

  static void darts(){
    Scanner scanner = new Scanner(System.in);

    String playerName = scanner.nextLine();

    int currentPoints = 301;
    int successfulShots = 0;
    int unsuccessfulShots = 0;

    String fieldType = scanner.nextLine();

    while (!"Retire".equals(fieldType)) {
      int pointsScored = Integer.parseInt(scanner.nextLine());

      int totalShotPoints = 0;

      if ("Single".equals(fieldType)) {
        totalShotPoints = pointsScored;
      } else if ("Double".equals(fieldType)) {
        totalShotPoints = pointsScored * 2;
      } else if ("Triple".equals(fieldType)) {
        totalShotPoints = pointsScored * 3;
      }

      if (currentPoints >= totalShotPoints) {
        currentPoints -= totalShotPoints;
        successfulShots++;
      } else {
        unsuccessfulShots++;
      }

      if (currentPoints == 0) {
        System.out.printf("%s won the leg with %d shots.%n", playerName, successfulShots);
        break;
      }

      fieldType = scanner.nextLine();
    }

    if (currentPoints != 0) {
      System.out.printf("%s retired after %d unsuccessful shots.%n", playerName, unsuccessfulShots);
    }

    scanner.close();
  }

  static void numberWars(){
    Scanner scanner = new Scanner(System.in);

    String player1Name = scanner.nextLine();
    String player2Name = scanner.nextLine();

    int player1Points = 0;
    int player2Points = 0;

    String input = scanner.nextLine();

    while (!"End of game".equals(input)) {
      int player1Card = Integer.parseInt(input);
      int player2Card = Integer.parseInt(scanner.nextLine());

      if (player1Card > player2Card) {
        player1Points += (player1Card - player2Card);
      } else if (player2Card > player1Card) {
        player2Points += (player2Card - player1Card);
      } else {
        System.out.println("Number wars!");

        int player1WarCard = Integer.parseInt(scanner.nextLine());
        int player2WarCard = Integer.parseInt(scanner.nextLine());

        if (player1WarCard > player2WarCard) {
          System.out.printf("%s is winner with %d points%n", player1Name, player1Points);
        } else {
          System.out.printf("%s is winner with %d points%n", player2Name, player2Points);
        }
        scanner.close();
        return;
      }

      input = scanner.nextLine();
    }

    System.out.printf("%s has %d points%n", player1Name, player1Points);
    System.out.printf("%s has %d points%n", player2Name, player2Points);

    scanner.close();
  }

  static void movieRating(){

    Scanner scanner = new Scanner(System.in);


    int numberOfMovies = Integer.parseInt(scanner.nextLine());

    double highestRating = Double.MIN_VALUE;
    String movieWithHighestRating = "";

    double lowestRating = Double.MAX_VALUE;
    String movieWithLowestRating = "";

    double totalRatingSum = 0;


    for (int i = 0; i < numberOfMovies; i++) {
      String movieName = scanner.nextLine();
      double rating = Double.parseDouble(scanner.nextLine());

      if (rating > highestRating) {
        highestRating = rating;
        movieWithHighestRating = movieName;
      }

      if (rating < lowestRating) {
        lowestRating = rating;
        movieWithLowestRating = movieName;
      }

      totalRatingSum += rating;
    }

    double averageRating = totalRatingSum / numberOfMovies;

    System.out.printf("%s is with highest rating: %.1f%n", movieWithHighestRating, highestRating);
    System.out.printf("%s is with lowest rating: %.1f%n", movieWithLowestRating, lowestRating);
    System.out.printf("Average rating: %.1f%n", averageRating);

     scanner.close();
  }

  static void tennis(){
    Scanner scanner = new Scanner(System.in);

    int numberOfTournaments = scanner.nextInt();
    int initialPoints = scanner.nextInt();

    int totalPointsFromTournaments = 0;
    int winsCount = 0;


    for (int i = 0; i < numberOfTournaments; i++) {
      String stageReached = scanner.next();

      switch (stageReached) {
        case "W":
          totalPointsFromTournaments += 2000;
          winsCount++;
          break;
        case "F":
          totalPointsFromTournaments += 1200;
          break;
        case "SF":
          totalPointsFromTournaments += 720;
          break;
      }
    }


    int finalPoints = initialPoints + totalPointsFromTournaments;

    int averagePoints = totalPointsFromTournaments / numberOfTournaments;

    double winPercentage = (winsCount * 100.0) / numberOfTournaments;

    System.out.printf("Final points: %d%n", finalPoints);
    System.out.printf("Average points: %d%n", averagePoints);
    System.out.printf("%.2f%%%n", winPercentage);

    scanner.close();
  }

  static void basketBall(){

    Scanner scanner = new Scanner(System.in);

    int totalWins = 0;
    int totalLosses = 0;
    int totalGamesPlayed = 0;

    String tournamentName = scanner.nextLine();

    while (!"End of tournaments".equals(tournamentName)) {
      int numberOfGames = Integer.parseInt(scanner.nextLine());

      for (int gameNumber = 1; gameNumber <= numberOfGames; gameNumber++) {
        int desiPoints = Integer.parseInt(scanner.nextLine());
        int opponentPoints = Integer.parseInt(scanner.nextLine());

        int difference = Math.abs(desiPoints - opponentPoints);

        totalGamesPlayed++;

        if (desiPoints > opponentPoints) {
          totalWins++;
          System.out.printf("Game %d of tournament %s: win with %d points.%n",
              gameNumber, tournamentName, difference);
        } else {
          totalLosses++;
          System.out.printf("Game %d of tournament %s: lost with %d points.%n",
              gameNumber, tournamentName, difference);
        }
      }

      tournamentName = scanner.nextLine();
    }

    double winPercentage = (double) totalWins / totalGamesPlayed * 100;
    double lossPercentage = (double) totalLosses / totalGamesPlayed * 100;

    System.out.printf("%.2f%% matches win%n", winPercentage);
    System.out.printf("%.2f%% matches lost%n", lossPercentage);

    scanner.close();
  }

  static void movieTicketLast(){

    Scanner scanner = new Scanner(System.in);

    int totalStudentTickets = 0;
    int totalStandardTickets = 0;
    int totalKidTickets = 0;
    int grandTotalTickets = 0;

    String movieName = scanner.nextLine();

    while (!"Finish".equals(movieName)) {
      int availableSeats = Integer.parseInt(scanner.nextLine());
      int currentMovieTicketsSold = 0;

      String ticketType = scanner.nextLine();

      while (!"End".equals(ticketType)) {
        currentMovieTicketsSold++;

        switch (ticketType) {
          case "student":
            totalStudentTickets++;
            break;
          case "standard":
            totalStandardTickets++;
            break;
          case "kid":
            totalKidTickets++;
            break;
        }

        if (currentMovieTicketsSold == availableSeats) {
          break;
        }

        ticketType = scanner.nextLine();
      }

      double percentageFull = (double) currentMovieTicketsSold / availableSeats * 100;
      System.out.printf("%s - %.2f%% full.%n", movieName, percentageFull);

      grandTotalTickets += currentMovieTicketsSold;

      movieName = scanner.nextLine();
    }

    System.out.printf("Total tickets: %d%n", grandTotalTickets);

    if (grandTotalTickets > 0) {

      double studentTicketsPercentage = (double) totalStudentTickets / grandTotalTickets * 100;
      double standardTicketsPercentage = (double) totalStandardTickets / grandTotalTickets * 100;
      double kidTicketsPercentage = (double) totalKidTickets / grandTotalTickets * 100;

      System.out.printf("%.2f%% student tickets.%n", studentTicketsPercentage);
      System.out.printf("%.2f%% standard tickets.%n", standardTicketsPercentage);
      System.out.printf("%.2f%% kids tickets.%n", kidTicketsPercentage);
    } else {

      System.out.printf("%.2f%% student tickets.%n", 0.00);
      System.out.printf("%.2f%% standard tickets.%n", 0.00);
      System.out.printf("%.2f%% kids tickets.%n", 0.00);
    }


    scanner.close();

  }

}
