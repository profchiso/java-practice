import java.util.Scanner;

public class InputClass {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entered a name  ");
    String myName = scan.nextLine();
    System.out.println("Entered an Age  ");
    int age = scan.nextInt();
    System.out.println("Entered name is  " + myName + " entered age is " + age);
    scan.close();
  }
}
