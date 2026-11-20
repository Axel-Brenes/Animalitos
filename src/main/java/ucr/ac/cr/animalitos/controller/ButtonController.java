/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.animalitos.controller;

import javax.swing.JOptionPane;
import ucr.ac.cr.animalitos.model.Page;
import ucr.ac.cr.animalitos.view.FrmVentanaPrincipal;

/**
 *
 * @author Axel
 */
public class ButtonController {
    
    BookController bookController;
    Page page;

    public ButtonController() {
        this.bookController = new BookController();
        String title = JOptionPane.showInputDialog("Por favor escriba el título, este servirá como identificador.");
        String content = JOptionPane.showInputDialog("Por favor escriba el contenido dentro del texto.");
        FrmVentanaPrincipal frm = new FrmVentanaPrincipal();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        this.page = new Page(title, content, 1);
        bookController.addPage(page);
    } //End of constructor method
    
} //End of CLASS
