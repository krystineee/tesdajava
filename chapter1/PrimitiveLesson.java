package chapter1;

public class PrimitiveLesson {
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    byte a = 1;    //byte max value is 127
      /*
        short b = 32767; //short max value is 32767 more than that will be invalid
        int c = 2147483647; //becomes invalid int max value is 2147483647
      */
   float f = 3.14f; //with or without f, it is still a float
   double d =5.1D; //accepts f
   //to convet a number to a long add L at the end of the number 
      /* 
      int i = 56L; 
      invalid because long is bigger than int 
      */
   long l = 56L; //valid because long is bigger than int
   char c = 97; //char values are Unicode characters | look up Ascii table
   System.out.println(c);

   int million = 1_000_000; //valid because underscores are allowed in numbers as long its not at the start, end, and by a decimal
   float h =3.1_4f; //valid but annoying to look at
  }

}
