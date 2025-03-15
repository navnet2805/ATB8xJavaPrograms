package Tasks;

public class Child1 {
    String name = "Naveen";
    void display(Child1 person) {
        System.out.println("Name: " + person.name);
    }

    void show() {
        display(this); // Passes the current object as a parameter
    }
    }
