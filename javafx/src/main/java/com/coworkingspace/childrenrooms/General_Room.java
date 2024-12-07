package com.coworkingspace.childrenrooms;

public class General_Room {
    private boolean IsIndoor;
    private boolean HasFreeWIFI;

    public void setIsIndoor(boolean IsIndoor){
        this.IsIndoor =IsIndoor;
    }
    public boolean getIsIndoor(){
        return IsIndoor;
    }

    public void setHasFreeWIFI(boolean HasFreeWIFI){
        this.HasFreeWIFI=HasFreeWIFI;
    }
    public boolean getHasFreeWIFI(){
        return HasFreeWIFI;
    }
}
