package Proyecto1;

public class Propietario {
    //Atributos
    private String nombre;
    private String fechaNacimiento;
    private String calle;
    private String barrio;
    private String ciudad;

    //Constructor
    public Propietario(String nombre, String fechaNacimiento, String calle, String barrio, String ciudad) {
        this.nombre = nombre;        
        this.fechaNacimiento = fechaNacimiento;
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    //Metodos de acceso (encapsulado)
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCalle() {
        return calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
