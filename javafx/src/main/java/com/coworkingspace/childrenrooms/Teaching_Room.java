package com.coworkingspace.childrenrooms;

public class Teaching_Room {
    private String ProjectorType;
    private String BoardType;
    private String InstructorName;
    private boolean HasComputers;


    public void setProjectorType(String ProjectorType){
        this.ProjectorType=ProjectorType;
    }
    public String getProjectorType(){
        return ProjectorType;
    }

    public void setBoardType(String BoardType){
        this.BoardType=BoardType;
    }
    public String getBoardType(){
        return BoardType;
    }

    public void setInstructorName(String InstructorName){
        this.InstructorName=InstructorName;
    }
    public String getInstructorName(){
        return InstructorName;
    }

    public void setHasComputers(boolean HasComputers){
        this.HasComputers=HasComputers;
    }
    public boolean getHasComputers(){
        return HasComputers;
    }
}
