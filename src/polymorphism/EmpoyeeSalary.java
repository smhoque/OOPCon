package polymorphism;

/**
 * Created by riponctg on 12/8/2016.
 */
public class EmpoyeeSalary {
    public void TotalSalary(int salary) {
        int total = (salary);
        System.out.println("First Year Employee salary: " + total);

    }

    public void TotalSalary(int salary, int comission) {
        int total = (salary + comission);
        System.out.println("Second Year Employee salary: " + total);

    }

    public void TotalSalary(int salary, int commission, int bonus) {
        int total = (salary + commission + bonus);
        System.out.println("Thired Year Employee Salary: " + total);

    }
}
