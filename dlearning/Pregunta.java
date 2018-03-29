package JTestP;

/**
 * @(#)Pregunta.java
 *
 *
 * @author 
 * @version 1.00 2017/12/3
 */

import java.io.*;
public class Pregunta implements Serializable {
        
	String question;
        //It has 4 answers
	String[] answer=new String[4];
        //but only one is correct
	int correct;

    public Pregunta(String question, String resp1, String resp2, String resp3, String resp4, int correct) {
    	
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