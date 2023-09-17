package assignmentOne;

public class Class2 {
    // static variable
    public static final String std_name="Sabbib";
    // global variable
    String std_dept;
    int  id=12345;
    static String std_height="5.7";

    public static void main(String[] args) {
        // local variabl
        String std_address="Dhaka";

        // create object
        Class2 information=new Class2();
        System.out.println("Student Name :"+ Class2.std_name);
        information.std_dept="IT";
        System.out.println("Student Department :"+information.std_dept);
        information.studentId();
        studentHeight();
    }

    // static method
    public void studentId(){
        System.out.println("Student Id: "+id);
    }

    // non-static method
    public static void studentHeight(){
        System.out.println("Student Height: "+std_height);
    }
}
