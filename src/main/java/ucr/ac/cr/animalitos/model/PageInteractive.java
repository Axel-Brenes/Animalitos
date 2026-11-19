/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.animalitos.model;

/**
 *
 * @author Axel Abdiel Brenes Mora
 */
public class PageInteractive extends Page{
    
    private String question;
    private String answer;
    
    public PageInteractive(String question, String answer, String title, String content, int number) {
        super(title, content, number);
        this.question = question;
        this.answer = answer;
    } //End of Constructor

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
    
} //End of PageInteractive class
