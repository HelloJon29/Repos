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
public class Book {
    
    private Integer pages;
    private String binding;
    private Boolean novelType;
    // default constructor
    public Book() {
        
    }
    // Field constructor
    public Book(Integer pages, String binding, Boolean novelType) {
        this.pages = pages;
        this.binding = binding;
        this.novelType = novelType;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public Boolean getNovelType() {
        return novelType;
    }

    public void setNovelType(Boolean novelType) {
        this.novelType = novelType;
    }
}
