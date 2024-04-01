/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class SingletonJava {
    private static SingletonJava object;
    String text;
    
    private SingletonJava (String text){
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException ex) {
            Logger.getLogger(SingletonJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.text = text;
    }
    
    public static SingletonJava getIntance(String text){
        if (object == null){
            object = new SingletonJava(text);
        }
        return object;
    }
}
