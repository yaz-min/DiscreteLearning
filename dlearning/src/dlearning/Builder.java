/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlearning;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder;
/**
 *
 * @author mau
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void watch(final Process process) {
    new Thread(){
        public void run() {
            dlearning.Archivo output = new dlearning.Archivo("plan_output");
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null; 
            try {
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                    output.write(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }.start();
}
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ProcessBuilder builder = new ProcessBuilder("/Users/pamelagarcia/Downloads/dlv.i386-apple-darwin.bin", "-FP", "/Users/pamelagarcia/DLearning/dlearning.dl", "/Users/pamelagarcia/DLearning/dlearning.plan");
        builder.redirectErrorStream(true);
        final Process process = builder.start();
        
        PrintWriter input = new PrintWriter(process.getOutputStream()); 
        input.print("y");
        input.print("y");
        input.close();
        
        Builder.watch(process);
    }
    
}
