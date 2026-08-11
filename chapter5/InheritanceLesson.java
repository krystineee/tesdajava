package chapter5;

public class InheritanceLesson {
    public static void main(String[] args) {
        FinalParent p1 = new FinalParent();
        Lion animal = new Lion("muning", 4, 13123421);
    }
}

/* adding final keyword will prevent other class from inheriting
will still output */
class FinalParent{
    int number;
    void getParent(){

    }
}

/* will inherit from FinalParent
will error if FinalParent has 'final' */
class ChildClass extends FinalParent{ 
    void getChildParent(){
        getParent();
        System.out.println(number);
    }
}

class Animal2 extends java.lang.Object{
    String name;
    int age;
    public Animal2(String name, int age){ //constructor
        this.name = name;
        this.age = age;
    }
}

class Lion extends Animal2{
    int LionId;
    public Lion(String name, int age, int LionId){
        super(name, age); /* kung ano constructor ni parent same for super
                          calls superparent - Animals2*/
        this.LionId = LionId;
        System.out.println(super.name);
    }
}

class MountainLion extends Lion{
    String locationString;
    public MountainLion(String name, int age, int LionId, String locationString){
        super(name, age, LionId);
        this.locationString = locationString;
    }
}

//Override sample
class Canine{
    /*method hiding (add static keyword)
    static public double getAverageWeight(){ */
    static int dogFoodID = 5234;
    public boolean hasFangs = true;
    public double getAverageWeight(){    
        return 50;
    }
}

class Pug extends Canine{
    public double getAverageWeight(){
        this.hasFangs = false;
        System.out.println("Pug: " + hasFangs +"\nCanine: "+ super.hasFangs);
        return super.getAverageWeight()-30;
    }
}

class Wolf extends Canine{
    public double getAverageWeight(){
        return super.getAverageWeight()+20;
    }

    //Co-variant return type
    Canine getAnimal(){
        Canine w1 = null;
        return w1;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight()); //overrides the parent
        /* Hayop h1 = new Hayop(); error because Hayop is abstract */
        Hayop h1 = new Dog(); //works because creating a new object for Dog
    }
}

/* abstract class
Hindi pwede instantiate */
abstract class Hayop{
    int age;
    String name;
    public void eat(){
        System.out.println("Hayop is eating");
    }

    public abstract String getName(); //abstract method | no body
    abstract int getAge();
    abstract void setAge(int Age);
}

//will work even if walang abstract keyword
class Dog extends Mammal{
    public String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    @Override
    void sayImMammal() {
       System.out.println("Im a Mammal");
    }
    public void setAge(int Age){

    }
}

//if may abstract na keyword di na need ilagay abstract method
abstract class Mammal extends Hayop{
   abstract void sayImMammal();
}

//Assumed interface
abstract interface CanBurrow {
    public static final int MINIMUM_DEPTH = 2; //uppercase because constant
    public abstract int getMaximumDepth(); 
}

//interface can extend another interface | implements for class
interface CanBurrow2 extends CanBurrow {
    int MINIMUM_DEPTH2 = 2; //uppercase because constant
    int getMaximumDepth2(); 
    /*bawal magdeclare method body sa interface unless may default keyword
    override
    assumed public*/
    default int getMinDepth(){ //can only be used in interface | must have method body
        return 1;
    }
    //other way to declare method body - static interface
    static boolean isInWater(){ 
        return false;
    }
}

//class can extend another class | implement for interface
class FieldMouse extends Hayop implements CanBurrow2{
    public int getMaximumDepth(){ 
    return MINIMUM_DEPTH - 1;
    }
    public int getMaximumDepth2(){ 
    return MINIMUM_DEPTH;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    int getAge() {
        return age;
    }
    @Override
    void setAge(int Age) {
    }
}