/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.animalitos.model;

import java.util.ArrayList;

/**
 *
 * @author Axel, Rachel, Jimena
 */
public class Book {
    
    ArrayList<Page> pages;
    private int id;
    
    public Book (){
        this.pages = new ArrayList<>();
        this.id = 1;
    } //End of constructor
    
    public String addPage(Page page){
        this.pages.add(page);
        return "Pagina agregada con éxito.";       
    } //End of addPage method
    
    public String getPages(){
        String out = "";
        for (Page page : pages){
            out += pages + "\n\n";
        } //End of for
        return out;
    } //End of getPages method
    
        
} //End of Book class
