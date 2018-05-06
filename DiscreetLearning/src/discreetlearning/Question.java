/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreetlearning;

/**
 *
 * @author noe
 */
public class Question {
           
	String question;
        //It has 4 answers
	String[] answer=new String[4];
        //but only one is correct
	int correct;

    public Question(String question, String resp1, String resp2, String resp3, String resp4, int correct) {
    	
        this.question=question;
    	this.answer[0]=resp1;
    	this.answer[1]=resp2;
    	this.answer[2]=resp3;
    	this.answer[3]=resp4;
    	this.correct=correct-1;
    }
    
    public String toString()
    {
    	return question+"\na) "+answer[0]+"\nb) "+answer[1]+"\nc) "+answer[2]+"\nd) "+answer[3]+"\n\n";
    }
    
}
