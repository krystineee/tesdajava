package chapter2;

public class IfSwitchStatementLesson {
    public static void main(String[] args) {
        int hourOfDay = 15;

        //if multiple statement use curly brace
        //if 1 only can omit curly brace
        if(hourOfDay<11)
            System.out.println("Good Morning");
        System.out.println("Kumain ka na ba?");

        //if-else
        if(hourOfDay<11)
            System.out.println("Good Morning");
        else
            System.out.println("Good Afternoon");
        
        //if-else if-else
        if(hourOfDay>=18)
            System.out.println("Good Evening");
        else if(hourOfDay>=12)
            System.out.println("Good Afternoon");
        else
            System.out.println("Good Morning");
        
        //ternary operator
        //(boolean expression) ? T : F;
        System.out.println((hourOfDay>=18)?"Good Eve":"Good Day");
        //also possible (boolean expression) ? T : (boolean expression) ? T : F;
        System.out.println((hourOfDay>=18)?"Good Eve":(hourOfDay>=12)?"Good Afternoon":"Good Morning");

        //Switch-case
        int dayOfWeek = 6;
        switch(dayOfWeek){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: 
            case 7: System.out.println("Weekends");
                break;            
            default: System.out.println("Invalid day of the week");
            //optional | can be placed anywhere in the switch-case statement
        }
    }
}