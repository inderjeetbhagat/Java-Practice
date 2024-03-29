package Classes;

class Employee {
    int id;
    String name;
    public void printDetails() {
        System.out.println("The id is " + id);
        System.out.println("The name is " + name);
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee inder = new Employee();

        inder.id = 12;
        inder.name = "Inderjeet";

//        System.out.println(inder.id);
//        System.out.println(inder.name);
        inder.printDetails();;


    }
}
