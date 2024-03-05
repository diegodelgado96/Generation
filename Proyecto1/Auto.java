package Proyecto1;

//importamos la clase propietario
import Proyecto1.Propietario;

public class Auto {
    //Atributos
    private String modelo;
    private String color;
    private int anio;
    private String marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroPuertas;
    private boolean tieneTechoSolar;
    private int numeroMarchas;
    private boolean transmisionAutomatica;

    //constructor
    public Auto(String modelo,
        String color,
        int anio,
        String marca,
        String chasis,
        Propietario propietario,
        int velocidadMaxima,
        int velocidadActual,
        int numeroPuertas,
        boolean tieneTechoSolar,
        int numeroMarchas,
        boolean transmisionAutomatica) {

        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.numeroPuertas = numeroPuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroMarchas = numeroMarchas;
        this.transmisionAutomatica = transmisionAutomatica;

    }

    //Metodos de acceso (encapsulamiento)
    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public int getAnio(){
        return anio;
    }

    public String getMarca(){
        return marca;
    }

    public String getChasis(){
        return chasis;
    }

    public Propietario getPropietario(){
        return propietario;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public int getVelocidadActual(){
        return velocidadActual;
    }

    public int getNumeroPuertas(){
        return numeroPuertas;
    }

    public boolean getTieneTechoSolar(){
        return tieneTechoSolar;
    }

    public int getNumeroMarchas(){
        return numeroMarchas;
    }

    public boolean getTransmisionAutomatica(){
        return transmisionAutomatica;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setAnio (int anio) {
        this.anio = anio;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public void setChasis (String chasis) {
        this.chasis = chasis;
    }

    public void setPropietario (Propietario propietario) {
        this.propietario = propietario;
    }

    public void setVelocidadMaxima (int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setVelocidadActual (int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setNumeroPuertas (int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTieneTechoSolar (boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public void setNumeroMarchas (int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public void setTransmisionAutomatica (boolean transmisionAutomatica) {
        this.transmisionAutomatica = transmisionAutomatica;
    }

    //Acciones
    public void acelerar() {
        if(velocidadActual < velocidadMaxima) {
            velocidadActual++;
            System.out.println("Acelerando. Velocidad: " + velocidadActual + " km/h");
        } else {
            System.out.println("Velocidad Máxima");
        }
    }

    public void frenado() {
        velocidadActual = 0;
        System.out.println("Vehiculo detenido");
    }

    public void cambiarMarcha(int nuevaMarcha) {
        if(nuevaMarcha > 0 && nuevaMarcha <= numeroMarchas) {
            System.out.println("Cambiando a la marcha " + nuevaMarcha);
        } else {
            System.out.println("Marcha no válida");
        }
    }

    public void reducirMarcha() {
        if(numeroMarchas > 1) {
            System.out.println("Reduciendo marcha");
        } else {
            System.out.println("No se puede reducir la marcha");
        }
    }
}
