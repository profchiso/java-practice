import java.util.ArrayList;

public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<String> age = new ArrayList<String>();
    ArrayList<Integer> num = new ArrayList<Integer>();

    num.add(0);
    num.add(1);
    num.add(2);
    System.out.println(num.toString());
    System.out.println(num.get(1));
    num.set(1, 5);
    System.out.println(num.toString());
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
