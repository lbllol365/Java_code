package CoreJava;
/*
此程序展示了以下特性：
    1.重载构造器
    2.用this()调用另一个构造器
    3.无参数构造器
    4.对象初始化块
    5.静态初始化块
    6.实例域初始化

 */
import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args){
        Employee_2[] staff = new Employee_2[3];

        staff[0] = new Employee_2("Harry",10000);
        staff[1] = new Employee_2(60000);
        staff[2] = new Employee_2();
    }
}

class Employee_2{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {
        Random random = new Random();
        nextId = random.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee_2(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee_2(double salary){
        this("Employee #" + nextId,salary);
    }

    public Employee_2(){

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

}
