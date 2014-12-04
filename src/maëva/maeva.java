/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maëva;

/**
 *
 * @author Maëva
 */
public class maeva {
    static int i = 0 ;
     public static void main (String[] args){
         System.out.println("Hellow world");
         Lapin lap= new Lapin("la", 2);
         while (i<=10){
         lap.crier();
         i=i+1;
     }
     }
}
