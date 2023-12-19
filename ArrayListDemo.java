import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<String> age = new ArrayList<String>();
    ArrayList<Integer> num = new ArrayList<Integer>();
    LinkedList<String> cars = new LinkedList<String>();

    cars.add("BMW");

    cars.addFirst("Honda");
    cars.addLast("Toyota");

    System.out.println(
      cars.size() +
      "  " +
      cars.toString() +
      " " +
      cars.clone() +
      " " +
      cars.contains("Honda") +
      " " +
      cars.getLast() +
      " " +
      cars.peek()
    );

    num.add(0);
    num.add(1);
    num.add(2);
    System.out.println(num.toString());
    System.out.println(num.get(1));
    num.set(1, 5);

    age.addFirst("32");

    System.out.println(num.toString());
    Collections.sort(num);
    System.out.println(num.toString() + "  " + num.size());
    age.add("34");
    age.add("21");
    System.out.println(age.size() + " " + age.toString());
    age.remove("34");
    System.out.println(age.toString());

    age.isEmpty();
    age.clear();
    System.out.println(age.toString());
  }
}
