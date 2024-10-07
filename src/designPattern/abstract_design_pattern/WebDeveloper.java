package designPattern.abstract_design_pattern;

import designPattern.Employee;

public class WebDeveloper implements Employee {

    public int getSalary() {
        return 20000;
    }

    public String name(){
        System.out.println("I am Web developer");
        return "Web Developer";
    }
}
