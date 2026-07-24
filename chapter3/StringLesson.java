package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name1 = "fluffy";
        String a = "1";
        a = "0";
        a+="2";
        a+="3";
        String b = "1";
        String name2 = "fluffy"; //same address as string1
        name1 = null;
        name2 = null;
        String name3 = new String("fluffy"); //will stil have same address as name1 even if it was changed to null
        System.out.println(a);

        //string methods

        //length()
        String string = "Animals";
        System.out.println(string.length());

        //charAt() returns index
        System.out.println(string.charAt(4));

        //indexOf()
        System.out.println(string.indexOf('A'));
        System.out.println(string.indexOf("al", 4));
        
        //substring() returns part of a string
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3, 5));
        
        //toLowerCase() & toUpperCase()
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        //string = string.toUpperCase();

        //equals() & equalsIgnoreCase()
        System.out.println("abc".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        //startsWith() & endsWith()
        System.out.println("abc".startsWith("a"));
        System.out.println("abc".endsWith("C"));

        //contains()
        System.out.println("abc".contains("B"));

        //replace()
        System.out.println("abc".replace('a', 'A'));
        System.out.println("abcabc".replace("ab","AA"));
        
        //trim() removes white spaces
        String trimsample = "       \t \n \t Marc Yim   \t\n";
        System.out.println(trimsample.trim());
        System.out.println(trimsample);

        //StringBuilder
            //limit for max character sequence integer.MAX_VALUE
            //String limitString = "";
        String sample1 = "abcd";
        String sample2 = "abcd";
        String sample3 = "abcd ";
        
        //comparing compile time
        System.out.println("sample1==sample2 = "+(sample1==sample2));
        System.out.println("sample1==sample3 = "+(sample1==sample3));
        System.out.println("sample2==sample3 = "+(sample2==sample3));
        
        //comparing runtime
        System.out.println("sample1.equals(sample2) = "+sample1.equals(sample2));
        System.out.println("sample1.equals(sample3) = "+sample1.equals(sample3));
        System.out.println("sample2.equals(sample3) = "+sample2.equals(sample3));

        System.out.println("sample1.equals(sample3.trim()) = "+sample1.equals(sample3.trim()));
        System.out.println("sample2.equals(sample3.trim()) = "+sample2.equals(sample3.trim()));
    }
    
}
