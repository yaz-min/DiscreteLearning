/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlearning;

import java.io.*;

/**
 *
 * @author noe
 */
public class Archivo {
   
    
    //name es la ruta del archivo
    public String name;
    //public Scanner file;
    //public Formatter archivo;
    //public ArrayList<String> content = new ArrayList();
    String content;
    
    
    
    
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
    
    public void write(String word){
        //La funcion write recibe una cadena la cual la escribe en el archivo, pero no remplaza lo que tenia
        
        
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
  
   
    
    public static void main(String[] args){
        Archivo a = new Archivo("ejemplo");
       a.write("Plan: enseñar(S), preguntar(S)");
       System.out.println("Leido");
       
    }
}