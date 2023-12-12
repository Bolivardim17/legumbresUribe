package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // esntradas del problema

        String nombreProducto;
        String nombreDistribuidor;

        double costoLote;
        double costoventaPublico;
        double totalDeLaCompre;
        int cantidadCompradaProducto;


        //proceso

        Scanner leerDatos= new Scanner(System.in);

        System.out.println("dame el nombre del producto");
        nombreProducto=leerDatos.nextLine();

        System.out.println("cual es nombre del distribuidor");
        nombreDistribuidor=leerDatos.nextLine();

        System.out.println("cual es el costo del lote");
        costoLote=leerDatos.nextDouble();

        System.out.println("cual es el costo venta al publico");
        costoventaPublico=leerDatos.nextDouble();

        System.out.println("cual es el total de la compra");
        totalDeLaCompre=leerDatos.nextDouble();

        System.out.println("Cuanta cantidad de producto se compro");
        cantidadCompradaProducto=leerDatos.nextInt();

        //como hacer el resumen

        System.out.println("********************");
        System.out.println("resumen ingreso mercancia");
        System.out.println("lote que entra"+nombreProducto);
        System.out.println("costo total $"+costoLote);
        System.out.println("entregado por"+nombreDistribuidor);
        System.out.println("**************");


        System.out.println("venta al detal \n");
        costoventaPublico=5000;

        System.out.println("querido usuario, el costo de "+nombreProducto+"es de $"+costoventaPublico);

        System.out.print("Dijita la cantidad de "+nombreProducto+"Que quieres comprar");
        cantidadCompradaProducto=leerDatos.nextInt();

        //calculando el valor de una variable
        totalDeLaCompre=costoventaPublico*cantidadCompradaProducto;

        System.out.println("el valor de su comprares de $"+totalDeLaCompre);







    }
}