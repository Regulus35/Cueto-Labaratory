
package Activity2;

public class Staff extends Person {
    private String department;

    
    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
 
   
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

   
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
