package modelotienda;


public class Libro extends Articulo{

    public Libro(String nombre, int precioBase) {
        super(nombre, precioBase, TipoIva.SUPERREDUCIDO);
    }

    
    @Override
    public String getDenominacion() {
        return "LIBRO";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro otroLibro = (Libro) o;
        return getNombre().equals(otroLibro.getNombre()) 
                && getPrecio() == otroLibro.getPrecio();
    }

}
