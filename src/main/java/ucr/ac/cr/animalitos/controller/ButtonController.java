/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.animalitos.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.animalitos.model.PageInteractive;
import ucr.ac.cr.animalitos.view.FrmVentanaPrincipal;
import ucr.ac.cr.animalitos.view.PanleDataDatoCuriosoUno;

/**
 *
 * @author Axel, Rachel, Jimena
 */
public class ButtonController{
    
    BookController bookController;
    PageInteractive page;
    PanleDataDatoCuriosoUno panelDataCurioso;

    public ButtonController() {
        this.bookController = new BookController();
        FrmVentanaPrincipal frm = new FrmVentanaPrincipal();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        
        //Codigo para agregar algunas paginas de preguntas
        String text = "¿Los pulpos tienen cuantos corazones?\nA. Uno.       B. Dos.\nC. Tres.       D. Cuatro.";
        String answer = "C";
        this.page = new PageInteractive(answer, "Curiosidad.", text, 1);
        bookController.addPage(page);
        
        text = "Los cangrejos herradura son criaturas muy viejas. ¿Sabes de que color es su sangre?\nA. Roja.       B. Azul.\nC. Amarillo.       D. Verde.";
        answer = "B";
        this.page = new PageInteractive(answer, "Curiosidad.", text, 1);
        bookController.addPage(page);
        
        text = "El insecto más longebo es...\nA. La mosca de la fruta.       B. Cucaracha.\nC. Saltamontes.       D. Cicharra.";
        answer = "D";
        this.page = new PageInteractive(answer, "Curiosidad.", text, 1);
        bookController.addPage(page);
        //Al final no se logró implementar lo esperado.
        //Se quería que estas páginas estuvieran guardadas en el ArrayList, lo cual si se pudo, pero no sse pudo
        //encontrar la manera para que el controller cambie el texto de manera dinámica, es decir que avanze cada página.
        panelDataCurioso.displayText(page);
                        
    } //End of constructor method
 
    
} //End of CLASS
