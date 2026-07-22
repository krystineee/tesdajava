package chapter2;

public class LoopLesson {
    //other way for condition
    static boolean op(){
        return true;
    }
    
    public static void main(String[] args) {
        byte a = 1;
        //while | will only run if statement is true
        while(a<=10)
            System.out.println("a = "+a++);
        
        //do-while | will run 1 time if conditon is false
        do{
            System.out.println("do while : a = "+a--);
        }while (a<10);
        System.out.println("end of program");

        //for loop | can run without update statement & intialization and condition = infinite loop
        for(int b = 0;b<10;b++)
        System.out.println("b = " +b);
        //for(;;) - causes infinite loop | (;;;) causes error
        
        //also possible
        int c = 12;
        boolean bol = true;
        for(System.out.println("Initialization"); bol; System.out.println("update statement")) //infinite
        System.out.println("c = " + c++);

        //
        
    }
}