package CoreJava.abstractClasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{
    private double salary;
    private Date hireday;

    public Employee(String n,double s,int year,int month,int day){
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year,month - 1 ,day);
        hireday = calendar.getTime();
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireday(){
        return hireday;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f",salary);
    }

    public void raiseSalary(double bePercent){
        double raise = salary * bePercent / 100;
        salary += raise;
    }
}
