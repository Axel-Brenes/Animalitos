/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.animalitos.controller;

import ucr.ac.cr.animalitos.view.FrmVentanaPrincipal;

/**
 *
 * @author Axel
 */
public class ButtonController {
    
    BookController bookController;

    public ButtonController() {
        this.bookController = new BookController();
        FrmVentanaPrincipal frm = new FrmVentanaPrincipal();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    } //End of constructor method
    
    public void actionListener(){
        
    } //End of actionListener method
    
} //End of CLASS
