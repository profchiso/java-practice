public class Interface {

  /**
   * InnerInterface
   */
  interface InnerInterface {
    String name = "chi";
    boolean isMarried = false;

    public void callName();
  }

  /**
   * InnerInterface_1
   */
  class InnerImplement implements InnerInterface {

    public void callName() {
      System.out.println(InnerImplement.name);
    }
  }

  public static void main(String[] args) {
    Interface inter = new Interface();
    Interface.InnerImplement in = inter.new InnerImplement();
    in.callName();
    //System.out.println(InnerImplement.name);
  }
}
