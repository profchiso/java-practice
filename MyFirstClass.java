import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class MyFirstClass {

  Scanner scan = new Scanner(System.in);

  //recursive methods
  static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }

  //method
  static String capitalize(String str) {
    return str.toUpperCase();
  }

  //method overloading
  int numberManipulation(int num) {
    return num;
  }

  float numberManipulation(float num) {
    return num;
  }

  public static void main(String[] args) {
    final int myAge = 30;
    int empty = 2;
    char letter = 'a';
    String[] myNameLength = { "a", "b", "c", "d", "e" };
    String specialCharacters = "chinedu \rkok ";
    boolean notEmpty = true;
    int min = Math.min(1, 4);
    int randomNum = (int) (Math.random() * 7);
    int i = 0;

    //loop
    while (i < 10) {
      System.out.println(i);
      i++;
    }

    //loop
    for (int k = 0; k < 5; k++) {
      System.out.println(k);
    }

    //array
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    for (String c : cars) {
      System.out.println(c);
      System.out.println(Arrays.toString(cars));
    }
    int sn = sum(5, 10);

    //calling another class method
    Class2 class2 = new Class2();
    String ok = Class2.itsFine;

    System.out.println(LocalDate.now().toString());

    MyAbstract myAbstract = new MyAbstract();

    System.out.println(myAbstract.getName());

    System.out.println(Class2.getDetail(class2.name, class2.age) + "  " + ok);

    System.out.println(
      "my age is " + myAge + " and " + randomNum + capitalize("chinedu") + sn
    );
  }
}
