package Proyecto2;

import Proyecto2.*;

public class facturaTest {
    public static void main(String[] args) {
        Factura factura = new Factura("F01", "PC Gamer", 4, 300);

        System.out.println("Numero: "+ factura.getNumero());
        System.out.println("Descripción: " + factura.getDescripcion());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por Articulo: $" + factura.getPrecioPorArticulo());
        System.out.println("Total: $" + factura.getTotalFactura());

        factura.setCantidad(5);
        factura.setPrecioPorArticulo(800);

        System.out.println("\n Valores actiualizados");
        System.out.println("Numero: "+ factura.getNumero());
        System.out.println("Descripción: " + factura.getDescripcion());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por Articulo: $" + factura.getPrecioPorArticulo());
        System.out.println("Total: $" + factura.getTotalFactura());
    }
}
