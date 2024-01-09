package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println("Hello world");
        test();
        add(10,20);
    }
    public static void test(){
        System.out.println("From test method");
    }
    public static void add(int a, int b){
        System.out.println("Sum of "+ a +" & " + b + " = "+ (a+b));
    }
}
