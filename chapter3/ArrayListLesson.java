package chapter3;
import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        
        //array with no generics
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add('c');
        list1.add(true);
        list1.add("asdfa");
        System.out.println(list1);

        //array with generics
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(54);
        list2.add(4);
        list2.add(2);
        System.out.println(list2.add(2)); //check if 2 is added
        list2.add(0,10); //puts 10 at index 0
        System.out.println(list2);

        //wrapper class
        int q = 10; 
        Integer w = 20; //has built-in methods unlike primitive types
        //not allowed in Java ver9
        // Integer w = new Integer(20);

        //autoboxing
        List nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        System.out.println(nums); // [1, 2]
        nums.remove(1);
        System.out.println(nums); // [1]
        
        //sorting arraylist
        List nums2 = Arrays.asList(8, 7, 2, 3, 4, 1, 9, 5, 6);
        Collections.sort(nums2);
        System.out.println("ascending order: " + nums2);
        Collections.reverse(nums2);
        System.out.println("reverse order: " + nums2);
        Collections.shuffle(nums2);
        System.out.println("shuffled: " + nums2);
    }
}
