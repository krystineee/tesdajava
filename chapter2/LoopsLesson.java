package chapter2;

import java.util.Scanner;

public class LoopsLesson {
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
        boolean bol = false; //will infinite if true
        for(System.out.println("Initialization"); bol; System.out.println("update statement")) 
        System.out.println("c = " +c);

        //nested for-loop
        System.out.println("enter a valid number");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(int x=1; x<limit; x++){
            for(int y=1; y<=x; y++){
                System.out.print(x);
            }
            System.out.println();
        }

        //for-each
        String[] colors = {"black", "red", "pink", "yellow", "white", "blue"}; //array of colors
        for(String color:colors)
            System.out.println("Color: "+color);//prints all items in the array

        //optional labels
        ROW: for(int p = 1; p<=10; p++){
        COL: for(int l =1; l<10;l++){
                //continue/break statement
                if(l==5)
                    // break COL; //will print upto col 4 only
                    continue COL; //skips col 5
                System.out.print(l*p+"\t");}
            System.out.println();
        }
    }
}