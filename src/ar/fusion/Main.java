package ar.fusion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double precio;
        System.out.println("Ingrese el precio:");
        Scanner scanner=new Scanner(System.in);
        precio=scanner.nextDouble();
        double precioMasIVA=damePrecioMasIVA(precio);

        System.out.println("Usted ingreso: "+precio);
        System.out.println("Precio con IVA(21%) --> "+precioMasIVA);
    }
    static double damePrecioMasIVA(double precio){
        //IVA = 21%
        return precio*=1.21;
    }
}