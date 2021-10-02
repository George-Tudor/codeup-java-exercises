public class Person {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("His name is " + this.name);
    }

    public Person(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public static void main(String[] args) {
        Person person = new Person("Bill");
        System.out.println(person.getName());

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
