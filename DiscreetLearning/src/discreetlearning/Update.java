/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreetlearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pamelagarcia
 */
public class Update {

    static String cond = "esta_en_asesorias";
    static boolean band = false;
    static File file = new File("/Users/pamelagarcia/DiscreteLearning/dlearninginit.plan");
    /**
     * @param args the command line arguments
     */
    public static void updatePlan(String cond, boolean band){
        //Hacer funcion para modificar dlearninginit sin cond
        String plan = read();
        StringBuilder temp;
        String new_plan = "";
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            //Cambia los estados iniciales de dlv, si esta negado lo hace positivo y viceversa
            if(plan.contains(cond)){
                if(band == true){
                    //Cambia los fluentes negados a no negados
                    temp = new StringBuilder("-");
                    temp.append(cond);
                    new_plan = plan.replace(temp.toString(), cond);
                }
                
                else{
                    //Niega los fluentes
                    temp = new StringBuilder("");
                    temp.append(cond);
                    new_plan = plan.replace(temp.toString(), ("-" + cond));
                }
            }
            
            writer.write(new_plan);
            writer.close();
            
        }catch(Exception w){
            w.printStackTrace();
        }
    }
    public static String read() {
        StringBuilder stringBuilder = null;
        try {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader (file));
            String line = null;
            stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");
            
            try {
                while((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append(ls);
                }
                
            } finally {
                reader.close();
            }
        }   catch (Exception ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return stringBuilder.toString();
    }
    
    public static void main(String[] args) {
        Update.updatePlan(cond, band);
    }
    
}
