package assignmentOne;

public class Class3 {
    // no argument constractor
    public Class3(){
        System.out.println("No agrgument constractor.");
    }

    // constractor overlodding
    public Class3(int x){
        System.out.println("Parameterige constractor.");
    }

    public static void main(String[] args) {
        new Class3();
        new Class3(5);

        method1();
        method1(1);
    }

    public static void method1(){
        System.out.println("print something for non parameterize method.");
    }

    public static void method1(int x){
        System.out.println("print something for parameterize method.");
    }
}
