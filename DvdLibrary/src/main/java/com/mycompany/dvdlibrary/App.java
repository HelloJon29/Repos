/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary;

import com.mycompany.dvdlibrary.controller.DvdLibraryController;
import com.mycompany.dvdlibrary.dao.DvdLibraryDao;
import com.mycompany.dvdlibrary.dao.DvdLibraryDaoImpl;
import com.mycompany.dvdlibrary.ui.DvdLibraryView;
import com.mycompany.dvdlibrary.ui.UserIO;
import com.mycompany.dvdlibrary.ui.UserIOConsoleImpl;

/**
 *
 * @author jonki
 */
public class App {
    public static void main(String[] args) {
        
    // Instantiate types
    UserIO myIO = new UserIOConsoleImpl();
    DvdLibraryDao dao = new DvdLibraryDaoImpl();
    DvdLibraryView view = new DvdLibraryView(myIO);
    DvdLibraryController controller = new DvdLibraryController(dao, view);
    
    controller.run();
    }
    
}
