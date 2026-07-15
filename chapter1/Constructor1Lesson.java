package chapter1; 

public class Constructor1Lesson {
  public static void main(String[] args) {
    Chicken c1 = new Chicken();
    Chicken c2 = new Chicken();
    System.out.println();
  }
}

class Chicken {
  /*
    constructor same name as the class name
    sets the innital value of the object when it is created
    VV
  */
  int numEggs = 0;
  String name;
  public Chicken() {
    name = "Hen";
  }
}