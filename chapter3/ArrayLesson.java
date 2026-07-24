package chapter3;

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
    }
}

class Student{
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;
}