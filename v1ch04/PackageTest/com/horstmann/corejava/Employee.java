package com.horstmann.corejava;

import java.time.*;

/**
 * A {@code Employee} object represents 
 * a man work in my company.
 */
public class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

/**
 * Construct a Employee Object
 * @param name name of employee
 * @param salary money
 * @param year year of hireday
 * @param month month of hireday
 * @param day day of hireday
 */
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

/**
 * get name of employee
 * @return the name
 */
    public String getName(){
        return name;
    }

/**
 * get salary of employee
 * @return the salary
 */
    public double getSalary(){
        return salary;
    }

/**
 * get hireday of employee
 * @return localdate
 */
    public LocalDate getHireDay(){
        return hireDay;
    }

/**
 * raise salary to a employee
 * @param byPercent wwww
 */
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}