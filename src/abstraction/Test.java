package abstraction;

import encapsulation.CEO;
import inheritance.Accounting;
import inheritance.HumanResource;
import polymorphism.CEOSalary;


/**
 * Created by riponctg on 12/7/2016.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("---Employee Details---" + "\n");
        Employee.EmployeeId();
        Employee.EmployeeName();
        Employee.EmployeeDepartment();
        Employee.EmployeeEmail();
        Employee.EmployeesRoomNumber();

        System.out.println("---Organizsation Details---" + "\n");
        Organization o = new Employee();
        o.OrName();
        o.OrLocation();

        System.out.println("---Department Details---" + "\n");
        Department d = new Employee();
        d.DepId();
        d.DepName();
        d.DepLocation();

        System.out.println("---CEO Details---" + "\n");
        CEO ceo = new CEO();
        ceo.setCeoName("Michels Rose");
        ceo.setCeoId(111);
        ceo.setCeoPhone("7031232365");
        ceo.setCeoEmail("michelrose@hotmail.com");
        System.out.println("CEO Name: " + ceo.getCeoName() + " CEO ID: " + ceo.getCeoId() + " CEO Phone: " + ceo.getCeoPhone() + " CEO Email: " + ceo.getCeoEmail());

        System.out.println("---Accounting and Human Resource Details---" + "\n");
        Accounting a = new Accounting();
        a.accountCleark();
        a.HumanResourceCleark();
        a.FindLocation(1);
        a.FindLocation(2);
        a.reader();

        System.out.println("---Salary  Details---" + "\n");
        CEOSalary ceoSalary = new CEOSalary();
        ceoSalary.TotalSalary(10000);
        ceoSalary.TotalSalary(10000 + 2000);
        ceoSalary.TotalSalary(10000 + 2000 + 1000);
        ceoSalary.TotalSalary(10000 + 2000 + 1000 + 2000);

        System.out.println("---Date---" + "\n");
        TodaysDate td = new TodaysDate();
        td.ShowDate();

        System.out.println("---Student Room Number---" + "\n");
        StudentRoomNumber studentRoomNumber = new StudentRoomNumber();
        studentRoomNumber.RoomNumber();

        System.out.println("---Set Student name to database---" + "\n");
        Student st = new Student();
        st.EnterStudent();
    }
}





