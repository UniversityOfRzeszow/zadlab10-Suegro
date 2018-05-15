/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class Zadanie3 extends Exception {
    
    public int a = 10;
    Throwable error; 
    
    public void dzielenie()
    {
        try
        {
            System.out.println(a/0);
        }catch(ArithmeticException error)
        {
            System.out.println("Proba dzielenia przez 0");
            throw error;
        }
    }
    
}
