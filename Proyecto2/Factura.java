package Proyecto2;

public class Factura {
    //Actributos
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precioPorArticulo;

    //constructor 
    public Factura(String numero, String descripcion, int cantidad, double precioPorArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    //Metodos getter y setter 
    public String getNumero(){
        return numero;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getCantidad(){
        return cantidad;
    }

    public double getPrecioPorArticulo(){
        return precioPorArticulo;
    }

    public void setNumero (String numero) {
        this.numero = numero;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad (int cantidad) {
        this.cantidad = Math.max(0, cantidad);
    }

    public void setPrecioPorArticulo (double precioPorArticulo) {
        this.precioPorArticulo = Math.max(0.0, precioPorArticulo);
    }

    //Acciones
    public double getTotalFactura() {
        return cantidad*precioPorArticulo;
    }
}
