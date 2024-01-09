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
        sub(20,10);
        mul(10,20);
        div(20,10);
    }
    public static void test(){
        System.out.println("From test method");
    }
    public static void add(int a, int b){
        System.out.println("Sum of "+ a +" & " + b + " = "+ (a+b));
    }
    public static void sub(int a, int b){
        System.out.println("Sub of "+ a +" & " + b + " = "+ (a-b));
    }
    public static void mul(int a, int b){
        System.out.println("Mul of "+ a +" & " + b + " = "+ (a*b));
    }
    public static void div(int a, int b){
        System.out.println("Div of "+ a +" & " + b + " = "+ (a/b));
    }
}
