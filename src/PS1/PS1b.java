package PS1;

import java.util.Scanner;

public class PS1b {
    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks of 3 subject");
        s1 = in.nextInt();
        s2 = in.nextInt();
        s3 = in.nextInt();

        float avg = (float) (s1 + s2 + s3) / 3;
        if (avg > 90 && avg <= 100) {
            System.out.println('A');
        } else if (avg > 80 && avg <= 90) {
            System.out.println('B');
        } else if (avg > 70 && avg <= 80) {
            System.out.println('C');
        } else if (avg < 70) {
            System.out.println('F');
        }
    }
}

