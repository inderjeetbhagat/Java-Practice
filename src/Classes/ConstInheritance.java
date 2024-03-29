package Classes;

class Base1 {
    Base1(int x, int y) {
        System.out.println("I'm a Base constructor with value x and y");
    }Base1(int x) {
        System.out.println("I'm a Base constructor with value x");
    }
    Base1() {
        System.out.println("I'm a constructor");
    }

    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
    class Derived1 extends Base1 {
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        Derived1() {
            System.out.println("I'm a derived constructor");
        }Derived1(int c, int y) {
            super(c,y);
            System.out.println("I'm a derived constructor with value c and y");
        }
    }



public class ConstInheritance {
    public static void main(String[] args) {
    Base1 b = new Base1();
    Derived1 d = new Derived1(1,5);

    }
}
