import java.util.Scanner;

public class InputClass {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entered a name  ");
    String myName = scan.nextLine();
    System.out.println("Entered name is  " + myName);
  }
}
