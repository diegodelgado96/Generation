package Proyecto3;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
    private static int cantEmpleados;

    public Empleado (String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        cantEmpleados++;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public double getSalarioMensual(){
        return salarioMensual;
    }

    public int getCantEmpleados(){
        return cantEmpleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double salarioAnual() {
        return salarioMensual*12;
    }

}
