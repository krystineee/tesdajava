package chapter4;

public class ConstructorLesson {
    public static void main(String[] args) {
        Bunny bun1 = new Bunny("Bugs");
        Bunny bun2 = new Bunny("Lola");
        Hamster ham1 = new Hamster(2);
        Hamster ham2 = new Hamster(2, "white");
        Hamster ham3 = new Hamster();
        System.out.println();
    }
}

//Default Constructor
class Bunny{
    String name; //instance variable
    public Bunny(String name){
        this.name = name; //"this" refers to the instance variable
        System.out.println("This is Bunny constructor");
    }

}

//Overloading Constructor
class Hamster{
    private String color;
    private int weight;

    public Hamster(int weight){ //1st constructor
        this.weight = weight;
        color = "brown";
        System.out.println("Hamster " + color);
    }
    public Hamster(int weight, String color){ //2nd constructor
        weight = weight;
        this.color = color;
        System.out.println("Hamster " + color);
    }
    public Hamster(){ //3rd constructor
        this(15,"pink");
    }
}

//Order of Iinitialization
class InitializationOrderSimple {
    private String name = "Torchie";    //instance
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    static { COUNT += 10; System.out.println(COUNT); }
    public InitializationOrderSimple() {
      System.out.println("constructor");    //method
    } 
    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}
