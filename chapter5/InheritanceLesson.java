package chapter5;

public class InheritanceLesson {
    public static void main(String[] args) {
        FinalParent p1 = new FinalParent();
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
    public double getAverageWeight(){    
        return 50;
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
        Hayop h1 = new Dog() //works because creating a new object for Dog
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
}

//will work even if walang abstract keyword 
class Dog extends Hayop{
    public String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}