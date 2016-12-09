package abstraction;

import java.util.Random;

/**
 * Created by riponctg on 12/7/2016.
 */
public class Employee extends Department implements Organization {
    public static void EmployeeId() {
        System.out.println("Employee name is: 110");
    }

    public static void EmployeeName() {
        String name = "Paul";
        if (name == "Paul") {
            System.out.println("Employee name: " + name);
        } else if (name != "Paul") {
            System.out.println("Name does not exist");
        } else
            System.out.println("Name not found");
    }

    public static void EmployeeDepartment() {
        String departmentName = "Information Technology";
        do {
            System.out.println("Employee department Name:" + departmentName);
        }
        while (departmentName != "Information Technology");
    }

    public static void EmployeeEmail() {
        String email = "Paul@gmail.com";
        do {
            System.out.println("Employee email:" + email);
        } while (email != "Paul@gmail.com");

    }

    public static void EmployeesRoomNumber() {
        int[] room = new int[5];
        Random random = new Random();

        for (int i = 0; i < room.length; i++) {
            room[i] = random.nextInt(10);
        }
        for (int j = 0; j < room.length; j++) {
            System.out.println("Employees Room Number: " + room[j]);
        }
    }

    @Override
    public void DepName() {
        System.out.println("Department name is: Information Technology");
    }

    @Override
    public void DepLocation() {
        System.out.println("Department Location is: Forth Floor");
    }

    @Override
    public void OrName() {
        System.out.println("Organization name is: USA WebService");
    }

    @Override
    public void OrLocation() {
        System.out.println("Organization location is: Second Floor");
    }
}

