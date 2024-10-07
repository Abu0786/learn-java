package designPattern.abstract_design_pattern;

public class AndroidDevFactory extends AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return (Employee) new AndroidDeveloper();
    }
}
