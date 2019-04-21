package modelotienda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {

    List<Comprable> compra;

    public Carrito() {
        this.compra = new ArrayList<>();
    }

    public void annandir(Comprable c) {
        compra.add(c);
    }

    public int getImporteTotal() {
        int suma = 0;
        for (Comprable comprable : compra) { // hay que recorrelos todos
            suma += comprable.getPrecio();
        }
        return suma;
    }

    public boolean hayEnvioGratis() {
        // Usando un bucle foreach, y return adelantado
        // Alternativa: bucle while con iterador / variable artificial y return retrasado
        if (getImporteTotal() > 5000) {
            return true;
        }
        int cuentaPerfumes = 0;
        for (Comprable comprable : compra) {   // Un while con iterador seria una alternativa
            if (comprable instanceof Perfume) {
                cuentaPerfumes++;
            }
            if (cuentaPerfumes >= 2) {
                return true; // paramos cuanto antes
            }
        }
        return false;
    }

    public boolean hayEnvioAsegurado() {
        // Usando un bucle while tradicional de búsqueda con
        // variable booleana artificial para salir y con return retrasado.
        // Alternativa: bucle foreach y return adelantado
        // Alternativa: bucle while(true) con ifs + continue o break
        Iterator<Comprable> iter = compra.iterator();
        boolean encontrado = false;
        while (iter.hasNext() && !encontrado) {
            Comprable comprable = iter.next();
            if (comprable instanceof Seguro) {
                Seguro seguro = (Seguro) comprable;
                encontrado = seguro.codigo == 7 || seguro.codigo == 12;
            }
        }
        return encontrado;
    }

    public int calcularVolumenPerfumes() {
        int sumaVolumen = 0;
        for (Comprable comprable : compra) {
            if (comprable instanceof Perfume) {
                sumaVolumen += ((Perfume) comprable).getVolumen();
            }
        }
        return sumaVolumen;
    }

}
