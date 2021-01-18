package edu.cnm.deepdive;

public class StringMethods {

  public static void main(String[] args) {
    String str = "java is fun";
    //length
    System.out.println("length = " + str.length());
    //char at
    System.out.println("char at = " + str.charAt(2));
    //index of
    System.out.println(str.indexOf('a'));
    System.out.println(str.indexOf('a', 2));//where is a starting from index 2
    System.out.println(str.indexOf("fun"));
    System.out.println(str.indexOf("fun, 10"));//returns -1 means match not found.
    //substring
    str.substring(8);//does not change str unless you reassign it (str = str.substring(8);
    str.substring(0, 6); //starts at 0 and does not include 6.
    System.out.println(str.substring(4, 4));// returns an empty string.
    System.out.println(str.substring(4, 2));//throws out of range exception.
    System.out.println(str.substring(4, 40));//throws out of range exception.
    //toLowerCase()
    System.out.println("AbCd".toLowerCase());//prints abcd.
    System.out.println(str.toUpperCase());//prints JAVA IS FUN.
    System.out.println(str);//prints java is fun because strings are immutable and
    //the original string hasn't changed.
    String dog = "Lucky";
    dog.toUpperCase();
    System.out.println(dog);//prints Lucky.

  }
}
