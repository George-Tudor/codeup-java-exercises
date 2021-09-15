public class Employee {
    public String name;
    public static String company = "Veridian Dynamics";

    public Employee(String name) {
        this.name = name;
    }

    public void displayEmployeeInfo() {
        System.out.println(name + " works at " + company);
    }

    public void randomQuote() {
        System.out.println(name + " says " + Quote.randomQuote());
    }

}

/*Create an Employee class. The employee class should have a name instance variable, a static company variable set to Veridian Dynamics, and a non-static method displayEmployeeInfo(). displayEmployeeInfo() should generate a string, name + " works at " + company. Create a test class that instantiates three employee objects with different names. Run displayEmployeeInfo on all of them to show that each has access to the employee static variable. Bonus: write a method that has the employee emit a random quote and test it.*/
