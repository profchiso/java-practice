import java.math.BigDecimal;
import java.util.Scanner;

public class InputClass {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entered a name  ");
    String myName = scan.nextLine();
    System.out.println("Entered an Age  ");
    int age = scan.nextInt();
    BigDecimal d = new BigDecimal(30);
    for (int i = 0; i < age; i++) {
      d = d.add(new BigDecimal("1.1"));
      System.out.println(d);
    }
    System.out.println("Entered name is  " + myName + " entered age is " + age);
    scan.close();
  }
}
