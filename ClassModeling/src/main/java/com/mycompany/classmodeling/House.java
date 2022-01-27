/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;

/**
 *
 * @author jonki
 */
public class House {
    private int sides;
    private int doors;
    private int rooms;
    private String color;
    private boolean roof;
    
    //default constructor
    public House() {  
        
    }
    // Properties Constructor for testing
    public House(int sides, int doors, int rooms, String color, boolean roof) {
        this.sides = sides;
        this.doors = doors;
        this.rooms = rooms;
        this.color = color;
        this.roof = roof;
    }
    // Getters and setters or as Mo calls them, "Helper functions"
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }
    
}

