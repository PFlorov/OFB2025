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


}
