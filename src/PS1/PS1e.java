package PS1;

import java.util.Scanner;

public class PS1e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write something");
        String x = in.nextLine();

        try{
            Integer.parseInt(x);
            System.out.println("It is an integer");
        }catch (NumberFormatException e){
            System.out.println("It is not an integer");
        }
    }
}
