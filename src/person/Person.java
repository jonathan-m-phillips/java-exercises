package person;

public class Person {

    public String name = "Peron's Name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + ".");
    }

    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Person jon = new Person("Jon");
        Person erin = new Person("Erin");

        jon.sayHello();
        erin.sayHello();
    }

}
