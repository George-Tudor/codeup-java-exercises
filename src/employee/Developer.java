package employee;

class Developer extends Employee {
    public Developer(String name, String department) {
        super(name, department);
    }

    public Developer() {
        super();
    }

    public String work() {
        return "writing code";
    }
}



