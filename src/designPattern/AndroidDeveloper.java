package designPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("getting android developer salary");
        return 40000;
    }
}
