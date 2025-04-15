package Activity2;
public class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int id, String subject) {
        super(name, id); // Call to the parent constructor
        this.subject = subject;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to the parent displayInfo method
        System.out.println("Subject: " + subject);
    }
}
