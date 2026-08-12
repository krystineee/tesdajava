package chapter6;

import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionLesson {
    public static void main(String[] args) throws Exception, RuntimeException{
        throw new Exception("Bad Code"); //without s in the body
        /*throw new RuntimeException("Bad Code"); //error unreachable since exception na yung una*/
    }
}

class ExceptionLesson2{
    public static void main(String[] args) {
        //try-catch should always be together
        try{
            //args[0] = "Hello World";
            //System.out.println(args[0]); 
            //System.exit(0); //will not print anything placed after
            System.out.println(12/0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException");
        }
        finally{ //will always run
            System.out.println("finally block");
        }
        System.out.println("done");
    }
}

//Second Exception
//possible try-catch & try-finally
class ExceptionLesson3{
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = read;
        }
        catch(IOException e){
            try{
                if(reader!=null){
                    reader.close();
                }
            }
            catch(IIOException inner){
            }
        }
    }
    private static FileReader read() throws IOException{
        return null;
    }
}
