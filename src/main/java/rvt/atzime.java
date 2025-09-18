package rvt;

import java.util.Scanner;

public class atzime {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give points [0-100]: ");

        int grade = Integer.valueOf(scanner.nextLine());

        if (grade < 0){
            System.out.println("Grade: impossible!");
        } else if (grade < 50){
            System.out.println("Grade: falied");
        } else if (grade < 60){
            System.out.println("Grade: 1");
        } else if (grade < 70){
            System.out.println("Grade: 2");
        } else if (grade < 80){
            System.out.println("Grade: 3");
        } else if (grade < 90){
            System.out.println("Grade: 4");
        } else if (grade <= 100){
            System.out.println("Grade: 5");
        } else if (grade > 100){
            System.out.println("Grade: incredible!");
        }
    }
}
