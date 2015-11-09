package com.revivalx.androidparsetodolist.model;

/**
 * Created by Bradley on 11/8/2015.
 */
public class Task {

    public String taskId;
    public String name;

    public Task(){
        this.taskId = "";
        this.name = "";
    }

    public void setTaskId(String taskId){
        this.taskId = taskId;
    }

    public String getTaskId(){
        return taskId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
