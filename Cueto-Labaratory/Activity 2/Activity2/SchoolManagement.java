package Activity2;


public class SchoolManagement {
        public static void main(String[] args) {
        
        Student student = new Student("johnny", 1, "10th Grade");
        Teacher teacher = new Teacher("Mr. bean", 2, "politics");
        Staff staff = new Staff("Mrs. lebron", 3, "Administration");

        
        System.out.println("Student Information:");
        student.displayInfo();
        System.out.println();

        System.out.println("Teacher Information:");
        teacher.displayInfo();
        System.out.println();

        System.out.println("Staff Information:");
        staff.displayInfo();
        System.out.println("thank you for being patient with us");
    }
}

