package designPattern;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee.getSalary());
        Employee employee1 = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(employee1.getSalary());
    }
}
