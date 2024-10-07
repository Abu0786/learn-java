package designPattern.abstract_design_pattern;

import designPattern.Employee;

public class AndroidDeveloper implements Employee {

    public int getSalary() {
        return 10000;
    }
    public String name(){
        System.out.println("I am Android developer");
        return "Android Developer";
    }
}
