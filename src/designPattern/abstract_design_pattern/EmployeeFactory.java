package designPattern.abstract_design_pattern;

public class EmployeeFactory {
      // get Employee
    public static Employee getEmployee(AbstractEmployeeFactory absFactory){
             return absFactory.createEmployee();
    }
}
