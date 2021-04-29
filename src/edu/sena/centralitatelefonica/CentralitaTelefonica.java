/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.centralitatelefonica;

import edu.sena.clases.centralitatelefonica.Franja;
import edu.sena.clases.centralitatelefonica.Llamada;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Josarta
 */
public class CentralitaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Llamada> listaLLamadas = new ArrayList<>();

        Franja f1 = new Franja("Franja 1", 200, "20:00", "24:00");
        Franja f2 = new Franja("Franja 2", 150, "10:00", "20:00");
        Franja f3 = new Franja("Franja 3", 100, "00:00", "10:00");

        Scanner nc = new Scanner(System.in);

        do {
            System.out.println("Por favor ingrese el tipo de llamada Fijo - Celular");
            if (nc.nextLine().equalsIgnoreCase("fijo")) {
                System.out.println("Ingrese (numero Origen, numero Destino , duracion)");
                String ingresoValores = nc.nextLine();
                String[] valoresUnidos = ingresoValores.split(",");
                Llamada objLLamada = new Llamada("Fijo",
                        Long.parseLong(valoresUnidos[0]),
                        Long.parseLong(valoresUnidos[1]),
                        Integer.parseInt(valoresUnidos[2]));
                listaLLamadas.add(objLLamada);
                System.out.println("");
                System.out.println("********** El costo de esta llamada es de $ " + objLLamada.valorLlamada());
                System.out.println("");
            } else {
                System.out.println("Ingrese (numero Origen, numero Destino , duracion , franja 1,2,3 )");
                String ingresoValores = nc.nextLine();
                String[] valoresUnidos = ingresoValores.split(",");
                Franja fSeleccionada = new Franja();
                switch (valoresUnidos[3]) {
                    case "1":
                        fSeleccionada = f1;
                        break;
                    case "2":
                        fSeleccionada = f2;
                        break;
                    case "3":
                        fSeleccionada = f3;
                        break;
                }
                Llamada objLlamadaCelular = new Llamada("celular",
                        Long.parseLong(valoresUnidos[0]),
                        Long.parseLong(valoresUnidos[1]),
                        Integer.parseInt(valoresUnidos[2]),
                        fSeleccionada);
                listaLLamadas.add(objLlamadaCelular);
                System.out.println("");
                System.out.println("********** El costo de esta llamada es de $ " + objLlamadaCelular.valorLlamada());
                System.out.println("");
            }
            System.out.println("****************************");
            System.out.println("** Pulse 1 para terminar. **");
            System.out.println("****************************");

        } while (!nc.nextLine().endsWith("1"));

        System.out.println("");
        System.out.println("**************************************************************************");

        double total = 0;
        for (int i = 0; i < listaLLamadas.size(); i++) {
            System.out.println(""
                    + " Tipo de llamada | " + listaLLamadas.get(i).getTipo()
                    + " Numero origen | " + listaLLamadas.get(i).getNumeroOrigen()
                    + " Numero destino | " + listaLLamadas.get(i).getNumeroDestino()
                    + " Duracion | " + listaLLamadas.get(i).getDuracion()
                    + " Valor $ " + listaLLamadas.get(i).valorLlamada());
            total += listaLLamadas.get(i).valorLlamada();
        }

        System.out.println("**************************************************************************");
        System.out.println("*************    Valor total a pagar $ " + total + "**************************");
        System.out.println("**************************************************************************");

    }

}
