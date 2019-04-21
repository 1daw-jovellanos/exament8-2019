package modelotienda;


public class Seguro implements Comprable {
    public int codigo;
    public String nombre;
    public int precio;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
    
}
