public class EmployeeTest {
    public static void main(String[] args) {
        Employee one = new Employee("Bill");

        Employee two = new Employee("Linda");
        
        Employee three = new Employee("Joe");

        three.displayEmployeeInfo();
        System.out.println(Employee.company);
    }

}
