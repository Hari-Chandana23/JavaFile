package OOPS;
class Multiply{
    public int mathFun(int a, int b){
        int mul = a*b;
        return mul;
    }
}
//Child class
class Divide extends Multiply {
    //Overridden Method
    public int mathFun(int a, int b){
        int div = a/b;
        return div;
    }
}
class Subtract extends Multiply {
    //Overridden Method
    public int mathFun(int a, int b){
        int sub = a-b;
        return sub;
    }
}
public class Arthematic {
    public static void main(String args[]){
        Multiply obj1 = new Divide();
        Multiply obj2 = new Subtract();
        System.out.println(obj1.mathFun(8,2));
        System.out.println(obj2.mathFun(8,2));
    }
}

