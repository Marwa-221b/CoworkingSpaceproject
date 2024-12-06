package com.coworkingspace.childrenrooms;

public class Meeting_Room {
    private boolean HasScreen;
    private boolean HasWhiteboard;


    public void setHasScreen(boolean HasScreen){
        this.HasScreen=HasScreen;
    }
    public boolean getHasScreen(){
        return HasScreen;
    }

    public void setHasWhiteboard(boolean HasWhiteboard){
        this.HasWhiteboard=HasWhiteboard;
    }
    public boolean getHasWhiteboard(){
        return HasWhiteboard;
    }
}


