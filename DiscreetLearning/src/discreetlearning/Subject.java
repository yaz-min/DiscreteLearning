/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreetlearning;
import java.util.ArrayList;
/**
 *
 * @author noe
 */
public class Subject {
    private String name;
    private ArrayList<Object> examples = new ArrayList();
    private ArrayList<Quiz> exams = new ArrayList();
    private ArrayList<Quiz> quizes = new ArrayList();
    private ArrayList<String> def = new ArrayList();

    public Subject(String name) {
        this.name = name;
    }

    //get
    
    public String getName() {
        return name;
    }

    public ArrayList<Object> getExamples() {
        return examples;
    }
    public Object getExamples(int i) {
        return examples.get(i);
    }

    public ArrayList<Quiz> getExams() {
        return exams;
    }
    public Quiz getExams(int i) {
        return exams.get(i);
    }
    
    public ArrayList<Quiz> getQuizes() {
        return quizes;
    }
    public Quiz getQuizes(int i) {
        return quizes.get(i);
    }

    public ArrayList<String> getDef() {
        return def;
    }
    public String getDef(int i) {
        return def.get(i);
    }

    //Set
    
    public void setExamples(ArrayList<Object> examples) {
        this.examples = examples;
    }
    public void setExams(ArrayList<Quiz> exams) {
        this.exams = exams;
    }
    public void setQuizes(ArrayList<Quiz> quizes) {
        this.quizes = quizes;
    }
    public void setDef(ArrayList<String> def) {
        this.def = def;
    }
    
    public void setExamples(Object examples) {
        this.examples.add(examples);
    }
    public void setExams(Quiz exams) {
        this.exams.add(exams);
    }
    public void setQuizes(Quiz quizes) {
        this.quizes.add(quizes);
    }
    public void setDef(String def) {
        this.def.add(def);
    }
    
    public void setExamples(int i, Object examples) {
        this.examples.set(i,examples);
    }
    public void setExams(int i, Quiz exams) {
        this.exams.set(i, exams);
    }
    public void setQuizes(int i, Quiz quizes) {
        this.quizes.set(i, quizes);
    }
    public void setDef(int i, String def) {
        this.def.set(i, def);
    }
    
    public void teach(){
        String print = this.name + "\n\n";
        
        
        for(int i = 0; i < this.def.size();i++ ){
            try{
                print += this.def.get(i) + "\n" ;
            }catch(Exception e){;}
        }
            
        System.out.println(print); 
    }
    
}
