package PS1;

import java.util.Scanner;

public class PS1d {
    public static void main(String[] args) {
        System.out.println("Enter the distace in KM");
        Scanner in = new Scanner( System.in);
        float km = in.nextFloat();
        double miles = km * 0.621371;
        System.out.println("The distance in miles is: " + miles);
    }
}
