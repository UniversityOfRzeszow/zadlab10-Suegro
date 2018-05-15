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
public class Zadanie2 {
    
    public static void main(String args[])
    {
        odliczanie();
    }
    
    public static void odliczanie()
    {
        try
        {
            int[] liczby = new int[10];
            for(int i = 0;i<20;i++)
            {
                System.out.println(liczby[i]);
            }  
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Jestes poza tablica !!!");
        }
        
    }
    
}
