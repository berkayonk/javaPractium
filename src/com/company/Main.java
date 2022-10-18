// Berkay Önk
package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "kemal";
        int salary = 2000;
        int workHours = 45;
        int hireYear = 1985;

	    Employee employee = new Employee(name,salary,workHours,hireYear);
        System.out.println(employee);
    }
}
