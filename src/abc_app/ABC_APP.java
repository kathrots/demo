/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_app;

/**
 *
 * @author Priyank
 */
public class ABC_APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv = new TV();
        tv.turnOn();
            
      //  System.out.println(tv.volumeLevel);
        
        System.out.println(tv.toString());
        tv.turnOff();
        System.out.println(tv);
    }

}
    

