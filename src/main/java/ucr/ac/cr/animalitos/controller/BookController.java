/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.animalitos.controller;

import ucr.ac.cr.animalitos.model.Book;
import ucr.ac.cr.animalitos.model.Page;
import ucr.ac.cr.animalitos.model.PageInteractive;
import ucr.ac.cr.animalitos.model.PageTip;

/**
 *
 * @author Axel, Rachel, Jimena
 */
public class BookController {
    
    Book book;
    private int id;

    public BookController() {
        this.book = new Book();
        this.id = 1;
    } //End of Constructor method
    
    public void addPage(Page page){
        book.addPage(page);
        page.setNumber(this.id);
        this.id ++;
    } //End of addPageInteractive method
    
} //End of BookController class
