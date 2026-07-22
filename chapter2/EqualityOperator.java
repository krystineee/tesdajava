package chapter2;

public class EqualityOperator{
    public static void main(String[] args) {
        File x = new File();
        File y = new File();
        File z = x;
        System.out.println(x==y); //output false
        System.out.println(x==z); //output true
    }
}

class File{
}