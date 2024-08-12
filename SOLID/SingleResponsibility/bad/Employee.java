package LowLevelDesign.SOLID.SingleResponsibility.bad;

public class Employee {
    private String name;
    private String email;

    public void saveEmployee() {
        // Code to save employee to database
    }

    public void sendEmail(String message) {
        // Code to send email
    }

    public void calculateSalary() {
        // Code to calculate salary
    }
}
