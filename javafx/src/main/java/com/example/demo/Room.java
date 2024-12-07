package com.example.demo;

import java.util.ArrayList;

public abstract class Room {
    public String name;
    private int ID;
    private static int availabe_visi;
    private boolean IsIndoor;
    private boolean HasFreeWIFI;
    private boolean HasScreen;
    private boolean HasWhiteboard;
    //slots
    ArrayList<Visitor> listOfVisi;
    // abstract void displaySlots(); interface instead

    public Room(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Room(String name, int ID, boolean isIndoor, boolean hasFreeWIFI, boolean hasScreen, boolean hasWhiteboard) {
        this.name = name;
        this.ID = ID;
        IsIndoor = isIndoor;
        HasFreeWIFI = hasFreeWIFI;
        HasScreen = hasScreen;
        HasWhiteboard = hasWhiteboard;
    }

    public static int getAvailabe_visi() {
        return availabe_visi;
    }

    public static void setAvailabe_visi(int availabe_visi) {
        Room.availabe_visi = availabe_visi;
    }

    public boolean isIndoor() {
        return IsIndoor;
    }

    public void setIndoor(boolean indoor) {
        IsIndoor = indoor;
    }

    public boolean isHasFreeWIFI() {
        return HasFreeWIFI;
    }

    public void setHasFreeWIFI(boolean hasFreeWIFI) {
        HasFreeWIFI = hasFreeWIFI;
    }

    public boolean isHasScreen() {
        return HasScreen;
    }

    public void setHasScreen(boolean hasScreen) {
        HasScreen = hasScreen;
    }

    public boolean isHasWhiteboard() {
        return HasWhiteboard;
    }

    public void setHasWhiteboard(boolean hasWhiteboard) {
        HasWhiteboard = hasWhiteboard;
    }

    public ArrayList<Visitor> getListOfVisi() {
        return listOfVisi;
    }

    public void setListOfVisi(ArrayList<Visitor> listOfVisi) {
        this.listOfVisi = listOfVisi;
    }

    abstract void calcFee();


}
