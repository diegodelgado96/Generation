package Proyecto1;

import Proyecto1.*;

public class main {
    public static void main(String[] args) {
        //Objeto Dirección
        Direccion direccion = new Direccion("Cl 43 # 8-33", "Portales del Río", "Tuluá");

        //Objeto Marca
        Marca marca = new Marca("Toyota", 2010, 2024, "T123");

        //Objeto Propietario con relación a direcció
        Propietario propietario = new Propietario("Diego Delgado", "08/12/1996", direccion);

        //Objeto Auto con relación a Propietario y Marca
        Auto auto = new Auto("Modelo 1", "Rojo", 2023, marca, "Chasis123", propietario, 120, 0, 4, false, 3, false);

        System.out.println(auto);
        return; 
    }
}
