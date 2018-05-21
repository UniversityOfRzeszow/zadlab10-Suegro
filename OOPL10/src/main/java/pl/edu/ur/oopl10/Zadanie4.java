/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author Dominik
 */
public class Zadanie4 {

    public static void main(String args[]) {

        Zadanie4 a = new Zadanie4();
        a.losuj();
    }

    private int liczba1;
    private int liczba2;
    public int ilosc;
    public Random losuj = new Random();

    Zadanie4() {
        this.ilosc = 0;
    }

    public int getLiczba1() {
        return liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public void losuj() {
        try {
            liczba1 = losuj.nextInt(20)-10;
            liczba2 = losuj.nextInt(20)-10;
            System.out.println("Wynik to " + liczba1 / liczba2);
        } catch (Exception e) {
            System.out.println("Proba dzielenia przez 0");
            ilosc++;
        } finally {
            if(ilosc < 3) losuj();
        }

    }
}