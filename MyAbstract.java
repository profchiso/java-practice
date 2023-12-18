public class MyAbstract extends InnerMyAbstract {

  static final String nickName = "Profchiso";

  public String getName() {
    MyAbstract m = new MyAbstract();

    return " " + m.name + "  " + m.age + " " + m.isSingle;
  }
}

abstract class InnerMyAbstract {

  String name = "Chinedu";
  int age = 25;
  boolean isSingle = true;
}
