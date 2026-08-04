package chapter4;
import static java.util.Arrays.asList;

public class VarArgsLesson{
    int counter;
    static final int COUNTDOWN = 10;

    public int sumOfAllNums(int...y){
        int sum = 0;
        for(int num:y)
            sum+=num;
        return sum;
    }

    public int sumOfAllNums2(String h, int p, int...y){
        int sum = 0;
        System.out.println(h);
        for(int num:y)
            sum+=num;
        return sum;
    }

    //static method
    public static float getEarthsGravity(){
        return 9.8f;
    }

    //field
    public static float marsGravity = 3.72f;

    //max parameter 256 | included empty
    //multiple parameters | must always declare data type
    public static void hugeParameter(int p1, int p2, int p3){
    }

    
    public static void main(String[] args) {
        VarArgsLesson vl = new VarArgsLesson();
        VarArgsLesson vl2 = new VarArgsLesson();
        int[] a ={1,2,3,4,5,6,7,8,9,10};
        
        //System.out.println(vl.sumOfAllNums(1,2,3,4,5,6,7,8,9,10));
        System.out.println(vl.sumOfAllNums(a)); //output is 55
        System.out.println(vl.sumOfAllNums2("Marc", 1,2,3,4,5,6,7,8,9,10));
        //without String output is 54 | 1 is stored in p
        
        System.out.println(getEarthsGravity());
        System.out.println(marsGravity);
        System.out.println(vl.marsGravity);
        
        //COUNTDOWN = 100; //will not work because of Final modifier
        
        vl.marsGravity = 100;
        vl.counter = 3 ;
        System.out.println(vl.marsGravity);
        System.out.println(vl.counter);
        System.out.println(vl2.marsGravity);
        System.out.println(vl2.counter);

        vl = null;
        //System.out.println(vl.counter); //throws exception because of null
        System.out.println(vl.marsGravity);
    
    }
}