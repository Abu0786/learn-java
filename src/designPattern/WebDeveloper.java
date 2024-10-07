package designPattern;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("getting web developer salary");
        return 70000;
    }
}
