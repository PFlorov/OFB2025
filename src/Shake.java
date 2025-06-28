import java.util.Scanner;
public class Shake {


  static void Shake(){
    Scanner scanner = new Scanner(System.in);

    StringBuilder text = new StringBuilder(scanner.nextLine());
    StringBuilder pattern = new StringBuilder(scanner.nextLine());

    boolean shakenSuccessfully = false;


    while (pattern.length() > 0) {

      int firstMatchIndex = text.indexOf(pattern.toString());
      int lastMatchIndex = text.lastIndexOf(pattern.toString());


      if (firstMatchIndex != -1 && lastMatchIndex != -1 && firstMatchIndex != lastMatchIndex) {

        System.out.println("Shaked it.");
        shakenSuccessfully = true;


        text.delete(lastMatchIndex, lastMatchIndex + pattern.length());

        firstMatchIndex = text.indexOf(pattern.toString());
        if (firstMatchIndex != -1) {
          text.delete(firstMatchIndex, firstMatchIndex + pattern.length());
        }
        else {
          break;
        }


        int middleIndex = pattern.length() / 2;
        pattern.deleteCharAt(middleIndex);

      }
      else {
        break;
      }
    }

    System.out.println("No shake.");
    System.out.println(text.toString());

    scanner.close();
  }
}
