package polymorphism;

/**
 * Created by riponctg on 12/8/2016.
 */
public class CEOSalary extends EmpoyeeSalary {
    public void TotalSalary(int salary, int commission, int bonus) {
        int total = (salary + commission + bonus + 2000);
        System.out.println("First Year CEO Salary: " + total);
    }
}
