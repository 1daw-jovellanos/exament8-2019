package modelotienda;


public class Perfume extends Articulo {

    private int volumen;

    public Perfume(String nombre, int precioBase, int volumen) {
        super(nombre, precioBase, TipoIva.GENERAL);
        this.volumen = volumen;
    }

    @Override
    public String getDenominacion() {
        return "PERFUME";
    }

    public int getVolumen() {
        return volumen;
    }

}
