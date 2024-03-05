package Proyecto3;

import Proyecto3.*;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego", "Delgado", 500000);
        Empleado empleado2 = new Empleado("Camilo", "Castaño", 900000);

        //Mostrar salarios
        System.out.println("Salario mensual de "+ empleado1.getNombre() + ": $" + empleado1.getSalarioMensual());
        System.out.println("Salario mensual de "+ empleado2.getNombre() + ": $" + empleado2.getSalarioMensual());

        //Dar aumento
        empleado1.setSalarioMensual(empleado1.getSalarioMensual()*1.1);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual()*1.1);

        //Salario anual con aumento
        System.out.println("Salario mensual de "+ empleado1.getNombre() + ": $" + empleado1.getSalarioMensual());
        System.out.println("Salario mensual de "+ empleado2.getNombre() + ": $" + empleado2.getSalarioMensual());

        //número de empleados registrado
        System.out.println("Número de empleados registrados: "+ empleado1.getCantEmpleados());
    }
}
