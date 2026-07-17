package chapter1;

public class ReferenceLesson {
  public static void main(String[] args) {
    java.util.Date today = new java.util.Date(); //today is a reference variable that can hold a reference to a Date object
    String greeting = "How are you?"; //greeting is a reference variable that can hold a reference to a String object
    System.out.println(args[0]);  
  }
}
