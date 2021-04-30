package FilayBloque;

import java.util.*;

/**
 *
 * @author Giovanni
 */
public class Sistema {

    ArrayList<Jugador> listaJugadores = new ArrayList();

    public void menuPrincipal() {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {

            System.out.println("═════════════════════════════════");
            System.out.println("════════ MENU PRICIPAL ════════");
            System.out.println("═════════════════════════════════");
            System.out.println("1.- Registrar nuevo jugador");
            System.out.println("2.- Jugar Fila y Bloque");
            System.out.println("3.- Ver el Ranking");
            System.out.println("4.- Salir");
            System.out.println("═════════════════════════════════");
            System.out.println("Elija la opción deseada (1-4)");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    registrarJugador();
                    volverMenuPrincipal();
                    break;
                case 2:
                    break;
                case 3:
                    mostarRanking();
                    volverMenuPrincipal();
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
            }
        }

    }

    public void registrarJugador() {
        Jugador newJugador;
        String nombre = "";
        String alias = "";
        int edad = 0;
        boolean correcto = false;
        Scanner in = new Scanner(System.in);

        System.out.println("══════════════════════════════════════");
        System.out.println("════════ REGISTRAR JUGADOR ════════");
        System.out.println("══════════════════════════════════════");
        System.out.println("");

        System.out.println("Por favor ingrese nombre");

        nombre = in.nextLine();

        while (nombre == "") {
            System.out.println("Error! Por favor ingrese un nombre");
            nombre = in.nextLine();
        }
        System.out.println("Por favor ingrese alias");
        alias = in.nextLine();

        while (alias == "") {
            System.out.println("Error! Por favor ingrese el alias correctamente");
            alias = in.nextLine();
        }
        System.out.println("Por favor ingrese edad");
        while (!correcto && edad <= 0) {
            try {
                edad = in.nextInt();
                if (edad < 0) {
                    System.out.println("Error, por favor ingrese una edad mayor a 1");
                } else {
                    correcto = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error, por favor ingrese una edad correcta");
                in.nextLine();

            }

        }

        newJugador = new Jugador();
        newJugador.setJugador(nombre, alias, edad);
        listaJugadores.add(newJugador);
        
        System.out.println("Usuario creado correctamente!");

    }

    public void mostarRanking() {
        int pos = 1;
        for (Jugador cadena : listaJugadores) {

            System.out.println(pos + "- " + cadena);
            pos++;
        }
    }

    public void volverMenuPrincipal() {
        Scanner in = new Scanner(System.in);
        String opcion;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Presione enter para volver al Menú Principal");
        opcion = in.nextLine();

    }

}
