// Berkay Önk
package com.company;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Constructor for this class
    public Employee(String myName, double mySalary, int myWorkHours, int myHireYear){
        name = myName;
        salary = mySalary;
        workHours = myWorkHours;
        hireYear = myHireYear;
    }

    // Calculation of our tax
    double tax(){
        double tax;
        if(salary < 1000){
            return 0;
        }
        else{
            // %3 tax calculation
            tax = (salary*3)/100;
            return tax;
        }
    }

    // Calculation of our bonus
    double bonus(){
        double bonus;
        if(workHours > 40){
            bonus = (workHours - 40) * 30;
            return bonus;
        }
        else{
            return 0;
        }
    }

    // Method to raise salary according to bonus, tax and base salary
    double raiseSalary(){
        double mySalary;
        int yearsWorked = 2021 - hireYear;
        mySalary = salary + bonus();
        mySalary = mySalary - tax();

        if(yearsWorked <= 0){
            // Error
            System.out.println("Number of years worked can't be equal or lower than 0");
            return 0;
        }
        else if( yearsWorked < 10){
            mySalary = mySalary + (salary*5)/100;
            return mySalary;
        }
        else if(yearsWorked < 20){
            mySalary = mySalary + (salary*10)/100;
            return mySalary;
        }
        else{
            mySalary = mySalary + (salary*15)/100;
            return mySalary;
        }
    }

    // Overwrite toString() method
    public String toString(){
        return "Adı : " + name + System.getProperty("line.separator") + "Maaşı : " + salary + System.getProperty("line.separator") + "Çalışma Saati : " + workHours + System.getProperty("line.separator")
                + "Başlangıç Yılı : " + hireYear + System.getProperty("line.separator") + "Vergi : " + tax() + System.getProperty("line.separator") + "Bonus : " + bonus() + System.getProperty("line.separator")
                + "Maaş Artışı : " + (raiseSalary() - (salary + bonus() - tax())) + System.getProperty("line.separator") + "Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) + System.getProperty("line.separator")
                + "Toplam Maaş : " + raiseSalary();
    }
}
