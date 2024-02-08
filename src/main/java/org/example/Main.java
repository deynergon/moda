package org.example;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nombre;
        String apellidos;
        boolean clienteVIP;
        int cantidad;
        double subtotal = 0.0;
        double descuento = 0.0;

        System.out.println("*****Bienvenido a modaExpress****");
        System.out.print("Cual es tu nombre?: ");
        nombre = keyboard.nextLine();
        System.out.print("Cual es tu apellido?");
        apellidos = keyboard.nextLine();

        System.out.print("Eres cliente VIP?: ");
        clienteVIP = keyboard.nextBoolean();

        System.out.print("¿Cuántos artículos vas a comprar?: ");
        cantidad = keyboard.nextInt();

        double precioPorArticulo = 100000.0;
        subtotal = cantidad * precioPorArticulo;

        // Aplicar descuentos para cliente regular
        if (!clienteVIP) {
            if (cantidad >= 1 && cantidad <= 3) {
                descuento = subtotal * 0.1;
                subtotal *= 0.9;
            } else if (cantidad >= 4 && cantidad <= 6) {
                descuento = subtotal * 0.15;
                subtotal *= 0.85;
            } else if (cantidad > 6) {
                descuento = subtotal * 0.2;
                subtotal *= 0.8;
            }
        }
        // Aplicar descuentos para cliente VIP
        else {
            if (cantidad >= 1 && cantidad <= 3) {
                descuento = subtotal * 0.1;
                subtotal *= 0.9;
            } else if (cantidad >= 4 && cantidad <= 6) {
                descuento = subtotal * 0.15;
                subtotal *= 0.85;
            } else if (cantidad > 6) {
                descuento = subtotal * 0.2;
                subtotal *= 0.8;
            }
        }

        System.out.println("Resumen de la compra:");
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Tipo de cliente: " + (clienteVIP ? "VIP" : "Regular"));
        System.out.println("Cantidad de artículos: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
    }
}