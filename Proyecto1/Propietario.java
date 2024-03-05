package Proyecto1;

import Proyecto1.Direccion;

public class Propietario {
    //Atributos
    private String nombre;
    private String fechaNacimiento;
    private Direccion direccion;

    //Constructor
    public Propietario(String nombre, String fechaNacimiento, Direccion direccion) {
        this.nombre = nombre;        
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    //Metodos de acceso (encapsulado)
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
