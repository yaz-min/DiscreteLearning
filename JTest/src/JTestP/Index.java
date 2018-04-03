/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTestP;


public class Index {
    public static String user="";
    
    public static void main(String[] args){
        Splash obj = new Splash();
        obj.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                obj.ProgressBar.setValue(i);
                obj.Label.setText(i+"%");
            }
        } catch (Exception e) {
        }
        obj.dispose();
        
        Login login = new Login();
        login.setVisible(true);
       
            
        
    }
}
