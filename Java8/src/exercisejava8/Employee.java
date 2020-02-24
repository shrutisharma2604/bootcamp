package exercisejava8;
//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference
interface ConsRefInterface{
     Employee consRef(String name, int age, String city);
}
public class Employee {
    String name;
    int age;
    String city;

    public Employee(String name, int age, String city) {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConsRefInterface consRefInterface=Employee::new;
        Employee employee=consRefInterface.consRef("Shruti",22,"Rudrapur");
        System.out.println(employee.toString());
    }
}
