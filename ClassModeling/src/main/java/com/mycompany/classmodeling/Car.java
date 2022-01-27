/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;

/**
 *
 * @author jonga
 */
public class Car {
    private String color;
    private Integer doors;
    private Integer seats;
    private Integer windows;
    private Boolean wheels;
    
    // Default constructor
    public Car() {
        
    }
    
    // Constructor for Car fields
    public Car(String color, Integer doors, Integer seats, Integer windows, Boolean wheels) {
        this.color = color;
        this.doors = doors;
        this.seats = seats;
        this.windows = windows;
        this.wheels = wheels;
    }
    // getters and setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public Integer getDoors() {
        return doors;
    }
    public void setDoors(Integer doors) {
        this.doors = doors;
    }
    
    public Integer getSeats() {
        return seats;
    }
    public void setSeats(Integer seats) {
        this.seats = seats;
    }
    
    public Integer getWindows() {
        return windows;
    }
    public void setWindows(Integer windows) {
        this.windows = windows;
    }
    
    public Boolean getWheels() {
        return wheels;
    }
}
