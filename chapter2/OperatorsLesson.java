package chapter2;

public class OperatorsLesson{
    public static void main(String[] args){
    //shift ops
    System.out.println(2<<2);
    System.out.println(8>>>1); //unsigned
        //0 0 1 0 will move bit
        //8 4 2 1    
    
    //unary operator
    int a = 5;
    System.out.println(a++); //print out value of a first before incrementing 1
    System.out.println(a); //prints out incremented value

    int p = 3;
    System.out.println(++p+p++);// (1+3) + 4 =8
    System.out.println(p); //4++
    //❌ ++p++; --p-=-;
    //✅p=+p++;

    //casting
    short x = 10;
    short y = 30;
    short z = (short)(x*y);
    System.out.println("z="+ z);
    // (type) value or variable;
    int g = (byte)26;
    byte w = (byte)g;
    
    //logic boolean
    System.out.println(!false); 
    boolean isActive = false;
    System.out.println(!!!!!!!!!!!!!isActive); 
    System.out.println();
    boolean isActive2 = false, isActive3;
    isActive=isActive2=isActive3=true;
    System.out.println(isActive);
    System.out.println(isActive2);
    System.out.println(isActive3);
    }
}
