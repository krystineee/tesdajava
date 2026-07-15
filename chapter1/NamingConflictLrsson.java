package chapter1;

/*  
    will cause ambiguity if we import 
    java.util.* and java.sql.* because both packages 
    have a Date class
*/

//solution
import java.util.Date; //importing only the Date class from java.util package
/*
  or only import java.sql.Date; package
 */

public class NamingConflictLrsson {
  Date d1;
  //also possible
  java.sql.Date d2;
}
