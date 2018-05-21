/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author Dominik
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie5 {

    public static void wprowadzInt() {
        Scanner odczyt = new Scanner(System.in);
        try {
            System.out.println("Prosze podac liczbe calkowita");
            int liczba = odczyt.nextInt();
            FileReader fread = new FileReader("plik1.txt");
            BufferedReader bufread = new BufferedReader(fread);
            String output = bufread.readLine();
            bufread.close();
            FileWriter fwrite = new FileWriter("plik2.txt");
            BufferedWriter bwrite = new BufferedWriter(fwrite);
            bwrite.write(liczba);
            bwrite.newLine();
            bwrite.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.print("Wyjątek: ");
            System.out.println(e.getMessage());
        }
    }

    public static void wprowadzString() {
        Scanner odczyt = new Scanner(System.in);
        try {
            System.out.println("Prosze podac napis");
            String napis = odczyt.nextLine();
            FileReader fread = new FileReader("plik1.txt");
            BufferedReader bufread = new BufferedReader(fread);
            String output = bufread.readLine();
            bufread.close();
            FileWriter fwrite = new FileWriter("plik2.txt");
            BufferedWriter bwrite = new BufferedWriter(fwrite);
            bwrite.write(napis);
            bwrite.newLine();
            bwrite.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.print("Wyjątek: ");
            System.out.println(e.getMessage());
        }
    }

}
