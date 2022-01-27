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
public class Airplane {
    private String body;
    private String wings;
    private String cockpit;
    private Integer seats;
    private Integer windows;

    // Default Constructor
    public Airplane() {
    
    }
    // Properties constructor
    public Airplane(String body, String wings, String cockpit, Integer seats, Integer windows) {
        this.body = body;
        this.wings = wings;
        this.cockpit = cockpit;
        this.seats = seats;
        this.windows = windows;
    }
    // Getters and setters
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public String getCockpit() {
        return cockpit;
    }

    public void setCockpit(String cockpit) {
        this.cockpit = cockpit;
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
    
}
