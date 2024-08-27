class A {
    String name;
    int age;
    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class B extends A {
    String department;
    public B(String name, int age, String department) {
        super(name, age); 
        this.department = department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        A objA = new A("X", 30);
        System.out.println("Details of Class A:");
        objA.displayInfo();
        B objB = new B("Y", 35, "Engineering");
        System.out.println("\nDetails of Class B:");
        objB.displayInfo();
    }
}
