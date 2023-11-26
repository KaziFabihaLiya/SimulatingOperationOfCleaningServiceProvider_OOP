/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ahmed
 */
public class developementModel implements Serializable {
    protected String devPlan;
    protected Long budget;
    protected LocalDate dateofissue;

    public developementModel(String devPlan, Long budget, LocalDate dateofissue) {
        this.devPlan = devPlan;
        this.budget = budget;
        this.dateofissue = dateofissue;
    }

    public String getDevPlan() {
        return devPlan;
    }

    public void setDevPlan(String devPlan) {
        this.devPlan = devPlan;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public LocalDate getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(LocalDate dateofissue) {
        this.dateofissue = dateofissue;
    }

    @Override
    public String toString() {
        return "" + "Developement Plan : " + devPlan + "\n" + 
                "Budget Required : " + budget + "\n" + 
                "Date of Issue : " + dateofissue + "\n" + "\n" ;
    }
}