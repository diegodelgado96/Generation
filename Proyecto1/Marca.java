package Proyecto1;

public class Marca {
    private String nombre;
    private int nrModelo;
    private int anioLanzamiento;
    private String codigoIdentificador;

    public Marca(String nombre, int nrModelo, int anioLanzamiento, String codigoIdentificador) {
        this.nombre = nombre;
        this.nrModelo = nrModelo;
        this.anioLanzamiento = anioLanzamiento;
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNrModelo() {
        return nrModelo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNrModelo(int nrModelo) {
        this.nrModelo = nrModelo;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

}
