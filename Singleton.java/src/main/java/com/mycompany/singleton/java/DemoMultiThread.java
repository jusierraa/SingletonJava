/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton.java;

/**
 *
 * @author jcsie
 */
public class DemoMultiThread {
    public static void main(String[] Args){
        Thread threadJuan = new Thread(new threadJuan());
        Thread threadDiego = new Thread(new threadDiego());
        threadJuan.start();
        threadDiego.start();
    }
    
    public static class threadJuan implements Runnable {
        public void run(){
            SingletonJava singleton = SingletonJava.getIntance("Hi i'm Juan");
            System.out.println(singleton.text);
        }
    }
    
    public static class threadDiego implements Runnable {
        public void run(){
            SingletonJava singleton2 = SingletonJava.getIntance("Hello, I'm Diego");
            System.out.println(singleton2.text);
        }
    }
    
    
}
