package designPattern.abstract_design_pattern;

public class WebDeveloperFactory extends AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return (Employee) new WebDeveloper();
    }
}
