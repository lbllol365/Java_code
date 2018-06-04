package CoreJava.clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n,double s){
        name = n;
        salary = s;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();

        cloned.hireDay = (Date)hireDay.clone();
        return cloned;
    }
    public void setHireDay(int year,int month,int day){
        Date newHireDay = new GregorianCalendar(year,month - 1,day).getTime();
        hireDay.setTime(newHireDay.getTime());

    }

    public void raiseSalary(double bePercent){
        double raise = salary * bePercent / 100;
        salary += raise;
    }

    public String toString(){
        return "Emloyee[name" + name + ",salary=" + salary + "hireDay=" + hireDay + "]";
    }
}
