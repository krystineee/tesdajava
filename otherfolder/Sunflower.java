package otherfolder;

/* To import a class from another package, we use the import statement
   import packageName.className; e.g. (import chapter1.Toy;)
   or
   import packageName.*;
*/

import chapter1.*;
import chapter4.AccessModifier;
import chapter4.VarArgsLesson;

public class Sunflower {
  public static void main(String[] args) {
  Toy toy1 = new Toy();
  System.out.println(toy1);
  AccessModifier acm1 = new AccessModifier();
  acm1.greetMe();
  //acm1.greetMe2();
  //acm1.greetMe3();
  //acm1.greetMe4();
  }
}

//To use protected extend the parent or within the same folder only
class MoonFlower extends AccessModifier{
  public static void main(String[] args) {
    MoonFlower mf = new MoonFlower();
    mf.greetMe();
    mf.greetMe3();
    //mf.greetMe4();
    System.out.println(VarArgsLesson.getEarthsGravity()); //to make global | get reference file
  }
}