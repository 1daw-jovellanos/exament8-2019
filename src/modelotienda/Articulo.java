package modelotienda;

public abstract class Articulo implements Comprable {

    private String nombre;
    /** En céntimos... aunque en realidad, no es relevante salvo para obtener el valor en
     * euros
     */
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
        return precioBase + precioBase * porcentaje / 100; // división entera. despreciamos
        // fracciones de céntimo
    }
    
    public abstract String getDenominacion();

    @Override
    public String toString() {
        // Al dividir por 100, el precio sale en €
        return String.format("%s: %s %.2f€", getDenominacion(), getNombre(), getPrecio() / 100.0);
    }

}
