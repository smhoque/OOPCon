package abstraction;

import java.util.Scanner;

/**
 * Created by riponctg on 12/8/2016.
 */
public class Student {

    public void EnterStudent() {
        String[] student = new String[5];
        System.out.println("Please enter student name:");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {
            student[i] = sc.nextLine();
        }
        System.out.println("Total student set to: ");
        for (int j = 0; j < student.length; j++) {
            System.out.println(student[j]);
        }

    }
}
