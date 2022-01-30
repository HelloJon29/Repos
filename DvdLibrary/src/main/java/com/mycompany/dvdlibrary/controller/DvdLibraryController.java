/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.controller;

import com.mycompany.dvdlibrary.dao.DvdLibraryDao;
import com.mycompany.dvdlibrary.ui.DvdLibraryView;

/**
 *
 * @author jonki
 */
public class DvdLibraryController {
    // Create new variables using type Dao and View
    DvdLibraryDao dao;
    DvdLibraryView view;
    // Initialize dao and view with new constructor
    public DvdLibraryController(DvdLibraryDao dao, DvdLibraryView view) {
        this.dao = dao;
        this.view = view;
    }
    // main logic to be ran
    public void run() {
        System.out.println("hello world");
    }
}
