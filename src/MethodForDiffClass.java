public class MethodForDiffClass {
    public static void main(String[] args){
        display();
        MethodForDiffClass obj2 = new MethodForDiffClass();
        obj2.show();
    }

    static void display(){
        Test.display2(); //calling other class static method by using class reference
        Test obj = new Test();
        obj.print(); // calling other class of non-static method by object creation

    }
    void show(){
        Test ob = new Test();
        ob.print();     //calling other class non-static method to other different class non-static method.
        Test.display2(); //Calling other class static method to non static method just using class name reference.
    }

}

class Test{
    static void display2(){
        System.out.println("This is Display two method of other test class");
    }
    void print(){
        System.out.println("This is print non-static method of test class...!!");
    }
}
