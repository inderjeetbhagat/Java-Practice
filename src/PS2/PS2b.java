package PS2;

import java.util.Scanner;

public class PS2b {
    public static void main(String[] args) {
        System.out.println("Enter the grade");
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        int encriptedGrade = grade + 8;
        System.out.println("Encripted Grade = "+ encriptedGrade);
        int decriptedGrade = encriptedGrade - 8;
        System.out.println("Decripted Grade =" +decriptedGrade);
    }
}
