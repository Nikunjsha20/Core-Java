import java.util.Scanner;
public class MethodForSameClass {
    public static void main(String[] args){
        display();    //Direct Calling static method
        MethodForSameClass.display(); //By using class name we can also access static methods
        MethodForSameClass obj = new MethodForSameClass(); // By create object calling non-static methods
        obj.print();

    }
    static void display(){
        System.out.println("this is Display Static method");
        display2(); //Direct calling Static method
    }

    static void display2(){
        System.out.println("This is display two method..");

    }

    void print(){
        System.out.println("This is Print non-static method");
        show(); // calling non-static method in non-static method Directly
    }

    void show(){
        System.out.println("This is Show non-static method");
        display(); // calling static method in non-static method directly
    }

}