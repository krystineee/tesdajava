package chapter4;

public class AccessModifier{
    //public - any as long as inimport
    public void greetMe(){
        System.out.println("Hello from JAVA public people");
    }

    //private - same class only
    private void greetMe2(){
        System.out.println("Hello from JAVA private person");
    }

    //protected - same folder
    protected void greetMe3(){
        System.out.println("Hello from JAVA protected person");
    }

    //default - also same folder
    void greetMe4(){
        System.out.println("Hello from JAVA default person");
    }

public static void main(String[] args){
    AccessModifier acm1 = new AccessModifier();
    acm1.greetMe();
    acm1.greetMe2();
    acm1.greetMe3();
    acm1.greetMe4();
    }
}

class ClassZ { 
    public static void main(String[] args){
    AccessModifier acm1 = new AccessModifier();
    acm1.greetMe();
    //acm1.greetMe2();
    acm1.greetMe3();
    acm1.greetMe4();
        }
}