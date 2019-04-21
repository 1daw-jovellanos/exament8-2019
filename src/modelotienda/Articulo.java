package modelotienda;

public abstract class Articulo implements Comprable {

    private String nombre;
    private int precioBase;
    private TipoIva tipoIva;

    public Articulo(String nombre, int precioBase, TipoIva tipoIva) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipoIva = tipoIva;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public TipoIva getTipoIva() {
        return tipoIva;
    }

    @Override
    public int getPrecio() {
        int porcentaje;
        switch (tipoIva) {
            case SUPERREDUCIDO:
                porcentaje = 4;
                break;
            case REDUCIDO:
                porcentaje = 10;
                break;
            case GENERAL:
                porcentaje = 21;
                break;
            default:
                porcentaje = 0;
        }
        return precioBase + precioBase * porcentaje / 100;
    }
    
    public abstract String getDenominacion();

    @Override
    public String toString() {
        return String.format("%s: %s %.2f€", getDenominacion(), getNombre(), getPrecio() / 100.0);
    }

}
