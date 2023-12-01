/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import java.io.Serializable;

/**
 *
 * @author kazif
 */
public class TaskSubmissionModelClass implements Serializable {
    String cleanerName,cleanerType,taskName;
    
    int cleanerCode;

    public TaskSubmissionModelClass(String cleanerName, int cleanerCode, String cleanerType, String taskName) {
        this.cleanerName = cleanerName;
        this.cleanerType = cleanerType;
        this.taskName = taskName;
        this.cleanerCode = cleanerCode;
    }

    public String getCleanerName() {
        return cleanerName;
    }

    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName;
    }

    public String getCleanerType() {
        return cleanerType;
    }

    public void setCleanerType(String cleanerType) {
        this.cleanerType = cleanerType;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getCleanerCode() {
        return cleanerCode;
    }

    public void setCleanerCode(int cleanerCode) {
        this.cleanerCode = cleanerCode;
    }

    
    
    
}
