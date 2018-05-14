/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreetlearning;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author noe
 */
public class Quiz {
    
    public static ArrayList<Question> questions10 = new ArrayList <Question>();
    public static ArrayList<Question> questions = new ArrayList <Question>();
    public static FileInputStream in;
    public static FileOutputStream out;
    public static ObjectInputStream fin;
    public static ObjectOutputStream fout;

    public static void openFile(String name)
    {
    	try{
    	File f = new File("src/Files/"+name+".dat");
    	if(f.exists())
    	{
                questions.clear();
    		in=new FileInputStream(name);
    		fin=new ObjectInputStream(in);
    		try{
    			do{
    				questions.add((Question)fin.readObject());
    			}while(true);
    		}catch(EOFException e){
    			;
    		}catch(ClassNotFoundException e){;}
    	}
    	else{
    	
                insertaQuestion();
                f.createNewFile();
                out=new FileOutputStream(name);
                fout=new ObjectOutputStream(out);
                for(int i=0;i<questions.size();i++){
                    fout.writeObject(questions.get(i));
                }
                fout.close();
            }       
        }catch(Exception e){;}
    }
    
  
    public static void insertaQuestion()
    {
    	questions.add(new Question("Sea A={a,b,c}.\nR={(a,a),(b,b)} es…","Reflexiva","Transitiva", "Simétrica", "Reflexiva y simétrica", 1));
      questions.add(new Question("Sea A={a,b,c}.\nR={ } es…", "Reflexiva y simétrica", "Transitiva y simétrica", "Sólo reflexiva", "Sólo transitiva", 2));
      questions.add(new Question("Sea A={a,b,c}. R={(a,a),(b,b), (c,c)} es…", "Reflexiva", "Transitiva", "Simétrica", "Todas las anteriores", 4));
      questions.add(new Question("Sea A={1,2,3,4,5}\nSea R={(a,b) pertenece AxA | a divide a b}. ¿Qué propiedades cumple?", "Reflexiva, transitiva y simétrica", "Sólo reflexiva y transitiva", "Reflexiva, transitiva y antisimétrica", "Sólo transitiva", 3));
      questions.add(new Question("¿Qué propiedad cumple la relación identidad?","Reflexiva","Transitiva","Simétrica","Antisimétrica",2));
      questions.add(new Question("Sea D una relación y R el conjunto de los números reales. Para todo a, b que pertenecen a R, a se relaciona con b (aDb) si y sólo si axb>=0. Así, esta relación es…","Reflexiva y transitiva","Simétrica y antisimétrica","Reflexiva y simétrica","Transitiva y antisimétrica",3));
      questions.add(new Question("Para toda m, n que pertenecen a los números reales, m se relaciona con n (mRn) si y sólo si m-n es par. ¿Qué propiedades cumple?","Sólo simétrica","Sólo transitiva","Sólo reflexiva","Todas las anteriores",4));
      questions.add(new Question("¿Qué significa que una relación sea reflexiva?","Para toda a,b en A: si (a,b) pertenece a R, entonces (b,a) pertenece a R","Para toda a en A: (a,a) pertenece a R","Para toda a,b en A: si (a,b), (b,a) pertenece a R, entonces a=b","Para toda a,b,c en A: si (a,b),(b,c) pertenece a R, entonces (a,c) pertenece a R",2));
      questions.add(new Question("¿Qué significa que una relación sea simétrica?","Para toda a,b en A: si (a,b) pertenece a R, entonces (b,a) pertenece a R","Para toda a en A: (a,a) pertenece a R","Para toda a,b en A: si (a,b), (b,a) pertenece a R, entonces a=b","Para toda a,b,c en A: si (a,b),(b,c) pertenece a R, entonces (a,c) pertenece a R",1));
      questions.add(new Question("¿Qué significa que una relación sea transitiva?","Para toda a,b en A: si (a,b) pertenece a R, entonces (b,a) pertenece a R","Para toda a en A: (a,a) pertenece a R","Para toda a,b en A: si (a,b), (b,a) pertenece a R, entonces a=b","Para toda a,b,c en A: si (a,b),(b,c) pertenece a R, entonces (a,c) pertenece a R",4));
      questions.add(new Question("¿Qué significa que una relación sea antisimétrica","Para toda a,b en A: si (a,b) pertenece a R, entonces (b,a) pertenece a R","Para toda a en A: (a,a) pertenece a R","Para toda a,b en A: si (a,b), (b,a) pertenece a R, entonces a=b","Para toda a,b,c en A: si (a,b),(b,c) pertenece a R, entonces (a,c) pertenece a R",3));
      questions.add(new Question("Para R={(1,1),(1,2),(1,3),(1,4),(1,5),(2,2),(2,4),(3,3),(4,4),(5,5)} donde\nR={(a,b) pertenece AxA | a divide a b}\nA={1,2,3,4,5}\nSeleccione la opción verdadera:","R es reflexiva porque (a,b) y (b,a) no pertenecen a R","R es transitiva porque se pueden componer los pares ordenados, y de dichas composiciones, todas pertenecen a la relación","R no cumple ninguna propiedad","R es antisimétrica porque para cada elemento de A, hay un (a,a), ya que todos son divisibles por si mismos",2));
      questions.add(new Question("¿Qué propiedades cumple la relación inclusión?","Sólo reflexiva","Sólo antisimétrica","Sólo transitiva","Todas las anteriores",4));
      questions.add(new Question("Sea A={a,b,c}, seleccione la relación que NO es transitiva:","R={(a,a),(b,b),(c,c)}","R=[(a,b),(c,c)}","R={(a,b),(b,c)}","Todas son transitivas",3));
      questions.add(new Question("Si una relación es simétrica, ¿qué propiedad ya no puede cumplir?","Reflexividad","Transitividad","Antisimetría","La propiedad de simetría no contradice ninguna otra propiedad",4));

        
       
    }

    public static void listarRandom(ArrayList<Question> origen)
    {
        
    	int index;
        for(int i= 0; i<10;i++){
            questions10.add(new Question("vacio",null, null, null, null, 0));
        }
        for(int i= 0; i<10;i++){
            do{
                index = (int)(Math.random()*(origen.size()-1));
                if(!(questions10.contains(origen.get(index)))){
                    questions10.set(i, origen.get(index));
                }
                else{
                    i--;
                }
            
            }while(!(questions10.contains(origen.get(index))));
        }
        
    }
}