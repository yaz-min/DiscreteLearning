/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlearning;

import java.io.*;
import java.util.*;

/**
 *
 * @author noe
 */
public class Archivo {
   
    //public static ArrayList<String> planning = new ArrayList();
    
    //name es la ruta del archivo
    public String name;
    String content;
    String planning;
    
    
    
    
    public Archivo (String name){
        //todos los archivos se van a guardar en la carpeta "Files"
        this.name = "src/Files/"+name+".txt";
    }
    
    public void read(){
        //Abre/crea el archivo lee su contenido y almacena el texto en "content"
         try{
            //content.clear();
            content = "";
            File f = new File(name);
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(name));
            String temp = "";
            String bfRead;
            
            while((bfRead = br.readLine()) != null){
                temp = temp + bfRead + "\n";
            }
            
            content = temp;
            br.close();
            
        }catch(Exception e){
            System.out.println("Archivo no encontrado");
}
        
    }
    public void readPlan(){
        //Lee el plan que esta en un archivo
        Scanner word;
        try{
            //content.clear();
            int cont = 0;
            content = "";
            File f = new File(name);
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(name));
            String plan ="";
            String temp = "";
            String bfRead;
            
            while((bfRead = br.readLine()) != null){
                plan = bfRead.substring(0, 4);
                if(cont > 1){
                    if(plan.equalsIgnoreCase("PLAN")){
                        temp = temp + bfRead + "\n";
                        break;
                    }
                }
                cont++;
            }
            cont=0;
            content = temp;
            word = new Scanner(content);
            while(word.hasNext()){
                if(cont <2){
                    this.planning = word.next();
                }
                else
                    break;
                cont++;
            }
            content = planning;
            br.close();   
        }catch(Exception e){
            System.out.println("File not found");
        }
        
    }
    public void write(String word){
        //La funcion write recibe un archivo y remplaza this.content
        
        
        read();
        try{
         File f = new File(name);   
         if(!f.exists()){
                f.createNewFile();
            }  
         FileWriter fr = new FileWriter(f);   
         BufferedWriter bw = new BufferedWriter(fr);
         PrintWriter wr = new PrintWriter(bw);
        
         wr.write(content + word);
         
         wr.close();
         bw.close();
            
            
        }catch(Exception e){System.out.println("Archivo no encontrado");}
    }    
    public void write(Archivo from){
        //La funcion write recibe una cadena la cual la escribe en el archivo, pero no remplaza lo que tenia
        
        
        from.read();
        try{
         File f = new File(name);   
         if(!f.exists()){
                f.createNewFile();
            }  
         FileWriter fr = new FileWriter(f);   
         BufferedWriter bw = new BufferedWriter(fr);
         PrintWriter wr = new PrintWriter(bw);
        
        
         
         wr.write(from.content);
         
         wr.close();
         bw.close();
            
            
        }catch(Exception e){System.out.println("Archivo no encontrado");}
    }
    public void writePlan(Archivo from){
        //La funcion write recibe una cadena la cual la escribe en el archivo, pero no remplaza lo que tenia
        
        
        from.readPlan();
        try{
         File f = new File(name);   
         if(!f.exists()){
                f.createNewFile();
            }  
         FileWriter fr = new FileWriter(f);   
         BufferedWriter bw = new BufferedWriter(fr);
         PrintWriter wr = new PrintWriter(bw);
        
        this.content = from.planning;
        this.planning = from.planning;
        this.write(from.planning);
        //from.clean();
         wr.close();
         bw.close();
         
        
            
        }catch(Exception e){System.out.println("File not found");}
    }
    public void clean(){
        try{
         File f = new File(name);   
         if(!f.exists()){
                f.createNewFile();
            }  
         f.delete();
        }catch(Exception e){System.out.println("Archivo no encontrado");}
    }
    
    public static void main(String[] args){
        Archivo a = new Archivo("ejemplo");
        Archivo plan = new Archivo("plan_output");
       //a.write("Plan: enseñar(S), preguntar(S)");
      // a.writePlan(plan);
      // System.out.println("Hecho");
       a.clean();
    }
    
}