package PS8;

class Employee{
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        name = name1;
    }
}
public class PS8a {
    public static void main(String[] args) {
    Employee inder = new Employee();
    inder.setName("Inder");
        System.out.println(inder.getName());
        inder.salary = 1000;
        System.out.println(inder.getSalary());
    }
}
