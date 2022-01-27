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
public class IceCream {
    private String flavor;
    private String size;
    private Boolean cone;
    // Default Constructor
    public IceCream() {
        
    }
    // Fields Constructor
    public IceCream(String flavor, String size, Boolean cone) {
        this.flavor = flavor;
        this.size = size;
        this.cone = cone;
    }
    // Getters and setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getCone() {
        return cone;
    }

    public void setCone(Boolean cone) {
        this.cone = cone;
    }
    
}
