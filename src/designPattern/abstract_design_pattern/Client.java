package designPattern.abstract_design_pattern;

import designPattern.EmployeeFactory;

public class Client {

    public static void main(String[] args) {
        //I want to get Android developer

        Employee e1 = (Employee) EmployeeFactory.getEmployee(new AndroidDevFactory().toString());

        System.out.println(e1.name());

        Employee e2 = (Employee) EmployeeFactory.getEmployee(new WebDeveloperFactory().toString());

        System.out.println(e2.name());


    }
}
