
package modelotienda;

/**
 * Para hacer pruebas. Puedes borrarme.
 */
public class MainBorrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // pruebas aquí
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
