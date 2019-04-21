/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelotienda;

/**
 *
 * @author victor.fernandez
 */
public class ExamenClasesAvanzadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro("ay", 1200);
        Libro l2 = new Libro("ay", 1200);
        Libro l3 = new Libro("zux", 1800);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }
    
}
