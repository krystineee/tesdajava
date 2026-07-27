package chapter3;
import java.util.*;

public class ArrayLesson {
    public static void main(String[] args) {
        //creating arrays
        int [] i = new int[3];
        int[] numbers2 = new int[]{1, 54, 75};
        int[] numbers3 = {42, 55, 99};//anonymous array 
        
        //array with object
        Student[] batch2 = {new Student(),new Student(),new Student(),null};
        
        //for-loop with array
        for(int j = 0; j<numbers3.length; j++)
            System.out.println(numbers3[j]);

        //.sort()
         int[] numbers4 = {1, 54, 75, 5 ,76, 3, 34, 8, 10, 42, 55, 99};
         Arrays.sort(numbers4);
         for(int number4: numbers4)
            System.out.print(number4+ ", ");
        System.out.println();
        //Can be used for String
        //output will be: 1, 10, 3, 42, 5, ...

        //.binarySearch()
        int searchNum = 9;
        System.out.println("\n"+searchNum + " search result: " + Arrays.binarySearch(numbers4, 9));
        //if array is unsorted result is unpredictable

        //varargs | parameter inside the method
            //public static void main(String... args){}    
        
        //Multidimensional Array
    }   
}

class Student{
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;
}