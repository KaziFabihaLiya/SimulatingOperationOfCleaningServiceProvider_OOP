/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

/**
 *
 * @author ahmed
 */
public class jobRecruitModel {
    protected String department, description,requirement;
    protected long salary;

    public jobRecruitModel(String department, String description, String requirement, long salary) {
        this.department = department;
        this.description = description;
        this.requirement = requirement;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getDescription() {
        return description;
    }

    public String getRequirement() {
        return requirement;
    }

    public long getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "We are looking for a employee in the " + department +" department with "
                 + description +" and degree of minimum " +  requirement + "\n" +
                " Offered Salary : " + salary +" (Negotiable)";
    }
    
    
}
