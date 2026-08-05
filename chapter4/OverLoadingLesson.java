package chapter4;

public class OverLoadingLesson {

    //overloaded method
    public void fly(int numMiles){
        System.out.println("int");
    }

    /** Duplicate method with int as return type
      public int fly(int numKilometers){
        System.out.println("int");
    }*/

    public void fly(short numFeet){
        System.out.println("short");
    }

    public void fly(Object obj){
        System.out.println("Object");
    }

    public boolean fly(){
        return false;
    }

    //without access modifier
    void fly(int numMiles, short numFeet){
        System.out.println("int, short");
    }

    //with exception
    public void fly(short numFeet, int numMiles) throws Exception{
        System.out.println("short, int");
    }

    public static void main(String[] args) {
        OverLoadingLesson oll = new OverLoadingLesson();
        short s = 1;
        oll.fly(1);
        oll.fly(s);
        System.out.println(oll.fly());
        oll.fly(1,(short)1); //casting 1 to short
        try{
            oll.fly((short)1, 1);
        }
        catch(Exception e){
            System.out.println("oll.fly((short)1, 1) has been catch");   
        }
    }
}

//order java uses to choose the right method
class Glider2 {
    public static String glide(String s) {
      return "1";
    }
    public static String glide(String... s) {
      return "2";
    }
    public static String glide(Object o) {
      return "3";
    }
    public static String glide(String s, String t) {
      return "4";
    }
    public static void main(String[] args) {
      System.out.println(glide("a"));
      System.out.println(glide("a", "b"));
      System.out.println(glide("a", "b", "c"));
    } }
