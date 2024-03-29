package Classes;

 class Employee1 {
    private int id;
    private String name;
    public Employee1() {
        this.id = 18;
    }

//    public void setId ( int i) {
//        id = i;
//    }
    public void getId () {
        System.out.println(id);
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Employee1 inderj = new Employee1();
//        inderj.id = 12;
//        inderj.name = "Inderjeet";
//        inderj.setId(78);
        inderj.getId();
    }
}
